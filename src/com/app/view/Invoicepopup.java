package com.app.view;

import com.app.controller.Controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class Invoicepopup extends JDialog{

    private JTextField customerNameField;
    private JTextField dateField;
    private JLabel customerNameLabel;
    private JLabel dateLabel;
    private JButton saveButton;
    private JButton cancelButton;

    public Invoicepopup(MainFrame f) {
        
        customerNameLabel = new JLabel("Customer Name");
        customerNameField = new JTextField("");
        dateLabel = new JLabel("Invoice Date");
        dateField = new JTextField("");
        saveButton = new JButton("Save");
        saveButton.setActionCommand("Create Invoice");
        cancelButton = new JButton("Cancel");
        cancelButton.setActionCommand("Close Invoice");
        saveButton.addActionListener(f.getActionListener());
        cancelButton.addActionListener(f.getActionListener());
        setLayout(new GridLayout(3, 2));
        setLocation(400, 400);
        setTitle("Create new Invoice");
        add(dateLabel);
        add(dateField);
        add(customerNameLabel);
        add(customerNameField);
        add(saveButton);
        add(cancelButton);
        pack();
        
        
    }

    public JTextField getCustomerNameField() {
        return customerNameField;
    }

    public JTextField getDateField() {
        return dateField;
    }
}
