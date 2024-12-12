package AdventofCodeDay3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReaderPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("input3");
		
		try{
			Scanner scanner = new Scanner(file);
			int count = 0; 
			
			while(scanner.hasNext()) {
				//grab 1 line
				String line = scanner.nextLine();
				
				//split the line into a String array 
				String[] elements = line.split(" ");
				
				if(increasing(elements) || decreasing(elements)) {
					count++;
				}
				else {
					System.out.println(Arrays.toString(elements));
				}
				
				}
			System.out.println("Total Safe " + count);
			
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean decreasing(String[] list) {
	
		for (int i = 1; i < list.length; i++) {
			int el0 = Integer.valueOf(list[i-1]);
			int el1 = Integer.valueOf(list[i]);
			
			if (el1 >= el0) {
				return false;
			}
			else if (el0-el1 > 3 ) {
				return false; 
			}
		}
		return true;
	}
	
	public static boolean increasing(String[] list) {
		
		for (int i = 1; i < list.length; i++) {
			int el0 = Integer.valueOf(list[i-1]);
			int el1 = Integer.valueOf(list[i]);
			
			if (el1 <= el0) {
				return false;
			}
			else if (el1-el0 > 3) {
				return false; 
			}
		}
		return true;
	}
	
	

}
