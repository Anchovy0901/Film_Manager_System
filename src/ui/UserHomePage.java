/*
 * Created by JFormDesigner on Wed Sep 09 14:48:54 CST 2020
 */

package ui;

import dao.impl.FilmScheduleDaoImpl;
import dao.impl.OrderDaoImpl;
import entity.FilmScheduleVO;
import entity.Order;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
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
        filmName = new JTextField();
        query = new JButton();
        l4 = new JLabel();
        l7 = new JLabel();
        l1 = new JLabel();
        year = new JTextField();
        label1 = new JLabel();
        month = new JTextField();
        label2 = new JLabel();
        day = new JTextField();
        label3 = new JLabel();
        cineplexName = new JTextField();
        label4 = new JLabel();
        filmCategory = new JTextField();
        scrollPane1 = new JScrollPane();
        jFrame = new JFrame();
        id = new JTextField();
        buy = new JButton("购买");
        jLabel = new JLabel("电影编号");
        card = new JButton("会员卡");


        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);
        contentPane.add(filmName);
        filmName.setBounds(120, 35, 165, filmName.getPreferredSize().height);

        //---- query ----
        query.setText("\u67e5\u8be2");
        contentPane.add(query);
        query.setBounds(355, 95, 130, query.getPreferredSize().height);

        //---- buy ----
        contentPane.add(jLabel);
        jLabel.setBounds(520,95,80,year.getPreferredSize().height);
        contentPane.add(id);
        id.setBounds(600, 95, 50, year.getPreferredSize().height);
        contentPane.add(buy);
        buy.setBounds(680, 95, 70, query.getPreferredSize().height);

        //--- card ---
        contentPane.add(card);
        card.setBounds(770,95,90,query.getPreferredSize().height);

        //---- name ----
        l4.setText("\u5f71\u7247\u540d\u79f0");
        contentPane.add(l4);
        l4.setBounds(new Rectangle(new Point(25, 35), l4.getPreferredSize()));

        //---- date ----
        l7.setText("\u4e0a\u6620\u65f6\u95f4");
        contentPane.add(l7);
        l7.setBounds(new Rectangle(new Point(320, 35), l7.getPreferredSize()));

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
        contentPane.add(cineplexName);
        cineplexName.setBounds(850, 35, 100, cineplexName.getPreferredSize().height);

        //---- label4 ----
        label4.setText("\u7535\u5f71\u7c7b\u578b");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(30, 95), label4.getPreferredSize()));
        contentPane.add(filmCategory);
        filmCategory.setBounds(125, 95, 140, filmCategory.getPreferredSize().height);

        String [] columnName = {
                "编号",
                "影城",
                "影厅",
                "电影",
                "票价",
                "开映时间",
                "结束时间"
        };
        List<FilmScheduleVO> filmScheduleVOS = new FilmScheduleDaoImpl().userPageHome();
        Object [][] data=new Object[filmScheduleVOS.size()][7];
        if(!filmScheduleVOS.isEmpty()){
            for (int i = 0; i < filmScheduleVOS.size(); i++) {
                data[i][0]=filmScheduleVOS.get(0).getId();
                data[i][1]=filmScheduleVOS.get(0).getCineplexName();
                data[i][2]=filmScheduleVOS.get(0).getMovieHallName();
                data[i][3]=filmScheduleVOS.get(0).getFilm();
                data[i][4]=filmScheduleVOS.get(0).getTicketRates();
                data[i][5]=filmScheduleVOS.get(0).getStartTime();
                data[i][6]=filmScheduleVOS.get(0).getEndTime();
            }
        }
        table1 = new JTable(data,columnName);
        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(0, 150, 1065, 383);


        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(id.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "购买时编号不能为空");
                }
                FilmScheduleDaoImpl filmScheduleDao = new FilmScheduleDaoImpl();
                FilmScheduleVO filmScheduleVO = filmScheduleDao.userPageHomeId(Integer.parseInt(id.getText()));
                if(filmScheduleVO == null){
                    JOptionPane.showMessageDialog(null, "购买编号不存在");
                }
                Order order = new Order();
                order.setCineplesId(filmScheduleVO.getCineplexId());
                order.setMovieHallId(filmScheduleVO.getMovieHallId());
                order.setPrice(filmScheduleVO.getTicketRates());
                new OrderDaoImpl().add(order);
                new UserHomePage();
                jFrame.dispose();
            }
        });

        card.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DiscountCardHomePage();
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
    private JTextField filmName;
    private JButton query;
    private JLabel l4;
    private JLabel l7;
    private JLabel l1;
    private JTextField year;
    private JLabel label1;
    private JTextField month;
    private JLabel label2;
    private JTextField day;
    private JLabel label3;
    private JTextField cineplexName;
    private JLabel label4;
    private JTextField filmCategory;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JFrame jFrame;
    private JTextField id;
    private JButton buy;
    private JLabel jLabel;
    private JButton card;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String args[]){
        new UserHomePage();
    }
}
