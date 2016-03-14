/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksperyment_list;

import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Robert Waniewski
 */
public class Eksperyment_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        List array = new ArrayList();
        List linked = new LinkedList();
        
        for(int i = 0 ; i<90000 ; i++){
        array.add(new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
        
        linked.add(new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
        }

       System.out.println("Eksperyment 1: Dodawanie elementu na początek listy: \n");
        long start_array = System.currentTimeMillis();
        
        for(int i = 0 ; i<10000 ; i++){
       array.add(0, new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
       
        }
       
       long stop_array = System.currentTimeMillis();
       
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");
        
       
       long start_linked = System.currentTimeMillis();
       
       for(int i = 0 ; i<10000 ; i++){
       
       linked.add(0, new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
       }
       
       long stop_linked = System.currentTimeMillis();      
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");

       System.out.println("\n\nEksperyment 2: Dodawanie elementu na środek listy: \n");
        start_array = System.currentTimeMillis();      
        for(int i = 0 ; i<10000 ; i++){
       array.add(50000+i, new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
       
        }
       
       stop_array = System.currentTimeMillis();     
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");    
        start_linked = System.currentTimeMillis();      
       for(int i = 0 ; i<10000 ; i++){      
       linked.add(50000+i, new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
       }
       
       stop_linked = System.currentTimeMillis();      
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");

       
       
       System.out.println("\n\nEksperyment 3: Dodawanie elementu na koniec listy: \n");
        start_array = System.currentTimeMillis();       
        for(int i = 0 ; i<10000 ; i++){
       array.add(109999+i, new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
       
        }
       
       stop_array = System.currentTimeMillis();      
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");     
        start_linked = System.currentTimeMillis();     
       for(int i = 0 ; i<10000 ; i++){      
       linked.add(109999+i, new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
       }
       
       stop_linked = System.currentTimeMillis();    
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");
       
       
      
       System.out.println("\n\nEksperyment 4: Usuwanie elementu z początku listy: \n");
        start_array = System.currentTimeMillis();    
        for(int i = 0 ; i<10000 ; i++){
       array.remove(0);     
        }      
       stop_array = System.currentTimeMillis();       
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");       
       start_linked = System.currentTimeMillis();     
       for(int i = 0 ; i<10000 ; i++){      
       linked.remove(0);
       }
       stop_linked = System.currentTimeMillis();      
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");

       System.out.println("\n\nEksperyment 5: Usuwanie elementu ze środeka listy: \n");
        start_array = System.currentTimeMillis();
        
        for(int i = 0 ; i<10000 ; i++){
       array.remove(55000-i);
       
        }
       
       stop_array = System.currentTimeMillis();
       
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");
        
       
        start_linked = System.currentTimeMillis();
       
       for(int i = 0 ; i<10000 ; i++){
       
       linked.remove(55000-i);
       }
       
       stop_linked = System.currentTimeMillis();
       
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");

       System.out.println("\n\nEksperyment 6: Usuwanie elementu z konca listy: \n");
        start_array = System.currentTimeMillis();     
        for(int i = 0 ; i<10000 ; i++){
       array.remove(99999-i);
       
        }
       
       stop_array = System.currentTimeMillis();     
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");
       start_linked = System.currentTimeMillis();     
       for(int i = 0 ; i<10000 ; i++){      
       linked.remove(99999-i);
       }    
       stop_linked = System.currentTimeMillis();     
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");
       
       
       System.out.println("\n\nEksperyment 7: Pobieranie elementu z początku listy: \n");
        start_array = System.currentTimeMillis();
        
        for(int i = 0 ; i<10000 ; i++){
       array.get(0);
       
        }
       
       stop_array = System.currentTimeMillis();
       
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");
       start_linked = System.currentTimeMillis();
       
       for(int i = 0 ; i<10000 ; i++){
       
       linked.get(0);
       }
       
       stop_linked = System.currentTimeMillis();
       
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");

       System.out.println("\n\nEksperyment 8: Pobieranie elementu ze środeka listy: \n");
        start_array = System.currentTimeMillis();
        
        for(int i = 0 ; i<10000 ; i++){
       array.get(45000);
       
        }
       
       stop_array = System.currentTimeMillis();
       
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");
        
       
        start_linked = System.currentTimeMillis();
       
       for(int i = 0 ; i<10000 ; i++){
       
       linked.get(45000);
       }
       
       stop_linked = System.currentTimeMillis();
       
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");

       System.out.println("\n\nEksperyment 9: Pobieranie elementu z konca listy: \n");
        start_array = System.currentTimeMillis();
        
        for(int i = 0 ; i<10000 ; i++){
       array.get(89999);
       
        }
       
       stop_array = System.currentTimeMillis();
       
       System.out.println("Czas wykonania ArrayListy:"+(stop_array-start_array)+" 1/10000ms");
        
       
        start_linked = System.currentTimeMillis();
       
       for(int i = 0 ; i<10000 ; i++){
       
       linked.get(89999);
       }
       
       stop_linked = System.currentTimeMillis();
       
       System.out.println("Czas wykonania LinkedListy:"+(stop_linked-start_linked)+" 1/10000ms");

       
       
       
       
       
    }
    
}
