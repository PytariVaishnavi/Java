package GUI;
import java.awt.event.*;
import java.awt.*;
public class CardLayoutExample {
	public static void main(String args[]) {
		Frame frame = new Frame("CardLayoutBorder");
		Panel pa = new Panel();
		Button ba1 = new Button();
		Button ba2 = new Button();
   	 Button ba3= new Button();
   	 Button ba4 = new Button();
   	 Button ba5 = new Button();
   	 frame.add(pa);
   	 pa.setLayout(new CardLayout());
   	 //pa.setLayout(new CardLayout());
   	 pa.add(new Button("India"));
   	 pa.add(new Button("Pakisthan"));
   	 pa.add(new Button("Japan"));
   	 pa.add(new Button("China"));
   	 pa.add(new Button("Countries"));
   	 frame.setSize(300,300);
   	 frame.setVisible(true);
   	 frame.addWindowListener(new WindowAdapter() {
   		 public void windowClosing(WindowEvent e) {
   			 System.exit(0);
   		 }
   	 });
	}
}
