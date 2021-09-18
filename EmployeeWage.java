public class AddPartTime {

    public static void main(String[] args) {
        //Constants
        int FULL_TIME = 1;
        int PART_TIME = 2;
        int PER_HR = 20;
         ///Variables
        int emphr = 0;
        int empday = 0;
         //Computation
        double empcheck = Math.floor(Math.random()*10)%3;
        if (empcheck == PART_TIME)
            emphr = 4;
        else if (empcheck == FULL_TIME)
            emphr = 8;
        else
            emphr = 0;
        empday = emphr * PER_HR ;
        System.out.println("employee wage : " +empday);
    }
}