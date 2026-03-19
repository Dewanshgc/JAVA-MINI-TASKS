import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to get reverse : ");
		int a =  sc.nextInt(); //12345
		int b=0;
		for(;a>0;a=a/10){
			b=a%10;
			System.out.print(b);
		}
	}
}