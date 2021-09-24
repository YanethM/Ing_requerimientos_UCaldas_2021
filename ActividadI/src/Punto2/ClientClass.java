/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author YanethM
 */
public class ClientClass extends PersonClass{
    
    private String address;
    private String contact;
    
    public ClientClass(String name, String document_type, String document, String email, String address, String contact) {
        super(name, document_type, document, email);
        this.address = address;
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
}
