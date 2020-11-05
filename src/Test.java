public class Test {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", 25, "1234567890");
        System.out.println(person);
        person.setAge(-10);
        System.out.println(person);
    }
}
