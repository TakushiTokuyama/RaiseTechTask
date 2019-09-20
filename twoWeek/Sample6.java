package twoWeek;



public class Sample6 {

	public static class Commnication{
		//⑫Communicationクラスに新しく話しかけてきた人が誰かで応答を返す
		public String greetCheck(String name) throws Exception{ 

			if(name.equals("上司")) {
				throw new Exception("上司がきてあせる");//⑫例外を返す
			}else {
				return name + "こんにちは！";
			}

		}
	}

	public static void main(String[] args) {

		String boss = "上司";

		try {

			Commnication com = new Commnication();
			//例外が起こる可能性がある処理
			String result = com.greetCheck(boss);

			System.out.println(result);

		}catch(Exception e) {
			//例外が起こった場合の処理
			System.out.println(e);

		}
	}
}