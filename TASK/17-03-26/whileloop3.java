import java.util.Scanner;
class dk{
	public  static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to find the length : ");
		int a=sc.nextInt();
		int rev=0;
		while(a!=0){
			rev=a%10;
			a=a/10;
			System.out.print(rev);
		}
}
}

// int num=1234;
// int multi=0;
// while(num>0){
	// int dig=num%10;
	// multi=multi*dig;
	// num=num/10;
// }
// System.out.println(multi);

// // int num=1234;
// // int rev=0;
// // while(num>0){
	// // int dig=num%10;
	// // rev=rev*10+dig;
	// // num=num/10;
// // }
// // System.out.println(rev);
// // }