package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

public class Product {
    private long productId;
    private String name;
    private String dateSupplied;
    private int quantityInStock;
    private double unitPrice;

    public Product() {
        // Default constructor
    }

    public Product(long productId, String name, String dateSupplied, int quantityInStock, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Product(Product other) {
        this.productId = other.productId;
        this.name = other.name;
        this.dateSupplied = other.dateSupplied;
        this.quantityInStock = other.quantityInStock;
        this.unitPrice = other.unitPrice;
    }

    // Getter and setter methods for each field

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(String dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return   "\n" +
                "       {" + "productId=" + productId +
                ", name='" + name +
//                ", dateSupplied='" + dateSupplied + '\'' +
//                ", quantityInStock=" + quantityInStock +
//                ", unitPrice=" + unitPrice +
                '}';
    }

    public  String toXML(){
        return  "\n     <project>" +
                "\n           <id>" + productId + "</id>" + "\n" +
                "           <name>" + name + "</name>" + "\n" +
//                "           <dateSupplied>" + dateSupplied + "</dateSupplied>" + "\n" +
//                "           <quantityInStock>" + quantityInStock + "</quantityInStock>" + "\n" +
//                "           <unitPrice>" + unitPrice + "</unitPrice>" +
                "     </project>";
    }

    public  String toCSV(){
        return  "\n" +
                productId + ", " +
                name + "," ;
//                dateSupplied + ", " +
//                quantityInStock + ", " +
//                unitPrice;
    }

    public  String toYAML(){
        return "\n           id: " + productId + "\n" +
                "           name: " + name + "\n" ;
//                "           dateSupplied: " + dateSupplied + "\n" +
//                "           quantityInStock: " + quantityInStock + "\n" +
//                "           unitPrice: " + unitPrice ;
    }
}