package Recursion;

public class RecursionwithString {
	
	public static String replacechar(String s, char a, char b) {
		if(s.length() == 0) {
			return s;
		}
		String smalloutput = replacechar(s.substring(1), a, b);
		if(s.charAt(0)== a) {
			return b+smalloutput;
		}else {
			return s.charAt(0)+ smalloutput;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println(replacechar("axbxcdx", 'x', 'y'));
			}

}
