import java.util.Scanner;

public class HelloWorld { 
    /**
     * @param args
     */
    public static void main(String[] args) {
        

        try (Scanner input = new Scanner(System.in)) {
            String nome = input.nextLine();
            float nota = input.nextFloat();

            System.out.format("A nota do %s é %.2f", nome, nota); // print linha
      // System.out.printf("A sua nota é %.2f", nota); // print formatado
            // System.out.format("A sua nota é %.2f", nota); // mesma coisa
        }

        int a = 100;
        
        int[] arr = new int[5]; // array simples

        int[][] arr2 = new int [3][3]; // matriz 3x3
        
        int[][][] arr3 = new int [3][3][3];

        arr2[2][2] = 9;


        arr[0] = 10;
        arr[1] = 6;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 7;
        


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


        for (int[] i: arr2 ){
            for (int j: i){
                System.out.print(j);
            }
            System.out.println("\n");
        }

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2]; //posição 0 recebe um array de 2 posições
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[5];
        
        for(int[] i : arrayInt){
            System.out.println(i);
        }
    }
}
