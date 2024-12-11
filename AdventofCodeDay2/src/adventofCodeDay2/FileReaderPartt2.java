package adventofCodeDay2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileReaderPartt2 {
public static void main(String[] args) {
		
		
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		
		try{
			Scanner scanner = new Scanner(new File("input2"));
			
			while(scanner.hasNext()) {
				
				
				//call nextInt 2x iteration
				//add to the respective lists!
				leftList.add(scanner.nextInt());
				rightList.add(scanner.nextInt());
				
			}
			int sum =0;
			while(leftList.size()>0) {
				//look for the smallest element in the left list
				
				for (int i = leftList.size() - 1; i >= 0; i--) {
					int count = 0;
					int value = leftList.get(i);
					for (int j = rightList.size() - 1; j >= 0; j--) {
						if (value == rightList.get(j)) {
							count++; 
						}
					}
					System.out.println(count * value);
					sum += count* value;
					leftList.remove(i);
					
				}
				
			}
			System.out.println("Sum is " + sum);
		
			
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}

