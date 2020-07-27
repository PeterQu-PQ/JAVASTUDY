package iotest;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
    public static void main(final String[] args) {
        File path=new File("./src/main/java/");
        String[] list;
        if(args.length==0)
            list=path.list();
        else
            list=path.list(new FilenameFilter() {
                private  Pattern pattern=Pattern.compile(args[0]);
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });

        try {
            Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        }
        catch (NullPointerException e){
            System.out.println("Wrong!!!");
        }
        try {
            for (String item:list)
                System.out.println(item);

        }
        catch (NullPointerException e){
            System.out.println("Wrong!!!2");
        }
    }
}
