package com.backend.invoice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products {
    
    @Column(name = "product_weight")
    private String Product_Weight;
    @Column(name = "product_rate")
    private String Product_Rate;


    
private Invoice invoice;

@ManyToOne
@JoinColumn(name="id")
public Invoice getInvoice() {
    return invoice;
}
public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
}
public String getProduct_Weight() {
    return Product_Weight;
}
public void setProduct_Weight(String product_Weight) {
    Product_Weight = product_Weight;
}
public String getProduct_Rate() {
    return Product_Rate;
}
public void setProduct_Rate(String product_Rate) {
    Product_Rate = product_Rate;
}


    

}
