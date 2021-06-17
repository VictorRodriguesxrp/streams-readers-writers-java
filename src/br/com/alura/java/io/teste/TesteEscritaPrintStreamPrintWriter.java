package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("lorem2.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
	
		bw.write("lorem kkakakakakakakakakk teste teste teste 100");
		bw.write(System.lineSeparator());
		bw.write("hsuahsauhsauhas dsasa dadada ass8");
		
		bw.close();
	}
}
