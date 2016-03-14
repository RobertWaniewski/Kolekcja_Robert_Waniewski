/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksperyment_list;
import java.util.Random;

/**
 *
 * @author Robert Waniewski
 */
public class RandomString {
    
    public static String LosowyWyraz (int dlugosc){
    String wyraz = "";
    int dodawana; 
    int los; 
    Random gen = new Random();
    for (int i = 0; i<dlugosc; i++){
        los = gen.nextInt(10);
        if (los >0 && los <3){   
            dodawana = gen.nextInt(25);
            dodawana = dodawana+65;}
        else if (los > 2 && los <10){
            dodawana = gen.nextInt(25);
            dodawana = dodawana+97;}
        else{
            dodawana = 32;}
        wyraz = wyraz + (char)dodawana;
     }
    
    
    return wyraz;
    }
    
    public static String LosoweImie (){
    String wyraz = "";
    int dodawana; 
    int los; 
    Random gen = new Random();
    
    wyraz = wyraz + ((char)(gen.nextInt(25)+65));
    
    for (int i = 0; i<8; i++){
        dodawana = gen.nextInt(25);
        dodawana = dodawana+97;
        wyraz = wyraz + (char)dodawana;
    }
    return wyraz;}
    
    public static String LosoweNazwisko (){
    String wyraz = "";
    int dodawana; 
    int los; 
    Random gen = new Random();
    
    wyraz = wyraz + ((char)(gen.nextInt(25)+65));
    for (int i = 0; i<12; i++){
        dodawana = gen.nextInt(25);
        dodawana = dodawana+97;
        wyraz = wyraz + (char)dodawana;
    }
    return wyraz;}
    
    public static String LosowyTelefon (){
    String wyraz = "";
    int dodawana; 
    int los; //
    Random gen = new Random();
    
  
    
    for (int i = 0; i<9; i++){
        dodawana = gen.nextInt(10);
        dodawana = dodawana+48;
        wyraz = wyraz + (char)dodawana;
    }
    return wyraz;}
    
    public static String LosowaUlica (){
    String wyraz = "";
    int dodawana; 
    int los; 
    Random gen = new Random();
    
    
    
    wyraz = wyraz + ((char)(gen.nextInt(25)+65));
    for (int i = 0; i<8; i++){
        dodawana = gen.nextInt(25);
        dodawana = dodawana+97;
        wyraz = wyraz + (char)dodawana;
    }
    wyraz = wyraz + " " + ((char)(gen.nextInt(25)+65));
    for (int i = 0; i<13; i++){
        dodawana = gen.nextInt(25);
        dodawana = dodawana+97;
        wyraz = wyraz + (char)dodawana;
    }
    
    return wyraz;}
    
    public static String LosowyNrDomu (){
    String wyraz = "";
    int dodawana;
    int los;
    Random gen = new Random();

    
    for (int i = 0; i<2; i++){
        dodawana = gen.nextInt(10);
        dodawana = dodawana+48;
        wyraz = wyraz + (char)dodawana;
    }
    
    return wyraz;}
    
    public static String LosowyKodPocztowy (){
    String wyraz = "";
    int dodawana; 
    int los;
    Random gen = new Random();
   
    for (int i = 0; i<2; i++){
        dodawana = gen.nextInt(10);
        dodawana = dodawana+48;
        wyraz = wyraz + (char)dodawana;
    }
    wyraz = wyraz + "-";
    for (int i = 0; i<3; i++){
        dodawana = gen.nextInt(10);
        dodawana = dodawana+48;
        wyraz = wyraz + (char)dodawana;
    }
    
    return wyraz;}
    
    public static String LosowaMiejscowosc (){
    String wyraz = "";
    int dodawana; 
    int los;
    Random gen = new Random();
    
    wyraz = wyraz + ((char)(gen.nextInt(25)+65));
    for (int i = 0; i<13; i++){
        dodawana = gen.nextInt(25);
        dodawana = dodawana+97;
        wyraz = wyraz + (char)dodawana;
    }
    
    
    return wyraz;
    }
    
}
