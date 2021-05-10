package lab11_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //MAIN 1

//        String[] sa_array = new String[10];
//        Arrays.fill(sa_array, " ");
//        Thread producer = new AddToArray(sa_array);
//        Thread replace = new TakeSomeFromArray(sa_array, "ppp", 3);
//        producer.start();
//        replace.start();

        //MAIN 2

        String[] sa_array = new String[10];
        for (int i = 0; i < sa_array.length; i++)
            sa_array[i] = "";
        Thread t3 = new AddToArray(sa_array);
        Thread t4 = new AddToArray(sa_array);
        Thread t5 = new AddToArray(sa_array);
        Thread t6 = new AddToArray(sa_array);
        Thread t7 = new TakeSomeFromArray(sa_array, "bbb", 10);
        Thread t8 = new TakeSomeFromArray(sa_array, "sss", 10);
        Thread t9 = new TakeSomeFromArray(sa_array, "ddd", 10);
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

    }

    static int counter = 300;
}
