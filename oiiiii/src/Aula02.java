import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args){
        int r;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Somos a BláBláBlá Petshop. Escolha 1: comprar ração; Escolha 2: solicitar valor de ração; Escolha 3: falar com atendente.");
            int Escolha = sc.nextInt();
            switch (Escolha) {
                case 1:
                    System.out.println("Temos a ração 'x'");
                        break;
                    case 2:
                        System.out.println("Temos a partir de R$100,00");
                        break;
                    case 3:
                        System.out.println("oiiii");
                        break;
                    }
                System.out.println("Digite '0' para retornar");
                r = sc.nextInt();
            }while(r==0);
        }
    }