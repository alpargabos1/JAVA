package labor2;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString(){
        return String.format("%d / %d / %d",year,month,day);
    }

    public boolean isValidDate() {
        if(!DateUtil.isValidDate(year,month,day)){
            return false;
        }
        return true;
    }
}
