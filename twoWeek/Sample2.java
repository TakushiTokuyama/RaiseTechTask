package twoWeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Sample2 {

	public static void main(String[] args) {

		List<String> classList = new ArrayList<>();  //⑤String型のListを作成

			classList.add("1組");          	//0番目
			classList.add("2組");		   	//1番目
			classList.add("3組");		    //2番目

		for(int i = 0; i < 3; i++ ) {
			System.out.println(classList.get(i));
		}

		Map<String , Integer> attendanceNumber = new HashMap<String , Integer>();  ////⑤String型のMapを作成

			attendanceNumber.put("山田" ,  1);	//0番目
			attendanceNumber.put("鈴木" , 2);	//1番目
			attendanceNumber.put("田中", 3);	//2番目

		int yamada = attendanceNumber.get("山田");		//山田君の出席番号取得
			System.out.println("山田君の出席番号は"+yamada);

			attendanceNumber.put("鈴木", 4);		//鈴木君の出席番号書き換え
			System.out.println("鈴木君の出席番号は"+attendanceNumber.get("鈴木"));
	}

}
