import java.io.*;

public class MakeFile {
    public static void main(String[] args) {
        File file = new File("file.text");
        try (FileWriter fw = new FileWriter(file, true);) {
            try {
                fw.write("1 - Qual seu nome completo?\n" + "2 - Qual seu email de contato?\n" + "3 - Qual sua idade?\n" + "4 - Qual sua altura?\n"
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}