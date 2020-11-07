/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116416.latihan32.daftarfilm;

/**
 *
 * @author user
 * NAMA     : riyan bahar
 * KELAS    : IF-2
 * NIM      : 10116416
 */
public class Film {
  String nama;
    String genre;
    Double rating;
    int duration;
    
    public void nowPlaying(String genre,String nama , Double rating ,int duration){
     System.out.println("Hallo everyone ");
     System.out.println("Judul Film: " +nama );
     System.out.println("Genre Film : "+genre);
     System.out.println("Rating Film : "+rating);
     System.out.println("Duration Film : "+duration+ " Menit");
     System.out.println("");
     System.out.println("Developed by RiyanBahar");
    
    }
}
