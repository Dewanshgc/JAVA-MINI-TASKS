import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int b=sc.nextInt();
		int a[]=new int[b];
		for(int i=0;i<b;i++){
			System.out.print("Enter the index value at "+i+" : ");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<b;i++){
			System.out.print(a[i]+" ");
		}
	}
}