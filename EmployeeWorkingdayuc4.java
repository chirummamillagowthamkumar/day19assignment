public class EmployeeWorkingdayuc4 {

                public static final int  isFullTime=1;
            public static final int isPartTime=0;
                public static final int  employeeWagePerhr=20;

                public static void main(String[] args) {
                  int employeeTotalWage=0;
                  int workingDays=5;
              int empHrs=20;
              int empWage=0;


             for(int i=1;i<=workingDays;i++)
            {
                 double empCheck=Math.floor(Math.random()*10)%3;
             switch((int)empCheck)
                        {
                           case isFullTime :

                              empHrs=8;
                        break;
                           case isPartTime :

                              empHrs=4;
                          break;
                           default :

                              empHrs=0;
                        }
             empWage=empHrs*employeeWagePerhr;
                employeeTotalWage+=empWage;
                    System.out.println(empWage);

             }
          System.out.println(employeeTotalWage);


        }

}

