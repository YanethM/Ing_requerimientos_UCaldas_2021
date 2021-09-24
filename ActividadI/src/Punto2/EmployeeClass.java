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
public class EmployeeClass extends PersonClass {

    private int salary;
    private String name_job;
    private String job_position;

    public EmployeeClass(String name, String document_type, String document, String email,int salary, String name_job, String job_position) {
        super(name, document_type, document, email);
        this.job_position = job_position;
        this.name_job = name_job;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
    public String getName_job() {
        return name_job;
    }

    public void setName_job(String name_job) {
        this.name_job = name_job;
    }

    public String getJob_position() {
        return job_position;
    }

    public void setJob_position(String job_position) {
        this.job_position = job_position;
    }

    

}
