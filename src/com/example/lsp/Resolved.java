package com.example.lsp;

import java.util.ArrayList;
interface AudioPlayer{
    public void playAudio() ;
}

interface VideoMediaPlayer extends  AudioPlayer {


    public void playVideo() ;
}
class VLCplayer implements VideoMediaPlayer {

    public void playAudio() {
        System.out.println("VLC : Playing audio");

    }
    public void playVideo() {
        System.out.println("VLC: Playing video ");

    }
}
class Grooveplayer implements AudioPlayer {

    @Override
    public void playAudio() {
        System.out.println("Groove: Playing audio");

    }
}


public class Resolved {
    public static void main(String[] args){

        ArrayList<AudioPlayer> mediaPlayers=new ArrayList<AudioPlayer>();
        mediaPlayers.add(new VLCplayer());
        mediaPlayers.add(new Grooveplayer());

        for(AudioPlayer Player : mediaPlayers){
            Player.playAudio();
        }
    }
}
