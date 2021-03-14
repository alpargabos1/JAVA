package lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        elements = new double[length];
    }

    public MyArray(double[] elements) {
        this.elements = elements;
        this.length = elements.length;
    }

    public MyArray(MyArray myArray) {
        this.elements = myArray.elements;
        this.length = myArray.length;
    }

    public MyArray(String fileName) {
        readFromFile(fileName);
    }

    private void readFromFile(String fileName){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(scanner.hasNextLine()) {
            length = Integer.parseInt(scanner.nextLine().trim());
        }
        String line = null;
        if(scanner.hasNextLine()) {
            line = scanner.nextLine();
        }
        String[] items = line.split(" ");
        if(this.elements == null) this.elements = new double[length];
        for(int i=0; i<length; i++) {
            elements[i] = Integer.parseInt(items[i].trim());
        }
    }

    public void fillRandom(double a, double b){
        Random r = new Random();
        for(int i=0; i<this.length; i++){
            elements[i] = a + (r.nextDouble() * (b - 1 - a));
        }
    }

    public double mean(){
        double counter = 0;
        for(double item : elements){
            counter += item;
        }
        return counter / length;
    }

    public double stddev()
    {
        double sum = 0.0, standardDeviation = 0.0;

        for(double num : elements) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: elements) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    public void sort(){
        Arrays.sort(elements);
    }

    public void print(String name){
        System.out.print(name + ": ");
        for(double item : elements){
            System.out.printf("%f ",item);
        }
        System.out.println("");
    }
}
