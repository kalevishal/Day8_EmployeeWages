public class Attendance {
    
    public static void main(String[] args) {
         //Constants
        
        double empCheck = Math.floor(Math.random()* 10)%2;
         //Computation
        if(empCheck == 1 )
        System.out.println("Employee is present");
        else
            System.out.println("Employee is not present");
    }
 }
