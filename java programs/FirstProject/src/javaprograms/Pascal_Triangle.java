package javaprograms;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args){
		int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		r = scan.nextInt();
		
		for(i=0; i<r; i++){
			for(k=r; k>i; k--){
				System.out.println(" ");
	
			}
		number=1;
		for(j=0; j<=i; j++){
			System.out.println(number+ " ");
			number = number*(i-j)/(j+1);
		}
		System.out.println();
		}

	}

}
