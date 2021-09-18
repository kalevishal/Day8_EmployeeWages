public class ClassMethod {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int RATE_PER_HR = 20;
    public static final int NO_OF_WORKING_DAY = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static int comEmpWage() {
        //Variables
        int empHrs = 0, totalEmpHrs = 0, totalWolkigDays = 0;
        //Computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWolkigDays < NO_OF_WORKING_DAY) {
            totalWolkigDays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case RATE_PER_HR:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println(" Day: " + totalWolkigDays + " emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * RATE_PER_HR;
        System.out.println("total emp wage: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        comEmpWage();
    }
}
