/*
 * Created by JFormDesigner on Fri Sep 11 21:19:17 CST 2020
 */

package ui;

import dao.CineplexDao;
import dao.impl.CineplexDaoImpl;
import entity.Cineplex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class CineplexInsert {
    public CineplexInsert() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        name = new JTextField();
        remark = new JTextField();
        address = new JTextField();
        phone = new JTextField();
        insert = new JButton();
        label5 = new JLabel();
        characteristicService = new JTextField();
        id = new JLabel();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u5f71\u57ce\u540d\u79f0");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(50, 25), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u5730\u5740");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(55, 60), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u5185\u5bb9");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(55, 100), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("\u8054\u7cfb\u7535\u8bdd");
        contentPane.add(label4);
        label4.setBounds(45, 140, 70, label4.getPreferredSize().height);
        contentPane.add(name);
        name.setBounds(145, 25, 155, name.getPreferredSize().height);
        contentPane.add(remark);
        remark.setBounds(145, 100, 155, remark.getPreferredSize().height);
        contentPane.add(address);
        address.setBounds(145, 60, 155, address.getPreferredSize().height);
        contentPane.add(phone);
        phone.setBounds(145, 140, 155, phone.getPreferredSize().height);

        //---- insert ----
        insert.setText("\u786e\u5b9a");
        contentPane.add(insert);
        insert.setBounds(140, 220, 110, insert.getPreferredSize().height);

        //---- label5 ----
        label5.setText("\u7279\u8272\u670d\u52a1");
        contentPane.add(label5);
        label5.setBounds(50, 175, label5.getPreferredSize().width, 32);
        contentPane.add(characteristicService);
        characteristicService.setBounds(145, 175, 155, characteristicService.getPreferredSize().height);
        contentPane.add(id);
        id.setBounds(330, 30, 30, 20);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(name.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ӱ�����Ʋ���Ϊ��");
                }
                if(address.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Ӱ�ǵ�ַ����Ϊ��");
                }
                if(remark.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "���ݲ���Ϊ��");
                }
                if(phone.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "��ϵ��ʽ����Ϊ��");
                }
                if(characteristicService.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "��ɫ������Ϊ��");
                }
                CineplexDao cineplexDao = new CineplexDaoImpl();
                Cineplex cineplex1 = cineplexDao.queryName(name.getText());
                if(cineplex1 == null){
                    JOptionPane.showMessageDialog(null, "Ӱ�������Ѿ�����");
                }
                entity.Cineplex cineplex = new entity.Cineplex();
                cineplex.setName(name.getText());
                cineplex.setAddress(address.getText());
                cineplex.setRemark(remark.getText());
                cineplex.setPhone(phone.getText());
                cineplex.setCharacteristicService(characteristicService.getText());
                cineplexDao.add(cineplex);
                new CineplexHomePage();
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
    private JLabel label3;
    private JLabel label4;
    private JTextField name;
    private JTextField remark;
    private JTextField address;
    private JTextField phone;
    private JButton insert;
    private JLabel label5;
    private JTextField characteristicService;
    private JLabel id;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
