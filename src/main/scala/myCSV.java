import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;

public class myCSV {
    private BufferedReader reader; // Read the file
    private String line; // Get the line of each row
    private String parts[] = null; // Stores each read line

    public void readFile(String fileName) {
        try{
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                parts = line.split(",");
                printLine();
                System.out.println();
            }
            reader.close();
            line = null;
            parts = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void printLine() {
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i] + " | ");
        }
    }
}
