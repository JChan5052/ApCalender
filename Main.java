public class Main{
    public static void main(String[] args) {
        System.out.println(APCalendar.numberOfLeapYears(2000,2016)+": 2000 to 2016-expected 5");
        System.out.println(APCalendar.numberOfLeapYears(2001,2016)+": 2001 to 2016-expected 4");
        System.out.println(APCalendar.numberOfLeapYears(2000,2017)+": 2000 to 2017-expected 5");
        System.out.println(APCalendar.numberOfLeapYears(2001,2017)+": 2001 to 2016-expected 4");
        System.out.println(APCalendar.numberOfLeapYears(2000,2100)+": 2000 to 2100-expected 25");
    }
}