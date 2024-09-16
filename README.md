# **ABSTRACT**
Dalam pemrograman berorientasi objek, kelas abstract adalah kelas yang tidak dapat diinstansiasi secara langsung. Kelas ini berisi metode abstract yang belum diimplementasikan.
Kelas abstract digunakan sebagai blueprint untuk kelas-kelas turunan. Kelas turunan harus mengimplementasikan metode abstract yang didefinisikan dalam kelas abstract.

## Source Code dari Kelas Abstract
<pre>
  public abstract class Kendaraan {
    abstract void kendaraan();
    
    public void produksi(){
        System.out.println("aku diproduksi oleh orang pintar");
    }
}
</pre>
Dalam kode ini kita buat class abstract Kendaraan dan buat method abstract yaitu kendaraan(); yang tidak dapat di implementasi, namun dapat di implementasi pada subclass. Dalam kode ini kita juga membuat method biasa yaitu produksi. Metode ini dapat dipanggil oleh objek yang dibuat dari kelas yang mewarisi Kendaraan.


# **OVERRIDE**
Method overriding adalah sebuah situasi dimana method class turunan menimpa method milik parent class. Ini bisa terjadi jika terdapat nama method yang sama baik di child class dan juga parent class.

## Source Code dari Override
<pre>
  public class Motor extends Kendaraan implements Berjalan, Berhenti{
    String warna;
    int jumlahRoda;
    
    public Motor(){
        System.out.println("Halo aku motor");
        super.produksi();
        kendaraan();
    }
    @Override
    void kendaraan(){
         System.out.println("Ini adalah kendaraan");
    }
}
</pre>
Kelas ini bernama Motor dan merupakan subclass dari Kendaraan. Ini berarti Motor mewarisi semua metode dan atribut dari kelas Kendaraan. Pada kelas ini juga terdapat konstruktor maka setiap kali objek dari kelas ini dibuat, pesan "halo aku motor" akan dicetak. Setelah itu, konstruktor memanggil metode produksi() dari kelas induk (Kendaraan) menggunakan super.produksi(). Ini akan mencetak pesan dari metode produksi() di kelas Kendaraan, yaitu "aku diproduksi oleh orang pintar". Dalam kode ini kita mengoverride metode abstrak produksi() dari kelas Kendaran.

# **OVERLOAD**
Method overloading adalah fitur dalam Java yang memungkinkan kita untuk mendefinisikan beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda dalam satu kelas.

## Source Code dari Overload
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
Di dalam kode ini, terdapat tiga metode dengan nama yang sama, yaitu quality, yang menunjukkan method overloading. Setiap metode memiliki parameter yang berbeda, sehingga mereka dapat melakukan tugas yang berbeda:
Metode pertama memberikan informasi umum tentang kualitas.
Metode kedua memberikan pernyataan tentang kualitas tanpa memberikan detail lebih lanjut.
Metode ketiga memberikan informasi spesifik tentang harga motor.
Dengan cara ini, kita bisa menggunakan nama metode yang sama tetapi mendapatkan perilaku yang berbeda sesuai dengan argumen yang diberikan.

# **KELAS UTAMA**
Pada class utama kita akan menjalankan seluruh program yang sudah kita implementasikan pada class yang kita buat

## Source Code :
<pre>
  public static void main(String[] args) {
        Motor motor1 = new Motor(); 
        motor1.start(); 
        motor1.stop();  
        motor1.quality();
        motor1.quality("eksklusif");
        System.out.println(motor1.quality(2000000));
        System.out.println("");
    }
</pre>

## Output :
<pre>
Halo aku motor
aku diproduksi oleh orang pintar
Ini adalah kendaraan
Aku mulai berjalan
Aku sudah berhenti
Kualitas motor tergantung pada perawatan dan penggunaan.
Motor ini berkualitas tinggi
Motor ini dibeli dengan harga 2000000 rupiah
</pre>
