import java.math.BigInteger;

public class day22 {
    public static void main(String[] args) {

        BigInteger bil1 = new BigInteger("1234567890");
        BigInteger bil2 = new BigInteger("9876543210");

        BigInteger hasilPenjumlahan = bil1.add(bil2);
        BigInteger hasilPerkalian = bil1.multiply(bil2);
        
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
}
