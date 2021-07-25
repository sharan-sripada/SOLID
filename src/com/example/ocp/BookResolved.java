package com.example.ocp;

import com.example.srp.Book;

public class BookResolved {
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
       HorrorBook hb=new HorrorBook("IT","King",500.0F,2,50);
       System.out.println(hb.getPrice());


    }

}


