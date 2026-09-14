# Examples - Linked List & Array Dasar

Contoh struktur data sederhana untuk membandingkan konsep yang sama secara
manual dan dengan `java.util`, serta antara Java dan C.

## Struktur File
- `MyLinkedList.java`: single & double linked list, versi manual dan
  `java.util.LinkedList`.
- `List.java`: linked list dasar di Java (`BasicNode` + `List`).
- `Node.c`: linked list dasar di C (`Node` + `List` + `initList`).
- `ArrayCopy.java`: cara manual vs `Arrays.copyOf`.

## Cara Menjalankan

Java:
```
cd examples
javac MyLinkedList.java
java MyLinkedList
```

C:
```
cd examples
cc Node.c -o node
./node
```

## Poin Pembelajaran
- Struktur node dan pointer `next` di Java dan C.
- Perbedaan single vs double linked list (arah traversal).
- Versi manual vs `java.util.LinkedList`.
- Perbedaan manajemen memori: reference (Java) vs pointer (C).
