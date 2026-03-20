class dk{
	public static void main(String[]args){
		dk1 obj1=new dk1();
		obj1.one();
		obj1.two();
		obj1.three();
		obj1.four();
		obj1.five();
		obj1.six();
		obj1.seven();
		obj1.eight();
	}
}

class dk1{
	void one(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(" *");
			}
			System.out.println();
		}System.out.println();
	}
	void two(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(" "+j);
			}
			System.out.println();
		}System.out.println();
	}
	void three(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(" "+i);
			}
			System.out.println();
		}System.out.println();
	}
	void four(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}System.out.println();
	}
	void five(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+i);
			}
			System.out.println();
		}System.out.println();
	}
	void six(){
		int n=4;
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }System.out.println();
	}
	void seven(){
		int b=0;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				// b=b+1; //
				System.out.print(" "+(j+b));
			}
			b++;
			System.out.println();
		}System.out.println();
	}
	void eight(){
		int b=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				b=b+1;
				System.out.print(" "+b);
			}
			System.out.println();
		}System.out.println();
	}
}

