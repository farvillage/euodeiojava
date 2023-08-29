import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.print("Input your first number: ");
        x = sc.nextInt();

        System.out.print("Input your second number: ");
        y = sc.nextInt();

        System.out.print (c.add(x,y));
    }
}