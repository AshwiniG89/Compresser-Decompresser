/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author harish
 */
public class Compress {
    public static void method(File file) throws FileNotFoundException, IOException{
        String fileDirectory = file.getParent();
        System.out.print(fileDirectory);
        FileInputStream fis =new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/Compressedfile.gz ");
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);
        
        byte [] buffer=new byte[1024];
        int length;
        
        while((length=fis.read(buffer))!=-1){
            gzipOS.write(buffer,0,length);
            for(int i=0;i<buffer.length;i++){
                System.out.print(buffer[i]+" ");
            }
            System.out.println(length);
        }
        
        fis.close();
        fos.close();
        gzipOS.close();
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File path= new File( "/Users/harish/Desktop/Gym problems/Project/CompressDecompress/Testdoc.rtf");
        method(path);
    }
    
}
