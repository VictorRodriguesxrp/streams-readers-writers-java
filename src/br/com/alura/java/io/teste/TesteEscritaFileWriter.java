package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("lorem3.txt");
	
		ps.println("lorem kkakakakakakakakakk teste teste teste 100");
		ps.println();
		ps.println("hsuahsauhsauhas dsasa dadada ass8");
		
		ps.close();
	}
}