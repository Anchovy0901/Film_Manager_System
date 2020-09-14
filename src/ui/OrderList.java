/*
 * Created by JFormDesigner on Sat Sep 12 00:13:55 CST 2020
 */

package ui;

import dao.impl.OrderDaoImpl;
import dao.impl.UserDaoImpl;
import entity.OrderVO;
import entity.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

/**
 * @author unknown
 */
public class OrderList{
    public OrderList() {
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
        scrollPane1.setBounds(0, 0, 540, 370);

        //---- button1 ----
        button1.setText("\u9996\u9875");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(240, 375), button1.getPreferredSize()));

        List<OrderVO> list = new OrderDaoImpl().orderList();
        if(!list.isEmpty()){
            String[] values=new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                OrderVO orderVO = list.get(i);
                values[i] = "用户："+orderVO.getRemarkName()+"  影城："+orderVO.getCineplexName()+"  影厅："+orderVO.getMovieName()+"  价格："+orderVO.getPrice()+"  评分："+orderVO.getScore()+"  评论："+orderVO.getRemark();
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

    public static void main(String args[]){
        new OrderList();
    }
}
