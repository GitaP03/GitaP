package mypackage;


import java.awt.*;
class My
{
	public static void main(String args[])
	{
		Frame f=new Frame("FrameDemo");
		f.setVisible(true);
		f.setBackground(Color.red);
		f.setSize(500,500);
		Button b=new Button("Button1");
		f.add(b);
		f.setLayout(new FlowLayout());
		TextField t=new TextField(" ");
		f.add(t);
	}
}