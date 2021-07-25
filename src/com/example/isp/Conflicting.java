package com.example.isp;
interface MediaPlayer {
    public void playAudio();
    public void playVideo();
}
class VLC implements MediaPlayer {

    public void playAudio() {
        System.out.println("VLC : Playing audio");

    }
    public void playVideo() {
        System.out.println("VLC: Playing video ");

    }
}
class Groove implements MediaPlayer {


    public void playVideo() {
        //throw new VideoNotsupportedException();
    }

    @Override
    public void playAudio() {
        System.out.println("Groove: Playing audio");

    }
}
public class Conflicting {
    public static void main(String[] args){

        VLC vlcplayer=new VLC();
        vlcplayer.playAudio();
        vlcplayer.playVideo();


        Groove grooveplayer=new Groove();
        grooveplayer.playAudio();
    }

}
