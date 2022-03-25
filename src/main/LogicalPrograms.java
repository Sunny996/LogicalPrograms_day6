package main;

public class LogicalPrograms {
    public void perfectNumber(int n) {
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (n == sum)
            System.out.println(n + " is a perfect number");
    }
}
