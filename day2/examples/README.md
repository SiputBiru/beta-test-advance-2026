# Examples - Linked List Dasar

Contoh linked list sederhana untuk membandingkan konsep yang sama di dua
bahasa: Java dan C.

## Struktur File
- `List.java`: linked list dasar di Java (`BasicNode` + `List`).
- `Node.c`: linked list dasar di C (`Node` + `List` + `initList`).

## Cara Menjalankan

Java:
```
cd examples
javac List.java
```

C:
```
cd examples
cc Node.c -o node
./node
```

## Poin Pembelajaran
- Struktur node dan pointer `next` di Java dan C.
- Perbedaan manajemen memori: reference (Java) vs pointer (C).
