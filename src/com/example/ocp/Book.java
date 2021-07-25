package com.example.ocp;

public class Book {
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


    public  static void main(String[] args){
       Book horrorBook=new Book("IT","King",500.0F,2);
        System.out.println(horrorBook.getPrice());


    }
}