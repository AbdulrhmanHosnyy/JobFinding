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
public class JobSeeker extends Person{
    
    private String [] list;

    public JobSeeker(String[] list, String name, int id, String mail) {
        super(name, id, mail);
        this.list = list;
    }
    
    public void display()
    {
        super.display();
        for (int i = 0; i < list.length; i++) {
            System.out.println("Job which looking for : " + list[i]);
        }
    }
}
