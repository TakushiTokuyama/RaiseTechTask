package twoWeek;

public class Sample {

	public static void main(String[] args) {

		String greeting = "HelloWorld";            //①HelloWorld」を表示してみよう
		System.out.println(greeting);

		for(int sum = 0 , i = 1; i < 11 ; i++ ) {  //②1～10まで足した結果を表示してみよう。
			sum += i ;
			if(i == 10 ) {
				System.out.println(sum);
				}
		}

		int answer = 0;							   //②1～10まで足した結果を表示してみよう。
		int sum[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i : sum) {
			answer += i;
		}
				System.out.println(answer);

		int num = 0;							  //②1～10まで足した結果を表示してみよう。
		for(int i = 0; i < 11 ; i++)
			num += i ;
				System.out.println(num);

	}

}
