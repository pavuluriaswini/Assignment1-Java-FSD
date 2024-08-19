package assignment1;

public class StringCharClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st= "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		int alpha=0;
		int num=0;
		int space=0;
		int splchar=0;
		for (char ch : st.toCharArray()) {
			if(Character.isLetter(ch)) {
				alpha++;
			}
			else if(Character.isDigit(ch)){
				num++;
			}
			else if(Character.isWhitespace(ch)){
				space++;
			}
			else {
				splchar++;
			}
		
			
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(space);
		System.out.println(splchar);
		
		

	}

}
