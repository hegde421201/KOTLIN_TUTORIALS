package solid

import kotlin.math.expm1

class Employee(firstName:String,lastName:String,experience:Double) {

   private lateinit  var firstName: String
   private lateinit  var lastName: String
   private lateinit var empId:String
   private var experienceInYears = 0.0

    fun displayEmployeeDetail(){
        println("Employee name $firstName $lastName has $experienceInYears of experience")
    }
}

/*

 https://assessment.hackerearth.com/challenges/test/algorithms-test-1515/add-information/

  */