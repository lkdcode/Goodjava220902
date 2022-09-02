import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in, out = "";								// int a = 0 처럼 문자열 초기화 "";
		char ch;
		int count, i;
		int diff = 'a' - 'A';							    // 대문자와 소문자의 값 차이를 저장한다.

		System.out.printf("문자열을 입력하세요 : ");
		in = scan.nextLine();								// 문자열을 입력 받는다.

		count = in.length();								// 입력받은 문자열의 길이

		for (i = 0; i < count; i++) {						// 0부터 문자열 길이만큼 1++
			ch = in.charAt(i);								// 문자열에서 문자 하나를 추출한다. 0부터 시작
			if (('A' <= ch) && (ch <= 'Z'))					// 문자가 대문자면
				out += (char) (ch + diff);					// 대문자 소문자의 값 차이를 더한다.
			else if (('a' <= ch) && (ch <= 'z'))			// 문자가 소문자면
				out += (char) (ch - diff);					// 대문자와 소문자의 값 차이를 뺀다.
			else
				out += (char) ch;							// 영문이 아닌 경우 그대로 둔다.
		}
		System.out.printf("변환된 문자열 ==> %s \n", out);
		System.out.print(diff);
	}
}