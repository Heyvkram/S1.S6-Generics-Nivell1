

public class Main {
    public static void main(String[] args) {
        Person john = new Person ("Jhon", "Connor", 36);

        GenericMethods.args(john, 55.2, "Teapot");
        GenericMethods.args(15, "ball", john);
        GenericMethods.args(new Person("Pepe", "Pepez", 90), john, 2);
    }
}