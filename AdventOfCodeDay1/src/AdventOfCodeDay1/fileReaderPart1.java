package AdventOfCodeDay1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class fileReaderPart1 {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		
		try{
			Scanner scanner = new Scanner(new File("input1"));
			
			while(scanner.hasNext()) {
				
				
				//call nextInt 2x iteration
				//add to the respective lists!
				leftList.add(scanner.nextInt());
				rightList.add(scanner.nextInt());
				
			}
			int sum =0;
			while(leftList.size()>0) {
				//look for the smallest element in the left list
				int smallestLeft = leftList.get(0);
				int smallestIndex =0;
				for(int i = 0; i <leftList.size(); i++) {
					if (leftList.get(i) < smallestLeft){
						smallestLeft = leftList.get(i);
						smallestIndex = i;
					}
				}
				
				//remove the smallest from that list
				leftList.remove(smallestIndex);
				
				//continue with the right list
				int smallestRight = rightList.get(0);
				smallestIndex =0;
				
				for(int i = 0; i <rightList.size(); i++) {
					if (rightList.get(i) < smallestRight){
						smallestRight = rightList.get(i);
						smallestIndex = i;
					}
				}
				rightList.remove(smallestIndex);
				System.out.println(smallestLeft+" : " +smallestRight+ " "+ Math.abs(smallestRight-smallestLeft));
				sum += Math.abs(smallestRight-smallestLeft);
			}
			System.out.println("Sum is : " + sum);
			//look for the smallest element in left
			//look for smallest element in the right list
			//find the difference
			//remove the smallest element each time
			//repeat
			
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}

