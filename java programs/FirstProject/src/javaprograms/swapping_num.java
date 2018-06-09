package javaprograms;

import java.util.Scanner;

public class swapping_num {

	public static void main(String[] args) {
int x, y, temp;
System.out.println("Enter values of x and y");
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();

System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
temp = x;			//x=x+y; y=x-y; x=x-y;
x = y;
y = temp;
System.out.println("After Swapping\nx = "+x+"\ny = "+y);

	}

}
