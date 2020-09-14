/*
 * Created by JFormDesigner on Sun Sep 13 19:12:52 CST 2020
 */

package ui;

import dao.ActorDao;
import dao.AwardsDao;
import dao.PalmsDao;
import dao.impl.ActorDaoImpl;
import dao.impl.AwardsDaoImpl;
import dao.impl.PalmsDaoImpl;
import entity.Actor;
import entity.Awards;
import entity.Palms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class ActorInsert {
    public ActorInsert() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        name = new JTextField();
        sex = new JTextField();
        nation = new JTextField();
        birthday = new JTextField();
        remark = new JTextField();
        category = new JTextField();
        level = new JTextField();
        awardsName = new JTextField();
        periods = new JTextField();
        year = new JTextField();
        site = new JTextField();
        button1 = new JButton();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u6f14\u5458\u540d\u79f0");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(40, 25), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u6027\u522b");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(60, 70), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u56fd\u5bb6");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(60, 110), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("\u751f\u65e5");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(60, 150), label4.getPreferredSize()));

        //---- label5 ----
        label5.setText("\u4ece\u5f71\u7ecf\u5386");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(35, 190), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("\u83b7\u5956\u7c7b\u522b");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(40, 230), label6.getPreferredSize()));

        //---- label7 ----
        label7.setText("\u83b7\u5956\u7ea7\u522b");
        contentPane.add(label7);
        label7.setBounds(new Rectangle(new Point(35, 270), label7.getPreferredSize()));

        //---- label8 ----
        label8.setText("\u5956\u9879\u540d\u79f0");
        contentPane.add(label8);
        label8.setBounds(new Rectangle(new Point(35, 315), label8.getPreferredSize()));

        //---- label9 ----
        label9.setText("\u671f\u6570");
        contentPane.add(label9);
        label9.setBounds(new Rectangle(new Point(55, 360), label9.getPreferredSize()));

        //---- label10 ----
        label10.setText("\u83b7\u5956\u5e74\u4efd");
        contentPane.add(label10);
        label10.setBounds(new Rectangle(new Point(40, 405), label10.getPreferredSize()));

        //---- label11 ----
        label11.setText("\u4e3e\u529e\u5730\u70b9");
        contentPane.add(label11);
        label11.setBounds(new Rectangle(new Point(40, 445), label11.getPreferredSize()));
        contentPane.add(name);
        name.setBounds(135, 20, 190, name.getPreferredSize().height);
        contentPane.add(sex);
        sex.setBounds(135, 65, 190, sex.getPreferredSize().height);
        contentPane.add(nation);
        nation.setBounds(135, 100, 190, nation.getPreferredSize().height);
        contentPane.add(birthday);
        birthday.setBounds(135, 140, 190, birthday.getPreferredSize().height);
        contentPane.add(remark);
        remark.setBounds(135, 190, 190, remark.getPreferredSize().height);
        contentPane.add(category);
        category.setBounds(135, 230, 190, category.getPreferredSize().height);
        contentPane.add(level);
        level.setBounds(135, 270, 190, level.getPreferredSize().height);
        contentPane.add(awardsName);
        awardsName.setBounds(135, 315, 190, awardsName.getPreferredSize().height);
        contentPane.add(periods);
        periods.setBounds(135, 360, 190, periods.getPreferredSize().height);
        contentPane.add(year);
        year.setBounds(135, 400, 190, year.getPreferredSize().height);
        contentPane.add(site);
        site.setBounds(135, 440, 190, site.getPreferredSize().height);

        //---- button1 ----
        button1.setText("text");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(185, 500), button1.getPreferredSize()));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(name.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "演员名称不能为空");
                }
                if(sex.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "性别不能为空");
                }
                if(nation.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "国家不能为空");
                }
                if(birthday.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "生日不能为空");
                }
                if(remark.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "从影经历不能为空");
                }
                if(category.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "获奖类别不能为空");
                }
                if(level.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "获奖级别不能为空");
                }
                if(awardsName.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "奖项名称不能为空");
                }
                if(periods.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "期数不能为空");
                }
                if(year.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "获奖年限不能为空");
                }
                if(site.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "举办地点不能为空");
                }

                ActorDao actorDao = new ActorDaoImpl(); //演员
                PalmsDao palmsDao = new PalmsDaoImpl(); //获奖记录
                AwardsDao awardsDao = new AwardsDaoImpl(); //奖项
                Actor actor = actorDao.queryName(name.getText());
                if(actor != null){
                    JOptionPane.showMessageDialog(null, "演员已经存在");
                }
                //actor
                Actor actor1 = new Actor();
                actor1.setName(name.getText());
                actor1.setSex(sex.getText());
                actor1.setNation(nation.getText());
                actor1.setBirthday(birthday.getText());
                actor1.setRemark(remark.getText());
                actorDao.add(actor1);
                Actor actor2 = actorDao.queryName(name.getText());
                //Palms
                Palms palms = new Palms();
                palms.setActorId(actor2.getId());
                palms.setCategory(category.getText());
                palms.setLevel(level.getText());
                palmsDao.add(palms);
                //Awards
                Awards awards = new Awards();
                awards.setAwardsName(awardsName.getText());
                awards.setPeriods(periods.getText());
                awards.setYear(year.getText());
                awards.setSite(site.getText());
                awards.setActorId(actor2.getId());
                awardsDao.add(awards);
                new ActorHomePage();
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
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JTextField name;
    private JTextField sex;
    private JTextField nation;
    private JTextField birthday;
    private JTextField remark;
    private JTextField category;
    private JTextField level;
    private JTextField awardsName;
    private JTextField periods;
    private JTextField year;
    private JTextField site;
    private JButton button1;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
