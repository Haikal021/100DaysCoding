public class day12 {
          public static class Manusia {
                    private String nama;
                    private int umur;

                    public Manusia(String nama, int umur) {
                              this.nama = nama;
                              this.umur = umur;
                    }

                    public String getNama() {
                              return nama;
                    }

                    public int getUmur() {
                              return umur;
                    }
          }

          public static void main(String[] args) {
                    Manusia manusia1 = new Manusia("Haikal", 20);
                    Manusia manusia2 = new Manusia("ikal", 15);
                    System.out.println("Nama: " + manusia1.getNama() + ", Umur: " + manusia1.getUmur());
                    System.out.println("Nama: " + manusia2.getNama() + ", Umur: " + manusia2.getUmur());
          }
}
