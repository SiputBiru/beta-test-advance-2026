# Day 2 - Aplikasi Catatan: Linked List (Prev / Next Page)

Materi: **Struktur Data - Linked List (Daftar Tertaut)**

## Konsep
Aplikasi ini membaca `notes.txt`, membaginya menjadi beberapa halaman,
lalu menyimpan tiap halaman sebagai **node** dalam **doubly linked list**
(daftar tertaut ganda). Setiap node menyimpan:
- nomor halaman,
- isi teks,
- referensi ke halaman sebelumnya (`prev`),
- referensi ke halaman berikutnya (`next`).

Kursor `current` menunjuk ke halaman yang sedang ditampilkan.
Berpindah halaman hanya menggeser kursor ke `next`/`prev` - operasi O(1).

## Struktur Folder
- `Hands-On/`: aplikasi catatan utama (Java).
- `examples/`: contoh linked list sederhana dalam Java dan C.

Detail tiap folder ada di README masing-masing:
- `Hands-On/README.md`
- `examples/README.md`

## Cara Kompilasi & Menjalankan
```
cd Hands-On
javac *.java
java Main
```
Navigasi: `[n]` maju, `[p]` mundur, `[f]` awal, `[l]` akhir, `[q]` keluar.

## Poin Pembelajaran
- Perbedaan array vs linked list.
- Mengapa prev/next lebih alami dengan doubly linked list.
- Traversal dan penyimpanan kursor (state).
