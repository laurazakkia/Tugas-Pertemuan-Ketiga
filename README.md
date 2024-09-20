# 📚 Konsep Pemrograman Berbasis Obyek - Pertemuan Ketiga

---

##  Daftar Isi :
- [ Abstract](#abstract)
- [ Override](#override)
- [ Overload](#overload)
  
---

## Abstract
Kelas abstract adalah kelas yang tidak dapat diinstansiasi secara langsung. Kelas ini berisi metode abstract yang belum diimplementasikan. Kelas turunan harus mengimplementasikan metode abstract yang didefinisikan dalam kelas abstract.

### Source Code dari Kelas Abstract
<pre>
  public abstract class Kendaraan {
    abstract void kendaraan();
  
    public void produksi(){
        System.out.println("aku diproduksi oleh orang pintar");
    }
}
</pre>
- Class abstract Kendaraan dan method abstract kendaraan(); yang tidak dapat di implementasi, namun dapat di implementasi pada subclass. Dalam kode ini juga terdapat method produksi(). Metode ini dapat dipanggil oleh objek yang dibuat dari kelas yang mewarisi Kendaraan.

---

## Override
Overriding adalah subclass yang mendefinisikan ulang sebuah method yang sudah ada di kelas induk.

### Source Code Penerapan Override
<pre>
  public class Motor extends Kendaraan implements Berjalan, Berhenti{
  
    @Override
    void kendaraan(){
         System.out.println("Ini adalah kendaraan");
    }
}
</pre>
- Kelas Motor merupakan subclass dari Kendaraan. Berarti kelas Motor mewarisi semua metode dan atribut dari kelas Kendaraan. Dalam kelas ini mengoverride metode abstrak produksi() dari kelas Kendaran.

---

## Overload 
Overloading adalah ketika mendefinisikan beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda dalam satu kelas.

### Source Code dari Overload
<pre>
  public void quality() {
        System.out.println("Kualitas motor tergantung pada perawatan dan penggunaan.");
    }
    
    public void quality(String eksklusif) {
        System.out.println("Motor ini berkualitas tinggi");
    }
    
    public String quality(int harga) {
        return "Motor ini dibeli dengan harga " + harga + " rupiah";
    }
</pre>
- Terdapat tiga metode dengan nama yang sama, yaitu quality, yang menunjukkan method overloading. Setiap metode memiliki parameter yang berbeda, sehingga mereka dapat melakukan tugas yang berbeda.
