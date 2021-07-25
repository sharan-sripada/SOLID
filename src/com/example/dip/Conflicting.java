package com.example.dip;
class FrontEnd{
    void codeJavascript(){
        System.out.println("coding Javascript");
    }
}
class BackEnd{
    void codeJava(){
        System.out.println("coding Java");
    }
}
public class Conflicting {
    public static void main(String[] args){
    FrontEnd frontEnd=new FrontEnd();
    BackEnd backEnd=new BackEnd();
    frontEnd.codeJavascript();
    backEnd.codeJava();
    }

}
