package Looping;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        calculateInterest(5000,125);
        System.out.println("5,000 dollars at 2% interest is $" + calculateInterest(5000.0,2.0));
        System.out.println("5,000 dollars at 3% interest is $" + calculateInterest(5000.0,3.0));
        System.out.println("5,000 dollars at 4% interest is $" + calculateInterest(5000.0,4.0));
        System.out.println("5,000 dollars at 5% interest is $" + calculateInterest(5000.0,5.0));

        System.out.println("*****************************************************");
//        for(init; termination; increment)
    for(int i=0;i<10;i++){
        System.out.println("Loop " + i +" hello");
    }
        System.out.println("*****************************************************");

// fun time
    // increment
        for(int x=0; x<=5;x++){
            System.out.println("$10000.00 at "+x+"% interest is $"+ String.format("%.2f",calculateInterest(10000.0,x)));
        }
        System.out.println("*****************************************************");
    // decrement
        for(int val1 = 8;val1>0;val1--){
            System.out.println("$10000.00 at "+val1+"% interest is $"+ String.format("%.2f",calculateInterest(10000.0,val1)));
        }
        System.out.println("*****************************************************");
// Find 3 prime numbers, starting from 10 to 50
        int count = 0;
        for(int i=10;i<50;i++){
             if(isPrime(i)){
                 count++;
                 System.out.println("the prime number is "+i);
             }
             if(count ==3){
                 System.out.println("Requirement is satisfied");
                 break;
             }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }
//Testing for Prime Number

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<(long)Math.sqrt(n);i++){
            if(n%i ==0) {
                return false;
            }
        } return  true;
    }


}
