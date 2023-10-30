import java.util.Scanner;

/**
 * Kelas Trapesium digunakan untuk menghitung luas dan keliling trapesium.
 */
public class Main {

    /**
     * Metode ini menghitung luas trapesium.
     *
     * @param sisiAtas Panjang sisi atas trapesium.
     * @param sisiBawah Panjang sisi bawah trapesium.
     * @param tinggi   Tinggi trapesium.
     * @return Luas trapesium.
     */
    public static double hitungLuas(double sisiAtas, double sisiBawah, double tinggi) {
        return (sisiAtas + sisiBawah) * tinggi / 2;
    }

    /**
     * Metode ini menghitung keliling trapesium.
     *
     * @param sisiAtas Panjang sisi atas trapesium.
     * @param sisiBawah Panjang sisi bawah trapesium.
     * @param sisiKiri Panjang sisi kiri trapesium.
     * @param sisiKanan Panjang sisi kanan trapesium.
     * @return Keliling trapesium.
     */
    public static double hitungKeliling(double sisiAtas, double sisiBawah, double sisiKiri, double sisiKanan) {
        return sisiAtas + sisiBawah + sisiKiri + sisiKanan;
    }

    /**
     * Metode utama untuk menjalankan program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi atas trapesium: ");
        double sisiAtas = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi bawah trapesium: ");
        double sisiBawah = scanner.nextDouble();

        System.out.print("Masukkan tinggi trapesium: ");
        double tinggi = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi kiri trapesium: ");
        double sisiKiri = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi kanan trapesium: ");
        double sisiKanan = scanner.nextDouble();

        // Menghitung luas trapesium
        double luas = hitungLuas(sisiAtas, sisiBawah, tinggi);

        // Menghitung keliling trapesium
        double keliling = hitungKeliling(sisiAtas, sisiBawah, sisiKiri, sisiKanan);

        // Menampilkan hasil
        System.out.println("Luas trapesium adalah: " + luas);
        System.out.println("Keliling trapesium adalah: " + keliling);

        scanner.close();
    }
}
