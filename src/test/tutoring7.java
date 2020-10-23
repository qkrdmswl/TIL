package test;
import java.util.*;

public class tutoring7 {
	public static void main(String[]args) {
		int Array[][] = new int[4][4]; 
		
		for(int i=0; i <10; i++) {
			int a = (int)(Math.random()*4);
			int b = (int)(Math.random()*4);
			if(Array[a][b]!=0) {
				i--;
				continue;
			}
			else {
				Array[a][b] = (int)(Math.random()*9) + 1;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				 System.out.print(Array[i][j]);
				}
			System.out.println();
			}
		}
	}
		




