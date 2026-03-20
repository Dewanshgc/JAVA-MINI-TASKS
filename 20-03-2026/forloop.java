import java.util.Scanner;
class dk{
	public static void main(String[]args){
		dk1 obj1=new dk1();
		obj1.one();
		obj1.two();
		obj1.three();
		obj1.four();
		obj1.five();
		obj1.six();
	}
}
class dk1{
void one(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number to print : ");
	int a=sc.nextInt();
	for(int i=0;i<=a;i++){
		System.out.println(i);
	}
}
void two(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number to print reverse : ");
	int a=sc.nextInt();
	for(int i=a;i>=1;i--){
		System.out.println(i);
	}
}
void three(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number to get even numbers sum : ");
	int a=sc.nextInt();
	int i;
	int b=0;
	for(i=0;i<=a;i=i+2){
		b=b+i;
	}System.out.println(b);
}
void four(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number to get odd numbers sum : ");
	int a=sc.nextInt();
	int i;
	int b=0;
	for(i=1;i<=a;i=i+2){
		b=b+i;
	}System.out.println(b);
}
void five(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number to get sum of natural numbers : ");
	int a=sc.nextInt();
	int i;
	int b=0;
	for(i=0;i<=a;i++){
		b=b+i;
	}
	System.out.println(b);
}
void six(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number to find sum of digits : ");
	int a=sc.nextInt();
	int b=0,c=0;
	for(;a>0;a=a/10){
		b=a%10;
		c=c+b;
	}
	System.out.println(c);
}
}
