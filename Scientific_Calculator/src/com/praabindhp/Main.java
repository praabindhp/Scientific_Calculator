package com.praabindhp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Scientific extends JFrame implements ActionListener {
    JTextField tfield;
    double temp, temp1, result, a;
    static double m1, m2;
    int k = 1, x = 0, y = 0, z = 0;
    char ch;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, plus, min, div,mul,eq,sqrt;
    Container cont;
    JPanel textPanel, buttonpanel;
    Scientific() {
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        tfield = new JTextField(25);
        tfield.setHorizontalAlignment(SwingConstants.RIGHT);
        tfield.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });
        textpanel.add(tfield);
        buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(10, 4, 10, 10));
        boolean t = true;

        b1 = new JButton("1");
        buttonpanel.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("2");
        buttonpanel.add(b2);
        b2.addActionListener(this);

        b3 = new JButton("3");
        buttonpanel.add(b3);
        b3.addActionListener(this);

        b4 = new JButton("4");
        buttonpanel.add(b4);
        b4.addActionListener(this);

        b5 = new JButton("5");
        buttonpanel.add(b5);
        b5.addActionListener(this);

        b6 = new JButton("6");
        buttonpanel.add(b6);
        b6.addActionListener(this);

        b7 = new JButton("7");
        buttonpanel.add(b7);
        b7.addActionListener(this);

        b8 = new JButton("8");
        buttonpanel.add(b8);
        b8.addActionListener(this);

        b9 = new JButton("9");
        buttonpanel.add(b9);
        b9.addActionListener(this);

        zero = new JButton("0");
        buttonpanel.add(zero);
        zero.addActionListener(this);

        plus = new JButton("+");
        buttonpanel.add(plus);
        plus.addActionListener(this);

        min = new JButton("-");
        buttonpanel.add(min);
        min.addActionListener(this);

        mul = new JButton("*");
        buttonpanel.add(mul);
        mul.addActionListener(this);

        div = new JButton("/");
        div.addActionListener(this);
        buttonpanel.add(div);

        eq = new JButton("=");
        buttonpanel.add(eq);
        eq.addActionListener(this);

        sqrt = new JButton("Sqrt");
        buttonpanel.add(sqrt);
        sqrt.addActionListener(this);

        clr= new JButton("AC");
        buttonpanel.add(clr);
        clr.addActionListener(this);

        cont.add("Center", buttonpanel);
        cont.add("North", textpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        System.out.println(s);
        if (s.equals("1")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "1");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "2");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "3");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "4");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "5");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "6");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "7");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "8");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "9");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "0");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "0");
                z = 0;
            }
        }

        if (s.equals("+")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 0;
                ch = '+';
            } else {
                temp = Double.parseDouble(tfield.getText());
                tfield.setText("");
                ch = '+';
                y = 0;
                x = 0;
            }
            tfield.requestFocus();
        }
        if (s.equals("-")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 0;
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(tfield.getText());
                tfield.setText("");
            }
            ch = '-';
            tfield.requestFocus();
        }
        if (s.equals("/")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 1;
                ch = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(tfield.getText());
                ch = '/';
                tfield.setText("");
            }
            tfield.requestFocus();
        }
        if (s.equals("*")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
                temp = 1;
                ch = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(tfield.getText());
                ch = '*';
                tfield.setText("");
            }
            tfield.requestFocus();
        }

        if (s.equals("Sqrt")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                a = Math.sqrt(Double.parseDouble(tfield.getText()));
                tfield.setText("");
                tfield.setText(tfield.getText() + a);
            }
        }
        if (s.equals("AC")) {
            tfield.setText("");
            x = 0;
            y = 0;
            z = 0;
        }

        if (s.equals("=")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                temp1 = Double.parseDouble(tfield.getText());
                switch (ch) {
                    case '+' -> result = temp + temp1;
                    case '-' -> result = temp - temp1;
                    case '/' -> result = temp / temp1;
                    case '*' -> result = temp * temp1;
                }
                tfield.setText("");
                tfield.setText(tfield.getText() + result);
                System.out.println("Z=1");
                z = 1;
            }
        }

        tfield.requestFocus();
    }

    public static void main(String[] args) {
        Scientific f = new Scientific();
        f.setTitle("Scientific Calculator");
        f.pack();
        f.setVisible(true);
    }
}