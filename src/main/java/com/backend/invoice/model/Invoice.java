package com.backend.invoice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoices")
public class Invoice {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "full_name")
private String FullName;

@Column(name = "address")
private String Address;

@Column(name = "registration_no")
private Number RegistrationNo;

@Column(name = "state")
private String State;

@Column(name = "state_code")
private Number StateCode;

@Column(name = "pan_no")
private String PanNo;

@Column(name = "particular")
private String Particular;

@Column(name = "weight")
private Number Weight;

@Column(name = "unit")
private Number Unit;

@Column(name = "rate")
private Number Rate;

@Column(name = "taxable_value")
private Number TaxableValue;

@Column(name = "transport")
private Number Transport;

@Column(name = "sgst_amount")
private Number SGSTAmount;

@Column(name = "cgst_amount")
private Number CGSTAmount;

@Column(name = "icgst_amount")
private Number ICGSTAmount;

@Column(name = "final_total")
private Number FinalTotal;

@Column(name = "date")
private String Date;




    public Invoice(){}

    
    public Invoice(
        String fullname,
        String address,
        String state,
        String Particular,
        String date,
        String panNo,
        Number registrationNo,
        Number stateCode,
        Number weight,
        Number unit,
        Number rate,
        Number taxableValue,
        Number transport,
        Number sGSTAmount,
        Number cGSTAmount,
        Number iCGSTAmount,
        Number finalTotal
){
this.FullName = fullname;
this.Address = address;
this.RegistrationNo = registrationNo;
this.State = state;
this.StateCode = stateCode;
this.PanNo = panNo;
this.Particular = Particular;   
this.Weight = weight;
this.Unit = unit;
this.Rate = rate;
this.TaxableValue = taxableValue;
this.Transport = transport;
this.SGSTAmount = sGSTAmount;
this.CGSTAmount = cGSTAmount;
this.ICGSTAmount = iCGSTAmount;
this.FinalTotal = finalTotal;
this.Date = date;
}


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getFullName() {
        return FullName;
    }


    public void setFullName(String fullName) {
        FullName = fullName;
    }


    public String getAddress() {
        return Address;
    }


    public void setAddress(String address) {
        Address = address;
    }


    public Number getRegistrationNo() {
        return RegistrationNo;
    }


    public void setRegistrationNo(Number registrationNo) {
        RegistrationNo = registrationNo;
    }


    public String getState() {
        return State;
    }


    public void setState(String state) {
        State = state;
    }


    public Number getStateCode() {
        return StateCode;
    }


    public void setStateCode(Number stateCode) {
        StateCode = stateCode;
    }


    public String getPanNo() {
        return PanNo;
    }


    public void setPanNo(String panNo) {
        PanNo = panNo;
    }


    public String getParticular() {
        return Particular;
    }


    public void setParticular(String particular) {
        Particular = particular;
    }


    public Number getWeight() {
        return Weight;
    }


    public void setWeight(Number weight) {
        Weight = weight;
    }


    public Number getUnit() {
        return Unit;
    }


    public void setUnit(Number unit) {
        Unit = unit;
    }


    public Number getRate() {
        return Rate;
    }


    public void setRate(Number rate) {
        Rate = rate;
    }


    public Number getTaxableValue() {
        return TaxableValue;
    }


    public void setTaxableValue(Number taxableValue) {
        TaxableValue = taxableValue;
    }


    public Number getTransport() {
        return Transport;
    }


    public void setTransport(Number transport) {
        Transport = transport;
    }


    public Number getSGSTAmount() {
        return SGSTAmount;
    }


    public void setSGSTAmount(Number sGSTAmount) {
        SGSTAmount = sGSTAmount;
    }


    public Number getCGSTAmount() {
        return CGSTAmount;
    }


    public void setCGSTAmount(Number cGSTAmount) {
        CGSTAmount = cGSTAmount;
    }


    public Number getICGSTAmount() {
        return ICGSTAmount;
    }


    public void setICGSTAmount(Number iCGSTAmount) {
        ICGSTAmount = iCGSTAmount;
    }


    public Number getFinalTotal() {
        return FinalTotal;
    }


    public void setFinalTotal(Number finalTotal) {
        FinalTotal = finalTotal;
    }


    public String getDate() {
        return Date;
    }


    public void setDate(String date) {
        Date = date;
    }




}