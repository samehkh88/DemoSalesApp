/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LinePopup extends JDialog{
    
    private JTextField itemNameField;
    private JTextField itemCountField;
    private JTextField itemPriceField;
    private JLabel itemNameLabel;
    private JLabel itemCountLabel;
    private JLabel itemPriceLabel;
    private JButton Add;
    private JButton CloseDialog;

    public LinePopup(MainFrame frame) {
        
        itemNameField = new JTextField(25);
        itemNameLabel = new JLabel("Item Name");

        itemCountField = new JTextField(25);
        itemCountLabel = new JLabel("Item Count");

        itemPriceField = new JTextField(25);
        itemPriceLabel = new JLabel("Item Price");

        Add = new JButton("OK");
        CloseDialog = new JButton("Cancel");

        Add.setActionCommand("Sucess Create Line");
        CloseDialog.setActionCommand("Close Line popup");

        Add.addActionListener(frame.getActionListener());
        CloseDialog.addActionListener(frame.getActionListener());
        setLayout(new GridLayout(4, 2));

        add(itemNameLabel);
        add(itemNameField);
        add(itemCountLabel);
        add(itemCountField);
        add(itemPriceLabel);
        add(itemPriceField);
        add(Add);
        add(CloseDialog);

        pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }
}
