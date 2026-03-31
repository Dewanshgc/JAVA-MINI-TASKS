import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int rows=sc.nextInt();
		System.out.print("Enter the columns : ");
		int cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
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
	}
}