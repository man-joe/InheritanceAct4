public class Book extends Product {

    private String author;
    private int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public Book(String author, int pages){
        this.author = author;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object book) {
        Book tmp = (Book) book;
        if(this.author.equals(tmp.getAuthor()) && (this.pages == tmp.getPages()))
            return true;
        return false;
    }
}