package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		FileOutputStream fos = new FileOutputStream("lorem1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		br.lines().forEach(s -> {
			try {
				bw.write(s + "\n");
				System.out.println(s);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		bw.close();
		br.close();
	}
}
