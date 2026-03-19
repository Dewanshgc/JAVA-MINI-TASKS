import java.util.Scanner;
class dk{
	public  static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to find the length : ");
		int a=sc.nextInt();
		int count=0;
		int multi=1;
		while(a!=0){
			count++;
			int b=a%10;
			multi=multi*b;
			a=a/10;
		}
		System.out.println(count);
		System.out.println(multi);
		
}
}