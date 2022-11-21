import javax.print.attribute.standard.MediaSize.JIS;
import javax.swing.InputMap;

public class HelloWorld { 
    public static void main(String[] args) {
        
        int a = 100;

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
