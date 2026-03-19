import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter starting value : ");
		int a=input.nextInt();
		System.out.print("Enter Ending value : ");
		int b=input.nextInt();
		int sum=0 ,evensum=0, oddsum=0;
		while(a<=b){
			if(a%2==0){
				evensum=evensum+a;
			}
			else{
				oddsum=oddsum+a;
			}
			sum=sum+a;
			a++;
		}
		System.out.println("Total sum : "+sum);
		System.out.println("Even sum : "+evensum);
		System.out.println("Odd sum : "+oddsum);
	}
}