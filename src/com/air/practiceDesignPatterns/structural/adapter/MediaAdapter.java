/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.air.practiceDesignPatterns.structural.adapter;

/**
 *
 * @author AIR
 */
public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;
    
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase(MediaType.VLC.toString())){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase(MediaType.MP4.toString())){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase(MediaType.VLC.toString())){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase(MediaType.MP4.toString())){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
    
}
