package iotest;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) {
        try {
            StringReader in=new StringReader(BufferedInputFile.read("./src/main/java/iotest/MemoryInput.java"));
            int c;
            while((c=in.read())!=-1)
                System.out.print((char)c);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
