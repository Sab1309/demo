package javaprograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 242, reversedInteger = 0, remainder, originalInteger;
originalInteger = num;
while (num != 0){
	remainder = num % 10;
	reversedInteger = reversedInteger * 10 + remainder;
	num /= 10;
}
if (originalInteger == reversedInteger)
	System.out.println(originalInteger + " is a palindrome. ");
else
	System.out.println(originalInteger + " is not a palindrome.");
	}

}
