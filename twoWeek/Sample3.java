package twoWeek;

	interface Communication{                   //⑥Communicationというインターフェース

		String morning = "おはよう";
		String noon = "こんにちは";
		String night = "こんばんは";

		void greeting();

	}

	class Morning implements Communication{	//朝のふるまい

		public void greeting() {
			System.out.println(morning);
		}
	}

	class Afternoon implements Communication{	//昼のふるまい

		public void greeting() {
			System.out.println(noon);
		}

	}

	class Night implements Communication{		//夜のふるまい

		public void greeting() {
			System.out.println(night);
		}
	}

	interface Birthday{						//お誕生日プレゼントインターフェース

		String present = "ケーキ";
		String present1 = "チョコ";

		String birthday(String name);

	}

	class Present implements Birthday{			//実装

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

	class Greet{

		static void greet(String greeting , String name){		//⑦greetというメソッド

			System.out.println(name +"さん"+ greeting);

		}

	}

	public class Sample3 {
	public static void main(String[] args) {

		Morning m = new Morning();
		Afternoon a = new Afternoon();
		Night n = new Night();

		m.greeting();							//朝のあいさつ
		a.greeting();							//昼のあいさつ
		n.greeting();							//夜のあいさつ

		Present p = new Present();

		String answer = p.birthday("yamada");
		String answer1 = p.birthday("tanaka");

		System.out.println(answer);
		System.out.println(answer1);

		Greet.greet(Communication.noon , "yamada");		//⑨greetというメソッド内でHelloという言葉を受けたら、Helloと返す

	}

}
