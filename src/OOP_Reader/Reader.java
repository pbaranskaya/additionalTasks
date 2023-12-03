package OOP_Reader;

public class Reader {

    static String firstName;
    String lastName;
    String ticketNumber;
    String faculty;
    String date;
    String phoneNumber;

    public Reader() {
        super();
    }

    public Reader (String firstName, String lastName, String ticketNumber,
                   String faculty, String date, String phoneNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }


    public void takeBook(int books){
        System.out.println(lastName + " " + firstName.charAt(0) +" взял " + books + " книги");
    }

    public void takeBook(String...vars) {
        System.out.println(lastName + " " + firstName.charAt(0) + " взял:");
        for (String i : vars) {
            System.out.print(i + " ");
        }
    }

    public void takeBook(Object...vars){ // как помещать объекты
        System.out.println(lastName + " " + firstName.charAt(0) + " взял:");
        for (Object i : vars) {
            System.out.print(i + " ");
        }
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", date='" + date + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
