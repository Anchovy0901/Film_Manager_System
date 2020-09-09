/*
 * Created by JFormDesigner on Wed Sep 09 15:54:33 CST 2020
 */

package ui;

import dao.UserDao;
import dao.impl.UserDaoImpl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class Forget {
    public Forget() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        username = new JTextField();
        phone = new JTextField();
        forget = new JButton();
        password = new JPasswordField();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8d26\u53f7");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(45, 30), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u624b\u673a\u53f7");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(45, 85), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u65b0\u5bc6\u7801");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(45, 140), label3.getPreferredSize()));
        contentPane.add(username);
        username.setBounds(130, 30, 170, username.getPreferredSize().height);
        contentPane.add(phone);
        phone.setBounds(130, 85, 170, phone.getPreferredSize().height);

        //---- forget ----
        forget.setText("\u4fee\u6539\u5bc6\u7801");
        contentPane.add(forget);
        forget.setBounds(140, 200, 125, forget.getPreferredSize().height);
        contentPane.add(password);
        password.setBounds(130, 140, 170, password.getPreferredSize().height);

        forget.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(username.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "username is null");
                    return;
                }
                if(new String(password.getPassword()).isEmpty()){
                    JOptionPane.showMessageDialog(null, "password is null");
                    return;
                }
                if(phone.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "phone is null");
                    return;
                }
                UserDao userDao = new UserDaoImpl();

                if(userDao.forgetQuery(username.getText(), phone.getText())){
                    userDao.forgetUpdate(username.getText(), new String(password.getPassword()));
                    jFrame.dispose();
                    new Login();
                }else{
                    JOptionPane.showMessageDialog(null, "phone error");
                    return;
                }
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
        jFrame.setSize(400,370);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField username;
    private JTextField phone;
    private JButton forget;
    private JPasswordField password;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
