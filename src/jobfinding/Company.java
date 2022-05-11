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
public class Company {
    private String name;
    private String [] list;

    public Company(String name, String[] list) {
        this.name = name;
        this.list = list;
    }
    
    

    public String getName() {
        return name;
    }

    public String[] getList() {
        return list;
    }
    
    
    
    
}
