package org.example;

public class ThirdTask {
    public static void main(String[] args) {
        int monthPaid = monthPayment(300, 10);
        printTotal(monthPaid);
    }
    public static int monthPayment(int sum, int period) {
        int monthPaid = sum/period;
        System.out.println(monthPaid);
        return monthPaid;
    }

    public static void printTotal(int total) {
        System.out.println(total + total * 0.07);
    }
}
