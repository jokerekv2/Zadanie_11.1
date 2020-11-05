public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        throwNameExceptionIf(firstName, lastName);
        throwAgeExceptionIf(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        throwNameExceptionIf(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        throwNameExceptionIf(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        throwAgeExceptionIf(age);
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private void throwAgeExceptionIf(int age) throws IncorrectAgeException {
        if (age < 1)
            throw new IncorrectAgeException("Podany wiek jest mniejszy od jeden, a nie powinien.");
    }

    private void throwNameExceptionIf(String firstName, String lastName) throws NameUndefinedException {
        if (firstName == null || lastName == null) {
            throw new NameUndefinedException("Imię lub nazwisko jest nullem!");
        } else if (firstName.length() < 2 || lastName.length() < 2) {
            throw new NameUndefinedException("Imię lub nazwisko mają mniej niż dwa znaki!");
        }
    }

    private void throwNameExceptionIf(String name) throws NameUndefinedException {
        if (name == null) {
            throw new NameUndefinedException("Imię lub nazwisko jest nullem!");
        } else if (name.length() < 2) {
            throw new NameUndefinedException("Imię lub nazwisko mają mniej niż dwa znaki!");
        }
    }
}
