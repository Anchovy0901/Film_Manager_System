/*
 * Created by JFormDesigner on Fri Sep 11 22:34:46 CST 2020
 */

package ui;

import dao.CineplexDao;
import dao.impl.CineplexDaoImpl;
import dao.impl.MovieHallDaoImpl;
import entity.Cineplex;
import entity.MovieHall;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class MovieHallInsert {
    public MovieHallInsert() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label3 = new JLabel();
        name = new JTextField();
        tableNum = new JTextField();
        label4 = new JLabel();
        cineplexName = new JTextField();
        insert = new JButton();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u5f71\u5385\u540d\u79f0");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(50, 50), label1.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u5ea7\u4f4d\u6570");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(55, 170), label3.getPreferredSize()));
        contentPane.add(name);
        name.setBounds(140, 40, 135, name.getPreferredSize().height);
        contentPane.add(tableNum);
        tableNum.setBounds(140, 165, 135, tableNum.getPreferredSize().height);

        //---- label4 ----
        label4.setText("\u5f71\u57ce\u540d\u79f0");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(50, 110), label4.getPreferredSize()));
        contentPane.add(cineplexName);
        cineplexName.setBounds(140, 105, 135, cineplexName.getPreferredSize().height);

        //---- insert ----
        insert.setText("\u786e\u5b9a");
        contentPane.add(insert);
        insert.setBounds(155, 220, 90, insert.getPreferredSize().height);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(name.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "影厅名称不能为空");
                }
                if(cineplexName.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "影城名称不能为空");
                }
                if(tableNum.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "座位数不能为空");
                }
                Cineplex cineplex = new CineplexDaoImpl().queryName(cineplexName.getText());
                if(cineplex == null){
                    JOptionPane.showMessageDialog(null, "影院不存在");
                }
                MovieHall movieHall1 = new MovieHallDaoImpl().queryName(name.getText());
                if(movieHall1 != null){
                    JOptionPane.showMessageDialog(null, "影厅名称已经存在");
                }

                entity.MovieHall movieHall = new entity.MovieHall();
                movieHall.setName(name.getText());
                movieHall.setCineplexId(cineplex.getId());
                movieHall.setTableNum(Integer.parseInt(tableNum.getText()));
                new MovieHallDaoImpl().add(movieHall);
                new MovieHallHomePage();
                jFrame.dispose();
                new MovieHallHomePage();
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
    private JLabel label1;
    private JLabel label3;
    private JTextField name;
    private JTextField tableNum;
    private JLabel label4;
    private JTextField cineplexName;
    private JButton insert;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
