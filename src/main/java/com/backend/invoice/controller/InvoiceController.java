package com.backend.invoice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.backend.invoice.exception.ResourceNotFoundException;
import com.backend.invoice.model.Invoice;
import com.backend.invoice.repository.InvoiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v4/")
public class InvoiceController {
    
    @Autowired
    private InvoiceRepository invoiceRepository;

     //get all employees
     @GetMapping("/invoices")
     public List<Invoice> getAllInvoices(){
         return invoiceRepository.findAll();
     }

      //get employee REST Api
    @PostMapping("/invoices")
    public Invoice createInvoice(@RequestBody Invoice invoice){
        return invoiceRepository.save(invoice);
    }

     // get employee by id
     @GetMapping("/invoices/{id}")
     public ResponseEntity<Invoice> getInvoiceById(@PathVariable Long id){
         Invoice invoice = invoiceRepository.findById(id).
         orElseThrow( () -> new ResourceNotFoundException("Invoice does Not Exist with id" + id));
         return ResponseEntity.ok(invoice);
     }


      //update employee rest api
    @PutMapping("/invoices/{id}")
    public ResponseEntity<Invoice> updateEmployee(@PathVariable Long id,@RequestBody Invoice invoiceDetails){
    Invoice invoice = invoiceRepository.findById(id).
    orElseThrow( () -> new ResourceNotFoundException("Employee does Not Exist with id" + id));

    invoice.setFullName(invoiceDetails.getFullName());
    invoice.setAddress(invoiceDetails.getAddress());
    invoice.setRegistrationNo(invoiceDetails.getRegistrationNo());
    invoice.setState(invoiceDetails.getState());
    invoice.setStateCode(invoiceDetails.getStateCode());
    invoice.setPanNo(invoiceDetails.getPanNo());
    invoice.setParticular(invoiceDetails.getParticular());
    invoice.setWeight(invoiceDetails.getWeight());
    invoice.setUnit(invoiceDetails.getUnit());
    invoice.setRate(invoiceDetails.getRate());
    invoice.setTaxableValue(invoiceDetails.getTaxableValue());
    invoice.setTransport(invoiceDetails.getTransport());
    invoice.setSGSTAmount(invoiceDetails.getSGSTAmount());
    invoice.setCGSTAmount(invoiceDetails.getCGSTAmount());
    invoice.setICGSTAmount(invoiceDetails.getICGSTAmount());
    invoice.setFinalTotal(invoiceDetails.getFinalTotal());

    Invoice updateInvoice = invoiceRepository.save(invoice);
    return ResponseEntity.ok(updateInvoice);
}

      //delete employee rest API
    @DeleteMapping("invoices/{id}")
    public ResponseEntity <Map<String, Boolean>> deleteInvoice(@PathVariable Long id){
        Invoice invoice = invoiceRepository.findById(id).
        orElseThrow( () -> new ResourceNotFoundException("Invoice does Not Exist with id" + id));

        invoiceRepository.delete(invoice);
        Map<String ,Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
