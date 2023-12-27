package GUI;
import java.awt.*;
import java.awt.event.*;
public class BorderLayoutExample {
    public static void main(String args[]) {
    	Frame frame=new Frame("BorderLayoutFrame");
    	Panel pa=new Panel();
    	Button ba1=new Button();
    	Button ba2=new Button();
    	Button ba3=new Button();
    	Button ba4=new Button();
    	Button ba5=new Button();
    	frame.add(pa);
    	pa.setLayout(new BorderLayout(5,5));
    	pa.add(new Button("India"),BorderLayout.NORTH);
    	pa.add(new Button("Pakisthan"),BorderLayout.SOUTH);
    	pa.add(new Button("Japan"),BorderLayout.EAST);
    	pa.add(new Button("China"),BorderLayout.WEST);
    	pa.add(new Button("Countries"),BorderLayout.CENTER);
    	frame.setSize(300,300);
    	frame.setVisible(true);
    	frame.addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent we) {
    			System.exit(0);
    		}
    	});
    }
}
