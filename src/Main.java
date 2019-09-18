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

        // Overriding methods
        Book b2 = new Book("George R.R. Martin", 800);
        b2.setCode("SongOFIceAndFire");
        b2.setDescription("No one is safe...");
        b2.setPrice(21.30);
        System.out.println(b2.toString());

        Product p = new Product();
        p.setCode("code1");
        p.setDescription("product description");
        p.setPrice(1.00);
        System.out.println(p.toString());

        // Testing equals method...
        if(p.equals("code")) // should fail
            System.out.println("Product 1 passes test");
        else
            System.out.println("Product 1 fails test");

        if(b.equals(b2)) // should fail
            System.out.println("Book 1 is equal to Book 2");
        else
            System.out.println("Book 1 is not equal to Book 2");

        if(s.equals("Joe")) // should pass
            System.out.println("Same Programmer!");
        else
            System.out.println("Not the same Programmer!");

    }
}
