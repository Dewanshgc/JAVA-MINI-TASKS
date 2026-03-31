import java.util.Scanner;
class dk{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to get table : ");
		int a =  sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(a + " X " + i + " = " + a*i);
		}
	}
}