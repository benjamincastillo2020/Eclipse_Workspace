package communityService;



import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static void main(String... args) {
    	List<student> students = readStudentsFromCSV("students.csv");

        // let's print all the person read from CSV file
        for (student S : students) {
        	
            System.out.println(S);
        }
    }

    static List<student> readStudentsFromCSV(String fileName) {
        List<student> students = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
        	
            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                student student = createStudent(attributes);

                // adding student into ArrayList
                students.add(student);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return students;
    }

    private static student createStudent(String[] metadata) {
    	int ID = Integer.parseInt(metadata[0]);
    	String Fname = metadata[1];
        String Lname = metadata[2];
        int Grade = Integer.parseInt(metadata[3]);
        int Hours = Integer.parseInt(metadata[4]);
        String Email = metadata[5];

        // create and return book of this metadata
        return new student(ID, Fname, Lname, Grade, Hours, Email);
    }

}


