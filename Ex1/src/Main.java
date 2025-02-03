public class Main {
    public static void main(String[] args) {
        NoGenericMethods words1 = new NoGenericMethods("car", "Pencil", "John");
        NoGenericMethods words2 = new NoGenericMethods("John", "car", "Pencil");
        NoGenericMethods words3 = new NoGenericMethods("Pencil","car", "John");

        System.out.println(words1);
        System.out.println(words2);
        System.out.println(words3);
    }
}