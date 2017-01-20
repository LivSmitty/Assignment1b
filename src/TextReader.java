import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by scott_000 on 1/18/2017.
 */
public class TextReader {


    public static void main(String[] args) throws FileNotFoundException {
        //Gather file information from user
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the file name with extension : ");
        String inputFile = console.next();

        //Create TextReaderBean to analyze text file
        TextReaderBean txtBean1 = new TextReaderBean();
        txtBean1.read(inputFile);


    }
}
