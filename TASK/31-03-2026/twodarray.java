import java.util.Scanner;

class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows of the array : ");
		int a=sc.nextInt();
		System.out.print("Enter the columns of the array : ");
		int c=sc.nextInt();
		int b[][]=new int[a][c];
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print("Enter the index value at "+i+" & "+j+" : ");
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}