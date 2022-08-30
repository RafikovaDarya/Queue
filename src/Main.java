import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список клиентов парка аттракциона: ");

        Queue<Person> clients = new LinkedList<>(generateClients());
        while (!clients.isEmpty()) {
            Person s = clients.poll();
            int tickets = s.getNumOfTickets();
            s.setNumOfTickets(--tickets);
            System.out.println(s + " прокатился(-лась) на аттракционе. Осталось "
                    + s.getNumOfTickets() + " билет(ов)");
            if (tickets > 0) {
                clients.offer(s);
            }
            if (tickets == 0) {
                System.out.println(s + " сошел(-шла) с аттракциона.");
            }

        }
    }

    public static List<Person> generateClients() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vasya", "Ivanov", 1));
        people.add(new Person("Petya", "Pechkin", 3));
        people.add(new Person("Lina", "Lenina", 2));
        people.add(new Person("Vera", "Sergeeva", 5));
        people.add(new Person("Rita", "Medvedko", 3));
        return people;
    }
}