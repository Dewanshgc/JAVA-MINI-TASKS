import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int b=sc.nextInt();
		int a[][]=new int[b][];
		
		for(int i=0;i<b;i++){
			System.out.print("Enter the value at index row "+i+" : ");
			int c=sc.nextInt();
			a[i]=new int[c];
			for(int j=0;j<c;j++){
				System.out.print("Enter the value for index row "+i+" & column "+j+" : ");
				a[i][j]=sc.nextInt();
			}
		}
		
		// for(int i=0;i<b;i++){
			// for(int j=0;j<a[i].length;j++){
				// System.out.print("Enter the value at index "+a[i][j]+" : ");
				// a[i][j]=sc.nextInt();
			// }
		// }
		for(int i=0;i<b;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println(); 
		}
	}
}