package com.app.controller;

import com.app.model.InvoiceFile;
import com.app.model.LineFile;
import com.app.model.TableInvoiceLineModule;
import com.app.model.TableInvoiceModule;
import com.app.view.Invoicepopup;
import com.app.view.LinePopup;
import com.app.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controller implements ActionListener, ListSelectionListener {

    private MainFrame mainframe;
    private Invoicepopup InvoicepopupObj;
    private LinePopup LinePopupObj;
    private SimpleDateFormat Formatdate = new SimpleDateFormat("dd-mm-yyyy");
    private ArrayList<InvoiceFile> invoicesArr = new ArrayList();
    private TableInvoiceModule TableInvoiceModuleObj;

    public Controller(MainFrame frame) {
        this.mainframe = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        System.out.println(actionCommand);
        switch (actionCommand) {
            case "Load File":
                loadFile();
                break;
                
            case "Save File":
                //saveFile();
                break;
                
            case "Create New Invoice":
                // open Invoice popup
                createNewInvoice();
                break;
                
            case "Create Invoice":
                // add item in Invoice Dialog
                AddNewInvoice();
                break;
                
            case "Close Invoice":
                // close Dialog invoice
                CloseInvoice();
                break;
                
            case "Delete Selected Invoice":
                // Delete row from invoice table
                deleteSelectedInvoice();
                break;
                
            case "Create New Item":
                // open Dialog line
                createNewLine();
                break;
                
             case "Delete Line Item":
                // close Dialog line
                deleteLineItem();
                break;
                
            case "Close Line popup":
                // close Dialog line
                CloseNewItem();
                break;

        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int rowIndex = mainframe.getInvoiceTable().getSelectedRow();
        if (rowIndex != -1){
        InvoiceFile uplodedFile = mainframe.getInvoices().get(rowIndex);
        mainframe.ShowInvoiceNumber().setText("" + uplodedFile.getNum());
        mainframe.ShowInvoiceDate().setText(uplodedFile.getDate());
        mainframe.ShowCustomerName().setText(uplodedFile.getCustomerName());
        mainframe.ShowinvoiceTotal().setText("" + uplodedFile.getTotalInvoice());
        TableInvoiceLineModule linesTableObj = new TableInvoiceLineModule(uplodedFile.getLines());
        mainframe.getlinesTable().setModel(linesTableObj);
        linesTableObj.fireTableDataChanged();
    }
    }
    private void loadFile() {
        JFileChooser fc = new JFileChooser();
        try {

            int result = fc.showOpenDialog(mainframe);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                Path headerPath = Paths.get(headerFile.getAbsolutePath());
                List<String> headerLines = Files.readAllLines(headerPath);
                ArrayList<InvoiceFile> invoicesArray = new ArrayList<>();
                for (String headerLine : headerLines) {
                    String[] headerParts = headerLine.split(",");
                    int invoiceNum = Integer.parseInt(headerParts[0]);
                    String invoiceDate = headerParts[1];
                    String customerName = headerParts[2];

                    InvoiceFile invoice = new InvoiceFile(invoiceNum, invoiceDate, customerName);
                    invoicesArray.add(invoice);
                }
                result = fc.showOpenDialog(mainframe);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File lineFile = fc.getSelectedFile();
                    Path linePath = Paths.get(lineFile.getAbsolutePath());
                    List<String> lineLines = Files.readAllLines(linePath);
                    for (String lineLine : lineLines) {
                        String lineParts[] = lineLine.split(",");
                        int invoiceNum = Integer.parseInt(lineParts[0]);
                        String itemName = lineParts[1];
                        double itemPrice = Double.parseDouble(lineParts[2]);
                        int count = Integer.parseInt(lineParts[3]);
                        InvoiceFile inv = null;
                        for (InvoiceFile invoice : invoicesArray) {
                            if (invoice.getNum() == invoiceNum) {
                                inv = invoice;
                                break;
                            }
                        }
                        LineFile line = new LineFile(invoiceNum, itemName, itemPrice, count, inv);
                        inv.getLines().add(line);
                    }
                }
                mainframe.setInvoices(invoicesArray);
                //create Table module
                TableInvoiceModule TableInvoiceModule = new TableInvoiceModule(invoicesArray);
                // pass the table module to the frame
                mainframe.setTableInvoiceModuleObj(TableInvoiceModule);
                mainframe.getInvoiceTable().setModel(TableInvoiceModule);
                // data change
                mainframe.getTableInvoiceLineModule().fireTableDataChanged();

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
// method for open the Invoice Dialog
    private void createNewInvoice() {
        InvoicepopupObj = new Invoicepopup(mainframe);
        InvoicepopupObj.setVisible(true);
    }

    // method for delete inoice from Tabel   
    private void deleteSelectedInvoice() {
        // return the index for the selected row 
        int selectedInvoiceRow = mainframe.getInvoiceTable().getSelectedRow();
        if (selectedInvoiceRow != -1) {
            mainframe.getInvoices().remove(selectedInvoiceRow);
            mainframe.getTableInvoiceModule().fireTableDataChanged();
        }
    }

// method for Cancle the Invoice Dialog
    public void CloseInvoice() {
        InvoicepopupObj.setVisible(false);
        InvoicepopupObj.dispose();
        InvoicepopupObj = null;
    }
// method for opne  the Line Dialog
    private void createNewLine() {
        LinePopupObj = new LinePopup(mainframe);
        LinePopupObj.setVisible(true);
    }
    
        private void deleteLineItem() {
       // return the index for the selected row from Line Table
        int selectedLineRow = mainframe.getlinesTable().getSelectedRow();
        if (selectedLineRow != -1) {
           // mainframe.get.remove(selectedLineRow);
           // mainframe.getTableInvoiceModule().fireTableDataChanged();  
    }
        }  
// method for Close the Invoice Dialog
    private void CloseNewItem() {
        LinePopupObj.setVisible(false);
        LinePopupObj.dispose();
        LinePopupObj = null;
    }

    public void AddNewInvoice() {

        String EnteredcustomerName = this.InvoicepopupObj.getCustomerNameField().getText();
        String EnteredinvoiceDate = this.InvoicepopupObj.getDateField().getText();
        Date invoiceDateInput = new Date();
        this.InvoicepopupObj.setVisible(false);
        int x = (getMaxNum() + 1);
        InvoiceFile newInvoiceHeader = new InvoiceFile(x, EnteredinvoiceDate, EnteredcustomerName);
        this.invoicesArr.add(newInvoiceHeader);
        this.TableInvoiceModuleObj = new TableInvoiceModule(this.invoicesArr);
        this.mainframe.getInvoiceTable().setModel(this.TableInvoiceModuleObj);
        this.TableInvoiceModuleObj.fireTableDataChanged();
    }

    public int getMaxNum() {
        System.out.println("value before is " + invoicesArr.size());
        int num = 0;
        Iterator val = this.invoicesArr.iterator();

        while (val.hasNext()) {
            InvoiceFile invoicef = (InvoiceFile) val.next();
            if (invoicef.getNum() > num) {
                num = invoicef.getNum();
            }
        }
        System.out.print("the value is : " + num);
        return num;
    }



}
