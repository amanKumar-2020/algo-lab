// A number prime or Not

import java.util.Scanner;

// public class primeOrNot {
//     public static void main(String []args){
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int number = scanner.nextInt();
//         boolean prime = true;

//         for(int i = 2 ; i< number ; i++){
//             if(number%i==0 && number >0){
//                 prime = false;
//                 break;
//             }
//         }

//         if(prime){
//             System.out.println("number is prime");
//         }else{
//             System.out.println("number is not prime");
//         }
//         scanner.close();
//     }
// }
public class primeOrNot {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
       
        if (number <=1) {
            System.out.println("Number is neither prime nor composite");
        }else{
            boolean prime = true;
            int c = 2;
            while (c*c <= number) {
                if(number % c ==0){
                    prime = false;
                    break;
                }
                c+= 1;
            }
            if (prime) {
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        }
        
        scanner.close();
    }
}
