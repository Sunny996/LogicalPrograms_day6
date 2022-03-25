package main;

public class LogicalPrograms {
    public void fibonacci(int n){
        int first=0;
        int second=1;
        int temp=0;
        System.out.println(first);
        System.out.println(second);
        for(int i=2;i<n;i++){
            temp=first+second;
            first=second;
            second=temp;
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
}
