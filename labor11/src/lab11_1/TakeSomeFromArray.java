package lab11_1;

public class TakeSomeFromArray extends Thread {
    private String[] array;
    private String str;
    private int number;

    public TakeSomeFromArray(String[] array, String str, int number) {
        this.array = array;
        this.str = str;
        this.number = number;
    }

    public void print(){
        System.out.print(Thread.currentThread().getName() + ": ");
        System.out.printf("String \"%s\" has been replaced with \" \" \n",str);
    }

    @Override
    public void run() {
        int counter = 1;
        while (counter <= number) {
            synchronized (this.array) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i].compareTo(str) == 0) {
                        array[i] = " ";
                        print();
                        counter++;
                        Main.counter--;
                    }
                }
            }
        }
        System.out.printf("String \"%s\" has been replaced %d times, thread finishes its work.\n",str,number);
    }
}
