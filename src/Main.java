import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri a");
        a = scanner.nextDouble();

        System.out.println("nhap gia tri b");
        b = scanner.nextDouble();

        System.out.println("nhap gia tri c");
        c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.print("Phuong trinh co 1 nghiem x= " + answer);
        } else {
            if (b == c) {
                System.out.print("Phuong trinh co vo so nghiem");
            } else {
                System.out.print("Phuong trinh vo nghiem");
            }
       /* if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            } */


        }
    }
}
