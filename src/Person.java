public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null || lastName == null) {
            throw new NameUndefinedException("Imię lub nazwisko jest nullem!");
        } else if (firstName.length() < 2 || lastName.length() < 2) {
            throw new NameUndefinedException("Imię lub nazwisko mają mniej niż dwa znaki!");
        } else if (age < 1) {
            throw new IncorrectAgeException("Podany wiek jest mniejszy od jeden, a nie powinien.");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.pesel = pesel;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException("Podany wiek jest mniejszy od 1, a nie powinien.");
        } else
            this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
