package lab9_1;

public class DateUtil {

    public static boolean leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day){
        if(year > 2021 || year < 1) return false;
        if(month < 1 || month > 12) return false;
        if(month != 2) {
            if(month == 4 || month == 6 || month == 9 || month == 11){
                if(day < 1 || day > 30) return false;
            }
            if(day < 1 || day > 31) return false;
        }
        else {
            if(!leapYear(year) && day > 28) return false;
            if(leapYear(year) && day > 29) return false;
        }
        return true;
    }

}
