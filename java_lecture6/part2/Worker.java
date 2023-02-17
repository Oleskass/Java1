package java_lecture6.part2;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    // переопределяем базовое поведение toString()
    @Override
    public String toString() {
        return String.format("%d. %s %s, %dRUB", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
