/*
 * Created by JFormDesigner on Fri Sep 11 23:36:12 CST 2020
 */

package ui;

import dao.impl.MovieHallDaoImpl;
import dao.impl.UserDaoImpl;
import entity.MovieHall;
import entity.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

/**
 * @author unknown
 */
public class UserList {
    public UserList() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        button1 = new JButton();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(0, 0, 490, 350);

        //---- button1 ----
        button1.setText("\u9996\u9875");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(195, 355), button1.getPreferredSize()));

        List<User> list = new UserDaoImpl().userList();
        if(!list.isEmpty()){
            String[] values=new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                User user = list.get(i);
                values[i] = "姓名："+user.getName()+"  联系方式："+user.getPhone()+"  邮箱："+user.getEmail()+"  地址："+user.getAddress();
            }
            list1.setModel(new AbstractListModel() {

                @Override
                public int getSize() {
                    return values.length;
                }

                @Override
                public Object getElementAt(int index) {
                    return values[index];
                }
            });
        }

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminHomePage();
                jFrame.dispose();
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
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(jFrame.getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane1;
    private JList list1;
    private JButton button1;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
