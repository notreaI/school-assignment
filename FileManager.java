import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
public class FileManager extends JFrame implements ActionListener{
	private JTextField textField = new JTextField(20);
	private JButton button = new JButton("List");
	File cd = new File(".");
	String[] fn = cd.list();
	String ans = "";
	public FileManager(){
		setLayout(new BorderLayout());
		add(textField,BorderLayout.NORTH);
		add(button,BorderLayout.CENTER);
		button.addActionListener(this);
		textField.addActionListener(this);
		setTitle("simple file manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == button){
			System.out.println(textField.getText());
			if(textField.getText().length()==0){
				for (int i = 0; i<fn.length;i++){
					ans = ans + fn[i]+"\n";
					System.out.println(ans);
				}
			
			JOptionPane.showMessageDialog(null,ans);
			}
		}
	}
	

public static void main(String[] args){
	FileManager ab = new FileManager();
	ab.setVisible(true);
}
}