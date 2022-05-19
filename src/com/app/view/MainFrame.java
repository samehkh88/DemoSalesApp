package com.app.view;

import com.app.controller.Controller;
import com.app.model.InvoiceFile;
import com.app.model.TableInvoiceLineModule;

import com.app.model.TableInvoiceModule;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 * @author DELL
 */
public class MainFrame extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateLineButton;
    private javax.swing.JTable MaininvoiceTable;
    private javax.swing.JLabel ShowCustomerName;
    private javax.swing.JLabel ShowInvoiceDate;
    private javax.swing.JLabel ShowInvoiceNumber;
    private javax.swing.JLabel ShowinvoiceTotal;
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteLineButton;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JLabel invoiceNumLabel;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable linesTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables
    private ArrayList<InvoiceFile> invoices;
    private Controller controller = new Controller(this);
    private Invoicepopup Invoicepopup;
    private TableInvoiceLineModule TableInvoiceLineModuleObj ; 
    private TableInvoiceModule TableInvoiceModuleObj ;
    /**
     * Creates new form InvoiceFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MaininvoiceTable = new javax.swing.JTable();
        MaininvoiceTable.getSelectionModel().addListSelectionListener(controller);
        createInvoiceButton = new javax.swing.JButton();
        createInvoiceButton.addActionListener(controller);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        invoiceNumLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        linesTable = new javax.swing.JTable();
        CreateLineButton = new javax.swing.JButton();
        CreateLineButton.addActionListener(controller);
        deleteLineButton = new javax.swing.JButton();
        deleteLineButton.addActionListener(controller);
        jLabel5 = new javax.swing.JLabel();
        ShowInvoiceNumber = new javax.swing.JLabel();
        ShowInvoiceDate = new javax.swing.JLabel();
        ShowCustomerName = new javax.swing.JLabel();
        ShowinvoiceTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(controller);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MaininvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(MaininvoiceTable);

        createInvoiceButton.setText("Create New Invoice");

        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.setActionCommand("Delete Selected Invoice");

        jLabel1.setText("Invoice Number : ");

        jLabel2.setText("Invoice Date :");

        jLabel3.setText("Customer Name :");

        jLabel4.setText("Invoice Total : ");

        linesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(linesTable);

        CreateLineButton.setText("Create New Item");

        deleteLineButton.setText("Delete Item");
        deleteLineButton.setActionCommand("Delete Line Item");

        jLabel5.setText("Invoices Tabel");

        jMenu1.setText("File");

        loadFileMenuItem.setText("Load File");
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save File");
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(invoiceTotalLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(invoiceNumLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(invoiceDateLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(customerNameLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ShowInvoiceNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(ShowInvoiceDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ShowCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShowinvoiceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(createInvoiceButton)
                        .addGap(125, 125, 125)
                        .addComponent(deleteInvoiceButton)
                        .addGap(133, 133, 133)
                        .addComponent(CreateLineButton)
                        .addGap(71, 71, 71)
                        .addComponent(deleteLineButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invoiceNumLabel)
                            .addComponent(ShowInvoiceNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invoiceDateLabel)
                            .addComponent(ShowInvoiceDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerNameLabel)
                            .addComponent(ShowCustomerName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invoiceTotalLabel)
                            .addComponent(ShowinvoiceTotal))
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInvoiceButton)
                    .addComponent(deleteInvoiceButton)
                    .addComponent(CreateLineButton)
                    .addComponent(deleteLineButton))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<InvoiceFile> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<InvoiceFile> invoices) {
        this.invoices = invoices;
    }

    public Invoicepopup getHeaderDialog() {
        return Invoicepopup;
    }

   
    public void setTableInvoiceModuleObj(TableInvoiceModule TableInvoiceModuleObj) {
        this.TableInvoiceModuleObj = TableInvoiceModuleObj;
    }
    
    public TableInvoiceModule getTableInvoiceModule() {
        if (TableInvoiceModuleObj == null) {
            TableInvoiceModuleObj = new TableInvoiceModule(getInvoices());
        }
        return TableInvoiceModuleObj;
    }
    
    public JTable getInvoiceTable() {
        return MaininvoiceTable;
    }

    
    public TableInvoiceLineModule getTableInvoiceLineModule() {
        return TableInvoiceLineModuleObj;
    }
    
    // use it to pass the data right section "Invoice number"
    public JLabel ShowInvoiceNumber()
    {
    return ShowInvoiceNumber ;
    }
    
    // use it to pass the data right section "Invoice date"
    public JLabel ShowInvoiceDate()
    {
    return ShowInvoiceDate ;
    }
    
    // use it to pass the data right section "Customer name"
    public JLabel ShowCustomerName()
    {
    return ShowCustomerName ;
    }
    
    // use it to pass the data right section "total"
    
    public JLabel ShowinvoiceTotal()
    {
    return ShowinvoiceTotal ;
    }
    
    public JTable getlinesTable()
    {
    return linesTable ;
    }
    
    public Controller getActionListener() {
        return controller;
    }
    
        public int getNextInvoiceNumber() {
        int num = 0;
        //loop to know that last number from all Invoiced
        for(InvoiceFile InvFile : getInvoices())
        {
             if (InvFile.getNum() > num)
                num = InvFile.getNum();
        }
        return num;
    }
        
        
}
