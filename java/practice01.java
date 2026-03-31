// Take input of a salary. If the salary if greater than 10,000
// add bonus as 2000, otherwise add bonus as 1000.

import java.util.Scanner;


public class practice01 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your salary");
        int salary = scanner.nextInt();
        int bonus = 0;
        if(salary<0){
            System.out.println("Invalid salary");
        }else if(salary>0 && salary<2000){
            bonus += 1000;
        }else{
            bonus += 2000;
        }

        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary = " + (salary + bonus));

        scanner.close();
    }
     
}