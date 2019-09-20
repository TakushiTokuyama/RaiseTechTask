package twoWeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Sample2 {

	public static void main(String[] args) {
		//⑤String型のListを作成
		List<String> classList = new ArrayList<>();  

			classList.add("1組");
			classList.add("2組");
			classList.add("3組");

		for(int i = 0; i < 3; i++ ) {
			System.out.println(classList.get(i));
		}

		////⑤String型のMapを作成
		Map<String , Integer> attendanceNumber = new HashMap<String , Integer>();

			attendanceNumber.put("山田" ,  1);
			attendanceNumber.put("鈴木" , 2);
			attendanceNumber.put("田中", 3);
		//山田君の出席番号取得
		int yamada = attendanceNumber.get("山田");
			System.out.println("山田君の出席番号は"+yamada);
			//鈴木君の出席番号書き換え
			attendanceNumber.put("鈴木", 4);
			System.out.println("鈴木君の出席番号は"+attendanceNumber.get("鈴木"));
	}

}
