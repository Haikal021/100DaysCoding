public class day17 {
    public static void main(String[] args) {
        int Penjumlahan = tambah(5, 3);
        System.out.println("Hasil penjumlahan: " + Penjumlahan);

        double Perkalian = kali(4.0, 2.5);
        System.out.println("Hasil perkalian: " + Perkalian);

        String kataSambung = sambung("kata ", "sambung");
        System.out.println("Hasil penggabungan string: " + kataSambung);
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static String sambung(String str1, String str2) {
        return str1 + str2;
    }
}
