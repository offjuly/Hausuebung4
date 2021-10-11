import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ApiReader {
    BufferedReader br;

    {
        try {
            br = new BufferedReader(new FileReader("numbers.csv"));
            String line = br.readLine();
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
