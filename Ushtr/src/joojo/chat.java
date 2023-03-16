package joojo;
import java.util.Random;
public class chat {

	public static void main(String[] args) {
		int[][] vargu = new int[3][3];
        Random rand = new Random();

        // Mbushja e vargut me numra të rastësishëm
        for (int i = 0; i < vargu.length; i++) {
            for (int j = 0; j < vargu[i].length; j++) {
                vargu[i][j] = rand.nextInt(10) + 1;
            }
        }

        // Paraqitja e vargut në konsolë
        System.out.println("Vargu:");
        for (int i = 0; i < vargu.length; i++) {
            for (int j = 0; j < vargu[i].length; j++) {
                System.out.print(vargu[i][j] + " ");
            }
            System.out.println();
        }

        // Mbledhja e elementeve të vargut
        int total = 0;
        for (int i = 0; i < vargu.length; i++) {
            for (int j = 0; j < vargu[i].length; j++) {
                total += vargu[i][j];
            }
        }

        // Paraqitja e shumës së elementeve të vargut
        System.out.println("Shuma e elementeve të vargut: " + total);
    }
} 
	