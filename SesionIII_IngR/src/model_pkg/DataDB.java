/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

/**
 *
 * @author YanethM
 */
public class DataDB {
    private int id_student;
    private String name_student;
    private String document_type;
    private int document;
    private boolean lives_in_mzls;
    private int chemestry;

    public DataDB() {
        this.id_student = 0;
        this.name_student = "";
        this.document_type = "";
        this.document=0;
        this.lives_in_mzls = false;
        this.chemestry = 0;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getName_student() {
        return name_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public boolean isLives_in_mzls() {
        return lives_in_mzls;
    }

    public void setLives_in_mzls(boolean lives_in_mzls) {
        this.lives_in_mzls = lives_in_mzls;
    }

    public int getChemestry() {
        return chemestry;
    }

    public void setChemestry(int chemestry) {
        this.chemestry = chemestry;
    }
    
    
}
