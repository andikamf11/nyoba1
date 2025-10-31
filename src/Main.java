
/**
 * Kelas Main adalah titik awal program penyewaan motor.
 * Program akan membuat objek SewaMotor dan memulai proses penyewaan.
 *
 * @author NamaKamu
 * @version 1.0
 */
public class Main {

    /**
     * Method utama (main) untuk menjalankan program.
     * Membuat objek dari kelas SewaMotor dan memanggil method mulaiSewa().
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        SewaMotor sewa = new SewaMotor();
        sewa.mulaiSewa();
    }
}
