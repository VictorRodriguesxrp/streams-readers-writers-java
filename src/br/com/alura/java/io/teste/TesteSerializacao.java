package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		String nome = "Victor";
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serializacao.bin"));
//		oos.writeObject(nome);
//		oos.close();
//		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serializacao.bin"));
		
		String nome = (String) ois.readObject();
		ois.close();
		
		System.out.println(nome);
	}
}
