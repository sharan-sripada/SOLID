package com.example.dip;

class Online_payment  {

    boolean payment_made=false;
    int reference_id;
    public void setPayment_made(){
        payment_made=true;

    }
    public boolean paymentmade(){
        return payment_made;
    }
    public void transaction(int id){
        reference_id=id;
        setPayment_made();
    }

}
class Offline_payment  {
    boolean payment_made=false;
    public void setPayment_made(){
        payment_made=true;
    }
    public boolean paymentmade(){
        return payment_made;
    }

}

public class BookConflicting {

    String name;
    String author;
    float price;
    int quantity;
    Online_payment p;
    BookConflicting(String name, String author, float price, int quantity, Online_payment p){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
        this.p=p;
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
    void ordered(){
        if(p.paymentmade() ==false){
            System.out.println("Not ordered yet");
        }
        else {
            System.out.println("Ordered. On the way");
        }
    }
    void onlinepayment(int id){
        p.transaction(id);
    }
    void payment(){
        p.setPayment_made();
    }



    public  static void main(String[] args){
        BookConflicting b=new BookConflicting("crime and punishment","Dostoevsky", 450.0F,1,new Online_payment());
        System.out.println("Author: "+b.getAuthor()+" price: "+b.getPrice());
        System.out.println("Quantity: "+b.getQuantity());
        b.addQuantity(2);
        System.out.println("New Quantity: "+b.getQuantity());
        b.onlinepayment(123);
        b.ordered();



    }

}


