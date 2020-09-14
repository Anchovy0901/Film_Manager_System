/*
 * Created by JFormDesigner on Sun Sep 13 22:46:48 CST 2020
 */

package ui;

import dao.CineplexDao;
import dao.FilmDao;
import dao.FilmScheduleDao;
import dao.MovieHallDao;
import dao.impl.CineplexDaoImpl;
import dao.impl.FilmDaoImpl;
import dao.impl.FilmScheduleDaoImpl;
import dao.impl.MovieHallDaoImpl;
import entity.Cineplex;
import entity.Film;
import entity.FilmSchedule;
import entity.MovieHall;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

/**
 * @author unknown
 */
public class FilmScheduleInsert {
    public FilmScheduleInsert() {
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
        cineplexName = new JTextField();
        movieHallName = new JTextField();
        filmName = new JTextField();
        ticketRates = new JTextField();
        startTime = new JTextField();
        endTime = new JTextField();
        button1 = new JButton();
        label7 = new JLabel();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u5f71\u57ce\u540d\u79f0");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(40, 40), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u5f71\u5385\u540d\u79f0");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(40, 85), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u7535\u5f71\u540d\u79f0");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(40, 135), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("\u7968\u4ef7");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(45, 175), label4.getPreferredSize()));

        //---- label5 ----
        label5.setText("\u5f00\u64ad\u65f6\u95f4");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(40, 220), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("\u7ed3\u675f\u65f6\u95f4");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(40, 255), label6.getPreferredSize()));
        contentPane.add(cineplexName);
        cineplexName.setBounds(120, 40, 165, cineplexName.getPreferredSize().height);
        contentPane.add(movieHallName);
        movieHallName.setBounds(120, 80, 165, movieHallName.getPreferredSize().height);
        contentPane.add(filmName);
        filmName.setBounds(120, 125, 165, filmName.getPreferredSize().height);
        contentPane.add(ticketRates);
        ticketRates.setBounds(120, 165, 165, ticketRates.getPreferredSize().height);
        contentPane.add(startTime);
        startTime.setBounds(120, 210, 165, startTime.getPreferredSize().height);
        contentPane.add(endTime);
        endTime.setBounds(120, 255, 165, endTime.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u786e\u5b9a");
        contentPane.add(button1);
        button1.setBounds(165, 320, 95, button1.getPreferredSize().height);

        //---- label7 ----
        label7.setText("\u65f6\u95f4\u683c\u5f0f\uff1ayyyy-MM-dd HH:mm:ss");
        contentPane.add(label7);
        label7.setBounds(40, 290, 275, label7.getPreferredSize().height);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cineplexName.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "影城名称不能为空");
                }
                if(movieHallName.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "影厅名称不能为空");
                }
                if(filmName.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "电影名称不能为空");
                }
                if(ticketRates.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "票价名称不能为空");
                }
                if(startTime.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "开播不能为空");
                }
                if(endTime.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "结束时间不能为空");
                }

                FilmScheduleDao filmScheduleDao = new FilmScheduleDaoImpl();//排片
                CineplexDao cineplexDao = new CineplexDaoImpl();//影城
                MovieHallDao movieHallDao = new MovieHallDaoImpl();//影厅
                FilmDao filmDao = new FilmDaoImpl();//电影

                Cineplex cineplex = cineplexDao.queryName(cineplexName.getText());
                if(cineplex == null){
                    JOptionPane.showMessageDialog(null, "影城不存在");
                }
                MovieHall movieHall = movieHallDao.queryName(movieHallName.getText());
                if(movieHall == null){
                    JOptionPane.showMessageDialog(null, "影厅不存在");
                }
                Film film = filmDao.queryName(filmName.getText());
                if(film == null){
                    JOptionPane.showMessageDialog(null, "电影不存在");
                }

                FilmSchedule filmSchedule = new FilmSchedule();
                filmSchedule.setCineplexId(cineplex.getId());
                filmSchedule.setMovieHallId(movieHall.getId());
                filmSchedule.setFilmId(film.getId());
                filmSchedule.setTicketRates(new BigDecimal(ticketRates.getText()));
                DateTimeFormatter timeDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime startLocal = LocalDateTime.parse(startTime.getText(), timeDtf);
                filmSchedule.setStartTime(startLocal.toInstant(ZoneOffset.of("+8")).toEpochMilli());
                LocalDateTime endLocal = LocalDateTime.parse(endTime.getText(), timeDtf);
                filmSchedule.setEndTime(endLocal.toInstant(ZoneOffset.of("+8")).toEpochMilli());
                filmScheduleDao.add(filmSchedule);
                new FilmScheduleHomePage();
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
    private JTextField cineplexName;
    private JTextField movieHallName;
    private JTextField filmName;
    private JTextField ticketRates;
    private JTextField startTime;
    private JTextField endTime;
    private JButton button1;
    private JLabel label7;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
