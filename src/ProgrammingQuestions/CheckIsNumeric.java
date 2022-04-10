package ProgrammingQuestions;

public class CheckIsNumeric {

	public static void main(String[] args) {

		System.out.println(isNumeric("12345"));
		System.out.println(isNumeric("Testing123"));
		System.out.println(isNumeric("Testing"));

	}

	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isNumeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}

		int len = cs.length();
		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}

		return true;

	}
}
