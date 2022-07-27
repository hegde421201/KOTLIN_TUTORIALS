package java2.designpatterns.solid.srp;

import java.util.Random;

public class Employee {

     private String firstName,lastName,empId;
     private double expInYears;

    public String getFirstName() {
        return firstName;
    }

    public double getExpInYears() {
        return expInYears;
    }

    public Employee(String firstName, String lastName,
                    double experience){

         this.firstName = firstName;
         this.lastName = lastName;
         this.expInYears = experience;
     }

     //The displayEmployee() shows the employee's name and their working experience in years.
     public void displayEmployee(){
         System.out.println("The employee "+lastName+","+firstName+" has work experience of "+expInYears+" years");
     }

    //The checkSeniority() method evaluates whether an employee is a senior person. Here we have considered 7 years of experience.
    public String  checkSeniority(double expInYears){
        return expInYears > 7 ? "senior" : "junior";
    }

    //The generateEmpId() method generates an employee id using string concatenation.
     // The logic is as follows : concatenate the first two characters of the first name with a random number to form an employee ID.
     public String generateEmpId(String empFirstName){
         int random = new Random().nextInt(5000);
         return empFirstName.substring(0,2)+random;
     }

}
/*
 Analysis
 --------------
What is the problem with this design?
SRP is violated here. You can see that displaying an employee detail, generating an employee id, or checking a seniority level
are all different activities. Since we put everything in a single class, we may face problems adopting new changes in the future.
Here are some possible reasons:
• The management can set a different criterion to decide a seniority level.
• They can also use a different algorithm to generate the employee id.
In each case,we will need to modify the Employee class. Now you understand that it is better to follow the SRP and separate these activities.

* */