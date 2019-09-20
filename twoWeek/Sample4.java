package twoWeek;

interface work{					//Workふるまい

	String hard = "難しい";
	String easy = "簡単";

	void overtime();
	void LeaveEarly();
}

interface salary{				//Salaryふるまい

	int money = 1000;

	String get(String name , int hour );
}

class WorkplaceCommunication implements work , salary{      //⑧WorkplaceCommunication(職場)実装

	public void overtime() {
	     System.out.println("今日は"+hard+"ので残業です。");
	}

	public void LeaveEarly() {
		System.out.println("今日は"+easy+"なのでさっさと帰る");
	}

	public String get(String name , int hour) {
		int getSalary = money * hour;
		return name + "さんは"+hour+"時間働いたので"+getSalary+"円あげます";
	}
}




public class Sample4 {

	public static void main(String[] args) {

		WorkplaceCommunication workplace = new WorkplaceCommunication();	//⑧WorkplaceCommunication(職場)

		workplace.overtime();
		workplace.LeaveEarly();

		String name = "yamada";

		System.out.println(workplace.get(name , 10));

	}

}
