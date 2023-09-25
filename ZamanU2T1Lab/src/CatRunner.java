public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("A", 1, 1000.0);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("B", 1000, 0.1);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
