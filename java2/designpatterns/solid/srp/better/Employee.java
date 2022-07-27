package java2.designpatterns.solid.srp.better;

 class Employee {

 private String firstName,lastName,empId;
 private double expInYears;

     public double getExpInYears() {
         return expInYears;
     }

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public String getEmpId() {
         return empId;
     }

     public Employee(String firstName, String lastName, double expInYears) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.expInYears = expInYears;
     }

     //The displayEmployee() shows the employee's name and their working experience in years.
     public void displayEmployee(){
         System.out.println("The employee "+lastName+","+firstName+" has work experience of "+expInYears+" years");
     }
 }

 /*
  In the following demonstration, we introduce two more classes.
  The SeniorityChecker class now contains the checkSeniority() method and the EmployeeIdGenerator class contains the generateEmpId(...) method to generate the employee id.
  As a result, in the future, if We need to change the program logic to determine the seniority level or use a new algorithm to generate an employee id,
  We can make the changes in the respective classes. Other classes are untouched, so We do not need to retest those classes.
To improve the code readability and avoid clumsiness inside the main() method, we use the static method showEmpDetail(...).
This method calls the displayEmployee() method from Employee, the generateEmpId() method from EmployeeIdGenerator,
and the checkSeniority() method from SeniorityChecker. We understand that this method was not necessary, but it makes the client code simple and easily understandable.
 * */

