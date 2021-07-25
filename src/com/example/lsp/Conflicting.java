package com.example.lsp;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

interface  MediaPlayer {

    public abstract void playAudio() ;
    public void playVideo() ;
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
        throw  new UnsupportedOperationException();
    }

    @Override
    public void playAudio() {
        System.out.println("Groove: Playing audio");

    }
}
public class Conflicting {
    public static void main(String[] args){

        ArrayList<MediaPlayer> mediaPlayers=new ArrayList<MediaPlayer>();
        mediaPlayers.add(new VLC());
        mediaPlayers.add(new Groove());

        for(MediaPlayer Player : mediaPlayers){
            Player.playAudio();
            //Player.playVideo();
        }
    }

}

