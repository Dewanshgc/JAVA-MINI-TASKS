import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows for matrix 1 : ");
		int rows1=sc.nextInt();
		System.out.print("Enter the columns for matrix 2 : ");
		int cols1=sc.nextInt();
		int a[][]=new int[rows1][cols1];
		
		for(int i=0;i<rows1;i++){
			for(int j=0;j<cols1;j++){
				System.out.print("enter the value index "+i+" and "+j+" : ");
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.print("Enter the rows for matrix 2 : ");
		int rows2=sc.nextInt();
		System.out.print("Enter the columns for matrix 2 : ");
		int cols2=sc.nextInt();
		int b[][]=new int[rows2][cols2];
		
		for(int i=0;i<rows2;i++){
			for(int j=0;j<cols2;j++){
				System.out.print("enter the value index "+i+" and "+j+" : ");
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+"  ");
			}
			System.out.println( );
		}
	}
}