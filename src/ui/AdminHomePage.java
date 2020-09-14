/*
 * Created by JFormDesigner on Wed Sep 09 14:17:59 CST 2020
 */

package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class AdminHomePage {
    public AdminHomePage() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        film = new JButton();
        cineplex = new JButton();
        movieHall = new JButton();
        filmSchedule = new JButton();
        discountCard = new JButton();
        user = new JButton();
        order = new JButton();
        actor = new JButton();
        jFrame = new JFrame();

        //======== this ========
        jFrame.setTitle("home page");
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- film ----
        film.setText("\u7535\u5f71\u7ba1\u7406");
        contentPane.add(film);
        film.setBounds(new Rectangle(new Point(50, 40), film.getPreferredSize()));

        //---- cineplex ----
        cineplex.setText("\u5f71\u57ce\u7ba1\u7406");
        contentPane.add(cineplex);
        cineplex.setBounds(new Rectangle(new Point(165, 40), cineplex.getPreferredSize()));

        //---- movieHall ----
        movieHall.setText("\u5f71\u5385\u7ba1\u7406");
        contentPane.add(movieHall);
        movieHall.setBounds(new Rectangle(new Point(280, 40), movieHall.getPreferredSize()));

        //---- filmSchedule ----
        filmSchedule.setText("\u7535\u5f71\u6392\u7247\u7ba1\u7406");
        contentPane.add(filmSchedule);
        filmSchedule.setBounds(new Rectangle(new Point(55, 160), filmSchedule.getPreferredSize()));

        //---- discountCard ----
        discountCard.setText("\u6298\u6263\u5361\u7ba1\u7406");
        contentPane.add(discountCard);
        discountCard.setBounds(new Rectangle(new Point(165, 105), discountCard.getPreferredSize()));

        //---- user ----
        user.setText("\u7528\u6237\u7ba1\u7406");
        contentPane.add(user);
        user.setBounds(new Rectangle(new Point(285, 105), user.getPreferredSize()));

        //---- order ----
        order.setText("\u8ba2\u5355\u7ba1\u7406");
        contentPane.add(order);
        order.setBounds(new Rectangle(new Point(55, 105), order.getPreferredSize()));

        //---- actor ----
        actor.setText("\u6f14\u5458\u7ba1\u7406");
        contentPane.add(actor);
        actor.setBounds(new Rectangle(new Point(185, 160), actor.getPreferredSize()));

        cineplex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CineplexHomePage();
                jFrame.dispose();
            }
        });

        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserList();
                jFrame.dispose();
            }
        });

        movieHall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MovieHallHomePage();
                jFrame.dispose();
            }
        });

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OrderList();
                jFrame.dispose();
            }
        });
        film.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FilmHomePage();
                jFrame.dispose();
            }
        });
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OrderList();
                jFrame.dispose();
            }
        });
        discountCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DiscountCardHomePage();
                jFrame.dispose();
            }
        });
        filmSchedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FilmScheduleHomePage();
                jFrame.dispose();
            }
        });
        actor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        jFrame.setSize(450,400);
        jFrame.setLocationRelativeTo(jFrame.getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton film;
    private JButton cineplex;
    private JButton movieHall;
    private JButton filmSchedule;
    private JButton discountCard;
    private JButton user;
    private JButton order;
    private JButton actor;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
