/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author ÖZGE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nesne nesne1=Nesne.NesneOlustur();
        Nesne nesne2 = Nesne.NesneOlustur();
        
        System.out.println("----------------------------------------------------");
        
        if(nesne1==nesne2){
            System.out.println("Nesneler aynı");
        }
        else{
            System.out.println("Nesneler aynı değil");
        }
            
        System.out.println("----------------------------------------------------");
        
        System.out.println("Seçilen mail kutusu görünüm ayarları : ");
        nesne1.randomGorunum();
    }
    
}
