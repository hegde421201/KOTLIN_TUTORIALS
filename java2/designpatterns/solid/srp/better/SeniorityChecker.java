package java2.designpatterns.solid.srp.better;

public class SeniorityChecker {

    public String checkSeniority(double expInYears){
        return expInYears > 7 ? "senior" : "junior";
    }
}
