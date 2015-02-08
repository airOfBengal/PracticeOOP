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
public enum MediaType {
    MP3,MP4,VLC;
    
    @Override    
    public String toString() {
        switch(this){
            case MP4:
                return "mp4";
            case VLC:
                return "vlc";
            default:
                return "mp3";
        }
    }
}
