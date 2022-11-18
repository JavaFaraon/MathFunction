package org.example;

public class Function {

    private double x;
    private double y;
    private  double start = 0.0;
    private double finish = 2.0;
    private double step = 0.002;

    public static void main(String[] args) {
        Function function = new Function();
        double[][] fff = function.tabFunction();
        function.printMax(function.numberOfMaxElement(fff), fff);
        function.printMin(function.numberOfMinElement(fff), fff);
        function.sumOfArray(fff);
        function.meanOfArray(fff);
        function.numberOfMinElement(fff);
    }

    public double calcExpression(double x) {
        final double a = 2.7;
        final double b = -0.3;
        final int c = 4;
        if (x < 1.4) {
            y = a*x*x + b*x + c;
        } else if (x == 1.4) {
            y = a/x + Math.sqrt((x*x+1));
        }
        else y = (a + b*x)/Math.sqrt((x*x+1));
        return y;
    }
    public int numberOfTabSteps (double start, double finish, double step) {
        int stepNumber;
        stepNumber = (int) ((finish-start)/step+1);
        return stepNumber;
    }
    public double[][] tabFunction() {
        double [][] array = new double[numberOfTabSteps(start,finish,step)][2];
        x = start;
        for (int i =0; i< numberOfTabSteps(start, finish, step); i++){
            y = calcExpression(x);
            array [i][0] = x;
            array [i][1] = y;
            System.out.print("Step " + i + " - " + x + " : ");
            System.out.println(y);
            double r = Math.round((x + step)*1000);
            x = r/1000;
        }
        System.out.println("Array length " + array.length + " lines");
        System.out.print("Step 0 - " + array[0][0] + " : ");
        System.out.println(array[0][1]);
        System.out.print("Step 700 - " + array[700][0] + " : ");
        System.out.println(array[700][1]);
        System.out.print("Step 1000 - " + array[1000][0] + " : ");
        System.out.println(array[1000][1]);
        return array;
    }
    public int numberOfMaxElement(double [][] arr) {
//        System.out.println(arr);
//        System.out.println("max");
        int indexOfMax = 0;
        double max=arr[0][1]; // Первый элемент принимаем за максимальный.
        for(int i=1; i< arr.length; i++) {
            if (arr[i][1] > max) // Если следущий элемент больше максимального, то...
            {
                max = arr[i][1]; // назначаем его максимальным.
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
    public int numberOfMinElement(double [][] arr) {
        int indexOfMin = 0;
        double min=arr[0][1]; // Первый элемент принимаем за минимальный.
        for(int i=1; i< arr.length; i++) {
            if (arr[i][1] < min) // Если следущий элемент меньше минимального, то...
            {
                min = arr[i][1]; // назначаем его минимальным.
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
    public double sumOfArray(double [][] arr) {
        double sum = 0;
        for(int i=0; i< arr.length; i++) {
            sum+=arr[i][1];
            }
        System.out.println("Sum of all function values: " + sum);
        return sum;
    }
    public double meanOfArray(double [][] arr) {
        double sum = 0;
        for(int i=0; i< arr.length; i++) {
            sum+=arr[i][1];
        }
        double mean = sum/arr.length;
        System.out.println("Mean of all function values: " + mean);
        return mean;
    }
    public void printMax(int indOfMax, double[][] arr) {
        System.out.println("Index of maximal function value - " + indOfMax + ": " + "X = " + arr[indOfMax][0] + "   Y = " + arr[indOfMax][1]);
    }
    public void printMin(int indOfMin, double[][] arr) {
        System.out.println("Index of minimal function value - " + indOfMin + ": " + "X = " + arr[indOfMin][0] + "   Y = " + arr[indOfMin][1]);
    }
}
