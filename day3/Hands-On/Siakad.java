import java.util.Scanner;

public class Siakad {

    // Record Mahasiswa (kelamin: true = Laki-laki, false = Perempuan)
    public record Mahasiswa(String nama, String jurusan, boolean kelamin) {}

    // Data Dummy (20 Mahasiswa)
    private static Mahasiswa[] DAFTAR_MAHASISWA = {
        new Mahasiswa("Andi Pratama", "Informatika", true),
        new Mahasiswa("Budi Santoso", "Sistem Informasi", true),
        new Mahasiswa("Citra Lestari", "Informatika", false),
        new Mahasiswa("Dewi Anggraini", "Teknik Elektro", false),
        new Mahasiswa("Eko Prasetyo", "Informatika", true),
        new Mahasiswa("Fani Rahmawati", "Sistem Informasi", false),
        new Mahasiswa("Gilang Ramadhan", "Teknik Elektro", true),
        new Mahasiswa("Hana Maulida", "Informatika", false),
        new Mahasiswa("Indra Kusuma", "Sistem Informasi", true),
        new Mahasiswa("Joko Widodo", "Teknik Elektro", true),
        new Mahasiswa("Kartika Sari", "Informatika", false),
        new Mahasiswa("Lukman Hakim", "Sistem Informasi", true),
        new Mahasiswa("Maya Putri", "Teknik Elektro", false),
        new Mahasiswa("Naufal Rizky", "Informatika", true),
        new Mahasiswa("Olivia Zahrani", "Sistem Informasi", false),
        new Mahasiswa("Putra Siregar", "Teknik Elektro", true),
        new Mahasiswa("Qori Amalia", "Informatika", false),
        new Mahasiswa("Rian Hidayat", "Sistem Informasi", true),
        new Mahasiswa("Siti Nurhaliza", "Teknik Elektro", false),
        new Mahasiswa("Taufik Ismail", "Informatika", true)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tampilkan Rekap");
            System.out.println("3. Cari Data Berdasarkan Nama");
            System.out.println("4. Exit");
            System.out.print("Pilih menu (1-4): ");

            String pilihan = scanner.nextLine().trim();

            switch (pilihan) {
                case "1" -> tampilkanData();
                case "2" -> tampilkanRekap();
                case "3" -> {
                    System.out.print("Masukkan nama yang dicari: ");
                    String keyword = scanner.nextLine().trim();
                    cariBerdasarkanNama(keyword);
                }
                case "4" -> {
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    running = false;
                }
                default -> System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }

    /**
     * OBJECTIVE 1: SORTING & GROUPING
     * -------------------------------------------------------------
     * 1. Kelompokkan data mahasiswa berdasarkan jurusannya.
     * 2. Urutkan nama mahasiswa secara ascending (A-Z) pada masing-masing jurusan.
     * 3. Tampilkan data dengan format yang rapi.
     *
     * Contoh Output:
     * =========================================
     * Jurusan: Informatika
     * - Andi Pratama [L]
     * - Citra Lestari [P]
     * - Eko Prasetyo [L]
     * ...
     *
     * Jurusan: Sistem Informasi
     * - Budi Santoso [L]
     * - Fani Rahmawati [P]
     * ...
     * =========================================
     */
    public static void tampilkanData() {
        // TODO: Implementasikan algoritma sorting & grouping di sini
        System.out.println("Under Construction!");
    }

    /**
     * OBJECTIVE 2: AGREGASI & REKAP DATA
     * -------------------------------------------------------------
     * 1. Hitung total seluruh mahasiswa.
     * 2. Hitung jumlah mahasiswa di tiap jurusan.
     * 3. Hitung rincian per jenis kelamin (Laki-laki / Perempuan) di tiap jurusan.
     *
     * Contoh Output:
     * =========================================
     * REKAPITULASI DATA MAHASISWA
     * Total Keseluruhan: 20 Mahasiswa
     *
     * - Informatika: 8 Mahasiswa (L: 5, P: 3)
     * - Sistem Informasi: 6 Mahasiswa (L: 4, P: 2)
     * - Teknik Elektro: 6 Mahasiswa (L: 4, P: 2)
     * =========================================
     */
    public static void tampilkanRekap() {
        // TODO: Implementasikan kalkulasi rekapitulasi data di sini
        System.out.println("Under Construction!");
    }

    /**
     * OBJECTIVE 3: SEARCHING (LIKE / PARTIAL MATCH)
     * -------------------------------------------------------------
     * Saat ini pencarian masih menggunakan exact match (.equalsIgnoreCase).
     *
     * TANTANGAN:
     * Ubah/tingkatkan algoritma agar mendukung pencarian parsial (seperti query SQL: WHERE nama LIKE '%keyword%').
     * Contoh: Pencarian "an" atau "AN" harus memunculkan "Andi Pratama", "Fani Rahmawati", "Gilang Ramadhan", dll.
     */
    public static void cariBerdasarkanNama(String keyword) {
        boolean ditemukan = false;
        System.out.println("\nHasil Pencarian untuk '" + keyword + "':");

        for (Mahasiswa mhs : DAFTAR_MAHASISWA) {
            if (mhs.nama().equalsIgnoreCase(keyword)) {
                String gender = mhs.kelamin() ? "Laki-laki" : "Perempuan";
                System.out.println("- " + mhs.nama() + " | " + mhs.jurusan() + " | " + gender);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data mahasiswa dengan nama '" + keyword + "' tidak ditemukan.");
        }
    }
}
