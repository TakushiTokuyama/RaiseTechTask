package com.example.demo;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class JTest {

	@Test
	public void testGetHello() {

		Hello hello = new Hello();

		Hello hello1 = hello;

		String message = hello.getHello();

		//値を比較する
		assertThat(message, is("hello!!"));
		//nullではない
		assertThat(message, is(notNullValue()));
		//同じインスタンスか調べる
		assertThat(hello, is(sameInstance(hello1)));
		//クラスのインスタンスか調べる
		assertThat(hello, is(instanceOf(Hello.class)));

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		//期待する値があるか調べる
		assertThat(numbers, hasItem(1));

		numbers.add(2);
		//複数
		assertThat(numbers,hasItems(1,2));

		String language = "aiu3";

		//文字が含まれているか
		assertThat(language , containsString("aiu"));
		//最初の文字
		assertThat(language , startsWith("a"));
		//最後の文字
		assertThat(language , endsWith("3"));
	}

}



