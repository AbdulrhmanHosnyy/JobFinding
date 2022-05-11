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
public class JobFinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person[] person = new Person[4];

        String[] list1 = {"Cooker", "Bartender", "Chef"};
        String[] list2 = {"FrontEnd", "BackEnd", "FullStack"};

        person[0] = new JobSeeker(list1, "Abdo", 101, "abdohosny@gmail.com");
        person[1] = new JobSeeker(list2, "Omar", 102, "omarhosny@gmail.com");

        String[] list3 = {"SauseChef", "DessertsChef", "Jaintor"};
        String[] list4 = {"MLDev", "AIDev", "Jaintor"};

        Company company1 = new Company("Desouky", list3);
        Company company2 = new Company("Google", list4);

        person[2] = new JobPoster(company1, "Hosny", 103, "hosny@gmail.com");
        person[3] = new JobPoster(company2, "Youssef", 104, "youssef@gmail.com");

        for (Person p : person) {
            p.display();

            if (p instanceof JobPoster) {
                JobPoster jobPoster = (JobPoster) p;
                jobPoster.postForAJob();
            }

        }
    }

}
