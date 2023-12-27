package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MenubarExample{
    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    JLabel l; 
    MenubarExample(){
    	JFrame f = new JFrame("Menu and MenuItem Example");
    	JMenuBar mb = new JMenuBar();
    	menu=new JMenu("Menu");  
        submenu=new JMenu("Sub Menu");
        i1=new JMenuItem("Item 1");  
        i2=new JMenuItem("Item 2");  
        i3=new JMenuItem("Item 3");  
        i4=new JMenuItem("Item 4");  
        i5=new JMenuItem("Item 5");
        menu.add(i1); menu.add(i2); menu.add(i3);  
        submenu.add(i4); submenu.add(i5);  
        menu.add(submenu);  
        mb.add(menu); 
        l=new JLabel(); 
        l.setBounds(5,5,360,320); 
        f.add(l);  
        f.setJMenuBar(mb);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }
    public static void main(String args[])  
    {  
    new MenubarExample(); }
}
