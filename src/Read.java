import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\ACER\\Documents\\Java Jiraya\\Sistema-de-Cadastros\\file.text");
            int i;
            while ((i= fileReader.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }


