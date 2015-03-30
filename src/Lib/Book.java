package Lib;


public class Book {
    private int id ;
    private String title ;
    private String autor ;
    private String publishing_house ;
    private int year ;
    private int pages ;
    private float prise;
    public Book (){
        id = 0;
        title="" ;
        autor="";
        publishing_house="";
        year=0;
        pages=0;
        prise=0.0F;
    }
    public int getId (){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAutor(){
        return autor;
    }
    public String getPublishing_house(){
        return publishing_house;
    }
    public int getYear(){
        return year;
    }
    public int getPages(){
        return pages;
    }
    public float getPrise(){
        return prise;
    }
    public void setId(int n ){
        id=n;
    }
    public void setTitle(String t){
        title=t;
    }
    public void setAutor(String a){
        autor=a;
    }
    public void setPublishing_house(String pu){
        publishing_house=pu;
    }
    public void setYear(int y){
        year=y;
    }
    public void setPages(int pa){
        pages=pa;
    }
    public void setPrise(float pr){
        prise=pr;
    }
    @Override //переназначаем метод печети
    public String toString() {
        String my = new String();
        return my = " Nomer: " +id + " Nazva: "+title +  " Avtor: "+ autor + " Izdatelstvo: " + publishing_house +
                " Gog: " + year+ " Stranic: "+ pages+ " Cena: "+ prise;
    }
}
