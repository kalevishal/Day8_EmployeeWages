public class DailyEmployeeWage {

    public static void main(String[] args) {
        //Constants
        int FULL_TIME = 1;
        int PER_HR = 20;
        //Variables
        int empHr = 0;
        int empWage = 0;
        //Computation
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck == FULL_TIME)
            empHr = 8;
        else
            empHr = 0;
        empWage = empHr * PER_HR ;
        System.out.println("employee Wage: " + empWage);

    }
}