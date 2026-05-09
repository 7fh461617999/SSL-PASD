public class LinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
Student10 std1 = new Student10("001", "Student 1", "TI-1I", 3.89);
Student10 std2 = new Student10("002", "Student 2", "TI-1I", 3.45);
Student10 std3 = new Student10("003", "Student 3", "TI-1I", 3.20);
Student10 std4 = new Student10("004", "Student 4", "TI-1I", 3.00);
sll.print();
sll.addFirst(std4);
sll.print();
sll.addLast(std1);
sll.print();
sll.insertAfter(std3, "Student 4");
sll.insertAt(2, std2);
sll.print();

    }
}
