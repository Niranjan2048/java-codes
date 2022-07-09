import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUISwing implements ActionListener
{
	JTextField tf1,tf2,tf3,tf4;
	GUISwing()
	{
		JFrame frame = new JFrame("GUISwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("Name: ");
		tf1 = new JTextField(5);
		JLabel label2 = new JLabel("Roll no: ");
		tf2 = new JTextField(5);
		JLabel label3 = new JLabel("City: ");
		tf3 = new JTextField(5);
		JLabel label4 = new JLabel("Zipcode: ");
		tf4 = new JTextField(5);
		JButton b = new JButton("My_Info");
		JButton reset = new JButton("Reset");
		
		panel1.add(label1);
		panel1.add(tf1);
		panel1.add(label2);
		panel1.add(tf2);
		panel1.add(label3);
		panel1.add(tf3);
		panel1.add(label4);
		panel1.add(tf4);
		panel1.add(b);
		panel1.add(reset);
		
		frame.getContentPane().add(BorderLayout.CENTER,panel1);
		frame.setVisible(true);
		b.addActionListener(this);
		reset.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("My_Info"))
		{
			String s1;
			s1 = tf1.getText();
			tf1.setFont(new Font("Arial", Font.ITALIC,16));
			tf1.setText(s1);
			
			s1 = tf2.getText();
			tf2.setFont(new Font("Arial", Font.ITALIC,16));
			tf2.setText(s1);
			
			s1 = tf3.getText();
			tf3.setFont(new Font("Arial", Font.ITALIC,16));
			tf3.setText(s1);
			
			s1 = tf4.getText();
			tf4.setFont(new Font("Arial", Font.ITALIC,16));
			tf4.setText(s1);
		}
		else if(ae.getActionCommand().equals("Reset"))
		{
			tf1.setText(" ");
			tf1.setFont(new Font("Dialog", Font.PLAIN,12));
			tf2.setText(" ");
			tf2.setFont(new Font("Dialog", Font.PLAIN,12));
			tf3.setText(" ");
			tf3.setFont(new Font("Dialog", Font.PLAIN,12));
			tf4.setText(" ");
			tf4.setFont(new Font("Dialog", Font.PLAIN,12));
		}
	}
	
	public static void main(String args[]){
		GUISwing stu = new GUISwing();
	}
}
