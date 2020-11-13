package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class tutoring14 {
	public static void main(String[]args) throws FileNotFoundException {
		File file = new File("c:\\");
		File [] files = file.listFiles();  
		
		File bigFile = null;
		long bigSize=0;
		for(int i=0; i<files.length; i++) { 
			File f = files[i];
			if(!f.isFile())
				continue;
			
			long size = f.length();  
			if(bigSize < size) {
				bigSize = size;
				bigFile = f;
			}
		}

		if(bigFile == null) 
			System.out.println("파일은 없습니다");
		else
			System.out.println("가장 큰 파일은 " + bigFile.getPath() + " " + bigSize + "바이트");
	}

}
