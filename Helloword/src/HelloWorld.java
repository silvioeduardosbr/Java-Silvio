<<<<<<< HEAD
import java.util.Scanner;
=======
import javax.print.attribute.standard.MediaSize.JIS;
import javax.swing.InputMap;
>>>>>>> c77a4fff18bf9b39448e3290b5ed065cba079b1f

public class HelloWorld { 
    public static void main(String[] args) {
        
<<<<<<< HEAD
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        float nota = input.nextFloat();

        System.out.format("A nota do %s é %.2f", nome, nota); // print linha
       // System.out.printf("A sua nota é %.2f", nota); // print formatado
        // System.out.format("A sua nota é %.2f", nota); // mesma coisa

        
=======
        int a = 100;
>>>>>>> c77a4fff18bf9b39448e3290b5ed065cba079b1f

        int[] arr = new int[5]; // array simples

        int[][] arr2 = new int [3][3]; // matriz 3x3
        


        arr[2] = 10;

        System.out.println(arr[2]);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("A");
        }

        for(int i: arr){ // For sem acesso aos indices
            System.out.println("ASAS");
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("aaA ");
            }
            System.out.println("\n");
        }
    }
}
