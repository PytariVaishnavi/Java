package GUI;
import java.awt.*;
import java.awt.event.*;
public class FlowLayoutExample {
     public static void main(String args[]) {
    	 Frame frame = new Frame("FlowLayoutFrame");
    	 Panel pa = new Panel();
    	 Button ba1 = new Button();
    	 Button ba2 = new Button();
    	 Button ba3= new Button();
    	 Button ba4 = new Button();
    	 Button ba5 = new Button();
    	 frame.add(pa);
    	 //pa.setLayout(new FlowLayout());
    	 //pa.setLayout(new FlowLayout(FlowLayout.RIGHT));
    	 pa.setLayout(new FlowLayout(FlowLayout.RIGHT,20,25));
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
