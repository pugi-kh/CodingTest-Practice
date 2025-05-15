package text_edit_answer_del;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
							        		new OutputStreamWriter(
						        				new FileOutputStream("output.txt"), StandardCharsets.UTF_8));
		
		String line;
		boolean ans = false;
		String choice = "A. B. C. D.";
		
		while(true) {
			line = br.readLine();
	    if (line == null || line.trim().isEmpty()) {
	        break;
	    }
	    
			String[] tokens = line.trim().split(" ");
			
			if(ans == false) {
				if(tokens[0].equals("Answer:")) {
					ans = true;
				}else if (tokens[0].startsWith("Q")) { 
					bw.append("\n\n\n\n\n").append(line);
				}else if (choice.contains(tokens[0])) {
					bw.append("\n\n").append(line);
				}else {
					bw.append(line);
				}
			}else {
				if(tokens[0].startsWith("Q")) {
					ans = false;
					bw.append("\n\n\n\n\n").append(line);
				}
			}
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
