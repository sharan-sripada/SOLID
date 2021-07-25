package com.example.dip;
interface  Ibook{
    String getName();
    String getAuthor();
    float getPrice();
    int getQuantity();
    float getPrice(int quantity);
}
public class BookResolved implements  Ibook{
    String name;
    String author;
    float price;
    int quantity;
    BookResolved(String name, String author, float price, int quantity){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public float getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public float getPrice(int quantity){
        return price*quantity;
    }


}
class add_Quant{
    void addQuantity(BookResolved book1, int quantity){
        book1.quantity+=quantity;

    }
}

class thriller_book implements Ibook {
    int discount;
    String name;
    String author;
    float price;
    int quantity;
    thriller_book(String name, String author, float price, int quantity,int discount){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
        this.discount=discount;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }

    public int getQuantity(){
        return quantity;
    }


    public float getPrice(){
        return price-discount;
    }
    public float getPrice(int quantity){
        return (price-discount)*quantity;
    }


}


