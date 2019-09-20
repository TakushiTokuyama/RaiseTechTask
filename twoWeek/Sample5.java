package twoWeek;


class Workplace{
	//⑪職場かどうかを判断するメソッド
	public static boolean checkplace(String place) { 	
		//職場かどうかチェック
		if(place.equals("職場")) {
			return true;
		}else {
			return false;
		}

	}
}

public class Sample5 {
	public static void main(String[] args) {
		//⑩職場かどうかを判断するようなフィールド
		String[] places = {"職場" , "遊園地" , "警察"};	
		String boss = "社長";
		
		for(int i = 0 ; i < 3 ; i++) {
			boolean result = Workplace.checkplace(places[i]);
		//⑪職場じゃなければ社長に挨拶しない
		if(result == true) {
			System.out.println(boss + "こんにちは");
		}else{
			System.out.println("無視だ");
		}
	  }
	}

}
