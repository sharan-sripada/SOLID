package com.example.dip;

import java.util.ArrayList;
import java.util.List;

interface  Develop{
    void develop();
}
class FrontEndDev implements  Develop{
    public void develop(){
        System.out.println("coding Javascript");
    }
}
class BackEndDev implements Develop{
   public void develop(){
        System.out.println("coding Java");
    }
}

public class Resolved {
    public static void main(String[] args){
        List<Develop> developers=new ArrayList<Develop>();
        developers.add(new BackEndDev());
        developers.add(new FrontEndDev());
        developers.forEach(d->d.develop());
    }
}
