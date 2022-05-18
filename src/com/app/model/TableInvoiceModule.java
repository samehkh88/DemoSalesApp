package com.app.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author maria
 */
public class TableInvoiceModule extends AbstractTableModel {
    
    private ArrayList<InvoiceFile> InvoiceFileObj;
     
    private String[] columnsName = {"No.", "Date", "Customer", "Total"};

    public TableInvoiceModule(ArrayList<InvoiceFile> invoices) {
        this.InvoiceFileObj = invoices;
    }

    @Override
    public int getRowCount() {
        return InvoiceFileObj.size();
    }

    @Override
    public int getColumnCount() {
        return columnsName.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnsName[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceFile invoice = InvoiceFileObj.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return invoice.getNum();
            case 1:
                return invoice.getDate();
            case 2:
                return invoice.getCustomerName();
            case 3:
                return invoice.getTotalInvoice();
            default:
                return "";
        }
    }
}
