package tokosepeda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SepedaMain {
    public static void main(String[] args) {
        //io
        try (Scanner scanner = new Scanner(System.in) // Menutup scanner
        ) {
            System.out.println("=== Aplikasi Informasi Sepeda ===");

            System.out.print("Masukkan Tipe Sepeda: ");
            String type = scanner.nextLine();

            System.out.print("Masukkan Jenis Sepeda: ");
            String jenis = scanner.nextLine(); // Consume newline

            // Membuat objek SepedaDetail
            SepedaDetail[] spd = new SepedaDetail[1];
            spd[0] = new SepedaDetail(type, jenis);

            // Output informasi sepeda detail
            System.out.println("\nInformasi Sepeda:");
            System.out.println(spd[0].displayInfo());

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan data yang benar.");
        }
    }
}
