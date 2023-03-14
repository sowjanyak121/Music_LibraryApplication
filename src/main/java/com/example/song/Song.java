// Write your code here
package com.example.song;
public class Song{
    int songId;
    String songName;
    String lyricist;
    String singer;
    String musicDirector;
    Song(int songId,String songName,String lyricist,String singer,String musicDirector){
        this.songId=songId;
        this.songName=songName;
        this.lyricist=lyricist;
        this.singer=singer;
        this.musicDirector=musicDirector;
    }
    public int getsongId(){
        return songId;
    }
    public void setsongId(int songId){
        this.songId=songId;
    }
    public String getsongName(){
        return songName;
    }
    public void setsongName(String songName){
        this.songName=songName;
    }
    public String getLyricist(){
        return lyricist;
    }
    public void setLyricist(String lyricist){
        this.lyricist=lyricist;
    }
    public String getSinger(){
        return singer;
    }
    public void setSinger(String singer){
        this.singer=singer;
    }
    public String getmusicDirector(){
        return musicDirector;
    }
    public void setmusicDirector(String musicDirector){
        this.musicDirector=musicDirector;
    }   
}