package main;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LogicalPrograms {
    public void fibonacci(int n) {
        int first = 0;
        int second = 1;
        int temp = 0;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < n; i++) {
            temp = first + second;
            first = second;
            second = temp;
            System.out.println(temp);
        }
    }

    public void perfectNumber(int n) {
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (n == sum)
            System.out.println(n + " is a perfect number");
    }
    
    public void primeNumber(int n){
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0)
                flag=true;
        }
        if(!flag)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");

    }
    
    public void reverseNumber(int n) {
        int temp = 0, rev = 0;
        while (n > 0) {
            temp = n % 10;
            n /= 10;
            rev = rev * 10 + temp;
        }
        System.out.println("The reverse of is " + rev);
    }

    public int[] couponNumber(int n) {
        int[] arr = new int[n];
        int a = 0, count = 0;
        while (arr[n - 1] == 0) {
            int randomNumber = 100 + (int) (Math.random() * 900);
            boolean flag = false;
            for (int i = 0; i <= a; i++) {
                if (randomNumber == arr[i])
                    flag = true;
            }
            if (!flag) {
                arr[a] = randomNumber;
                a++;
                count++;
            } else if (flag)
                count++;
        }
        System.out.println("Total random Number needed " + count);
        return arr;
    }

    public void stopWatch() {
        System.out.println("Type A to start the program");
        Scanner sc = new Scanner(System.in);
        Instant start, end;
        char ch = sc.next().charAt(0);
        int time;
        if (ch == 'A' || ch == 'a') {
            start = Instant.now();
            System.out.println("Type B to stop the program");
            char c = sc.next().charAt(0);
            if (c == 'B' || c == 'b') {
                end = Instant.now();
                long timeElapsed = Duration.between(start, end).toMillis();
                System.out.println("Time Elapsed "+timeElapsed+ " ms");
            }
        }

    }
}
