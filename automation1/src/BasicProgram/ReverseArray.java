package BasicProgram;

public class ReverseArray {
	public static void main(String[] args) {
		String s="WorkIsWorkship";
		char[] ch=s.toCharArray();
		String s1="";
		for(int i=ch.length-1;i>0;i--) {
		s1=s1+ch[i];
		}
		System.out.println(s1);
		
	}

}
