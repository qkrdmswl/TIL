package com.example.parsingexample1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    TextView text;

    String key = "69LFDh7FMch46%2FjRKfryua60biumVeNfOOox2jZadZGZSEPIplk5OLP8qPi0eHvWL5RGjDoiUkwvj96w58mYzw%3D%3D";
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText)findViewById(R.id.edit);
        text = (TextView)findViewById(R.id.text);
    }
    //Button을 클릭했을 때 자동으로 호출되는 callback method
    public void mOnClick(View v){

        switch(v.getId()){
            case R.id.button:

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        data = getXmlData();  // 아래 메소드를 호출하여 XML data를 파싱하여 String 객체로 얻어오기

                        runOnUiThread(new Runnable(){

                            @Override
                            public void run() {
                                text.setText(data);    //TextView에 문자열 data 출력
                            }
                        });
                    }
                }).start();

                break;
        }
    }
String getXmlData() {

    StringBuffer buffer = new StringBuffer();

    String str = edit.getText().toString(); //EditText에 작성된 Text 얻어오기
    String location = URLEncoder.encode(str);  //한글의 경우 인식이 안되기에 utf-8 방식으로 encoding  // 지역 검색 위한 변수

    String queryUrl = "http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList?"
                      +"addr="+location
                      +"%EC%A0%84%EB%A0%A5%EB%A1%9C&pageNo=1&numOfRows=10&ServiceKey="+key;

    try{
        URL url = new URL(queryUrl);  // 문자열로 된 요청 url을 URL 객체로 생성
        InputStream is = url.openStream();  // url 위치로 입력스트림 연결

        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        XmlPullParser xpp = factory.newPullParser();
        xpp.setInput(new InputStreamReader(is, "URF-8"));  //inputStream 으로부터 xml 입력받기

        String tag;

        xpp.next();
        int eventType = xpp.getEventType();

        while(eventType != XmlPullParser.END_DOCUMENT){
            switch(eventType){
                case XmlPullParser.START_DOCUMENT:
                    buffer.append("파싱 시작...\n\n");
                    break;
                case XmlPullParser.START_TAG:
                    tag = xpp.getName();  // 태그 이름 얻어오기

                    if(tag.equals("item"));  // 첫번째 검색결과
                    else if(tag.equals("addr")){
                        buffer.append("충전소 주소 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  //addr 요소의 TEXT 읽어와서 문자열버퍼에 추가
                        buffer.append("\n");
                    }
                    else if(tag.equals("chargeTp")){
                        buffer.append("충전기 타입 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // chargeTp
                        buffer.append("\n");
                    }
                    else if(tag.equals("cpId")){
                        buffer.append("충전기ID : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // cpId
                        buffer.append("\n");
                    }
                    else if(tag.equals("cpNm")){
                        buffer.append("충전기 명칭 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // cpNm
                        buffer.append("\n");
                    }
                    else if(tag.equals("cpStat")){
                        buffer.append("충전기 상태 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // cpStat
                        buffer.append("\n");
                    }
                    else if(tag.equals("cpTp")){
                        buffer.append("충전방식 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // cpTp
                        buffer.append("\n");
                    }
                    else if(tag.equals("csId")){
                        buffer.append("충전소ID ");
                        xpp.next();
                        buffer.append(xpp.getText());  // csId
                        buffer.append("\n");
                    }
                    else if(tag.equals("csNm")){
                        buffer.append("충전소 명칭 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // csNm
                        buffer.append("\n");
                    }
                    else if(tag.equals("lat")){
                        buffer.append("위도 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // lat
                        buffer.append("\n");
                    }
                    else if(tag.equals("longi")){
                        buffer.append("경도 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // longi
                        buffer.append("\n");
                    }
                    else if(tag.equals("statUpdateDatetime")){
                        buffer.append("충전기 상태 갱신시각 : ");
                        xpp.next();
                        buffer.append(xpp.getText());  // statUpdateDatetime
                        buffer.append("\n");
                    }
                    break;

                    case XmlPullParser.TEXT:
                        break;

                case XmlPullParser.END_TAG:
                    tag = xpp.getName();  // 태그 이름 얻어오기
                    if(tag.equals("item")) buffer.append("\n");  //첫번째 검색결과 종료.. 줄바꿈
                    break;
            }
            eventType = xpp.next();
        }

    }catch (Exception e){
        //TODO Auto-generated catch blocke.printStackTrace();
    }
    buffer.append("파싱 끝\n");

    return buffer.toString();  //StringBuffer 문자열 객체 반환

    }
}