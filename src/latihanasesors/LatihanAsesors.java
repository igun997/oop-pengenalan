/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanasesors;

/**
 *
 * @author SystemFive
 */
public class LatihanAsesors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       data input = new data();
       input.setKelas("SI-5");
       input.setNama("INDRA GUNANDA");
       input.setNim("105151211");
       input.setNilai(80);
       System.out.print("\nNama :"+input.getNama()+"\nNIM :"+input.getNim()+"\nKelas :"+input.getKelas()+"\nNilai :"+input.getIndex());
    }
    
}
