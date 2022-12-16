import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        ReadFile readFile = new ReadFile();
        readFile.readCSV(args[0]);
        readFile.readTXT(args[1]);
        readFile.printDetails();
    }
}
