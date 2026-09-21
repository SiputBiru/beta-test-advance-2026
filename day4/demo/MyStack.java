public class MyStack {
	private Node top;
	private int size;

	public MyStack() {
		this.head = null;
		this.size = 0;
	}

	public boolean isEmpty() {
        return this.top == null;
    }

	public int getSize() {
        return size;
    }

	public void push(Node newNode) {
		// 1. Sambungkan newNode.next dengan top
		// 2. Update top
		// 3. Update size
	}

	public String pop() {
		// 1. Cek stack apakah kosong
		// 2. Tampung data top di dalam variabel tmp 
		// 3. Geser top ke node sebelah
		// 4. Update size
        return tmp;
	}

	public String peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return null;
        }
        return this.top.data;
    }

	public void display() {
		if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }

        System.out.print("=================================" );
        Node current = top;
        while (current != null) {
            System.out.print("[" + current.data + "]");
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println("=================================");
    }
	}
}
