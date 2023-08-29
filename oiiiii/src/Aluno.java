import java.util.Scanner;

public class Aluno {
    public static void main(String args[]) {

        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);
        String nome;
        int g1 = 0;
        int g2 = 0;

        System.out.print("Input your Grade 1: ");
        g1 = sc.nextInt();

        System.out.print("Input your Grade 2: ");
        g2 = sc.nextInt();

        if (g1 + g2 / 2 >= 70) {
            System.out.println("You're approved!");
        } else {
            System.out.println("You're failed.");
        }
    }
}
