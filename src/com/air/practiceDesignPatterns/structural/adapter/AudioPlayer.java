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
public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase(MediaType.MP3.toString())){
            System.out.println("Playing mp3 file. Name: "+fileName);
        }else if(audioType.equalsIgnoreCase(MediaType.MP4.toString()) ||
                audioType.equalsIgnoreCase(MediaType.VLC.toString())){
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid Media. "+audioType+" is not supported.");
        }
    }
    
}
