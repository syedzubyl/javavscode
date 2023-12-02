
public class pare1021 {
public static void main(String[] args) {
	String s= "(()())(())";
	if (s.length() <= 2) {
		System.out.println(s);
	}
	StringBuilder string =new StringBuilder();
	char[] c =s.toCharArray();
	int open=1;
	for (int i =0; i<c.length; i++) {
		if (c[i] == '(') {
			open++;
			if(open>1) 
				string.append('(');
			
			
		}
		else {
			if (open > 1) 
				string.append(')');
				open--;
			
		}
	}
	System.out.println("sss"+string.toString());
	
}
}
