/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author YanethM
 */
public class PersonClass {
    //1. Declarar los atributos de la entidad persona, con base en el diagrama UML
    private String name;
    private String document_type;
    private String document;
    private char gender;
    private int born_year;
    private boolean actually_work;
    
    //2. Clic secundario, insert code, constructor()
    public PersonClass(String name, String document_type, String document, char gender, int born_year, boolean actually_work) {
        this.name = name;
        this.document_type = document_type;
        this.document = document;
        this.gender = gender;
        this.born_year = born_year;
        this.actually_work = actually_work;
    }
    //3. Clic secundario, insert code, getter() y setter()
    //La función get() Obtiene el valor que le hemos asignado al atributo
    //El método set() asigna un nuevo valor al atributo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBorn_year() {
        return born_year;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    public boolean isActually_work() {
        return actually_work;
    }

    public void setActually_work(boolean actually_work) {
        this.actually_work = actually_work;
    }
    
    //Creamos función que retorna la información de la persona
    public String show_info_person(){
        return getName() +" - " + getDocument_type()+" - " +getDocument()+" - " +getGender()+" - " +getBorn_year()+" - " +isActually_work();
    }
    
}
