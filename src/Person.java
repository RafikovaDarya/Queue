public class Person {
    protected String name;
    protected String surname;
    protected int numOfTickets;

    public Person(String name, String surname, int numOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numOfTickets = numOfTickets;
    }



    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public String toString() {
        return name + " " + surname;
    }

}
