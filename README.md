# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan penjualan sepeda menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa type dan jenis sepeda, dan memberikan output berupa informasi detail dari jenis tersebut seperti deskripsi sepeda, stok, dan harga.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Sepeda`, `SepedaDetail`, dan `SepedaMain` adalah contoh dari class.

```bash
public class Sepeda {
    ...
}

public class SepedaDetail extends Sepeda {
    ...
}

public class SepedaMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
spd[0] = new SepedaDetail(type, jenis);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `type` dan `jenis` adalah contoh atribut.

```bash
String type;
String jenis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Sepeda` dan `SepedaDetail`.

```bash
public class Sepeda {
    // Atribut
    private String type;
    private String jenis;
    

    // Constructor
    public Sepeda(String type, String jenis) {
        this.type = type;
        this.jenis = jenis;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setType` dan `setJenis` adalah contoh method mutator.

```bash
 public void setType(String type) {
        this.type = type;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getType`, `getJenis`, `getDeskripsi`, `getStok`, dan `getHarga` adalah contoh method accessor.

```bash
public String getType() {
        return type;
    }

    public String getJenis() {
        return jenis;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `type` dan `jenis` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash

```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SepedaDetail` mewarisi `Sepeda` dengan sintaks `extends`.

```bash
public class SepedaDetail extends Sepeda {
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Sepeda` merupakan overloading method `displayInfo` dan `displayInfo` di `SepedaDetail` merupakan override dari method `displayInfo` di `Sepeda`.

```bash
public String displayInfo(int stok) {
        StringBuilder sb = new StringBuilder();
        sb.append(displayInfo()); // Memanggil versi displayInfo() tanpa parameter
        sb.append("Jumlah Stok: ").append(stok).append("\n");
        return sb.toString();
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan `switch` dalam method `getDeskripsi`, `getStok`, dan `getHarga`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.



12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
(Scanner scanner = new Scanner(System.in) // Menutup scanner
        ) {
            System.out.println("=== Aplikasi Informasi Sepeda ===");

            System.out.print("Masukkan Type Sepeda: ");
            String type = scanner.nextLine();

            System.out.print("Masukkan Jenis Sepeda: ");
            String jenis = scanner.nextLine(); // Consume newline
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SepedaDetail[] spd = new SepedaDetail[1];` adalah contoh penggunaan array.

```bash
SepedaDetail[] spd = new SepedaDetail[1];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan data yang benar.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    0    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    0    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **90**  |

## Pembuat

Nama: M. Ridwan Hasani
NPM: 2210010069
