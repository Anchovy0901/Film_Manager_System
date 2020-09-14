/*
 * Created by JFormDesigner on Sun Sep 13 18:30:03 CST 2020
 */

package ui;

import dao.CineplexDao;
import dao.DiscountCardDao;
import dao.impl.CineplexDaoImpl;
import dao.impl.DiscountCardDaoImpl;
import entity.Cineplex;
import entity.DiscountCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

/**
 * @author unknown
 */
public class DiscountCardUpdate {
    public DiscountCardUpdate(Integer id) {
        initComponents(id);
    }

    private void initComponents(Integer id) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        name = new JTextField();
        discount = new JTextField();
        cineplexName = new JTextField();
        price = new JTextField();
        confirm = new JButton();
        jFrame = new JFrame();

        //======== this ========
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u6298\u6263\u5361\u540d\u79f0");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(35, 35), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u5219\u6263");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(55, 85), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u5f71\u57ce\u540d\u79f0");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(40, 130), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("\u529e\u5361\u91d1\u989d");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(35, 175), label4.getPreferredSize()));
        contentPane.add(name);
        name.setBounds(130, 35, 130, name.getPreferredSize().height);
        contentPane.add(discount);
        discount.setBounds(130, 80, 130, discount.getPreferredSize().height);
        contentPane.add(cineplexName);
        cineplexName.setBounds(130, 125, 130, cineplexName.getPreferredSize().height);
        contentPane.add(price);
        price.setBounds(130, 170, 130, price.getPreferredSize().height);

        //---- confirm ----
        confirm.setText("\u786e\u5b9a");
        contentPane.add(confirm);
        confirm.setBounds(new Rectangle(new Point(150, 225), confirm.getPreferredSize()));

        DiscountCardDao discountCardDao = new DiscountCardDaoImpl();
        CineplexDao cineplexDao = new CineplexDaoImpl();
        DiscountCard discountCard = discountCardDao.queryById(id);
        name.setText(discountCard.getName());
        discount.setText(discountCard.getDiscount().toString());
        cineplexName.setText(cineplexDao.queryById(discountCard.getId()).getName());
        price.setText(discountCard.getPrice().toString());

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(name.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "折扣卡名称不能为空");
                }
                if(discount.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "折扣不能为空");
                }
                if(cineplexName.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "影城名称不能为空");
                }
                if(price.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "办卡金额不能为空");
                }

                Cineplex cineplex = cineplexDao.queryName(cineplexName.getText());
                if(cineplex == null){
                    JOptionPane.showMessageDialog(null, "影城不存在");
                }
                DiscountCard discountCard1 = new DiscountCard();
                discountCard1.setName(name.getText());
                discountCard1.setDiscount(new BigDecimal(discount.getText()));
                discountCard1.setCineplexId(cineplex.getId());
                discountCard1.setPrice(new BigDecimal(price.getText()));
                discountCard1.setId(id);
                discountCardDao.edit(discountCard1);
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
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField name;
    private JTextField discount;
    private JTextField cineplexName;
    private JTextField price;
    private JButton confirm;
    private JFrame jFrame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
