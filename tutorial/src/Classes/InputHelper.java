package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHelper {
	
	public static String getInput(String prompt){
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println(prompt);
		System.out.flush();
		
		try{
			return stdin.readLine();
		}catch(IOException e){
			return "Error: " + e.getMessage();
		}
	}
}
