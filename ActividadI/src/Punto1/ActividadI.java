/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.Scanner;
import java.util.ArrayList;
import Punto2.*;

public class ActividadI {

    static Scanner inst_in_data = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos una instancia de la clase ClassPerson
        ArrayList<EmployeeClass> employee_list = new ArrayList<>();
        boolean exit_system = false;
        while(!exit_system){
            System.out.println(ANSI_BLUE + "SISTEMA EMPLEADOS UCALDAS" +ANSI_RESET);
            System.out.println("        1. Crear empleado");
            System.out.println("        2. Listar empleado");
            System.out.println("        3. Editar empleado");
            System.out.println("        4. Eliminar empleado");
            System.out.println(ANSI_RED + "        5. Salir del sistema"+ANSI_RESET);
            System.out.println(ANSI_BLUE +"        >>> "+ANSI_RESET);
            int option_menu = Integer.parseInt(inst_in_data.nextLine());
            switch(option_menu){
                case 1:
                    System.out.println(ANSI_RED +"Cúantos empleados deseas añadir?"+ANSI_RESET);
                    int num_employees = Integer.parseInt(inst_in_data.nextLine());
                    for (int i = 1; i <= num_employees; i++) {
                        System.out.println(ANSI_BLUE +"             >>>> EMPLEADO" + i+" <<<<"+ANSI_RESET);
                        System.out.println(ANSI_PURPLE + "        Nombre"+ANSI_RESET);
                        String name = inst_in_data.nextLine();
                        System.out.println(ANSI_PURPLE + "        Tipo documento"+ANSI_RESET);
                        String document_type = inst_in_data.nextLine();
                        System.out.println(ANSI_PURPLE + "        Documento"+ANSI_RESET);
                        String document = inst_in_data.nextLine();
                        System.out.println(ANSI_PURPLE + "        Cargo"+ANSI_RESET);
                        String name_job = inst_in_data.nextLine();
                        System.out.println(ANSI_PURPLE + "        Área"+ANSI_RESET);
                        String job_position = inst_in_data.nextLine();
                        System.out.println(ANSI_PURPLE + "        Email"+ANSI_RESET);
                        String email = inst_in_data.nextLine();
                        System.out.println(ANSI_PURPLE + "        Salario"+ANSI_RESET);
                        int salary = Integer.parseInt(inst_in_data.nextLine());
                        EmployeeClass employee = new EmployeeClass(name, document_type, document, email,salary, name_job, job_position);
                        employee_list.add(employee);
                        System.out.println("==============================EMPLEADO CREADO CON ÉXITO==============================");
                    }
                    break;
                case 2:
                    System.out.println(ANSI_RED +"BASE DE DATOS DE EMPLEADOS UCALDAS"+ANSI_RESET);
                    for (int i = 0; i < employee_list.size(); i++) {
                        EmployeeClass employee= employee_list.get(i);
                        System.out.println(ANSI_BLUE + "Nombre:" + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_BLUE + "Tipo documento:" + ANSI_RESET + employee.getDocument_type());
                        System.out.println(ANSI_BLUE + "Documento:" + ANSI_RESET + employee.getDocument());
                        System.out.println(ANSI_BLUE + "Correo:" + ANSI_RESET + employee.getEmail());
                        System.out.println(ANSI_BLUE + "Cargo:" + ANSI_RESET + employee.getName_job());
                        System.out.println(ANSI_BLUE + "Salario:" + ANSI_RESET + employee.getSalary());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    exit_system = true;
                    System.out.println(ANSI_RED + "==============================SALIENDO DEL SISTEMA=============================="+ ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "==============================Opción inválida=============================="+ ANSI_RESET);
            }
        }
        PersonClass inst_class = new PersonClass("Yaneth", "C.C.", "1053811111", 'F', 1991, true);
        System.out.println(inst_class.show_info_person());

    }
}
