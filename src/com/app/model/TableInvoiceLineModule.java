package com.app.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableInvoiceLineModule extends AbstractTableModel {

    private ArrayList<LineFile> LineFileObject;
    private String[] columnsLineName = {"No.", "Item Name", "Item Price", "Qty", "Unit Total"};
    
    
    public TableInvoiceLineModule(ArrayList<LineFile> linesfile) {
        this.LineFileObject = linesfile;
    }
    
    public ArrayList<LineFile> getLines() {
        return LineFileObject;
    }

    @Override
    public int getRowCount() {
        return LineFileObject.size();
    }

    @Override
    public int getColumnCount() {
        return columnsLineName.length;
    }

    @Override
    public String getColumnName(int C) {
        return columnsLineName[C];
    }
    
    
    @Override
    public Object getValueAt(int rownum, int columnnum) {
        
        LineFile Linesfile = LineFileObject.get(rownum);
        switch (columnnum) {
            case 0:
                return Linesfile.getInvoice().getNum();
            case 1:
                return Linesfile.getproductName();
            case 2:
                return Linesfile.getUnitPrice();
            case 3:
                return Linesfile.getQty();
            case 4:
                return Linesfile.getLineTotal();
            default:
                return "";
        }
    }

}
