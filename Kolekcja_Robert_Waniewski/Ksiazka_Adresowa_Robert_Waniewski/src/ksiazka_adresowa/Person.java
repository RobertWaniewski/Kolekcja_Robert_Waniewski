/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksiazka_adresowa;

import java.util.Date;

/**
 *
 * @author Robert Waniewski
 */
public class Person implements Comparable<Person>{
    String Imie;
    String Nazwisko;
    String Miasto;
    String Kod_Pocztowy;
    String Ulica;
    String Numer_Domu;
    String Telefon;
    
    
    public Person(String Imie, String Nazwisko, String Miasto, String Kod_Pocztowy, String Ulica, String Numer_Domu, String Telefon){
    this.Imie = Imie;
    this.Nazwisko = Nazwisko;
    this.Miasto = Miasto;
    this.Kod_Pocztowy = Kod_Pocztowy;
    this.Ulica = Ulica;
    this.Numer_Domu = Numer_Domu;   
    this.Telefon = Telefon;
    
    }

    public String toString() {
        return "Nazwisko: " +Nazwisko + " Imie: " + Imie+", Adres: " + Kod_Pocztowy + " " + Miasto + Ulica + " " + Numer_Domu + ", "  + ", Tel: " + Telefon;
    }
    
    @Override
    public int compareTo(Person o) {
        int porownaneNazwiska = Nazwisko.compareTo(o.Nazwisko);
 
        if(porownaneNazwiska == 0) {
            return Imie.compareTo(o.Imie);
        }
        else {
            return porownaneNazwiska;
        }
    }
    
}
