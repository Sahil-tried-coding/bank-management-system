package Bank.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3 ;
    JTextField textfield2;
    JPasswordField password3;

    JButton btn1,btn2,btn3;
    Login(){
        super("Bank System");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/banklogo.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
//        image.setBounds(350,10,100,100);
        image.setBounds(200,10,100,100);
        add(image);
        setLayout(null);


        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image c2 = c1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel cimage = new JLabel(c3);
        cimage.setBounds(630,350,100,100);
        add(cimage);
        setLayout(null);


        label1 = new JLabel("WELCOME TO THE ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("mulish",Font.BOLD,38));
//        label1.setBounds(230,125,450,40);
        label1.setBounds(350,50,450,40);
        add(label1);


        label2 = new JLabel("Card No :");
        label2.setForeground(Color.white);
        label2.setFont(new Font("SansSerif", Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        textfield2 = new JTextField(15);
        textfield2.setBounds(325,190,230,30);
        textfield2.setFont(new Font("Arial",Font.BOLD,14));
        add(textfield2);

        label3 = new JLabel("PIN NO :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("“SansSerif", Font.BOLD,28));
        label3.setBounds(150,250,375,28);
        add(label3);

        password3 = new JPasswordField(15);
        password3.setBounds(325,250,230,30);
        password3.setFont(new Font("Arial",Font.BOLD,14));
        add(password3);

        btn1 = new JButton("SIGN-IN");
        btn1.setFont(new Font("Arial",Font.BOLD,15));
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLACK);
        btn1.setBounds(300,320,100,30);
        btn1.addActionListener(this);
        add(btn1);

        btn2 =new JButton("CLEAR");
        btn2.setBounds(430,320,100,30);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.BLACK);
        btn2.setFont(new Font("Arial",Font.BOLD,15));
        btn2.addActionListener(this);
        add(btn2);


        btn3 =new JButton("SIGN-UP");
        btn3.setFont(new Font("Arial",Font.BOLD,15));
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.setBounds(300,370,230,30);
        btn3.addActionListener(this);
        add(btn3);




        ImageIcon bg1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image bg2 = bg1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel bgimage = new JLabel(bg3);
        bgimage.setBounds(0,0,850,480);
        add(bgimage);


        setSize(850,480);
        setLocation(450,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==btn1){
                Conn c = new Conn();
                String cardno = textfield2.getText();
                String pin = password3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statements.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }

            }
            else if(e.getSource()==btn2){
                textfield2.setText("");
                password3.setText("");

            } else if (e.getSource()==btn3) {
                new signup();
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
