/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussineslogic;
import java.io.*;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Iniciador {
    
    public static void main(String[] args) {
        
        Persona per1 = new Persona("Andres", 1203323291);
        Persona per2 = new Persona ("Maria", 39735679);
         Persona per3 = new Persona ("Fabian", 123456);
        
        File f = new File ("pets.txt");
        if (f.exists()) {
            try{
                Scanner sc = new Scanner(f);
                
                    
                for (int i = 0; i < 5; i++) {
                    
                
                if(sc.hasNext()){
                    if(sc.next().equals("Dog")){
                        String idp;
                        String np;
                        String cp;
                        String rp;
                        idp = sc.next();
                        np = sc.next();
                        cp = sc.next();
                        rp = sc.next();
                        Perro p1 = new Perro (idp , np, cp, rp);
                        
                        if(sc.next().equals("Andres")){
                            per1.getMascotas().add(p1);
                        }
                        if(sc.next().equals("Maria")){
                            per2.getMascotas().add(p1);
                        }
                        
                        if(sc.next().equals("Fabian")){
                            per3.getMascotas().add(p1);
                        }
                     
                        
                    }
                    
                    if (sc.next().equals(sc))
                }
                }
                
            }catch(FileNotFoundException ex){
                System.out.println("no encontro archivo");
            }
        }
        
        
        
    }
    
}
