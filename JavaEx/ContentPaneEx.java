package practice;
import java.awt.*; // �׷��� ó���� ���� Ŭ�������� ��θ�
import java.awt.event.*; // AWT �̺�Ʈ ����� ���� ��θ�
import javax.swing.*; // ���� ������Ʈ Ŭ�������� ��θ�
import javax.swing.event.*; // ���� �̺�Ʈ�� ���� ��θ�

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� �������α׷� ����
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());  // �����̳� ��ġ ���
		
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
