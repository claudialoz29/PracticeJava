public class CompareCustomObjects {
    public static void main(String[] args){
        Book bookOne = new Book("OCA", 20);
        Book bookTwo = new Book("OCA", 20);
        //when we are comparing two objects with == is false becasuse they are poinnting to diferent objects.
        //comparing the values is bookOne.equals(bookTwo) true

        if(bookOne.equals(bookTwo)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

class Book{
    public String title;
    public int page;

    public Book(String title, int page){
        this.title = title;
        this.page = page;

    }
    @Override
    public boolean equals(Object o){
        Book other = (Book)o;
        return title.equals(other.title) && page == other.page;
    }
    @Override
    public int hashCode(){
        return title.hashCode() + page;
    }
}