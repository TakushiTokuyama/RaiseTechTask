package twoWeek;
	//⑥Communicationというインターフェース
	interface Communication{ 

		String morning = "おはよう";
		String noon = "こんにちは";
		String night = "こんばんは";

		void greeting();
	}

	//朝のふるまい
	class Morning implements Communication{

		public void greeting() {
			System.out.println(morning);
		}
	}
	//昼のふるまい
	class Afternoon implements Communication{	

		public void greeting() {
			System.out.println(noon);
		}

	}
	//夜のふるまい
	class Night implements Communication{		

		public void greeting() {
			System.out.println(night);
		}
	}
	//お誕生日プレゼントインターフェース
	interface Birthday{				

		String present = "ケーキ";
		String present1 = "チョコ";

		String birthday(String name);

	}
	//実装
	class Present implements Birthday{

		public String birthday(String name) {

			if(name.equals("yamada")) {
				return present+"あげる";
			}else if(name.equals("suzuki")) {
				return present1+"あげる";
			}else {
				return "あげない";
			}

		}

	}

	//⑦greetというメソッド
	class Greet{

		static void greet(String greeting , String name){		

			System.out.println(name +"さん"+ greeting);

		}

	}

	public class Sample3 {

	public static void main(String[] args) {

		Morning m = new Morning();
		Afternoon a = new Afternoon();
		Night n = new Night();

		m.greeting();//朝のあいさつ
		a.greeting();//昼のあいさつ
		n.greeting();//夜のあいさつ

		Present p = new Present();

		String answer = p.birthday("yamada");
		String answer1 = p.birthday("tanaka");

		System.out.println(answer);
		System.out.println(answer1);
		//⑨greetというメソッド内でHelloという言葉を受けたら、Helloと返す
		Greet.greet(Communication.noon , "yamada");

	}

}
