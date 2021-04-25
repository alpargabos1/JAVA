package lab9_1;

public class MyDate implements Comparable<MyDate>{
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

    @Override
    public int compareTo(MyDate o) {
        if(o == null) throw new NullPointerException();
        if(o.year == this.year && o.month == this.month && o.day == this.day){
            return 0;
        }
        if(this.year != o.year){
            if(this.year > o.year){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            if(this.month != o.month){
                if(this.month > o.month){
                    return 1;
                }
                else return -1;
            }
            else{
                if(this.day > o.day) return 1;
                else return -1;
            }
        }

    }
}
