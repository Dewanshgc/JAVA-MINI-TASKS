import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to get print list : ");
		int a =  sc.nextInt();
		for(int i=0;i<=a;i++){
			System.out.print(i+" ");
		}
	}
}