package com.app.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LinePopup extends JDialog{
    
    private JTextField ProductNameField;
    private JTextField ProductQTYField;
    private JTextField ProductPriceField;
    private JLabel NameLabel;
    private JLabel QTYLabel;
    private JLabel PriceLabel;
    private JButton AddLine;
    private JButton CloseDialog;

    public LinePopup(MainFrame frame) {
        
        ProductNameField = new JTextField(25);
        NameLabel = new JLabel("   Product Name");

        ProductQTYField = new JTextField(25);
        QTYLabel = new JLabel("   Product QTY");

        ProductPriceField = new JTextField(25);
        PriceLabel = new JLabel("   Product Price");

        AddLine = new JButton("Create Line");
        CloseDialog = new JButton("Close");

        AddLine.setActionCommand("Sucess Create Line");
        CloseDialog.setActionCommand("Close Line popup");

        AddLine.addActionListener(frame.getActionListener());
        CloseDialog.addActionListener(frame.getActionListener());
        setLayout(new GridLayout(4, 2));
        setLocation(500, 500);

        add(NameLabel);
        add(ProductNameField);
        add(QTYLabel);
        add(ProductQTYField);
        add(PriceLabel);
        add(ProductPriceField);
        add(AddLine);
        add(CloseDialog);

        pack();
    }

    public JTextField getProductNameField() {
        return ProductNameField;
    }

    public JTextField getProductQTYField() {
        return ProductQTYField;
    }

    public JTextField getProductPriceField() {
        return ProductPriceField;
    }
}
