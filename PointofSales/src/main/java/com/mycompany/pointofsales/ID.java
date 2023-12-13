/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointofsales;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author HP
 */
public class ID {
    static void  replace(int skp) throws IOException{
        FileReader fileReader = null;
        String substring = "";
                
        File fid = new File("idList.txt");
        fileReader = new FileReader(fid);
        fileReader.skip(skp);

        char[] buffer = new char[3];
        int bytesRead = fileReader.read(buffer);
        if (bytesRead != -1) {
            substring = new String(buffer);
            int number = Integer.parseInt(substring); 
            number = number+1;
            String nmbr = "";
            String newstring = "";
            if (number > 100){
                nmbr = String.valueOf(number);
                newstring = nmbr;
            }else if (number > 10){
                nmbr = String.valueOf(number);
                newstring = "0" + nmbr;
            }else{
                nmbr = String.valueOf(number);
                newstring = "00" + nmbr;
            }
            RandomAccessFile file = new RandomAccessFile(fid, "rw");
            file.seek(skp);
            String replacement = newstring; 
            file.writeBytes(replacement);
        } 
    }
    static String  take(int skp) throws IOException{
        FileReader fileReader = null;
        String substring = "";
                
        File fid = new File("idList.txt");
        fileReader = new FileReader(fid);
        fileReader.skip(skp);

        char[] buffer = new char[3];
        int bytesRead = fileReader.read(buffer);
        if (bytesRead != -1) {
            substring = new String(buffer);
            int number = Integer.parseInt(substring);  
        }        
        return substring;
    }
}
