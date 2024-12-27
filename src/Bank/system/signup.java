package Bank.system;


import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class signup extends JFrame implements ActionListener {
    Random ran = new Random();
    long first4 = (ran.nextLong()% 9000L) + 1000L;
    String first = " "+Math.abs(first4);
    JTextField textname,ftextname,emailtext,addtext,mtext,pintext,citytext,statetext;

    JRadioButton rdbtn,rdbtn2,cbx1,cbx2,cbx3;

    JButton next ;
    JDateChooser dateChooser;

    signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/banklogo.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);



        JLabel label1 = new JLabel("Application Form No : " + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Mulish",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1 : Personal Details");
        label2.setBounds(330,70,660,30);
        label2.setFont(new Font("Mulish",Font.BOLD,22));
        add(label2);
//
//        JLabel label3 = new JLabel("Personal details");
//        label3.setBounds(290,90,600,30);
//        label3.setFont(new Font("Mulish",Font.BOLD,22));
//        add(label3);

        JLabel Namelabel = new JLabel("Name :");
        Namelabel.setBounds(80,190,100,30);
        Namelabel.setFont(new Font("Muslish",Font.BOLD,28));
        add(Namelabel);

        textname =new JTextField();
        textname.setBounds(300,190,300,30);
        textname.setFont(new Font("Mulish",Font.BOLD,14));
        add(textname);

        JLabel fname = new JLabel("Father's Name :");
        fname.setBounds(80,240,400,30);
        fname.setFont(new Font("Muslish",Font.BOLD,28));
        add(fname);

        ftextname =new JTextField();
        ftextname.setBounds(300,240,300,30);
        ftextname.setFont(new Font("Mulish",Font.BOLD,14));
        add(ftextname);

        JLabel dob = new JLabel("Date Of Birth :");
        dob.setBounds(80,300,200,30);
        dob.setFont(new Font("Muslish",Font.BOLD,28));
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,300,300,30);
        add(dateChooser);

        JLabel glabel = new JLabel("Gender :");
        glabel.setBounds(80,350,200,30);
        glabel.setFont(new Font("Muslish",Font.BOLD,28));
        add(glabel);

        rdbtn = new JRadioButton("Male");
        rdbtn.setFont(new Font("muslish",Font.BOLD,20));
        rdbtn.setBounds(300,355,100,20);
        rdbtn.setBackground(new Color(245, 223, 255));
        add(rdbtn);



        rdbtn2 = new JRadioButton("Female");
        rdbtn2.setFont(new Font("muslish",Font.BOLD,20));
        rdbtn2.setBounds(400,355,100,20);
        rdbtn2.setBackground(new Color(245, 223, 255));
        add(rdbtn2);

        ButtonGroup btngrup = new ButtonGroup();
        btngrup.add(rdbtn);
        btngrup.add(rdbtn2);

        JLabel elabel = new JLabel("Email :");
        elabel.setFont(new Font("Mulish",Font.BOLD,28));
        elabel.setBounds(80,400,100,30);
        add(elabel);

        emailtext = new JTextField();
        emailtext.setFont(new Font("Arial",Font.BOLD,14));
        emailtext.setBounds(300,400,300,30);
        add(emailtext);

        JLabel mlabel = new JLabel("Matarial status :");
        mlabel.setFont(new Font("Mulish",Font.BOLD,28));
        mlabel.setBounds(80,450,250,30);
        add(mlabel);

        cbx1 = new JRadioButton("Married");
        cbx1.setBounds(300,450,100,30);
        cbx1.setFont(new Font("muslish",Font.BOLD,20));
        cbx1.setBackground(new Color(245, 223, 255));
        add(cbx1);

        cbx2 = new JRadioButton("Unmarried");
        cbx2.setBounds(450,450,150,30);
        cbx2.setFont(new Font("muslish",Font.BOLD,20));
        cbx2.setBackground(new Color(245, 223, 255));
        add(cbx2);

        cbx3 = new JRadioButton("Other");
        cbx3.setBounds(600,450,150,30);
        cbx3.setFont(new Font("muslish",Font.BOLD,20));
        cbx3.setBackground(new Color(245, 223, 255));
        add(cbx3);

        ButtonGroup btngrup2 = new ButtonGroup();
        btngrup2.add(cbx1);
        btngrup2.add(cbx2);
        btngrup2.add(cbx3);


//        mtext = new JTextField();
//        mtext.setFont(new Font("Arial",Font.BOLD,14));
//        mtext.setBounds(300,450,300,30);
//        add(mtext);

        JLabel addlabel = new JLabel("Address :");
        addlabel.setFont(new Font("Mulish",Font.BOLD,28));
        addlabel.setBounds(80,500,200,30);
        add(addlabel);

        addtext = new JTextField();
        addtext.setFont(new Font("Arial",Font.BOLD,14));
        addtext.setBounds(300,500,300,30);
        add(addtext);

        JLabel citylabel = new JLabel("City :");
        citylabel.setFont(new Font("Mulish",Font.BOLD,28));
        citylabel.setBounds(80,550,200,30);
        add(citylabel);

        citytext = new JTextField();
        citytext.setFont(new Font("Arial",Font.BOLD,14));
        citytext.setBounds(300,550,300,30);
        add(citytext);

        JLabel pinlabel = new JLabel("Pin Code :");
        pinlabel.setFont(new Font("Mulish",Font.BOLD,28));
        pinlabel.setBounds(80,600,200,30);
        add(pinlabel);

        pintext = new JTextField();
        pintext.setFont(new Font("Arial",Font.BOLD,14));
        pintext.setBounds(300,600,300,30);
        add(pintext);

        JLabel statelabel = new JLabel("State :");
        statelabel.setFont(new Font("Mulish",Font.BOLD,28));
        statelabel.setBounds(80,650,200,30);
        add(statelabel);

        statetext = new JTextField();
        statetext.setFont(new Font("Arial",Font.BOLD,14));
        statetext.setBounds(300,650,300,30);
        add(statetext);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Mulish",Font.BOLD,14));
        next.setForeground(Color.WHITE);
        next.setBounds(650,700,100,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(245, 223, 255));
        setLayout(null);
        setLocation(360,40);
        setSize(850,800);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        String formno = first;
        String name = textname.getText();
        String fname = ftextname.getText();
        String gender = null;
        if(rdbtn.isSelected()){
            gender ="Male";
        } else if (rdbtn2.isSelected()) {
            gender ="Female";
        }
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String matarialStatus = null;
        if(cbx1.isSelected()){
            matarialStatus = "Married";
        } else if (cbx2.isSelected()) {
            matarialStatus="Unmarried";
        } else if (cbx3.isSelected()) {
            matarialStatus="Others";
        }
        String address = addtext.getText();
        String email = emailtext.getText();
        String pincode = pintext.getText();
        String state = statetext.getText();
        String city = citytext.getText();


        try{
            //for if someone not filled the name
            if(textname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Fill the form !");
            }
            else {
                Conn con1 = new Conn();
                String q = "insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+gender+"','"+dob+"','"+matarialStatus+"','"+address+"','"+email+"','"+pincode+"','"+state+"','"+city+"')";
                // table main value insert karne executeUpdate func use karte
                con1.statements.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args){
        new signup();
    }
}
