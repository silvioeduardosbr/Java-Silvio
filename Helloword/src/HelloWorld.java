import java.util.Scanner;

public class HelloWorld { 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        float nota = input.nextFloat();

        System.out.format("A nota do %s é %.2f", nome, nota); // print linha
       // System.out.printf("A sua nota é %.2f", nota); // print formatado
        // System.out.format("A sua nota é %.2f", nota); // mesma coisa

        

    }
}
