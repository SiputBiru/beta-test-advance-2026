public class MyQueue {
	private Node head;
    private Node tail;
    private int size;

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

	public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(Node newNode) {
        // 1. Cek apakah antrian kosong
        // 2. Klo iya isi head sama tail dengan newNode
        // 3. Klo tidak buat newNode sebagai tail
        // 4. Tambah size
    }

    public String dequeue() {
        // 1. Cek apakah antrian kosong
        // 2. Tampung data top di dalam variabel tmp 
        // 3. Geser head ke node sebelah
        // 4. Update size
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return null;
        }
        return head.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }

        System.out.print("=================================");
        Node current = head;
        while (current != null) {
            System.out.print("[" + current.data + "]");
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
}
