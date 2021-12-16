import java.io.*;
public class FileDemo
{
    public static void main(String[] args)
    {
        try{
        FileInputStream fis=new FileInputStream(new File("log.txt"));
        int i;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}