/*
 * Created by JFormDesigner on Wed Sep 09 14:48:54 CST 2020
 */

package ui;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class UserHomePage {
    public UserHomePage() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        textField1 = new JTextField();
        query = new JButton();
        name = new JLabel();
        date = new JLabel();
        l1 = new JLabel();
        year = new JTextField();
        label1 = new JLabel();
        month = new JTextField();
        label2 = new JLabel();
        day = new JTextField();
        label3 = new JLabel();
        cineplex = new JTextField();
        label4 = new JLabel();
        textField2 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);
        contentPane.add(textField1);
        textField1.setBounds(120, 35, 165, textField1.getPreferredSize().height);

        //---- query ----
        query.setText("\u67e5\u8be2");
        contentPane.add(query);
        query.setBounds(355, 95, 130, query.getPreferredSize().height);

        //---- name ----
        name.setText("\u5f71\u7247\u540d\u79f0");
        contentPane.add(name);
        name.setBounds(new Rectangle(new Point(25, 35), name.getPreferredSize()));

        //---- date ----
        date.setText("\u4e0a\u6620\u65f6\u95f4");
        contentPane.add(date);
        date.setBounds(new Rectangle(new Point(320, 35), date.getPreferredSize()));

        //---- l1 ----
        l1.setText("\u5e74");
        contentPane.add(l1);
        l1.setBounds(395, 35, l1.getPreferredSize().width, 25);
        contentPane.add(year);
        year.setBounds(445, 35, 50, year.getPreferredSize().height);

        //---- label1 ----
        label1.setText("\u6708");
        contentPane.add(label1);
        label1.setBounds(520, 35, label1.getPreferredSize().width, 20);
        contentPane.add(month);
        month.setBounds(565, 35, 50, month.getPreferredSize().height);

        //---- label2 ----
        label2.setText("\u65e5");
        contentPane.add(label2);
        label2.setBounds(640, 35, label2.getPreferredSize().width, 30);
        contentPane.add(day);
        day.setBounds(695, 35, 50, day.getPreferredSize().height);

        //---- label3 ----
        label3.setText("\u5f71\u57ce");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(795, 35), label3.getPreferredSize()));
        contentPane.add(cineplex);
        cineplex.setBounds(850, 35, 100, cineplex.getPreferredSize().height);

        //---- label4 ----
        label4.setText("\u7535\u5f71\u7c7b\u578b");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(30, 95), label4.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(125, 95, 140, textField2.getPreferredSize().height);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(0, 150, 1065, 383);

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
    private JTextField textField1;
    private JButton query;
    private JLabel name;
    private JLabel date;
    private JLabel l1;
    private JTextField year;
    private JLabel label1;
    private JTextField month;
    private JLabel label2;
    private JTextField day;
    private JLabel label3;
    private JTextField cineplex;
    private JLabel label4;
    private JTextField textField2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String args[]){
        new UserHomePage();
    }
}
