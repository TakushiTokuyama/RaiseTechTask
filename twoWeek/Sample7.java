package twoWeek;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sample7 {												   //いろんな例外

	public static int calc(int i) throws IllegalArgumentException{  //例外クラス

		int number = i;

		if(i == 1){
		     throw new IllegalArgumentException("1を入力するとこうなる");
		    }
		return number;
	}

	public static void main(String[] args) {

		try {

	        FileReader r = new FileReader("sample.txt");      		 //例外が発生する処理 ファイル読み込めない
	        System.out.print("ファイルを読み込みました");

	    } catch (FileNotFoundException e) {

	        System.out.print("ファイルが存在しませんでした");		//例外があった場合
	        System.out.print(e);									//error文
	    }

		try {

			int num = 0;
			int sum;

			sum = num % 0;								//例外が発生する処理 0で割る
			System.out.println(sum);

		} catch (Exception e){

			System.out.println(e);						//例外文
		} finally{										//必ずする処理
			System.out.println("");
		}

		int num = 0;

		try {
			if(num == 0) {								//例外が発生する処理 0
		throw new IllegalArgumentException();
		}
		}catch(IllegalArgumentException e) {

			System.out.println(e);	//error文

		}finally {
			System.out.println("");						//必ずする処理
		}

		for(int i = 0; i < 5; i++) {

		try {
			System.out.println(calc(i));				//1を入力すると例外をthrow
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		}

	}
}
