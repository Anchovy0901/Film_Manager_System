/*
 * Created by JFormDesigner on Wed Sep 09 12:10:05 CST 2020
 */

package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

/**
 * @author unknown
 */
public class Login {
    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ll = new JFrame();
        l1 = new JLabel();
        l2 = new JLabel();
        username = new JTextField();
        password = new JPasswordField();
        register = new JButton();
        message = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        login = new JButton();
        buttonGroup = new ButtonGroup();
        role = null;
        forget = new JLabel();

        //======== ll ========
        {
            ll.setTitle("login");
            Container llContentPane = ll.getContentPane();
            llContentPane.setLayout(null);

            //---- l1 ----
            l1.setText("\u8d26\u53f7");
            llContentPane.add(l1);
            l1.setBounds(35, 60, 55, 20);

            //---- l2 ----
            l2.setText("\u5bc6\u7801");
            llContentPane.add(l2);
            l2.setBounds(new Rectangle(new Point(35, 125), l2.getPreferredSize()));
            llContentPane.add(username);
            username.setBounds(100, 55, 165, username.getPreferredSize().height);
            llContentPane.add(password);
            password.setBounds(100, 115, 165, password.getPreferredSize().height);

            //----- forget ------
            forget.setText("忘记密码");
            llContentPane.add(forget);
            forget.setBounds(new Rectangle(new Point(245, 143), l2.getPreferredSize()));
            forget.setSize(60, 20);

            //---- register ----
            register.setText("\u6ce8\u518c");
            llContentPane.add(register);
            register.setBounds(new Rectangle(new Point(225, 205), register.getPreferredSize()));
            llContentPane.add(message);
            message.setBounds(105, 170, 160, message.getPreferredSize().height);

            //---- radioButton1 ----
            radioButton1.setText("\u7528\u6237");
            llContentPane.add(radioButton1);
            radioButton1.setBounds(new Rectangle(new Point(100, 170), radioButton1.getPreferredSize()));

            //---- radioButton2 ----
            radioButton2.setText("\u7ba1\u7406\u5458");
            llContentPane.add(radioButton2);
            radioButton2.setBounds(new Rectangle(new Point(190, 170), radioButton2.getPreferredSize()));

            //---- login ----
            login.setText("\u767b\u5f55");
            llContentPane.add(login);
            login.setBounds(new Rectangle(new Point(80, 205), login.getPreferredSize()));

            buttonGroup.add(radioButton1);
            buttonGroup.add(radioButton2);

            radioButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    role = true; //用户
                }
            });

            radioButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    role = false; //管理员
                }
            });

            login.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0) {
                    if(username.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "用户名不能为空");
                        return;
                    }
                    if(new String(password.getPassword()).isEmpty()){
                        JOptionPane.showMessageDialog(null, "密码不能为空");
                        return;
                    }
                   if(role == null){
                       JOptionPane.showMessageDialog(null, "角色是必选项");
                        return;
                   }
                    Boolean login = new UserDaoImpl().login(username.getText(), new String(password.getPassword()), role);
                    if(!login){
                        JOptionPane.showMessageDialog(null, "登录失败");
                        return;
                    }
                    if(username.getText().equals("admin")){
                        new AdminHomePage();
                        ll.dispose();
                    }else{
                        new UserHomePage();
                        ll.dispose();
                    }
                   ll.dispose();
                }
            });

            forget.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent event){
                    new Forget();
                    ll.dispose();
                }
            });

            register.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Register();
                    ll.dispose();
                }
            });


            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < llContentPane.getComponentCount(); i++) {
                    Rectangle bounds = llContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = llContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                llContentPane.setMinimumSize(preferredSize);
                llContentPane.setPreferredSize(preferredSize);
            }
            ll.pack();
            ll.setVisible(true);
            ll.setSize(350,300);
            ll.setLocationRelativeTo(ll.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame ll;
    private JLabel l1;
    private JLabel l2;
    private JTextField username;
    private JPasswordField password;
    private JButton register;
    private JLabel message;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private ButtonGroup buttonGroup;
    private JButton login;
    private Boolean role;
    private JLabel forget;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
