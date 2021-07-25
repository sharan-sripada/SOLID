package com.example.ocp;

class HorrorBook extends  BookResolved{
    int discount;
    HorrorBook(String name, String author, float price, int quantity, int discount) {
        super(name, author, price, quantity);
        this.discount=discount;
    }
    float getPrice( ){
        return price-discount;
    }
    float getPrice(int quantity){
        return (price-discount)*quantity;
    }

}

