package joojo;
import java.util.Arrays;
public class ligjerata2 {

	public static void main(String[] args) {
		/*int [][] a = {{5,4}, {3,4}, {2,4},} ;
		for(int row =0; row <a.length; row++) {
			for(int column=0; column < a[row].length; column++) {
				System.out.println(a[row][column]+" ");
			}
	}
		//maddhesia e vargut
		int[][] vargu = {
				{3,5,7},
				{8,9,6},
				{4,6,7},};
		
		
		System.out.println("Madhesia e vargut eshte: "+vargu.length+"x"+vargu[0].length);
		for (int i = 0; i < vargu.length; i++) {
		    for (int j = 0; j < vargu[i].length; j++) {
		        System.out.print(vargu[i][j] + " ");
		    }
		    }
		
		int [][] a = new int[3][3];
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            	
        a[i][j]=(int)(Math.random()*10+1);
            	}
            }
       System.out.println("vargu:");
       
       for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a[i].length; j++) {
               System.out.print(a[i][j] + " ");
           }
           System.out.println();
       }
		
		//mbledhja e dy matricave dhe parqitja e matrices se trete
		int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = (int) (Math.random() * 10 + 1);
                b[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] =a[i][j] + b[i][j];
            }
      
        }
        
        
        System.out.println("Vargu 1:");
        printMatrix(a);
        System.out.println("Vargu 2:");
        printMatrix(b);
        System.out.println("Shuma e dy vargjeve:");
        printMatrix(c);}
	
	
	public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
		
		
		        // Create the two matrices
		//mbledhja e elementeve te vargut t efundit
		        int[][] matrix1 = new int[3][3];
		        int[][] matrix2 = new int[3][3];

		        // Fill the matrices with random numbers from 1 to 10
		       
		        for (int row = 0; row < 3; row++) {
		            for (int col = 0; col < 3; col++) {
		                matrix1[row][col] = (int)(Math.random()*10+1);
		                matrix2[row][col] = (int)(Math.random()*10+1);
		            }
		        }

		        // Print the two matrices
		        System.out.println("Matrix 1:");
		        for (int row = 0; row < 3; row++) {
		            for (int col = 0; col < 3; col++) {
		                System.out.print(matrix1[row][col] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println("Matrix 2:");
		        for (int row = 0; row < 3; row++) {
		            for (int col = 0; col < 3; col++) {
		                System.out.print(matrix2[row][col] + " ");
		            }
		            System.out.println();
		        }
/* mbledhja e elementeve te vargut te fundit
		        // Sum only the elements of the last row of the second matrix
		        int sum = 0;
		        for (int col = 0; col < 3; col++) {
		            sum += matrix2[2][col];
		        }
		        System.out.println("Sum of the last row of Matrix 2: " + sum);
		    
		
		        
		     /* //mbledhja e dy rreshtave te pare
		        int sum=0;
		        for (int row = 0; row < 2; row++) {
		            for (int col = 0; col < 3; col++) {
		            		
		            sum+=matrix2[row][col];
		            }
		            
		            System.out.println("Sum of the two first rows of the first Matrix2: " + sum);
		            }
		            */
		
        
	}
	
	
}
