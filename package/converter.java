import java.util.*;
import javax.swing.*;
import java.lang.Math.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class converter implements ActionListener {
private static final Color DARKGRAY = null;
JFrame f;
JTextField t,t1,t3,t4,t2,t5;
JLabel l1,l3,l4,l5,l6,l7;
JButton bcon,bdel,bclr,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bb,bc,bd,be,bf;
JRadioButton r1,r2,r3,r4;
static double a=0,b=0,result=0;
static int choice=0;
converter()
{
f=new JFrame("Calculator");
l1=new JLabel("CONVERT FROM");
l3=new JLabel("CONVERTED TO DECIMAL");
l4=new JLabel("CONVERTED TO BINARY");
l6=new JLabel("CONVERTED TO HEXADECIMAL");
l5=new JLabel("CONVERTED TO OCTAL");
l7=new JLabel("DIGITAL CONVERTER");
t5= new JTextField();
t=new JTextField();
t1=new JTextField();
t3=new JTextField();
t4=new JTextField();
t2=new JTextField();
r1=new JRadioButton("DECIMAL");
r2=new JRadioButton("BINARY");
r3=new JRadioButton("OCTAL");
r4=new JRadioButton("HEXADECIMAL");
bcon=new JButton("CONVERT");
bdel=new JButton("BACKSPACE");
bclr=new JButton("RESET");
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b0=new JButton("0");
ba=new JButton("A");
bb=new JButton("B");
bc=new JButton("C");
bd=new JButton("D");
be=new JButton("E");
bf=new JButton("F");
l1.setBounds(80,70,280,40);
l1.setFont(new Font("Serif", Font.PLAIN, 18));
l1.setForeground(Color.RED);
l7.setBounds(230,10,280,70);
l7.setForeground(Color.WHITE);
l3.setForeground(Color.WHITE);
l4.setForeground(Color.WHITE);
l5.setForeground(Color.WHITE);
l6.setForeground(Color.WHITE);
l1.setForeground(Color.WHITE);
t1.setForeground(Color.BLUE);
t2.setForeground(Color.BLUE);
t3.setForeground(Color.BLUE);
t4.setForeground(Color.BLUE);
l7.setFont(new Font("Serif", Font.PLAIN, 24));
l3.setBounds(80,215,300,40);
l4.setBounds(80,265,300,40);
l5.setBounds(80,315,280,40);
l6.setBounds(80,365,280,40);
t5.setBounds(80,170,180,30);
t5.setForeground(Color.RED);
t5.setFont(new Font("Serif", Font.PLAIN, 18));
t5.setEditable(false);
t.setBounds(280,170,340,30);
t1.setBackground(Color.WHITE);
t.setBackground(Color.WHITE);
t1.setBounds(280,220,340,30);
t3.setBounds(280,320,340,30);
t3.setBackground(Color.WHITE);
t4.setBounds(280,370,340,30);
t4.setBackground(Color.WHITE);
t2.setBounds(280,270,340,30);
r1.setBounds(80,110,120,30);
r1.setBackground(Color.red);
r1.setForeground(Color.white);
t2.setBackground(Color.WHITE);
r2.setBounds(220,110,120,30);
r2.setBackground(Color.red);
r2.setForeground(Color.white);
r3.setBounds(360,110,120,30);
r3.setBackground(Color.red);
r3.setForeground(Color.white);
r4.setBounds(500,110,120,30);
r4.setBackground(Color.red);
r4.setForeground(Color.white);
bcon.setBounds(500,535,120,30);
bcon.setBackground(Color.red);
bcon.setForeground(Color.RED);
bcon.setForeground(Color.RED);
bcon.setForeground(Color.white);
bdel.setBounds(500,480,120,30);
bclr.setBounds(500,420,120,30);
b1.setBounds(180,420,80,25);
b1.setBackground(Color.CYAN);
b2.setBounds(290,420,80,25);
b2.setBackground(Color.CYAN);
b3.setBounds(400,420,80,25);
b3.setBackground(Color.CYAN);
b4.setBounds(80,460,80,25);
b4.setBackground(Color.CYAN);
b5.setBounds(180,460,80,25);
b5.setBackground(Color.CYAN);
b6.setBounds(290,460,80,25);
b6.setBackground(Color.CYAN);
b7.setBounds(400,460,80,25);
b7.setBackground(Color.CYAN);
b8.setBounds(80,500,80,25);
b8.setBackground(Color.CYAN);
b9.setBounds(180,500,80,25);
b9.setBackground(Color.CYAN);
b0.setBounds(80,420,80,25);
b0.setBackground(Color.CYAN);
ba.setBounds(290,500,80,25);
ba.setBackground(Color.CYAN);
bb.setBounds(400,500,80,25);
bb.setBackground(Color.CYAN);
bc.setBounds(80,540,80,25);
bc.setBackground(Color.CYAN);
bd.setBounds(180,540,80,25);
bd.setBackground(Color.CYAN);
be.setBounds(290,540,80,25);
be.setBackground(Color.CYAN);
bf.setBounds(400,540,80,25);
bf.setBackground(Color.CYAN);
ButtonGroup group= new ButtonGroup();
group.add(r1);
group.add(r2);
group.add(r3);
group.add(r4);
f.add(r1);
f.add(r2);
f.add(r3);
f.add(t5);
f.add(r4);
f.add(l1);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b0);
f.add(ba);
f.add(bb);
f.add(bc);
f.add(bd);
f.add(be);
f.add(bf);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(l6);
f.add(t);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(t4);
f.add(bcon);
f.add(bdel);
f.add(bclr);
f.add(l7);
f.setLayout(null);
f.setVisible(true);
f.setSize(700,650);
t.setEditable(true);
t1.setEditable(false);
t2.setEditable(false);
t3.setEditable(false);
t4.setEditable(false);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(Color.BLACK);
f.setResizable(false);
bcon.addActionListener(this);
bdel.addActionListener(this);
bclr.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
ba.addActionListener(this);
bb.addActionListener(this);
bc.addActionListener(this);
bd.addActionListener(this);
be.addActionListener(this);
bf.addActionListener(this);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
r4.addActionListener(this);
}
public void actionPerformed(ActionEvent enterPressed)
{
String userText,bin,oct,hex;
int dec;
if(enterPressed.getSource()==b1)
t.setText(t.getText().concat("1"));
if(enterPressed.getSource()==b2)
t.setText(t.getText().concat("2"));
if(enterPressed.getSource()==b3)
t.setText(t.getText().concat("3"));
if(enterPressed.getSource()==b4)
t.setText(t.getText().concat("4"));
if(enterPressed.getSource()==b5)
t.setText(t.getText().concat("5"));
if(enterPressed.getSource()==b6)
t.setText(t.getText().concat("6"));
if(enterPressed.getSource()==b7)
t.setText(t.getText().concat("7"));
if(enterPressed.getSource()==b8)
t.setText(t.getText().concat("8"));
if(enterPressed.getSource()==b9)
t.setText(t.getText().concat("9"));
if(enterPressed.getSource()==b0)
t.setText(t.getText().concat("0"));
if(enterPressed.getSource()==ba)
t.setText(t.getText().concat("a"));
if(enterPressed.getSource()==ba)
t.setText(t.getText().concat("A"));
if(enterPressed.getSource()==bb)
t.setText(t.getText().concat("B"));
if(enterPressed.getSource()==bc)
t.setText(t.getText().concat("C"));
if(enterPressed.getSource()==bd)
t.setText(t.getText().concat("D"));
if(enterPressed.getSource()==be)
t.setText(t.getText().concat("E"));
if(enterPressed.getSource()==bf)
t.setText(t.getText().concat("F"));
if(r1.isSelected()) {
choice=1;
t5.setText(" Enter Decimal No:");
}
if(r2.isSelected()) {
choice=2;
t5.setText(" Enter Binary No:");
}
if(r3.isSelected()) {
choice=3;
t5.setText(" Enter Octal No:");
}
if(r4.isSelected()) {
choice=4;
t5.setText(" Enter Hexadecimal No:");
}
if(enterPressed.getSource()==bcon) 
{
switch(choice)
{
case 1: 
userText=t.getText();
dec=Integer.parseInt(userText);
bin=Integer.toBinaryString(dec);
oct=Integer.toOctalString(dec);
hex=Integer.toHexString(dec);
t1.setText(userText);
t2.setText(bin);
t3.setText(oct);
t4.setText(hex);
break;
case 2: 
userText=t.getText();
dec=Integer.parseInt(userText,2);
oct=Integer.toOctalString(dec);
hex=Integer.toHexString(dec);
t2.setText(userText);
t1.setText(String.valueOf(dec));
t3.setText(oct);
t4.setText(hex);
break;
case 3:
userText=t.getText();
dec=Integer.valueOf(userText,8);
bin=Integer.toBinaryString(dec);
hex=Integer.toHexString(dec);
t3.setText(userText);
t1.setText(String.valueOf(dec));
t2.setText(bin);
t4.setText(hex);
break;
case 4:
userText=t.getText(); 
dec=Integer.valueOf(userText,16);
bin=Integer.toBinaryString(dec);
oct=Integer.toOctalString(dec);
t4.setText(userText);
t1.setText(String.valueOf(dec));
t2.setText(bin);
t3.setText(oct);
break;
}}
if(enterPressed.getSource()==bclr) {
t.setText("");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
}
if(enterPressed.getSource()==bdel) {
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i)); }
}
public static void main(String...s){
new converter();
}
}
