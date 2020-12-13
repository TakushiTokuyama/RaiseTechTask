package twoWeek;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sample7 {
	// ⑬いろんな例外
	public static int calc(int i) throws IllegalArgumentException {

		int number = i;

		if (i == 1) {
			throw new IllegalArgumentException("1を入力するとこうなる");
		}
		return number;
	}

	public static void main(String[] args) {

		try {
			// 例外が発生する処理 ファイル読み込めない
			FileReader r = new FileReader("sample.txt");
			System.out.print("ファイルを読み込みました");

		} catch (FileNotFoundException e) {
			// 例外があった場合
			System.out.print("ファイルが存在しませんでした");
			System.out.print(e);
		}

		try {
			int num = 0;
			int sum;
			// 例外が発生する処理 0で割る
			sum = num % 0;
			System.out.println(sum);

		} catch (Exception e) {

			System.out.println(e);
		} finally {
			System.out.println("");// 必ずする処理
		}

		int num = 0;

		try {
			// 例外が発生する処理 0
			if (num == 0) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {

			System.out.println(e);

		} finally {
			System.out.println("");// 必ずする処理
		}

		for (int i = 0; i < 5; i++) {

			try {
				// 1を入力すると例外をthrow
				System.out.println(calc(i));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
		}

	}
}
