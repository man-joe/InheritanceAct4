public class Main {
    public static void main(String[] args) {
        Book b = new Book("J.K Rowling", 800);
        b.setCode("HP1");
        b.setDescription("Your a Wizard HARRY!");
        b.setPrice(12.50);
        System.out.println(b.toString());

        Software s = new Software("Joe", "PC", "Windows");
        s.setCode("PC1");
        s.setDescription("Joe's PC");
        s.setPrice(1010.15);
        System.out.println(s.toString());

    }
}
