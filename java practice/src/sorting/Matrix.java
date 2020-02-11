package sorting;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter number of Rows: " + '\t');
		int rows= sc.nextInt();
		System.out.print("\nEnter number of Columns: " + '\t');
		int columns = sc.nextInt();

		int m1[][] = new int[rows][columns]; 
		int m2[][] = new int[rows][columns];
		
		int s[][] = new int[rows][columns];
		int p[][] = new int[rows][columns];
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				System.out.print("\n Enter matrix 1 value for  [" + i +"] [" + j + "]");
				m1[i][j] = sc.nextInt();				
			}			
		}

		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				System.out.print("\n Enter matrix 2 value for  [" + i +"] [" + j + "]");
				m2[i][j] = sc.nextInt();				
			}			
		}
		
		System.out.println("Matrix sum is :"  );
		for(int i=0;i<rows;i++) {
			
			for(int j =0;j<columns;j++) {
				
				s[i][j]=m1[i][j]+m2[i][j];
			
				System.out.print(s[i][j]+", ");
				
							}
			
			System.out.println( );
		}
		System.out.println(" matrix multiplication is:" );
for(int i=0;i<rows;i++) {
			
			for(int j =0;j<columns;j++) {
				
				p[i][j]=m1[i][j]*m2[i][j];
				
				System.out.print(p[i][j]+ ", ");
				
				
			}
			System.out.println( );
		}

		
	}
	
}
