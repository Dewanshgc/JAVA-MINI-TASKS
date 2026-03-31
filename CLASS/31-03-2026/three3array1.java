import java.util.Scanner;

class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the table number : ");
		int b=sc.nextInt();
		System.out.print("Enter the rows : ");
		int c=sc.nextInt();
		System.out.print("Enter the columns : ");
		int d=sc.nextInt();
		int a[][][]=new int[b][c][d];
		for(int i=0;i<b;i++){
			// System.out.print("table number"+i+" : ");
			for(int j=0;j<c;j++){
				// System.out.print("Rows number"+j+" : ");
				for(int k=0;k<d;k++){
					System.out.print("Enter index values "+i+" and "+j+" and "+k+" : ");
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		
		
		for(int i=0;i<b;i++){
			System.out.println("table number "+i+" : ");
			for(int j=0;j<c;j++){
				// System.out.print("Rows number"+j+" : ");
				for(int k=0;k<d;k++){
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}