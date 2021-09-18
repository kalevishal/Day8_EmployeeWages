public class UsingSwitchCase {

        public static final int PART_TIME = 1;
        public static final int Full_TIME = 2;
        public static final  int PER_HR = 20;

    public static void main(String[] args) {
         //Variables
        int emphr = 0;
        int empwage = 0;
         //Computation
        int empcheck =(int) Math.floor(Math.random()*10)%3;
        switch (empcheck) {
            case PART_TIME:
                emphr = 4;
                break;
            case Full_TIME:
                emphr = 8;
                break;
            default:
                emphr = 0;
               
        }
        empwage = emphr * PER_HR;
        System.out.println("employee wage: " +empwage);

    }

}
