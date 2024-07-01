/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokosepeda;

/**
 *
 * @author asus
 */
public class Sepeda {
    // Atribut
    private String type;
    private String jenis;
    

    // Constructor
    public Sepeda(String type, String jenis) {
        this.type = type;
        this.jenis = jenis;
    }

    // Method Mutator (Setter)
    public void setType(String type) {
        this.type = type;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    

    // Method Accessor (Getter)
    public String getType() {
        return type;
    }

    public String getJenis() {
        return jenis;
    }

    
    
    public String displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(type).append("\n");
        sb.append("Jenis: ").append(jenis).append("\n");
        return sb.toString();
    }

    // polymorphism(overriding)
    public String displayInfo(int stok) {
        StringBuilder sb = new StringBuilder();
        sb.append(displayInfo()); // Memanggil versi displayInfo() tanpa parameter
        sb.append("Jumlah Stok: ").append(stok).append("\n");
        return sb.toString();
    }

   
    
}
