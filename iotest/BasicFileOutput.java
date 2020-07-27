package iotest;

import java.io.*;

public class BasicFileOutput {
    static  String file="BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("./src/main/java/iotest/BasicFileOutput.java")));
        PrintWriter out=new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        int linecout=1;
        String s;
        while((s=in.readLine())!=null)
            out.println(linecout++ +":"+s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
