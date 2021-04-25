package lab9_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates = new ArrayList<>();
        Random r = new Random();
        for(int i=0; i<10; i++) {
            MyDate newDate = new MyDate(2021, r.nextInt(13), r.nextInt(32));
            if(newDate.isValidDate()){
                dates.add(newDate);
                System.out.println(newDate);
            }
        }
        dates.sort(MyDate::compareTo);
        System.out.println(dates);
    }
}
