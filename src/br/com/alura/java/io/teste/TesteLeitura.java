package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		br.lines().forEach(s -> {
			System.out.println(s);
		});
		
		br.close();
	}
}
