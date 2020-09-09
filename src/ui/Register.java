/*
 * Created by JFormDesigner on Wed Sep 09 12:22:38 CST 2020
 */

package ui;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import dao.impl.UserDaoImpl;
import entity.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class Register {
    public Register() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        l1 = new JLabel();
        l2 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        username = new JTextField();
        name = new JTextField();
        password = new JPasswordField();
        phone = new JTextField();
        email = new JTextField();
        address = new JTextField();
        register = new JButton();
        buttonGroup = new ButtonGroup();
        jFrame = new JFrame();

        //======== this ========
        jFrame.setTitle("register");
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- l1 ----
        l1.setText("\u8d26\u53f7");
        contentPane.add(l1);
        l1.setBounds(new Rectangle(new Point(45, 55), l1.getPreferredSize()));

        //---- l2 ----
        l2.setText("\u59d3\u540d");
        contentPane.add(l2);
        l2.setBounds(new Rectangle(new Point(45, 110), l2.getPreferredSize()));

        //---- label4 ----
        label4.setText("\u5bc6\u7801");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(45, 225), label4.getPreferredSize()));

        //---- label5 ----
        label5.setText("\u624b\u673a\u53f7");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(45, 280), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("\u90ae\u7bb1");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(45, 335), label6.getPreferredSize()));

        //---- label7 ----
        label7.setText("\u5730\u5740");
        contentPane.add(label7);
        label7.setBounds(new Rectangle(new Point(45, 390), label7.getPreferredSize()));

        //---- radioButton1 ----
        radioButton1.setText("\u7537");
        contentPane.add(radioButton1);
        radioButton1.setBounds(new Rectangle(new Point(45, 170), radioButton1.getPreferredSize()));

        //---- radioButton2 ----
        radioButton2.setText("\u5973");
        contentPane.add(radioButton2);
        radioButton2.setBounds(new Rectangle(new Point(125, 170), radioButton2.getPreferredSize()));
        contentPane.add(username);
        username.setBounds(120, 50, 165, username.getPreferredSize().height);
        contentPane.add(name);
        name.setBounds(120, 100, 165, name.getPreferredSize().height);
        contentPane.add(password);
        password.setBounds(120, 215, 165, password.getPreferredSize().height);
        contentPane.add(phone);
        phone.setBounds(120, 280, 165, phone.getPreferredSize().height);
        contentPane.add(email);
        email.setBounds(120, 335, 165, email.getPreferredSize().height);
        contentPane.add(address);
        address.setBounds(120, 390, 165, address.getPreferredSize().height);

        //---- register ----
        register.setText("\u6ce8\u518c");
        contentPane.add(register);
        register.setBounds(110, 445, 165, register.getPreferredSize().height);
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sexFlg = true; //男
            }
        });

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sexFlg = false; //女
            }
        });

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(username.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "账号不能为空");
                    return;
                }
                if(name.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "名称不能为空");
                    return;
                }
                if(sexFlg == null){
                    JOptionPane.showMessageDialog(null, "性别必选项");
                    return;
                }
                if(new String(password.getPassword()).isEmpty()){
                    JOptionPane.showMessageDialog(null, "密码不能为空");
                    return;
                }
                if(phone.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "手机号不能为空");
                    return;
                }
                if(email.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "邮箱不能为空");
                    return;
                }
                if(address.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "地址不能为空");
                    return;
                }
                User user = new User();
                user.setUsername(username.getText());
                user.setName(name.getText());
                user.setSex(sexFlg == true ?  "男" : "女");
                user.setPassword(new String(password.getPassword()));
                user.setPhone(phone.getText());
                user.setEmail(email.getText());
                user.setAddress(address.getText());
                Boolean register = new UserDaoImpl().register(user);
                if(register){
                    new Login();
                    jFrame.dispose();
                }
                JOptionPane.showMessageDialog(null, "注册失败，请重新注册");
                return;
            }
        });

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        jFrame.pack();
        jFrame.setLocationRelativeTo(jFrame.getOwner());
        jFrame.setVisible(true);
        jFrame.setSize(370, 600);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel l1;
    private JLabel l2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JTextField username;
    private JTextField name;
    private JPasswordField password;
    private JTextField phone;
    private JTextField email;
    private JTextField address;
    private JButton register;
    private ButtonGroup buttonGroup;
    private Boolean sexFlg;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
