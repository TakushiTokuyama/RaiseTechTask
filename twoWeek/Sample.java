package twoWeek;

public class Sample {

	public static void main(String[] args) {
		//①HelloWorld」を表示してみよう
		String greeting = "HelloWorld";
		System.out.println(greeting);
		//②1～10まで足した結果を表示してみよう。6行
		for(int sum = 0 , i = 1; i < 11 ; i++ ) {  
			sum += i ;
			if(i == 10 ) {
				System.out.println(sum);
				}
		}
		//②1～10まで足した結果を表示してみよう。5行
		int answer = 0;							   
		int sum[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i : sum) {
			answer += i;
		}
				System.out.println(answer);
		//②1～10まで足した結果を表示してみよう。4行
		int num = 0;							  
		for(int i = 0; i < 11 ; i++)
			num += i ;
				System.out.println(num);

	}

}
