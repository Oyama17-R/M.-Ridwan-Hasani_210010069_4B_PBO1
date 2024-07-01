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
public class SepedaDetail extends Sepeda {

    public SepedaDetail(String type, String jenis) {
        super(type, jenis);
    }

    // Override method untuk mendapatkan deskripsi berdasarkan tipe sepeda
    public String getDeskripsi() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "gunung":
                return "Sepeda gunung yang kuat dan tangguh.";
            case "balap":
                return "Sepeda balap yang ringan dan cepat.";
            case "lipat":
                return "Sepeda lipat yang praktis dan mudah dilipat.";
            case "kota":
                return "Sepeda kota yang nyaman untuk perjalanan sehari-hari.";
            case "hybrid":
                return "Sepeda hybrid yang kombinasi antara sepeda gunung dan sepeda kota.";
            case "bmx":
                return "Sepeda BMX untuk trik dan performa di lintasan off-road.";
            case "elektrik":
                return "Sepeda elektrik dengan motor listrik untuk bantuan saat mengayuh.";
            default:
                return "Deskripsi tidak tersedia untuk tipe sepeda ini.";
        }
    }

    // Override method untuk mendapatkan jumlah stok berdasarkan tipe sepeda
    public int getStok() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "gunung":
                return 20;
            case "balap":
                return 10;
            case "lipat":
                return 8;
            case "kota":
                return 45;
            case "hybrid":
                return 30;
            case "bmx":
                return 55;
            case "elektrik":
                return 34;
            default:
                return 0;
        }
    }

    // Override method untuk mendapatkan harga jual berdasarkan tipe sepeda
    public double getHarga() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "gunung":
                return 4500000;
            case "balap":
                return 7500000;
            case "lipat":
                return 3000000;
            case "kota":
                return 4500000;
            case "hybrid":
                return 4500000;
            case "bmx":
                return 2250000;
            case "elektrik":
                return 10000000;
            default:
                return 0;
        }
    }

    // Override method displayInfo() untuk menampilkan informasi lengkap sepeda
    @Override
    public String displayInfo() {
        return super.displayInfo() + "\n" +
               "Deskripsi: " + getDeskripsi() + "\n" +
               "Stok: " + getStok() + "\n" +
               "Harga Jual: Rp " + String.format("%.2f", getHarga());
    }
}




