/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robert Waniewski
 */
public class Wczytaj {
    
    public static char[] Czytaj (String nazwa_pliku)
    {
    RandomAccessFile raf = null;
        char znaki[] = null;
        
        try {
            raf = new RandomAccessFile(nazwa_pliku, "r");
            
            char temp;
            znaki = new char[(int)raf.length()];
                for (int i = 0 ; i<raf.length() ; i++){
                temp = (char)raf.readByte();
                if (temp != '\n')
                znaki[i] =temp;
                }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Wczytaj.class.getName()).log(Level.SEVERE, null, ex);
        }
        return znaki;
    
    
    }
    
}
