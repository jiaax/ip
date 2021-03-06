package duke;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Readfile class to read data from file and update Duke.
 */
public class ReadFile {
    static void printFileContents(String filePath) throws FileNotFoundException {
        File f = new File(filePath); // create a File for the given file path
        Scanner s = new Scanner(f); // create a Scanner using the File as the source
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    /**
     * The main method to test out the ReadFile file.
     * @param args
     */
    public static void main(String[] args) {
        try {
            printFileContents("data");
            LocalDate k = LocalDate.parse("2019-12-01");
            System.out.println(k.format(DateTimeFormatter.ofPattern("MMM d yyyy")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
