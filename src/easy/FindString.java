package easy;

public class FindString {
	public static void main(String[] args) {
		
		String s = "1";
		String c = "1";
		
		if(s == null || c == null)
			return;
		
		char[] arrayChar = c.toLowerCase().toCharArray();
		
		int soma = 0;
		for (int i = 0; i < arrayChar.length; i++) {
			if(s.toLowerCase().equals(String.valueOf(arrayChar[i]))) {
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.println("-----");
		System.out.println(soma);
		
	}
}
