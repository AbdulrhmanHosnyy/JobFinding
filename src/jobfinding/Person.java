/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobfinding;

/**
 *
 * @author HP
 */
public class Person {
    
    private String name;
    private int id;
    private String mail;
    
    public Person(String name, int id, String mail) {
        this.name = name;
        this.id = id;
        this.mail = mail;
    }
    
    public void display()
    {
        System.out.println("Person name is : " + name);
        System.out.println("Person id is : " + id);
        System.out.println("Person mail is : " + mail);  
    }

}
