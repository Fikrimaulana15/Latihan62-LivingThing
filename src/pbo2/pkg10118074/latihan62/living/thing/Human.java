/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan62.living.thing;

/**
 *
 * @author ASUS
 */
public class Human extends livingthing{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    

    @Override
    public void walk(String nama) {
        System.out.println(nama+" sedang berjalan");
    }

    
    
    
    
}
