package java2.designpatterns.solid.srp;

public class SRP {

    public static void main(String[] args) {

        System.out.println("Demo without SRP");
        Employee ravi = new Employee("Ravi","Meher",12);
        displayEmp(ravi);

        Employee kancha = new Employee("Kancha","Manchi",2);
        displayEmp(kancha);
    }

    private static void displayEmp(Employee emp1){

        emp1.displayEmployee();
        System.out.println("The employee ID is "+emp1.generateEmpId(emp1.getFirstName()));
        System.out.println("This employee is a "+emp1.checkSeniority(emp1.getExpInYears()));
    }
}


/*


 A class acts like a container that can hold many things such as data, properties, or methods.
 If you put in too much data or methods that are not related to each other, you end up with a bulky and problematic class.
 Suppose you create a class with multiple methods to handle various responsibilities.
 In such a case, even if you make a small change in one method,
 you need to retest the whole class again to ensure the workflow is correct.
 Thus, changes in one method can impact the other related method(s) in the class.
 This is why the single responsibility principle opposes this idea of putting multiple responsibilities in a class.
 It says that a class should have only one reason to change.

Before you make a class, identify the responsibility or purpose of the class.
If multiple members help you achieve a single purpose, it is fine to place all the members inside the class.

To see the analysis,check out the Employee.jav file in this package.
* */