
package ksiazka_adresowa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Robert Waniewski
 */
public class Ksiazka_Adresowa {

    public static void main(String[] args) {   
        List<Person> Ksiazka = new ArrayList<Person>();
        for(int i = 0 ; i<30 ; i++){
        Ksiazka.add(new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowyTelefon()));
        }   
         for(Person person : Ksiazka) {
            System.out.println(person);
        }
        Collections.sort(Ksiazka);
        System.out.println("\nPosortowane: ");  
        for(Person person : Ksiazka) {
            System.out.println(person);
        }
        
    }
    
}
