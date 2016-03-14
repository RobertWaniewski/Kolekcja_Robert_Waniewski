/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Robert Waniewski
 */
public class Licznik {
    
    private static final Integer JEDEN = new Integer(1);   
    public static String Licz (char[] znaki){
    String policzone = null;
    
     Map mapa = new HashMap();
        for (int i = 0; i<znaki.length; i++){      
            Integer czest = (Integer) mapa.get("\n"+znaki[i]);
            mapa.put("\n"+znaki[i], (czest == null ? JEDEN : new Integer (czest.intValue() + 1)));
          
        }
        
    policzone = (mapa.size() + " różnych znaków")+mapa;
    return policzone;
    
    }
    
}
