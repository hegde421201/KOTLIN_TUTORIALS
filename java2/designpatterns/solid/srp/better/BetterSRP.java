package java2.designpatterns.solid.srp.better;



public class BetterSRP {

    public static void main(String[] args) {
        System.out.println("Demo showing proper SRP rules");

        Employee ravi = new Employee("Ravi","Meher",12);
        displayEmp(ravi);

       Employee kancha = new Employee("Kancha","Manchi",2);
        displayEmp(kancha);

    }

    private static void displayEmp(Employee emp1){

        emp1.displayEmployee();

        //generate ID
        EmpIoyeeIdGenerator empIoyeeIdGenerator = new EmpIoyeeIdGenerator();

        //check seniority
        SeniorityChecker seniorityChecker = new SeniorityChecker();


        System.out.println("The employee ID is "+empIoyeeIdGenerator.generateEmpId(emp1.getFirstName()));
        System.out.println("This employee is a "+seniorityChecker.checkSeniority(emp1.getExpInYears()));
    }
}
