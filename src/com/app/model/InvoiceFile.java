package com.app.model;

import java.util.ArrayList;

public class InvoiceFile {
    private int num;
    private String date;
    private String customerName;
    private ArrayList<LineFile> lines;
    private double TotalInvoice;
    

    public InvoiceFile(int num, String date, String customer) {
        this.num = num;
        this.date = date;
        this.customerName = customer;
    }

    public ArrayList<LineFile> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customer) {
        this.customerName = customer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    //this method to calc the total for invoice
    public double getTotalInvoice()
    {
        double total = 0.0;
        for(LineFile Lf : getLines())
        {
            total += Lf.getLineTotal();
        }
        return total ;
    }


}
