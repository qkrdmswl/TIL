package practice;
import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*; // AWT 이벤트 사용을 위한 경로명
import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명
import javax.swing.event.*; // 스윙 이벤트를 위한 경로명

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙 응용프로그램 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());  // 컨테이너 배치 방법
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[]args) {
		new ContentPaneEx();
	}
}
