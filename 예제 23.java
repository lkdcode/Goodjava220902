import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요 : ");
		String word = scan.nextLine();
		int x = word.length();
		int i = 0;

		System.out.printf("내용을 거꾸로 입력 ==> ");
		for (i = x; i > 0; i--) {
			int N = word.charAt(i - 1);
			System.out.printf("%c", N);
		}
	}
}