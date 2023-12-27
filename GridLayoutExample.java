package GUI;
import java.awt.*;
import java.awt.event.*;
public class GridLayoutExample {
     public static void main(String args[]) {
    	 Frame frame = new Frame("GridLayoutFrame");
    	 Panel pa = new Panel();
    	 Button ba1 = new Button();
    	 Button ba2 = new Button();
    	 Button ba3= new Button();
    	 Button ba4 = new Button();
    	 Button ba5 = new Button();
    	 frame.add(pa);
    	 //pa.setlayout(new GridLayout());
    	 pa.setLayout(new GridLayout(1,2));
    	 //pa.setLayout(new GridLayout(3,2,10,15));
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
