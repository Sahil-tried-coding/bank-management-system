package Bank.system;

import javax.swing.*;
public class Main extends JFrame{
    Main(){
        setSize(800,400);
        setVisible(true);
        setTitle("BANK MANAGEMENT SYSTEM");
        ImageIcon imageIcon = new ImageIcon( ClassLoader.getSystemResource("icons//bhaibhai.jpg"));
        JLabel label = new JLabel(imageIcon);
        add(label);

    }
    public static void main(String[] args){
        new Main();
    }
}
