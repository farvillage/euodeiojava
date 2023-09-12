import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Teacher t = new Teacher();
        Student s = new Student();

        System.out.println("Input 1 for Student: \n");
        System.out.println("Input 2 for Teacher: ");

        int awnser = sc.nextInt();

        switch(awnser){
            case 1:
            System.out.println("Input your name: ");
            s.setName(sc.next());
            
            System.out.println("Input your age: ");
            s.setAge(sc.nextInt());

            System.out.println("Input grade 01: ");
            s.setGrade01(sc.nextInt());

            System.out,println("Input grade 02: ");
            s.setGrade02(sc.nextInt());
            s.calcMedia();

            System.out.println("The average grade is: " + s.getAverageGrade());
            break;

            case 2:
            System.out.println("Teacher's name: ");
            t.setName(sc.next());

            System.out.println("Teacher's age: ");
            t.setAge(sc.nextInt());

            System.out.println("Teacher's graduation: ");
            t.setGraduation(sc.next());

            System.out.println("Teacher's salary: ");
            t.getSalary(sc.nextDouble());
            break;
        default;
            System.out.println("null");
        }
    }
}
