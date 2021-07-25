package com.example.dip;

public class Book{
    String name;
    String author;
    float price;
    int quantity;
    Book(String name,String author,float price,int quantity){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }
    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }
    float getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }

    float getPrice(int quantity){
        return price*quantity;
    }

}
class add_Quantity{
    void addQuantity(Book book1, int quantity){
        book1.quantity+=quantity;

    }
}

class horror_book  {
    int discount;
    Book b;
    horror_book(Book b,int discount) {
        this.b=b;
        this.discount=discount;
    }
    float getPrice( ){
        return b.price-discount;
    }
    float getPrice(int quantity){
        return (b.price-discount)*quantity;
    }

}
