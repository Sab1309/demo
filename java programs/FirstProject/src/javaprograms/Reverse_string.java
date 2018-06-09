package javaprograms;

public class Reverse_string {
	//public static String reverseString(String str){
		//StringBuilder sb=new StringBuilder(str);
	//	sb.reverse();
		//return sb.toString();
	//}
	public static String reverseString(String str){
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--){
			rev+=ch[i];
		}
		return rev;
	}
	public static void main(String[] args) {
	System.out.println(Reverse_string.reverseString("i name is swati"));

	}

}
