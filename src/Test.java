public class Test {
    public static void main(String[] args) {
        Person person;
        try {
            person = new Person("Jan", "null", 25, "249167");
            System.out.println(person);
            person.setAge(-10);
            System.out.println(person);
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage() + "\nKoniec programu.");
        }

    }
}
