package AdventofCodeDay5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReaderPart5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Regular expression to match valid mul instructions
        String pattern = "mul\\((\\d{1,3}),(\\d{1,3})\\)";

        // Compile the regex
        Pattern regex = Pattern.compile(pattern);
        
        ArrayList<Integer> results = new ArrayList<>();
        boolean isEnabled = true;
		
		try{
			File file = new File("input5");
			Scanner scanner = new Scanner(file);
			
			
			while(scanner.hasNext()) {
				//grab 1 line
				String line = scanner.nextLine();
				
				//check for do() and don't()
				if (line.contains("do()")) {
                    isEnabled = true; // Enable mul instructions
                } else if (line.contains("don't()")) {
                    isEnabled = false; // Disable mul instructions
                }
				
				//Match the regex pattern in the line
                Matcher matcher = regex.matcher(line);
				
                while (matcher.find()) {
                    // Extract numbers from the capturing groups
                    int x = Integer.parseInt(matcher.group(1));
                    int y = Integer.parseInt(matcher.group(2));

                    // Perform multiplication and add to results
                    if (isEnabled) {
                        results.add(x * y);
                    }
                }
			}
			
			int sum = 0;
            for (int value : results) {
                sum += value;
            }
            
            System.out.println("Total sum is " + sum);
			
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
