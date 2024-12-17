/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_GUI;

/**
 *
 * @author Asus
 */
public class Product {
   public String name;
    public int harga;

    public Product(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return harga;
    }
}
