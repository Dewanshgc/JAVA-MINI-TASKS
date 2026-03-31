import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check prime : ");
		int a=sc.nextInt();
		int c=2;
		int b=0;
		while(a>=1){
			b=a%c;
			c++;
		}
		if(b==0){
				System.out.print("Not prime");
			}
			else{
				System.out.print("Prime");
			}
	}
}