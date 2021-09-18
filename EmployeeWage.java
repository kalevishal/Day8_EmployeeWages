public class WageForMonth {

    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    public static final int PER_HR = 20;
    public static final int NO_OF_WORKING_DAY = 2;

    public static void main(String[] args) {
        //Variables
        int emphr = 0;
        int empwage = 0;
        int totalwage = 0;
          //Computation
          for (int day = 0; day < NO_OF_WORKING_DAY; day++) {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case PART_TIME:
                        emphr = 4;
                        break;
                    case FULL_TIME:
                        emphr = 8;
                        break;
                    default:
                        emphr = 0;

                }
                empwage = emphr * PER_HR;
                totalwage += empwage;
                System.out.println("Emp Wage: " + empwage);
            }
        System.out.println("Total Emp Wgae: " + totalwage);


        }




    }
