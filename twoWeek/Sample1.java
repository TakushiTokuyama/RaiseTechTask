package twoWeek;

import java.time.LocalDateTime;

public class Sample1 {
	public static void main(String[] args) {

		LocalDateTime d = LocalDateTime.now();					//③3年後の今日が何曜日なのか


		    System.out.println(d);              				//今日
		    System.out.println(d.getDayOfWeek());  				//今日の曜日

		LocalDateTime threeYearsLater = d.plusMonths(36);		//36か月後
		LocalDateTime threeYearsLaters = d.plusYears(3); 		//3年後

			System.out.println(threeYearsLater);  				//36か月後 日付
			System.out.println(threeYearsLaters); 				//3年後 日付

			System.out.println(threeYearsLater.getDayOfWeek());  //36か月後 曜日
			System.out.println(threeYearsLaters.getDayOfWeek());  //3年後 曜日


		int answer = 1;								 //④コンソールに引数が0なら偽。引数が1なら真
		if(answer == 1) {
 			System.out.println("真");
 			}else {
 			System.out.println("偽");
 			}

			System.out.println(Method.execute(0));  //Methodクラスからexcuteメソッド読み込み

		int a = 0;
		 	while(a < 3){							//④コンソールに引数が0なら偽。引数が1なら真
		 		Method.executeTwo(a);          		//MethodクラスからexcuteTwoメソッド読み込み
		 		a++;
		 }

	}
}

