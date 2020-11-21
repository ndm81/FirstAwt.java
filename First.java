import java.awt.*;
class First extends Frame{
	First(){
		Button b=new Button("Click me ");
		b.setBounds(80,100,80,30); // set the position of the button
		add(b); // button add to the frame
		setSize(300,300);
		setLayout(null);
		setVisible(true);

	}
	public static void main(String[] args) {
		First f=new First();

	}
}