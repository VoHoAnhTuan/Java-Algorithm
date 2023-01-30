package List.SinglyLinkedList;

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
        System.out.println("\n" + list.getSize());
        System.out.println(list.isEmpty());

        list.removeFromFront();
        list.printList();
        System.out.println("\n" + list.getSize());
    }
}
