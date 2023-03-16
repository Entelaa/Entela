package joojo;
import java.util.Scanner;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		/*int [] List= new int[5];
		List[0]=5;
		List[1]=2;
		List[2]=8;
        List[3]=6;
        List[4]=9;
        System.out.println(List);
        int len=List.length;
        for(int i=0;i<len;i++){
        System.out.println(List[i]+" ");}*/
		
		
		
		
		
	/*	double [] a = {3.2,3.5,3.6};
		System.out.println(a);
		int len=a.length;
		for(int i=0;i<len;i++) {
			System.out.println(a[i]+" ");}*/
	
			
			
			/*
			int [] a= new int[3];
			Scanner b = new Scanner(System.in);
			System.out.println("Enter"+a.length);
			for(int i=0; i<a.length;i++)
				a[i]=b.nextInt();*/
		
		/**Initializing arrays with random values
		/*double[] a= new double[2];
		a[0]=5.6;
		a[1]=2.3;
		
		for(int i=0;i<a.length;i++) {
			a[i]=Math.random()*100;*/
		
		
		/*int [] lila= new int[5];
		Scanner b= new Scanner(System.in);
		System.out.println(lila.length);
		for(int i=0;i<lila.length;i++)
			lila[i]=b.nextInt();*/
		
		/**Displaying arrays
		/*double[]t= new double[1];
		t[0]=2.6;
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]+" ");
		}*/
		
		
		/**Char-tipi i te dhenave
		/*char[]city= {'A','E','a'};
		System.out.println(city);*/
		
		/**Summing all elements
		/*double [] n= {3.2,2.6,1.2};
		double t=0;
		for(int i=0;i<n.length;i++) {
			t+=n[i];
			System.out.println(t);
		}*/
		
		
		  /**Finding the largest number
		/*double [] e= {2.1,2.4,3.4};
		double max=e[0];
		for(int i=0;i<e.length;i++) {
			if(e[i]>max)
				{max=e[i];
				}	
		}
		System.out.println(max);*/
		
		/**Finding the smallest index of the largest element
		double [] a= {5.1,8.2,1.3};
		double max=a[0];
		int indexOfMax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
				indexOfMax=i;
			}
				
		}
		System.out.println(indexOfMax);*/
		
		
		/**minimumi i numrave
		double []d= {1.2,8.6,5.4};
		double min= d[0];
		for(int i=0;i<d.length;i++) {
			if(d[i]<min) {
				min=d[i];
			}
		}
		System.out.println(min);*/
		
		/** random shuffing
		double [] p= {5.6,1.4,3.2};
		for(int i = 0; i < p.length - 1; i++) {
			
			int j=(int)(Math.random()
					* p.length);
			
			double temp = p[i];
			p[i] = p[j];
			p[j] = temp;
			
			System.out.println(temp);
		}*/
		
		/*Shiffing elements
		double [] a= {6.5,2.6,2.1,3.4};
		double temp = a[0];
		for(int i=1; i<a.length;i++) {
			/*a[i-1]=a[i];
			System.out.println(a[i]);
			a[a.length-1]=temp;
			System.out.println(temp);
		}*/
		
		
		
		
		/*Mujt
		Scanner a = new Scanner(System.in);
		
		String [] b = {"Janar","Shkurt","Mars","Prill","Maj","Qeshor","Korrik","Gusht","Shtator","Tetor","Nentor","Dhjetor"};
		  for(int i=0;i<b.length;i++) {
		int mujt=a.nextInt();
		  
		System.out.println(b[mujt-1]);}*/
		
		  
		
		/*Kthimi nga int ndouble
		int [] b = {4,5,7};
		for(double e : b){
			System.out.println(e);
		}*/
		
		
		/*average dhe cont
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int n= s.nextInt();
		double [] numbers= new double[n];
		double sum=0;
		
		System.out.println("Enter the number: ");
		for(int i=0; i<n ;i++) {
			numbers[i]=s.nextDouble();
					sum+=numbers[i];
		}
		
		double average = sum/n;
		
		int count=0;
		for(int i=0;i<n;i++)
			if(numbers[i]<average)
				count++;
		
		System.out.println("Average is"+average);
		System.out.println("The count is"+count);*/
		
		
		/*Kopjimi i vargut me for
		int[] vargu1 = {1, 2, 3, 4, 5};
		int[] vargu2 = new int[vargu1.length];

		for (int i = 0; i < vargu1.length; i++) {
		    vargu2[i] = vargu1[i];
		}*/
		
		
		/*Kopjimi me arraycopy
		int[] vargu1 = {1, 2, 3, 4, 5};
		int[] vargu2 = new int[5];

		System.arraycopy(vargu1, 0, vargu2, 0, 5);
				
	System.out.println(vargu2[]);*/
		
		/**kalimi i vargjeve nemetoda
			 int x = 1; // x represents an int value
			 int[] y = new int[10]; // y represents an array of int values
			 m(x, y); // Invoke m with arguments x and y
			 System.out.println("x is " + x);
			 System.out.println("y[0] is " + y[0]);
			 }
			 public static void m(int number, int[] numbers) {
			 number = 1001; // Assign a new value to number
			 numbers[0] = 5555; // Assign a new value to numbers[0]*/
		
		/* paasing array to method
		int [] number = {1,3,6,8,9};
		printArray(number);
			
	}
				 
	 public static void printArray(int [] arr) {
		 
		 for(int i=0; i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }*/
		
		//ky kod paraqet si nje metode mund te marr nje varg si argument
		/*int x=1;
		int [] y = new int[10];
		
		m(x,y);  //metoda 'm' me x dhe y si argumente
		
		System.out.println(x);
		System.out.println(y[0]);
		

		  }//me metoden main printohen vlera e x dhe e y[]
	public static void m(int number, int []numbers) {
		number=100;
		numbers[0]=5055;*/
		
		
		int[] list = {1, 2, 3, 5, 4};
		for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
		    // Swap list[i] with list[j]
		    int temp = list[i];
		    list[i] = list[j];
		    list[j] = temp;
		}
		
		
	}
	
		}
	
		
		
	


