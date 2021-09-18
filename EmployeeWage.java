public class HourDayPerMonth {
    public static final int PART_time = 1;
    public static final int FULL_TIME = 2;
    public static final int PER_HR = 20;
    public static final int NO_OF_WORKING_DAY = 2;
    public static final int MAX_N0_OF_MONTH = 10;

    public static void main(String[] args) {
        //Variable
        int emphr = 0;
        int totalemphr = 0;
        int totalworkingday = 0;
         //computation
        while (totalemphr <= MAX_N0_OF_MONTH && totalworkingday < NO_OF_WORKING_DAY ){
            totalworkingday++;
            int empCheck = (int)  Math.floor(Math.random()*10)%3;
            switch (empCheck){
                case PART_time:
                    emphr = 4;
                    break;
                case FULL_TIME:
                    emphr = 8;
                    break;
                default:
                    emphr = 0;
                    break;
            }
            totalworkingday +=emphr;
            System.out.println("day: " +totalworkingday + "hr: " +emphr);

        }
         int totalempwork = totalworkingday * PER_HR;
        System.out.println("employee wage: " +totalempwork);
   }
}