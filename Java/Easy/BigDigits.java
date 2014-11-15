package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BigDigits {

    public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {				
			bigDigits(line.replaceAll("[^\\d]",""));    			
		}
    }    

    /**
     * Prints out ACII representation of numerical characters
     * @param str: String with only digits
     */
    private static void bigDigits(String str){

        String[] lines = {"","","","","",""} ;
        char[] characters = str.toCharArray();

        // ASCII is simply concatenated to make full string
        for (char c : characters){            

            switch(c){
                case '1':
                    lines[0] += "--*-";
                    lines[1] += "-**-";
                    lines[2] += "--*-";
                    lines[3] += "--*-";
                    lines[4] += "-***";
                    lines[5] += "----";
                    break;
                case '2':
                    lines[0] += "***-";
                    lines[1] += "---*";
                    lines[2] += "-**-";
                    lines[3] += "*---";
                    lines[4] += "****"; 
                    lines[5] += "----";
                    break;
                case '3':
                    lines[0] += "***-";
                    lines[1] += "---*";
                    lines[2] += "-**-";
                    lines[3] += "---*";
                    lines[4] += "***-";
                    lines[5] += "----";
                    break;
                case '4':
                    lines[0] += "-*--";
                    lines[1] += "*--*";
                    lines[2] += "****";
                    lines[3] += "---*";
                    lines[4] += "---*";
                    lines[5] += "----";
                    break;
                case '5':
                    lines[0] += "****";
                    lines[1] += "*---";
                    lines[2] += "***-";
                    lines[3] += "---*";
                    lines[4] += "***-";
                    lines[5] += "----";
                    break;
                case '6':
                    lines[0] += "-**-";
                    lines[1] += "*---";
                    lines[2] += "***-";
                    lines[3] += "*--*";
                    lines[4] += "-**-";
                    lines[5] += "----";
                    break;
                case '7':
                    lines[0] += "****";
                    lines[1] += "---*";
                    lines[2] += "--*-";
                    lines[3] += "-*--";
                    lines[4] += "-*--";
                    lines[5] += "----";
                    break;
                case '8':
                    lines[0] += "-**-";
                    lines[1] += "*--*";
                    lines[2] += "-**-";
                    lines[3] += "*--*";
                    lines[4] += "-**-";
                    lines[5] += "----";
                    break;
                case '9':
                    lines[0] += "-**-";
                    lines[1] += "*--*";
                    lines[2] += "-***";
                    lines[3] += "---*";
                    lines[4] += "-**-";
                    lines[5] += "----";
                    break;
                case '0':
                    lines[0] += "-**-";
                    lines[1] += "*--*";
                    lines[2] += "*--*";
                    lines[3] += "*--*";
                    lines[4] += "-**-";
                    lines[5] += "----";
                    break;
            }
            
            // Creates space between ACII lines 
            for(int i = 0; i < 6; i++){
                lines[i] += "-";                
            }
        }

        for(String l : lines){
            System.out.println(l);
        }
    }
}
