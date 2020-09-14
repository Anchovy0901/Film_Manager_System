/*
 * Created by JFormDesigner on Sun Sep 13 22:33:00 CST 2020
 */

package ui;

import dao.FilmDao;
import dao.impl.FilmDaoImpl;
import entity.Film;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author unknown
 */
public class FilmUpdate {
    public FilmUpdate(Integer id) {
        initComponents(id);
    }

    private void initComponents(Integer id) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();
        name = new JTextField();
        category = new JTextField();
        button1 = new JButton();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u7535\u5f71\u540d\u79f0");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(55, 50), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u7535\u5f71\u5206\u7c7b");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(55, 120), label2.getPreferredSize()));
        contentPane.add(name);
        name.setBounds(120, 45, 145, name.getPreferredSize().height);
        contentPane.add(category);
        category.setBounds(120, 110, 145, category.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u786e\u5b9a");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(150, 200), button1.getPreferredSize()));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(name.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "电影不能为空");
                }
                if(category.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "电影分类不能为空");
                }

                FilmDao filmDao = new FilmDaoImpl();
                Film film1 = new Film();
                film1.setName(name.getText());
                film1.setCategory(category.getText());
                film1.setId(id);
                filmDao.edit(film1);
                new FilmHomePage();
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
    private JLabel label2;
    private JTextField name;
    private JTextField category;
    private JButton button1;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
