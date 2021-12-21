package FileTest;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File path=new File("E:\\CodeBlocks");
        display(path);
    }

    public static void display(File path){
        File[] list=path.listFiles();
        for(File file:list){
            if(file.isFile()){
                System.out.println(file);
            }
            else if(file.isDirectory()){
                display(file);
            }
        }
    }
}
