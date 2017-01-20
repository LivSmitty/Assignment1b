
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;



public class TextReaderBean {


    int lines = 0;
    int chars = 0;
    int words = 0;
    int sum = 0;
    int numbers = 0;


    public TextReaderBean() {
        //create object
    }


    public void read(String input) throws FileNotFoundException {
        //scan text file and obtain word count, character count, and sum of numbers
        try {
            File file = new File(input);
            Scanner in = new Scanner(file);

            while (in.hasNextLine()) {
                lines++;
                String line = in.nextLine();
                chars += line.length();
                if (Character.isDigit(chars)) {
                    sum += Integer.parseInt(in.next());
                }
                words += new StringTokenizer(line, " ,").countTokens();
            }

            in.close();

            //print information
            System.out.println("Number of words in file: " + words);
            System.out.println("Number of Characters in file: " + chars);
            System.out.println("Sum of all numbers in file: " + numbers);

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}





