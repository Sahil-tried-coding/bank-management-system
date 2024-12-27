package Bank.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    String formno;
    JButton next;
    JTextField textpan,textaadhar;
    JRadioButton r1,r2,r3,r4;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    signup2(String formno){

        super("APPLICATION FORM");
        JLabel li = new JLabel("Page 2 :-");
        li.setFont(new Font("Raleway",Font.BOLD,22));
        li.setBounds(300,30,600,40);
        add(li);

        this.formno=formno;
        JLabel l2 = new JLabel("Additional Details");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={"Muslim","Hindu","Chirstan","Shikh","other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);


        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category []={"Open","OBC","SC","ST","NT","other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("raleway",Font.BOLD,14));
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income []={"null","1,50,000","2,50,000","5,00,000","up to 10,00,000","above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("raleway",Font.BOLD,14));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String education []={"Graduate","Non-Graduate","post-Graduate","Doctrate","others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setFont(new Font("raleway",Font.BOLD,14));
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occuppation :");
        l7.setFont(new Font("raleway",Font.BOLD,18));
        l7.setBounds(100,340,140,30);
        add(l7);

        String occupation []={"Salaried","Self-Employed","Business","Student","Retired","other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setFont(new Font("raleway",Font.BOLD,14));
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel i8 = new JLabel("Pan Number");
        i8.setFont(new Font("raleway",Font.BOLD,18));
        i8.setBounds(100,390,140,30);
        add(i8);

        textpan=new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBounds(350,390,320,30);
        add(textpan);

        JLabel i9 = new JLabel("Aadhar Number");
        i9.setFont(new Font("raleway",Font.BOLD,18));
        i9.setBounds(100,440,140,30);
        add(i9);

        textaadhar=new JTextField();
        textaadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textaadhar.setBounds(350,440,320,30);
        add(textaadhar);


        JLabel i10 = new JLabel("Senior Citizen");
        i10.setFont(new Font("raleway",Font.BOLD,18));
        i10.setBounds(100,490,180,30);
        add(i10);


        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("raleway",Font.BOLD,14));
        r1.setBackground((new Color(246, 186, 13)));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("raleway",Font.BOLD,14));
        r2.setBackground((new Color(246, 186, 13)));
        r2.setBounds(460,490,100,30);
        add(r2);

        ButtonGroup btngrp = new ButtonGroup();

        btngrp.add(r1);
        btngrp.add(r2);



        JLabel i11 = new JLabel("Existing Account");
        i11.setFont(new Font("raleway",Font.BOLD,18));
        i11.setBounds(100,540,180,30);
        add(i11);


        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("raleway",Font.BOLD,14));
        r3.setBackground((new Color(246, 186, 13)));
        r3.setBounds(350,540,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("raleway",Font.BOLD,14));
        r4.setBackground((new Color(246, 186, 13)));
        r4.setBounds(460,540,100,30);
        add(r4);

        ButtonGroup btngrp1 = new ButtonGroup();
        btngrp1.add(r3);
        btngrp1.add(r4);

        JLabel i12 = new JLabel("Form no :");
        i12.setFont(new Font("raleway",Font.BOLD,14));
        i12.setBounds(700,10,100,30);
        add(i12);

        JLabel i13 = new JLabel(formno);
        i13.setFont(new Font("raleway",Font.BOLD,14));
        i13.setBounds(760,10,100,30);
        add(i13);

        next = new JButton("Next");
        next.setFont(new Font("raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);





        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/banklogo.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
//        image.setBounds(350,10,100,100);
        image.setBounds(170,10,100,100);
        add(image);

        this.formno=formno;




        setLayout(null);

        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(246, 186, 13));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //to store the data in tabel
            String ren = (String) comboBox.getSelectedItem();
            String cat =(String) comboBox2.getSelectedItem();
            String inc =(String) comboBox3.getSelectedItem();
            String edu = (String) comboBox4.getSelectedItem();
            String occ = (String) comboBox5.getSelectedItem();

            String pan = textpan.getText();
            String aadhar = textaadhar.getText();

            String scitizen = null;
            if(r1.isSelected()){
                scitizen = "Yes";
            }else if(r2.isSelected()){
                scitizen="No";
            }
            String eaccount = null;
            if(r3.isSelected()){
                eaccount ="Yes";
            }
            else if(r4.isSelected()){
                eaccount="No";
            }
            try {
                if (textpan.getText().equals("") || textaadhar.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Fill the Fields");
                }

                 else{
                    Conn c1 = new Conn();
                    String q = "Insert into Signuptwoo values('" + formno + "','" + ren + "','" + cat + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + aadhar + "','" + scitizen + "','" + eaccount + "')";
                    c1.statements.executeUpdate(q);
                    new Signup3(formno);
                    setVisible(false);
                }
            }
            catch (Exception E){
                E.printStackTrace();
            }

        }





    public static void main(String[] args) {
        new signup2("");
    }}

