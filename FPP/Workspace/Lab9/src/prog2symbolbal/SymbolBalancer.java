package prog2symbolbal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;
	char[] left;
	char[] right;

	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}

	public void setText(String text) {
		this.text = text;
	}

	boolean symbolsBalanced(String delimiters) {
		// implement
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < delimiters.length(); j++) {				
				if(text.charAt(i) == delimiters.charAt(j)) {	
					if(j%2 == 0) {
						stack.push(text.charAt(i));
					}
					else {
						if(stack.isEmpty()) {
							return false;
						}
						if(stack.peek() == delimiters.charAt(j-1)) {
							stack.pop();
						}					
					}
				}
			}
		}
		
		if(stack.isEmpty()) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("prog2symbolbal//Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}()"));
	}

//	void readFile() {
//		String prefix = System.getProperty("user.dir") + "\\src\\";
//		try {
//			Scanner sc = new Scanner(new File(prefix + filename));
//			sc.useDelimiter(ODD_DELIMITER);
//			text = sc.next();
//			System.out.println(text);
//			sc.close();
//		}
//		catch(FileNotFoundException ex) {
//			System.err.println("File Not Found Exception " + ex.getMessage());
//		}
//	}

	void readFile() {
		String prefix = System.getProperty("user.dir") + "//src//";
		try {
			filename = "prog2symbolbal//Employee.java";
			List<String> lines = Files.readAllLines(Paths.get(prefix, filename));
			StringBuilder textsb = new StringBuilder();
			for (String line : lines) {
				textsb.append(line + "\n");
			}
			text = textsb.toString();
		} catch (IOException e) {
			System.out.println("File not found: " + e.getMessage());
		}
		System.out.println(text);
	}

}
