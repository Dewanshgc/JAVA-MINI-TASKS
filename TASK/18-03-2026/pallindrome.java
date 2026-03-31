import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check pallindrome : ");
		int a=sc.nextInt();
		int b=0;
		int c=a;
		int rev=0;
		while(a>0){
			b=a%10;
			rev=rev*10+b;
			a=a/10;
		}
		System.out.println("reverse is : "+rev);
		if(c==rev){
			System.out.println("Its pallindrome");
		}
		else{
			System.out.println("Its not pallindrome");
		}
	}
}