# Hands-On - Aplikasi Catatan (Linked List)

Aplikasi konsol yang membaca `notes.txt`, membaginya menjadi halaman, lalu
menyimpannya sebagai **doubly linked list**. Setiap halaman menjadi satu
**node** dengan referensi `prev` dan `next`, dan kursor `current` menunjuk
halaman yang sedang ditampilkan.

## Struktur File
- `PageNode.java`: node doubly linked list (nomor halaman, isi, `prev`, `next`).
- `Paginator.java`: membagi teks menjadi halaman (15 baris per halaman).
- `NoteBook.java`: membangun linked list & mengelola navigasi.
- `Main.java`: antarmuka konsol.
- `notes.txt`: teks contoh (dummy).

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
