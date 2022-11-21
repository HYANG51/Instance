package java_LJH_instance_example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// 내가 사용하고자 하는 함수에서 checked exception을 던지면 무조건 받아서 예외처리를 해줘야 함.
public class IOExceptionCase2 {
	public static void main(String[] args) {
		try {
			md1();
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("예외처리 됐냐");
		}
	}
	
	public static void md1() throws IOException {		// IOException 예외 넘긴다고 명시
		md2();
	}
	public static void md2() throws IOException {
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		
		writer = Files.newBufferedWriter(file);		// IOException 발생 가능
		writer.write('A');		// IOException 발생 가능
		writer.write('Z');		// IOException 발생 가능
		
		if(writer != null) {
			writer.close();		// IOException 발생 가능
		}
	}
}
