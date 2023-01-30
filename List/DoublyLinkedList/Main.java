package List.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee tuanVo = new Employee("Tuan", "Vo", 123);
        Employee johnWick = new Employee("John", "Wick", 456);
        Employee johnCena = new Employee("John", "Cena", 789);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(johnCena);
        list.addToFront(tuanVo);
        list.addToFront(johnWick);
        list.printList();

        System.out.println("\n------------------\n");

        Employee bill = new Employee("Bill", "End", 100);
        list.addToEnd(bill);
        list.printList();

        System.out.println("\n------------------\n");

        list.removeFromFront();
        list.printList();

        System.out.println("\n------------------\n");

        list.removeFromEnd();
        list.printList();
    }
}
