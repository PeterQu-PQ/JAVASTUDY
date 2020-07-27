package iotest;

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
//Args:GZIPcompress.java
public class GZIPcompress {
    public static void main(String[] args) throws Exception{
        if ((args.length==0)){
            System.out.println("Usage:\nGZIPcompress file\n"+"\tUsers GZIP compression to compress"+"the file to test.gz");
            System.exit(1);
        }
        //BufferedReader缓冲区字符输入流
        InputStreamReader f=new InputStreamReader(new FileInputStream(args[0]));
        System.out.println(f.getEncoding());
        BufferedReader in=new BufferedReader(f);
        //缓冲区字节输出流<-Gzip压缩流<-文件输出流
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream("test.gz"))));
        System.out.println("Writing file");
        int c;
        while ((c=in.read())!=-1)
            out.write(c);
        in.close();
        out.close();
        System.out.println("Reading File");
        //读取压缩文件
        //缓冲字符型输入流<-字符型输入流<-GZIP输入流<-文件输入流
        BufferedReader in2=new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
        String s;
        while ((s=in2.readLine())!=null)
            System.out.println(s);
    }
}
