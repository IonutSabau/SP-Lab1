import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<String> paragraphes = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();
    ArrayList<String> tables = new ArrayList<>();

    public Book(String title){
        if(title!=null) {
            this.title = title;
        }
    }

    public void createNewParagraph(String nameOfParagraph){
        this.paragraphes.add(nameOfParagraph);
    }
    public void createNewImage(String nameOfImage){
        this.images.add(nameOfImage);
    }
    public void createNewTable(String nameOfTable){
        this.images.add(nameOfTable);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getParagraphes() {
        return paragraphes;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public ArrayList<String> getTables() {
        return tables;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Title: "+this.getTitle());
        str.append("\n"+"Paragraphes: ");
        for (String prg : this.getParagraphes()){
            str.append(prg+", ");
        }
        str.append("\n"+"Images: ");
        for (String img : this.getImages()){
            str.append(img+", ");
        }
        str.append("\n"+"Tables: ");
        for (String tbl : this.getTables()){
            str.append(tbl+", ");
        }
        str.append("\n");

        return str.toString();
    }
    public void print(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {

        Book discoTitanic = new Book("Disco Titanic");

        discoTitanic.createNewParagraph("Paragrapg 1");
        discoTitanic.createNewParagraph("Paragraph 2");
        discoTitanic.createNewParagraph("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraph("Paragraph 4");
        discoTitanic.createNewTable("Table 1");
        discoTitanic.createNewParagraph("Paragraph 5");

        discoTitanic.print();

    }
}
