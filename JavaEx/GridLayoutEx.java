package practice;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("GridLayout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		
		c.setLayout(grid);
		c.add(new JLabel("이름"));  //항목
		c.add(new JTextField("")); //입력받는 칸
		c.add(new JLabel("학번"));  //항목
		c.add(new JTextField("")); //입력받는 칸
		c.add(new JLabel("학과"));  //항목
		c.add(new JTextField("")); //입력받는 칸
		c.add(new JLabel("과목"));  //항목
		c.add(new JTextField("")); //입력받는 칸
		
		setSize(300, 200);
		setVisible(true);
		
	}
	public static void main(String[]args) {
		new GridLayoutEx();
	}
}
