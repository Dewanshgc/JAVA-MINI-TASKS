import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to get largest : ");
		int a=sc.nextInt();
		int max=0;
		while(a>0){
			int b=a%10;
			if(b>max){
				max=b;
			}
			else{
				max=max;
			}
			a=a/10;
		}System.out.print("Largest number is : "+max);
	}
}