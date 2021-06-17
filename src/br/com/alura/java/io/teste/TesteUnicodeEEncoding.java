package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte [] bytes = s.getBytes("windows-1252");
		
		System.out.println(Arrays.toString(bytes));
		System.out.println(bytes.length + ", " + charset.displayName());
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");
		System.out.println(Arrays.toString(bytes));
		
		bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length + ", UTF-8");
		System.out.println(Arrays.toString(bytes));
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		byte[] bytes2 = s1.getBytes(utf8);
		String s2 = new String(bytes2, utf8);
		System.out.println(s2);
	}
}
