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
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "mp3.mp3");
        audioPlayer.play("mp4", "mp4.mp4");
        audioPlayer.play("vlc", "vlc.vlc");
        audioPlayer.play("avi", "avi.avi");
    }
   
}
