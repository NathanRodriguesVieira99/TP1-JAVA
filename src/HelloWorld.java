import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        String nome = "Nathan";
        int idade = 19;
        double d = 5.9;

        System.out.println("Olá " + nome +  " seja bem vindo ao TP1 de Java " + "você tem " + idade + " anos e " + d + " é seu ID" );

        // instancia a Class Scanner
        Scanner entrada = new Scanner (System.in);

        // Log para indicar que será possivel digitar
        System.out.println("DIGITE:");

        // variavel para armazenar o valor digitado
        String texto = entrada.nextLine();

        // exibe o valor digitado
        System.out.println("Você digitou: " + texto );

        }
    }
