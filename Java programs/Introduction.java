/*class Helloworld {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
    }
}*/

import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num1: ");
    int a = sc.nextInt();
    System.out.println("Enter num2: ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("The sum of two integers is: ");
    System.out.println(sum);
    sc.close()
    }
}