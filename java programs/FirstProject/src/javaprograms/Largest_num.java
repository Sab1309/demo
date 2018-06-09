package javaprograms;

public class Largest_num {

	public static void main(String[] args) {
		int num[]=new int[]{20,3,4,5,1,43,56,34,22,11};
		int smallest= num[0];
		int largest= num[0];
		
		for(int i=1; i<num.length; i++){
			if(num[i]>largest)
				largest= num[i];
			else if(num[i]<smallest)
				smallest= num[i];
		}

		System.out.println("Largest number is:" + largest);
		System.out.println("Smallest number is:" + smallest);
	}

}
