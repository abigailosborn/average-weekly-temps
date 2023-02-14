
/**
 * Finds the average weekly temperatures when daily temps are inputted
 * into the code. Assigns each average weekly temp a color and gives 
 * the date.
 * 
 *
 * @author Abigail Osborn
 * @version January 29, 2023
 */
import java.util.ArrayList;
public class GlensideAverageTemps
{
   //define main method
   public static void main(String[] args)
   {
       ArrayList<AverageTempsTester> dailyTemps = new ArrayList<AverageTempsTester>();
       //create AverageTempsTester objects
       //add temperatures starting on sunday
       dailyTemps.add(new AverageTempsTester("Week 1", 10, 14, 12, 20, 22, 13, 14));
       dailyTemps.add(new AverageTempsTester("Week 2", 33, 35, 38, 40, 40, 30, 29));
       dailyTemps.add(new AverageTempsTester("Week 3", 50, 49, 56, 59, 61, 50, 48));
       dailyTemps.add(new AverageTempsTester("Week 4", 0, 0, 0, 0, 0, 0, 0));
       dailyTemps.add(new AverageTempsTester("Week 5", 0, 0, 0, 0, 0, 0, 0));
       //add more weeks here
       
       //print template
       System.out.println("Weekly Glenside Temps");
       System.out.println();
       System.out.println("Week               Sun         Mon         Tues         Wed         Thurs         Fri         Sat");
       System.out.println("-------------------------------------------------------------------------------------------------");
       printTemps(dailyTemps);
       System.out.println("-------------------------------------------------------------------------------------------------");
       findAverage(dailyTemps);
       System.out.println("-------------------------------------------------------------------------------------------------");
       System.out.println();
       System.out.println();
   }
   
   //print temperatures using a for each loop
    public static void printTemps(ArrayList<AverageTempsTester> dailyTemps)
   {
       for(AverageTempsTester t : dailyTemps)
       {
           System.out.println(t);
       }
   }
   
   //find average of weekly temperatures
   public static void findAverage(ArrayList<AverageTempsTester> dailyTemps)
    {
        //starting month
        int month = 3;
        //starting day
        int day = 12;
        //empty int, will hold the remaining days for each month
        int remainingDays;
        //name of month
        String mo = "";
        //sum of temps
        double sum = 0.0;
        //average of temps
        double average = 0.0;
        //color associated with temp average
        String color;
        for(int i = 0; i < dailyTemps.size(); i++)
        {
            //find average of weekly temperatures
            sum = dailyTemps.get(i).getSun() + dailyTemps.get(i).getMon() + dailyTemps.get(i).getTues() + dailyTemps.get(i).getWed() + dailyTemps.get(i).getThurs() + dailyTemps.get(i).getFri() + dailyTemps.get(i).getSat();
            average = sum / 7;
        
            //add a week
            day += 7;
            //find the date (doesn't work for leap years)
            if(month == 1){
                if(day > 31){
                    month++;
                    remainingDays = day - 31;
                    day = remainingDays;
                }
            }
            else if(month == 2){
                if(day > 28){
                    month++;
                    remainingDays = day - 28;
                    day = remainingDays;
                }
            }
            else if(month == 3){
                if(day > 31){
                    month++;
                    remainingDays = day - 31;
                    day = remainingDays;
                }
            }
            else if(month == 4){
                if(day > 30){
                    month++;
                    remainingDays = day - 30;
                    day = remainingDays;
                }
            }
            else if(month == 5){
                if(day > 31){
                    month++;
                    remainingDays = day - 31;
                    day = remainingDays;
                }
            }
            else if(month == 6){
                if(day > 30){
                    month++;
                    remainingDays = day - 30;
                    day = remainingDays;
                }
            }
            else if(month == 7){
                if(day > 31){
                    month++;
                    remainingDays = day - 31;
                    day = remainingDays;
                }
            }
            else if(month == 8){
                if(day > 31){
                    month++;
                    remainingDays = day - 31;
                    day = remainingDays;
                }
            }
            else if(month == 9){
                if(day > 30){
                    month++;
                    remainingDays = day - 30;
                    day = remainingDays;
                }
            }
            else if(month == 10){
                if(day > 31){
                    month++;
                    remainingDays = day - 31;
                    day = remainingDays;
                }
            }
            else if(month == 11){
                if(day > 30){
                    month++;
                    remainingDays = day - 30;
                    day = remainingDays;
                }
            }
            else if(month == 12){
                if(day > 31){
                    month = 1;
                    remainingDays = day - 31;
                    day = remainingDays;
                }
            }
            
            //assign a String for the month
            switch(month){
                case 1:
                    mo = "January";
                    break;
                case 2:
                    mo = "February";
                    break;
                case 3:
                    mo = "March";
                    break;
                case 4:
                    mo = "April";
                    break;
                case 5:
                    mo = "May";
                    break;
                case 6:
                    mo = "June";
                    break;
                case 7:
                    mo = "July";
                    break;
                case 8:
                    mo = "August";
                    break;
                case 9:
                    mo = "September";
                    break;
                case 10:
                    mo = "October";
                    break;
                case 11:
                    mo = "November";
                    break;
                case 12:
                    mo = "December";
                    break;
            }
            //find color 
            if(average < 9){
                color = "dark purple";
            }
            else if(average < 14 && average > 10){
                color = "purple";
            }
            else if(average < 19 && average > 15){
                color = "light purple";
            }
            else if(average < 24 && average > 20){
                color = "light blue";
            }
            else if(average < 29 && average > 25){
                color = "medium blue";
            }
            else if(average < 34 && average > 30){
                color = "dark blue";
            }
            else if(average < 39 && average > 35){
                color = "dark forest green";
            }
            else if(average < 44 && average > 40){
                color = "dark green";
            }
            else if(average < 49 && average > 45){
                color = "green";
            }
            else if(average < 54 && average > 50){
                color = "yellow green";
            }
            else if(average < 59 && average > 55){
                color = "pale yellow";
            }
            else if(average < 64 && average > 60){
                color = "yellow";
            }
            else if(average < 69 && average > 65){
                color = "light orange";
            }
            else if(average < 74 && average > 70){
                color = "orange";
            }
            else if(average < 79 && average > 75){
                color = "red";
            }
            else if(average < 84 && average > 80){
                color = "maroon";
            }
            else if(average < 89 && average > 85){
                color = "pink";
            }
            else {
                color = "light pink";
            }
            //print out temperatures, week number, date, and color
            System.out.printf("%-6s %-6d %-7s %-10s %-5s %-6d %-9s %-8.2f", "Week:", (i + 1), "Month:", mo, "Day:", day, "Average:", average);
            System.out.println(" Color: " + color);
        }
    }
}
