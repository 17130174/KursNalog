/*����� (package) � ��� ����� ���������, ������� ������������ ��� ����, ����� ����������� ����� �������. */
package NalogC;    
/* java. - ��� ����������� ������, ������������ � �������� Java, �������� � ������ java.
java.awt - ����������� ������ awt, ����������� ������� ����������� �������:GridLayout, BorderLayout � �.�.
"*"-��������� ���� ��������� ���������� awt */
import java.awt.*;
import java.awt.event.*;
/* �����������:
javax.* � ����������� ����������.(����������� ���������� (standard extensions) � ��� ������ ��� ����-�� ������� Java)
Swing - ���������� ������������ ���������� (���������� �����), � ������� �� java.awt, javax.swing ����� ����� ������
������� ���������� � ����� ������� ����� �������
"*"-��������� ���� ��������� ���������� Swing (jbutton,jpanel,jlabel � �.�.)
"." ������������ ��� ��������� ��������� �� ������ �� ������.
*/
import javax.swing.*;  
/*���������� ����������� ��� ����, ����� ���������� �������*/
import javax.swing.border.*; 
/* (Public) - ���� � ������ ������ Nalog �������� ��� ���� ������ �������� � �������.
����������������� ����� class - ������� �����������, ��� �� ���������� ������� ����� ����� Nalog.
����� ��������� ������� �������� JFrame, ������� �������� � ����������� ���������� awt.
JFrame - ���� ����. JFrame �������� � ���� �� ����������� ��� �������� � ���������������� ���� ��������� - ��
���������� ��� ������ � ����� ���������. { }-�������� ������ ������������� ����� ��������� ��������.
*/
	public class Nalog extends JFrame{
	private static final long serialVersionUID = 1L;
	/* Nalog() - ��� ��������� ����������� (������ �������) �� JFrame.
	(Public) - �������� ��� ����� Nalog ����� ������� �� ������ ����� ������� ����� � ������ NalogC.
	static ��������� ���������� ����������� ������. ��� ����� ������, ������� �������� ������ ��� ������, � �� ���
	���������� ������� ����� ������. ����� ��� ����� �������� ���� �� ������������ ������ ������.� ����������� �������
	� ���������� ����� ���������� ����� ��� ������*/
	public static Nalog frame = new Nalog(); 
	/*
	����������� ������� public ��������, ��� ����� main(String[] args)����� � �������� ����-�� ������.
	static ��������� ���������� ����������� ������. ��� ����� ������, ������� �������� ��-���� ��� ������, � �� ���
	���������� ������� ����� ������. ����� ��� ����� �������� ���� �� ������������ ������ ������.� ����������� �������
	� ���������� ����� ���������� ����� ��� ������.
	void ��������, ��� ����� main(String[] args)�� ���������� ������ � ���������, ������� ��� �������,
	� ������ ������� �� ����� ������.
	� ������ main ����� String[] args ��������,��� ���� ����� �������� ������ �������� � ��-��� String, �.�. ��������� ������.
	��������� ����� �������� �� ���������� �������, �� ������ ���� �� ��� �������� ����� main().
	��� ������������ ���������� Java-���������������, ������� ������� ���������������� �����,
	�������� ���� ������ � ������ ������ main.
	*/
	public static void main(String[] args) { 
		/*����������� ����� ������� ��������� ������ � eventQueue
		 � EvenQueue ����� �������, ����� ��� ������� ���������� ��� ������� ����.*/
	EventQueue.invokeLater(new Runnable() {
		/* public - ����������� �������, ����������, ��� ����� run() ����� � ��-������ ������ ������.
		void ()��������, ��� ����� run �� ���������� ������ � ���������, ������� ��� �������,
		� ������ ������� �� ����� ������.
		����� run � ������� ��������, �.�. ����� �� ����� �������-���(����������)
		*/
	public void run() {
		/* ��� ������� ����� ������������ ����, ������� ��������� �������� �� ����������, ��-���������� �������� ����� try.
		����� �� ����� try-����� ���������� ���� catch, �������� ��� ���������� ������� �� ������ ������������.
		���������� � ��� ���������� ��������, ����������� �� ���� ���������� ���� �������-��. �������� ��� ���:
		1.����������� ��� ������ ����� try. 2.���� � ��� ������ ���, �� ���� catch(err) ��������-����, �� ���� ����������
		������� �� ����� try � ����� ������� ����� catch. 3.���� � ��� ��������� ������, �� ��-�������� try �� ���
		�����������, � ���������� ������� � ������ ����� catch(err).
		*/
	try {
		/*������������� ��� ���� Nalog ������ ������������*/
	frame.setVisible(true); 
	} catch (Exception e) {
		/* ��� ������� ����� ������������ ����, ������� ��������� ����-���� �� ����������, ������������ �������� ����� try.
		����� �� ����� try-����� ���������� ���� catch, �������� ��� ���������� ������� �� ������ ������������.
		���������� � ��� ���������� ��������, ����������� �� ���� ���������� ���� ���������. �������� ��� ���:
		1.����������� ��� ������ ����� try. 2.���� � ��� ������ ���, �� ���� catch(err) ������������, �� ���� ����������
		������� �� ����� try � ����� ������� ����� catch. 3.���� � ��� ��������� ������, �� ���������� try �� ���
		�����������, � ���������� ������� � ������ ����� catch(err).
		*/
	e.printStackTrace();
	}
	}
	});
	}
	/*������ �� ������� ������������� ���� � ������. ������ �������� ������ ��� ������� ������ (private)*/
	private JPanel panel1;
	/* ������ "�����" � "������������" ������� �������� ������ ��� ������� ������*/
	private JButton calc,calc2;
	/* ��������� �� ������� ������������� �����*/
	private JLabel label_1;
	/*����������� ��� ������. �������� ����*/
	public static double int_rad;
	/*�������� ��������� ����������*/
	static double a=13,a1=13,a2=15,a3=30,a4=35;
	/*����������� ������� public ��������, ��� ����� Nalog()����� � �������� ������ ������.
	static ��������, ��� �� ����� ��������� ���������(�����) ������� Nalog � ������, ����� ������������ ���� �����.
	Nalog - ������������ �� ������ ����������� (������ �������), .*/
	public Nalog() { 
	/*������������� �������� ����*/
	setTitle("����");
	/*��������� ������ � ������.*/
	setSize(225, 175); 
	/*���������� ���������� ������*/
	setLocationRelativeTo(null);
	/*�� �������� ����� - �� ��������� ����������*/
	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	/* �������� new ������� ��������� ���������� ������
	����� setLayout - ����� ��������� ����������, ������� ������ ������������ ������� ������� � ����������.
	�������� ���������� BorderLayout - ��� �������� ����������, ��� ������� �� ��������-���� ���������� �����������
	�� ���� ������. � ������ �� ���� ������ ������������� ���� ���������.
	��� ���������� ���������� �� ��������� � BorderLayout ����������� ����������� �����-����,
	���� ������ �� ����� ��������� ���������.*/
	setLayout (new BorderLayout()); 
	/*������ �� ������� ������������� ��������� ���� � ������*/
	panel1 = new JPanel();
	/*���������� ������ panel1 �� ������*/
	add(panel1, BorderLayout.CENTER);
	/*��������� ���������� �����-���(������,�����,�����,������)*/
	panel1.setBorder(new EmptyBorder(10,10,10,10));
	/* ��������� ��������� ���������� GridLayout. ������ �������� ���������� ����������� ���������� �
	 ������� */
	/* �� ������ 3 ������, 1 ������� ,5 - ���������� ����� ���������, 5 - ����� �������� */
	panel1.setLayout(new GridLayout(3,1,5,5));
	/*���������� ��� ���������� calc,calc2  �������� ��������
	 *  JButton � ������� - ������� �� ������*/
	calc = new JButton("������������");
	calc2 = new JButton("�����");
	/*���������� ��� ���������� label_1 �������� �������� JLabel � ��������� ��-��� ����� ����� ����������.
	JLabel.CENTER - ������������ �� ������
	*/
	label_1 = new JLabel("����� ���:", JLabel.CENTER);
	/*���������� ���������� JLabel �� ������ panel1*/
	panel1.add(label_1);
	/*���������� ���������� JLabel �� ������ panel1*/
	panel1.add(calc);
	/*���������� ���������� JButton �� ������ panel1*/
	panel1.add(calc2);
	/*��������� ������� ��� ������� �� ������ calc*/
	calc.addActionListener(new ActionListener() { 
           public void actionPerformed(ActionEvent e) {
        	   /*����� main2 �� ������ Nalog*/
        	   Nalog.main2(null);
        	   }
       });
	/*��������� ������� ��� ������� �� ������ calc2*/
	calc2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	/*����� main �� ������ Password*/
        	Password.main(null);
     		}
 });
	}
	/*
	����������� ������� public ��������, ��� ����� main2(String[] args)����� � �������� ����-�� ������.
	static ��������� ���������� ����������� ������. ��� ����� ������, ������� �������� ��-���� ��� ������, � �� ���
	���������� ������� ����� ������. ����� ��� ����� �������� ���� �� ������������ ������ ������.� ����������� �������
	� ���������� ����� ���������� ����� ��� ������.
	void ��������, ��� ����� main2(String[] args)�� ���������� ������ � ���������, ������� ��� �������,
	� ������ ������� �� ����� ������.
	� ������ main2 ����� String[] args ��������,��� ���� ����� �������� ������ �������� � ��-��� String, �.�. ��������� ������.
	��������� ����� �������� �� ���������� �������, �� ������ ���� �� ��� �������� ����� main().
	��� ������������ ���������� Java-���������������, ������� ������� ���������������� �����,
	�������� ���� ������ � ������ ������ main2.
	*/
public static void main2(String[] args) { 
	/*SwingUtilities.invokeLater ������������� ��� ������� ����������� ��������. 
	 * ��� ��������� �������� (Runnable), � ��������� ��� �� ����� �� ��������� �������� ����� ���������.*/
SwingUtilities.invokeLater(new Runnable() { 
	/* public - ����������� �������, ����������, ��� ����� run() ����� � ��-������ ������ ������.
	void ()��������, ��� ����� run �� ���������� ������ � ���������, ������� ��� �������,
	� ������ ������� �� ����� ������.
	����� run � ������� ��������, �.�. ����� �� ����� �������-���(����������)
	*/
public void run() { 
	/* ��������� �� ������� ������������� ����*/
JFrame form2 = new JFrame();
/*������ �� ������� ������������� ��������� ����, ���� ����� � ������.*/
JPanel panel, panel1; 
/* ������ "����������" � "� ����" */
JButton calc,calc2; 
/* ���������� �� ������� ������������� �����*/
JLabel label_1,label_2,label_3, label_4,label_n,sum_n,sum,label_n1,label_n2,label_n3,label_n4; 
/* ��������� ���� � ������� ������������ ������ ������ */
JTextField sum_ok;
/* ��������� ������������� (��� ������� �� ���� ��
����� ������ ����� ������� ������ ������������ � �������� ���������)*/
JRadioButton rad_13, rad_13_1,rad_15, rad_30, rad_35;
/*������������� �������� ���� � form2*/
form2.setTitle("����������� ����");
/*��������� ������ � ������ � form2.*/
form2.setSize(475, 290); 
/*���������� ���������� ������ � form2*/
form2.setLocationRelativeTo(null); 
/*�� �������� ����� - �� ��������� ���������� � form2*/
form2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
/*� ������ ��������� �������� BorderLayout � form2 */
form2.setLayout (new BorderLayout()); 
/*���� ��������� �������*/
form2.setVisible(true); 
/*������ �� ������� ������������� ��������� ���� � ������-�������������*/
panel = new JPanel(); 
/*������ �� ������� ������������� ������*/
panel1 = new JPanel();
/*���������� ������ panel �� ������ � form2*/
form2.add(panel, BorderLayout.CENTER); 
/*���������� ������ panel2 ����� � form2*/
form2.add(panel1, BorderLayout.SOUTH); 
/*��������� ���������� �����-���(������,�����,�����,������)*/
panel.setBorder(new EmptyBorder(10,0,10,10)); 
/*��������� ���������� �����-���(������,�����,�����,������)*/
panel1.setBorder(new EmptyBorder(10,10,10,10)); 
/* ��������� ��������� ���������� GridLayout. ������ �������� ���������� ����������� ���������� � 
 * ������� */
/* �� ������ 9 �����, 2 �������,5 - ���������� ��-��� ���������,  0- ����� ��������  */
panel.setLayout(new GridLayout(9,2,5,0)); 
/*�� ������ 1 ������,2 �������, ����� ����������� ������*/
panel1.setLayout(new GridLayout(1,2)); 
/*���������� ��� ���������� label_1,label_2,label_3, label_4,label_n,sum_n,
 * sum,label_n1,label_n2,label_n3,label_n4 �������� ��������
 *  JLabel � ��������� ��-��� ����� ����� ����������.
JLabel.CENTER - ������������ �� ������
JLabel.LEFT - ������������ �� ������ ����
JLabel.RIGHT - ������������ �� ������� ����
*/
label_1 = new JLabel("�������� ����� ���:", JLabel.LEFT); 
label_2 = new JLabel("��������", JLabel.LEFT); 
label_3 = new JLabel("����� ������, ���.", JLabel.LEFT); 
label_4 = new JLabel("����� �� ����, ���.", JLabel.LEFT); 
label_n = new JLabel(""); 
label_n1 = new JLabel("����������"); 
label_n2 = new JLabel("�����", JLabel.RIGHT); 
label_n3 = new JLabel("���:", JLabel.LEFT); 
label_n4 = new JLabel("");
sum_n = new JLabel("", JLabel.CENTER); 
sum = new JLabel("", JLabel.CENTER); 
/*���������� ��� ���������� calc,calc2  �������� ��������
 *  JButton � ������� - ������� �� ������*/
calc = new JButton("����������"); 
calc2 = new JButton("� ����"); 
/* ��������� ���� � ������� ������������ ������ ������ */
sum_ok = new JTextField(); 
/*������������ ������ �� ������*/
sum_ok.setHorizontalAlignment(JTextField.CENTER);
/*��������� ���������� �������� ��� ���������� ��-�� (2-������� ������, 5-�����, 2-������, 5-������)*/
sum_ok.setMargin(new Insets(2, 5, 2, 5)); 
/*������ ������*/
/*���������� ��� ���������� rad_13, rad_13_1,rad_15, 
 * rad_30, rad_35 �������� ����������� ��������������
 *  JRadioButton � ��������� ����� ����� ����� ����������.
JRadioButton.LEFT - ������������ �� ������ ����
*/
ButtonGroup group = new ButtonGroup(); 
rad_13 = new JRadioButton("����",false);
/*��������� � ������ ������ ����������
 * rad_13, rad_13_1,rad_15, 
 * rad_30, rad_35*/
group.add(rad_13); 
rad_13.setHorizontalAlignment(JRadioButton.LEFT); 
rad_13_1 = new JRadioButton("����� ����� ���������� ����",false); 
group.add(rad_13_1); 
rad_13_1.setHorizontalAlignment(JRadioButton.LEFT); 
rad_15 = new JRadioButton("���������", false); 
group.add(rad_15); 
rad_15.setHorizontalAlignment(JRadioButton.LEFT); 
rad_30 = new JRadioButton("����", false); 
group.add(rad_30); 
rad_30.setHorizontalAlignment(JRadioButton.LEFT); 
rad_35 = new JRadioButton("�������,���� ��� ����", false); 
group.add(rad_35); 
rad_35.setHorizontalAlignment(JRadioButton.LEFT); 
/*���������� ����������� JRadioButton, JLabel, JTextField �� ������ panel*/
panel.add(label_1); 
panel.add(label_n); 
panel.add(label_2); 
panel.add(label_n1); 
panel.add(label_n2); 
panel.add(label_n3); 
panel.add(rad_35); 
panel.add(rad_13_1); 
panel.add(rad_13); 
panel.add(rad_15); 
panel.add(label_n4); 
panel.add(rad_30); 
panel.add(label_3); 
panel.add(sum_n); 
panel.add(label_4); 
panel.add(sum); 
panel.add(sum_ok); 
/*���������� ������ �� ������ panel1*/
panel1.add(calc); 
panel1.add(calc2); 
/* 	rad_13 - ��������� �������������
	"."  - ��������� � ����� ���������� ������� ��������� ���������.
	addActionListener - ���������� ��������� ActionListener � �������������
	new - �������� new ������� ��������� ���������� ������ 
	(��� ���� ����� ������ ����� ���������������, ������ �� ��� ���������� ���-������ ���������� �������, 
	������� ����� �������� �� ������������ �� �������. 
	� ����� ������ ��������� ���������������� ������� ������� �� ������������� � ����� ������ �����. 
	������� ����� �������������� ��������� "ActionListener", 
	��������������� ��� ��������� ������� "ActionEvent".
	���� ���������� ����������� ���� ����� �������� ������ "{" 		*/ 
rad_13.addActionListener(new ActionListener() 
{ 
	/* 	ActionListener" ����� ����� "actionPerformed" ������� "ActionEvent", 
		������� ����������� ����� �������� ������ ����������� ������� ActionPerformed.
		�������� ����� public ��������, ��� ����� actionPerformed() �������� ��� ������ ������� ������ Java
		�������� ����� void ��������, ��� ����� main() �� ���������� ������ � ���������, ����-��� ��� �������. 
	*/
public void actionPerformed(ActionEvent e) 
{ 
	/*���������� int_rad �������� "a"*/
int_rad=a; 
/*�������� ��������� ����*/
sum_n.setText("");
/*�������� ��������� ����*/
sum.setText(""); 
} 
}); 
/* 	rad_13_1 - ��������� �������������
"."  - ��������� � ����� ���������� ������� ��������� ���������.
addActionListener - ���������� ��������� ActionListener � �������������
new - �������� new ������� ��������� ���������� ������ 
(��� ���� ����� ������ ����� ���������������, ������ �� ��� ���������� ���-������ ���������� �������, 
������� ����� �������� �� ������������ �� �������. 
� ����� ������ ��������� ���������������� ������� ������� �� ������������� � ����� ������ �����. 
������� ����� �������������� ��������� "ActionListener", 
��������������� ��� ��������� ������� "ActionEvent".
���� ���������� ����������� ���� ����� �������� ������ "{" 		*/ 
rad_13_1.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{ 
	/*���������� int_rad �������� "a1"*/
int_rad=a1; 
/*�������� ��������� ����*/
sum_n.setText("");
/*�������� ��������� ����*/
sum.setText(""); 
} 
}); 
/* 	rad_15 - ��������� �������������
"."  - ��������� � ����� ���������� ������� ��������� ���������.
addActionListener - ���������� ��������� ActionListener � �������������
new - �������� new ������� ��������� ���������� ������ 
(��� ���� ����� ������ ����� ���������������, ������ �� ��� ���������� ���-������ ���������� �������, 
������� ����� �������� �� ������������ �� �������. 
� ����� ������ ��������� ���������������� ������� ������� �� ������������� � ����� ������ �����. 
������� ����� �������������� ��������� "ActionListener", 
��������������� ��� ��������� ������� "ActionEvent".
���� ���������� ����������� ���� ����� �������� ������ "{" 		*/ 
rad_15.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
	/*���������� int_rad �������� "a2"*/
int_rad=a2; 
/*�������� ��������� ����*/
sum_n.setText("");
/*�������� ��������� ����*/
sum.setText("");  
} 
}); 
/* 	rad_30 - ��������� �������������
"."  - ��������� � ����� ���������� ������� ��������� ���������.
addActionListener - ���������� ��������� ActionListener � �������������
new - �������� new ������� ��������� ���������� ������ 
(��� ���� ����� ������ ����� ���������������, ������ �� ��� ���������� ���-������ ���������� �������, 
������� ����� �������� �� ������������ �� �������. 
� ����� ������ ��������� ���������������� ������� ������� �� ������������� � ����� ������ �����. 
������� ����� �������������� ��������� "ActionListener", 
��������������� ��� ��������� ������� "ActionEvent".
���� ���������� ����������� ���� ����� �������� ������ "{" 		*/ 
rad_30.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
	/*���������� int_rad �������� "a3"*/
int_rad=a3; 
/*�������� ��������� ����*/
sum_n.setText("");
/*�������� ��������� ����*/
sum.setText(""); 
} 
}); 
/* 	rad_35 - ��������� �������������
"."  - ��������� � ����� ���������� ������� ��������� ���������.
addActionListener - ���������� ��������� ActionListener � �������������
new - �������� new ������� ��������� ���������� ������ 
(��� ���� ����� ������ ����� ���������������, ������ �� ��� ���������� ���-������ ���������� �������, 
������� ����� �������� �� ������������ �� �������. 
� ����� ������ ��������� ���������������� ������� ������� �� ������������� � ����� ������ �����. 
������� ����� �������������� ��������� "ActionListener", 
��������������� ��� ��������� ������� "ActionEvent".
���� ���������� ����������� ���� ����� �������� ������ "{" 		*/ 
rad_35.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
	/*���������� int_rad �������� "a4"*/
int_rad=a4; 
/*�������� ��������� ����*/
sum_n.setText("");
/*�������� ��������� ����*/
sum.setText(""); 
} 
}); 
/*��������� ������� ��� ������� �� ������ calc2*/
calc2.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
/*��������� form2 �� �� ��������� ���������*/
{form2.dispose();}});
/* 	calc - ������ ���������� 
	"."  - ��������� � ����� ���������� (������) ������� ��������� ���������.
	addActionListener - ���������� ��������� ActionListener � ������
	new - �������� new ������� ��������� ���������� ������ 
	(��� ���� ����� ������ ����� ���������������, ������ �� ��� ���������� ���-������ ���������� �������, 
	������� ����� �������� �� ������������ �� �������. 
	� ����� ������ ��������� ���������������� ������� ������� ������ � ����� ������ �����. 
	������� ����� �������������� ��������� "ActionListener", 
	��������������� ��� ��������� ������� "ActionEvent".
	���� ���������� ����������� ���� ����� �������� ������ "{"
	*/ 
calc.addActionListener(new 
ActionListener() 
{ 
	/* 	ActionListener" ����� ����� "actionPerformed" ������� "ActionEvent", 
		������� ����������� ����� �������� ������ ����������� ������� ActionPerformed.
		�������� ����� public ��������, ��� ����� actionPerformed() �������� ��� ������ ������� ������ Java
		�������� ����� void ��������, ��� ����� main() �� ���������� ������ � ���������, ����-��� ��� �������. 
	*/
public void actionPerformed(ActionEvent e) 
{ 
	/* if - �������� ����. * isValidInput ��������� ������ �� ������������, �.�. 
		���� � ��������� ���� ������� ����� ��� ������� (�����, ������� �����-����� ������������� � �����).
		���� ������� ������������ ������, �� ������ ������ */	
if (isValidInput(sum_ok, "����� ������")) { 
	/* � ����������  ������������ ������ �������� ������������� � ��������� ���� ������� ����������� � ����� Nalog.
	�������������� ������ � ��� Double. */ 
	double d = Double.valueOf(sum_ok.getText().toString()); 
	/*������ ����� ������*/
	double pr = int_rad; 
	/*������ ����� �� ����*/
	tax tax = new tax();
	
	double t = tax.calcTax(d, pr);
	double t2 = tax.calcTax2(d, pr);
	/* String - ��������� ��� ���������� ����� ����� ��������� ���,
	 * s_pmax - �������� ����� ����������,
	 * String.format - �������������� ���������� � ������� ���,
	 	%.2f - ��������� ��� ���������� ����� ��� Float, ���������� 2 ����� ����� �������,
	 	d_pmax - ���������� ���� double, ������� ���� ������������� � ��������� ���
	 	 */ 

	String s_sum_n = String.format("%.2f", t); 
	/* ���������� ��������� ���������� � ���� Jlabel */
	sum_n.setText(s_sum_n); 
	String s_sum = String.format("%.2f", t2); 
	/* ���������� ��������� ���������� � ���� Jlabel */
	sum.setText(s_sum); 
} 
} 
}
		); 
} 
/*�������� ������, ��������� �������������*/
public boolean isValidInput(JTextField jtxt, String description) {
	/*���� ��� ������ �����-���� �����*/
    JDialog D = new JDialog();
  /*�������� �� ���� ������ ������ �����*/
    if (jtxt.getText().trim().length() > 0) {
    	/* ��� ������� ����� ������������ ����, ������� ��������� �������� �� ����������, ������-������ �������� ����� try. 
		����� �� ����� try-����� ���������� ���� catch, �������� ��� �������-��� ������� �� ������ ������������.
		���������� � ��� ���������� ��������, ����������� �� ���� ���������� ���� ���������. �������� ��� ���:
		1.����������� ��� ������ ����� try. 2.���� � ��� ������ ���, �� ���� catch(err) ������������, �� ���� ���������� 
		������� �� ����� try � ����� ������� ����� catch. 3.���� � ��� ��������� ������, �� ���������� try �� ���
		 �����������, � ���������� ������� � ������ ����� catch(err).
		*/     
        try { 
        	/*������� ������������� ����� � ����� �����   */
             double num = Double.parseDouble(jtxt.getText().replace(',','.'));    
           /*���� ��� ��������� - ���������� true*/
            return true; 
           	/* ��� ������� ����� ������������ ����, ������� ��������� �������� �� ����������, ������������ �������� ����� try. 
        			����� �� ����� try-����� ���������� ���� catch, �������� ��� �������-��� ������� �� ������ ������������.
        			���������� � ��� ���������� ��������, ����������� �� ���� ���������� ���� ���������. �������� ��� ���:
        			1.����������� ��� ������ ����� try. 2.���� � ��� ������ ���, �� ���� catch(err) ������������, �� ���� ���������� 
        			������� �� ����� try � ����� ������� ����� catch. 3.���� � ��� ��������� ������, �� ���������� try �� ���
        			 �����������, � ���������� ������� � ������ ����� catch(err).
        			*/
        } catch (NumberFormatException e) {
            /*����������� ������ � ��������� ����, ����� ������������ ��� ��� ���� �����*/
            jtxt.requestFocus();
            /*�������� ��������� ����*/
            jtxt.setText("");
               /*�������������� - �������� ������ �����*/
            JOptionPane.showMessageDialog(D, "�� ������ ������ �����!", "������", JOptionPane.WARNING_MESSAGE);
          /* ������ - ���������� false */
            return false;
        }
     /* ���� ������������ �� ��� ������� ������*/
    } else {
        /*��������������, ��� ����� ������ ������*/
        JOptionPane.showMessageDialog(D, "������� " + description, "������", JOptionPane.WARNING_MESSAGE);
        /*����������� ������ � �������� ����, ����� ������������ ��� ��� ���� �����*/
        jtxt.requestFocus();
      /*�������� ��������� ����*/
        jtxt.selectAll();
        /*������ - ���������� false*/
        return false;
    }