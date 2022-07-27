package java2.designpatterns.solid.srp.better;

import java.util.Locale;
import java.util.Random;

class EmpIoyeeIdGenerator {

     String empId;

     public String generateEmpId(String firstName){
      int random = new Random().nextInt(3000);
      return firstName.toUpperCase(Locale.ROOT).substring(0,2)+random*2;
     }


}
