public class APCalendar
{
public void APCalender(){}
private static boolean isLeapYear(int year){
    boolean four=year%4==0;
    boolean hund=year%100==0;
    boolean fourhund=year%400==0;
    if ((four&&!(hund))||fourhund) return true;
    return false;
}

public static int numberOfLeapYears(int year1, int year2){
    int ret=0;
for (int i=year1;i<year2;i++) if (isLeapYear(i)) ret++;
return ret;
}

@SuppressWarnings("unused")
private static int firstDayOfYear(int year){
//dont have to do
return 2;
}

@SuppressWarnings("unused")
private static int dayOfYear(int month, int day, int year){
//dont have to do
return 0;
}

public static int dayOfWeek(int month, int day, int year){
    int whatNumDay=dayOfYear(month,day,year)-1;
    return (firstDayOfYear(year)+whatNumDay)%7;
}

}