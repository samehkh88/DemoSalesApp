package com.app.model;

public class LineFile {
    private int num;
    private String productName;
    private double unitPrice;
    private int Qty;
    private InvoiceFile invoice;

    public LineFile(int Refnum, String itemName , double price ,  int count, InvoiceFile invoice) {
        this.num = Refnum;
        this.productName = itemName;
        this.unitPrice = price;
        this.Qty = count;
        this.invoice = invoice;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int count) {
        this.Qty = count;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getproductName() {
        return productName;
    }

    public void setIproductName(String item) {
        this.productName = item;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double price) {
        this.unitPrice = price;
    }

    // to calc the total for every line
    public double getLineTotal() {
        return unitPrice * Qty;
    }

    public InvoiceFile getInvoice() {
        return invoice;
    }

}
