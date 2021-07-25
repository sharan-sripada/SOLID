package com.example.isp;
interface VideoPlayer {
    public void playVideo();}

interface AudioPlayer{
    public void playAudio();
}

class VLCplayer implements VideoPlayer,AudioPlayer {

    public void playAudio() {
        System.out.println("VLC: Playing audio");

    }
    public void playVideo() {
        System.out.println("VLC: Playing video");

    }
}
class Grooveplayer implements AudioPlayer {

    public void playAudio() {
        System.out.println("Groove: Playing audio");

    }
}
public class Resolved {
    public static void main(String[] args){
        VLCplayer vlcplayer=new VLCplayer();
        vlcplayer.playAudio();
        vlcplayer.playVideo();


        Grooveplayer grooveplayer=new Grooveplayer();
        grooveplayer.playAudio();
    }
}
