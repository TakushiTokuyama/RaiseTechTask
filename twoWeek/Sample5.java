package twoWeek;


class Workplace{

	public static boolean checkplace(String place) { 	//⑪職場かどうかを判断するメソッド

		if(place.equals("職場")) {	//職場かどうかチェック
			return true;
		}else {
			return false;
		}

	}
}

public class Sample5 {
	public static void main(String[] args) {

		String[] places = {"職場" , "遊園地" , "警察"};		//⑩職場かどうかを判断するようなフィールド
		String boss = "社長";

		for(int i = 0 ; i < 3 ; i++) {
			boolean result = Workplace.checkplace(places[i]);
		if(result == true) {								//⑪職場じゃなければ社長に挨拶しない
			System.out.println(boss + "こんにちは");
		}else{
			System.out.println("無視だ");
		}
	  }
	}

}
