public class DayCalc {
    public static void main(String[] args)
    {
        int year = 2019;
        int month = 8;
        int days = 31;
        
        int leapYears = (year-1971)/4;
        int simpleYears = (year-1971)-leapYears;
        int totalDays = leapYears*366 + simpleYears*365+days;

        int daysYear = 0;
        
        for(int i=1;i<month;i++)
        {
            if(i == 2)
            {
                if(year%100 == 0 || year%4 == 0)
                daysYear += 29;
                else
                daysYear += 28;
                continue;
            }
            if(i <= 7 && i%2 != 0)
            {
                daysYear = daysYear + 31;
            }
            else if(i > 7 && i%2 == 0)
            {
                daysYear = daysYear + 31;
            }
            else 
            daysYear = daysYear + 30;
        }

        switch((daysYear+totalDays)%7+5)
        {
            case 1 : System.out.println("SUNDAY");
            break;
            case 2 : System.out.println("MONDAY");
            break;
            case 3 : System.out.println("TUESDAY");
            break;
            case 4 : System.out.println("WEDNESDAY");
            break;
            case 5 : System.out.println("THURSDAY");
            break;
            case 6 : System.out.println("FRIDAY");
            break;
            case 7 : System.out.println("SATURDAY");
            break;
        }
        
    }
}
