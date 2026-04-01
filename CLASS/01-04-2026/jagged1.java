import java.util.Scanner;

class dk {

public static void main (String [] args){

Scanner sc = new Scanner (System.in);

System.out.println("enter an array row size");


int rows = sc.nextInt();


int [][]a = new int [rows][];


for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            a[i] = new int[cols]; 
			
            System.out.println("Enter elements of each column " + i + ":");
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }



}

}