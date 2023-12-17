package ua.bakhmeteva.hw14;


import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import static ua.bakhmeteva.hw4.Task2.fillArray;
import static ua.bakhmeteva.hw4.Task2.isPrime;

public class PrimeNumberCounter {

    public static void main(String[] args) {
        int[] myArray = fillArray(20, 20);
        System.out.println(Arrays.toString(myArray));
        countPrimes(myArray);
    }

    private static void countPrimes(int[] myArray){
        AtomicInteger totalPrimeCount = new AtomicInteger(0);

        Thread thread1 = new Thread(() -> {
            int count = countPrimes(myArray, 0, myArray.length / 2);
            totalPrimeCount.addAndGet(count);
            System.out.println("Thread 1: " + count + " primes");
        });

        Thread thread2 = new Thread(() -> {
            int count = countPrimes(myArray, myArray.length / 2, myArray.length);
            totalPrimeCount.addAndGet(count);
            System.out.println("Thread 2: " + count + " primes");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total prime count: " + totalPrimeCount.get());
    }

    private static int countPrimes(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        return count;
    }
}
