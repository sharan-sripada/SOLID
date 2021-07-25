package com.example.srp;

public class Book {
    String name;
    String author;
    float price;
    int quantity;
    Book(String name, String author, float price, int quantity){
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
    void addQuantity(int additional_quantity){
        quantity+=additional_quantity;
    }
    float getPrice(int quantity){
        return price*quantity;
    }


public  static void main(String[] args){
        Book b=new Book("crime and punishment","Dostoevsky", 450.0F,1);
        System.out.println("Author: "+b.getAuthor()+" price: "+b.getPrice());
        System.out.println("Quantity: "+b.getQuantity());
        b.addQuantity(2);
    System.out.println("New Quantity: "+b.getQuantity());


}

}

