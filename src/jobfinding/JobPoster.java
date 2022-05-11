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
public class JobPoster extends Person{
    
    private Company company;

    public JobPoster(Company company, String name, int id, String mail) {
        super(name, id, mail);
        this.company = company;
    }
   
    public void display()
    {
        super.display();
        System.out.println("Compnay name is : " + company.getName());
    }
    
    public void postForAJob()
    {
        for (String job : company.getList()) {
            System.out.println("Job title is : " + job);
        }
    }
}
