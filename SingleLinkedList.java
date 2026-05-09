public class SingleLinkedList {
    Node10 head;
    Node10 tail;

    boolean isEmpty() {
        return (head == null);
    }

    void print() {
        if (!isEmpty()) {
            Node10 tmp = head;
            System.out.println("LinkedList Data:");
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linklist is empty!!");
        }
    }

    void addFirst(Student10 std) {
        Node10 newNode10 = new Node10(std, null);
        if (isEmpty()) {
            head = newNode10;
            tail = newNode10;
        } else {
            newNode10.next = newNode10;
            head = newNode10;
        }
    }

    void addLast(Student10 std) {
        Node10 newNode10 = new Node10(std, null);
        if (isEmpty()) {
            head = newNode10;
            tail = newNode10;
        } else {
            tail.next = newNode10;
            tail = newNode10;
        }
    }

    void insertAfter(Student10 std, String key) {
        Node10 newNode10 = new Node10(std, null);
        Node10 temp = head;
        do {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newNode10.next = temp.next;
                temp.next = newNode10;
                if (newNode10.next == null) {
                    tail = newNode10;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Student10 std) {
        if (index < 0) {
            System.out.println("Wrong Index!!");
        } else if (index == 0) {
            addFirst(std);
        } else {
            Node10 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node10(std, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    Student10 getData(int idx) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return null;
        }
        Node10 tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    int indexOf(String key){
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return -1;
        }
        Node10 tmp = head;
        int idx =0;
        while (tmp !=null && !tmp.data.name.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }
        if (tmp==null) {
            return -1;
        }else {
            return idx;
        }
    }
    void removeFirst(){
        if (isEmpty()) {
            System.out.println("LinkList is empty!!");
        }else if (head==tail) {
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    void removeLast(){
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        }else if (head==tail) {
            head = tail = null;
        }else{
            Node10 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next=null;
            tail = tmp;
        }
    }
} 
