
package twoWeek;

import java.time.LocalDateTime;

public class Sample1 {
	public static void main(String[] args) {

		// ③3年後の今日が何曜日なのか
		LocalDateTime d = LocalDateTime.now();
		// 今日
		System.out.println(d);
		// 今日の曜日
		System.out.println(d.getDayOfWeek());
		// 36か月後
		LocalDateTime threeYearsLater = d.plusMonths(36);
		// 3年後
		LocalDateTime threeYearsLaters = d.plusYears(3);
		// 36か月後 日付
		System.out.println(threeYearsLater);
		// 3年後 日付
		System.out.println(threeYearsLaters);
		// 36か月後 曜日
		System.out.println(threeYearsLater.getDayOfWeek());
		// 3年後 曜日
		System.out.println(threeYearsLaters.getDayOfWeek());
		// ④コンソールに引数が0なら偽。引数が1なら真
		int answer = 1;

		if (answer == 1) {
			System.out.println("真");
		} else {
			System.out.println("偽");
		}
		// Methodクラスからexcuteメソッド読み込み
		System.out.println(Method.execute(0));
		// ④コンソールに引数が0なら偽。引数が1なら真
		int a = 0;
		while (a < 3) {
			// MethodクラスからexcuteTwoメソッド読み込み
			Method.executeTwo(a);
			a++;
		}
	}
}
