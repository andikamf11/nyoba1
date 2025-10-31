/**
 * Kelas utama yang menjalankan program Sistem Sewa Motor.
 * <p>
 * Program ini memanggil kelas {@link SewaMotor} untuk memulai proses penyewaan motor.
 * Ketika dijalankan, program akan menampilkan informasi motor yang disewa serta
 * rincian data sesuai logika yang ada pada kelas {@code SewaMotor}.
 * </p>
 *
 * <p><b>Fungsi utama:</b></p>
 * <ul>
 *   <li>Membuat objek dari kelas {@code SewaMotor}</li>
 *   <li>Memanggil method {@code mulaiSewa()} untuk memulai proses penyewaan</li>
 * </ul>
 *
 * @author Andika
 * @version 1.0
 * @since 2025-10-30
 */
public class Main {

    /**
     * Method utama (entry point) dari program.
     * <p>
     * Method ini akan membuat objek dari kelas {@link SewaMotor} dan memanggil
     * method {@code mulaiSewa()} untuk menjalankan proses penyewaan motor.
     * </p>
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        SewaMotor sewa = new SewaMotor();
        sewa.mulaiSewa();
    }
}
