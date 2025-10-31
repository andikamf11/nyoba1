# 🏍️ Sistem Sewa Motor

## 🧩 Deskripsi
Program ini merupakan aplikasi sederhana berbasis *Java Console* yang digunakan untuk mengelola data penyewaan motor.  
Program menerapkan konsep **Object-Oriented Programming (OOP)** seperti *abstraction*, *interface*, *inheritance*, dan *polymorphism*.  
Melalui program ini, pengguna dapat melihat informasi motor yang disewa, seperti nama motor, plat nomor, dan harga sewa per hari.  
Kode ditulis menggunakan bahasa Java dan dibagi menjadi beberapa kelas agar lebih terstruktur dan mudah dikembangkan.

---

## ⚙ Struktur Program
Program terdiri dari beberapa kelas berikut:

1. **AbstractMotor.java**
    - Kelas abstrak yang berisi atribut dasar motor seperti nama, plat nomor, dan harga sewa per hari.
    - Memiliki method abstrak `tampilkanInfo()` yang harus diimplementasikan oleh subclass.

2. **displayMotor.java**
    - Sebuah *interface* yang berfungsi sebagai kontrak untuk menampilkan informasi motor.
    - Wajib diimplementasikan oleh kelas yang menggunakannya.

3. **Motor.java**
    - Kelas turunan dari `AbstractMotor` yang juga mengimplementasikan `displayMotor`.
    - Mengisi logika method `tampilkanInfo()` untuk menampilkan detail motor.

4. **SewaMotor.java**
    - Kelas yang menangani proses penyewaan motor dan memanggil data motor yang tersedia.

5. **Main.java**
    - Kelas utama yang menjalankan program.
    - Membuat objek `SewaMotor` dan memanggil method `mulaiSewa()` untuk memulai simulasi penyewaan.

---

## 💡 Fitur Utama
✅ Menampilkan informasi detail motor (nama, plat nomor, harga per hari)  
✅ Menggunakan konsep *Abstraction* dan *Interface*  
✅ Mengimplementasikan *Inheritance* dan *Polymorphism*  
✅ Struktur program rapi dan mudah dikembangkan

---

## 🧮 Alur Program
1. Program dijalankan dari kelas **Main.java**.
2. Sistem memanggil kelas **SewaMotor** untuk memulai proses sewa.
3. Kelas **Motor** menampilkan data motor seperti nama, plat nomor, dan harga per hari.
4. Program menampilkan hasil akhir berupa informasi lengkap motor yang disewa.

---

## 🚀 Cara Menjalankan Program

1. **Buka terminal / CMD**
2. Arahkan ke folder proyek:
   ```bash
   cd src
# 🏍️ Sistem Sewa Motor

## 🧩 Deskripsi
Program ini merupakan aplikasi sederhana berbasis *Java Console* yang digunakan untuk mengelola data penyewaan motor.  
Program menerapkan konsep **Object-Oriented Programming (OOP)** seperti *abstraction*, *interface*, *inheritance*, dan *polymorphism*.  
Melalui program ini, pengguna dapat melihat informasi motor yang disewa, seperti nama motor, plat nomor, dan harga sewa per hari.  
Kode ditulis menggunakan bahasa Java dan dibagi menjadi beberapa kelas agar lebih terstruktur dan mudah dikembangkan.

---

## ⚙ Struktur Program
Program terdiri dari beberapa kelas berikut:

1. **AbstractMotor.java**
    - Kelas abstrak yang berisi atribut dasar motor seperti nama, plat nomor, dan harga sewa per hari.
    - Memiliki method abstrak `tampilkanInfo()` yang harus diimplementasikan oleh subclass.

2. **displayMotor.java**
    - Sebuah *interface* yang berfungsi sebagai kontrak untuk menampilkan informasi motor.
    - Wajib diimplementasikan oleh kelas yang menggunakannya.

3. **Motor.java**
    - Kelas turunan dari `AbstractMotor` yang juga mengimplementasikan `displayMotor`.
    - Mengisi logika method `tampilkanInfo()` untuk menampilkan detail motor.

4. **SewaMotor.java**
    - Kelas yang menangani proses penyewaan motor dan memanggil data motor yang tersedia.

5. **Main.java**
    - Kelas utama yang menjalankan program.
    - Membuat objek `SewaMotor` dan memanggil method `mulaiSewa()` untuk memulai simulasi penyewaan.

---

## 💡 Fitur Utama
✅ Menampilkan informasi detail motor (nama, plat nomor, harga per hari)  
✅ Menggunakan konsep *Abstraction* dan *Interface*  
✅ Mengimplementasikan *Inheritance* dan *Polymorphism*  
✅ Struktur program rapi dan mudah dikembangkan

---

## 🧮 Alur Program
1. Program dijalankan dari kelas **Main.java**.
2. Sistem memanggil kelas **SewaMotor** untuk memulai proses sewa.
3. Kelas **Motor** menampilkan data motor seperti nama, plat nomor, dan harga per hari.
4. Program menampilkan hasil akhir berupa informasi lengkap motor yang disewa.

---

## 🚀 Cara Menjalankan Program

1. **Buka terminal / CMD**
2. Arahkan ke folder proyek:
   ```bash
   cd src
