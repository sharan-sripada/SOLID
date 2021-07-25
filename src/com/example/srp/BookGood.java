package com.example.srp;

public class BookGood {
    String name;
    String author;
    float price;
    int quantity;
    BookGood(String name,String author,float price,int quantity){
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
        BookGood bookGood=new BookGood("crime and punishment","Dostoevsky", 450.0F,1);
        AddQuantity addQuantity=new AddQuantity();

        System.out.println("Author: "+bookGood.getAuthor()+" price: "+bookGood.getPrice());
        System.out.println("Quantity: "+bookGood.getQuantity());

        addQuantity.addQuantity(bookGood,2);
        System.out.println("New Quantity: "+bookGood.getQuantity());


    }

}


