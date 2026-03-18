import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check armstrong : ");
		int a=sc.nextInt();
		int b=0,c=0;
		int d=a;
		while(a>0){
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
		}
		System.out.println(c);
		if(d==c){
			System.out.println("Is armstrong");
		}
		else{
			System.out.println("Not armstrong");
		}
	}
}