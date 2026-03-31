// A number prime or Not

import java.util.Scanner;

public class primeOrNot {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        boolean prime = false;

        for(int i = 2 ; i< number ; i++){
            if(number%i==0 && number >0){
                prime = true;
                break;
            }
        }

        if(prime){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
        scanner.close();
    }
}
