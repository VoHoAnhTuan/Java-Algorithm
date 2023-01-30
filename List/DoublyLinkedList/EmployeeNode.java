package List.DoublyLinkedList;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode prev;


    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return this.next;
    }

    public void setNext(EmployeeNode head) {
        this.next = head;
    }

    public EmployeeNode getPrev() {
        return this.prev;
    }

    public void setPrev(EmployeeNode prev) {
        this.prev = prev;
    }


    @Override
    public String toString() {
        return employee.toString();
    }


}