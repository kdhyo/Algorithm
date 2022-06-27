package level1;

public class 문자열내p와y의개수 {

	boolean solution(String s) {
		String nonP = s.replaceAll("(p|P)", "");
		String nonY = s.replaceAll("(y|Y)", "");

		return nonP.length() == nonY.length();
	}

}
