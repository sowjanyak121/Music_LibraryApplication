/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
@RestController
public class SongController{
    SongService service=new SongService();
    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return service.getSongs();
    }
    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId){
        return service.getSongById(songId);
    }
    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return service.addSong(song);
    }
    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId,@RequestBody Song song){
        return service.updateSong(songId,song);
    }
    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        service.deleteSong(songId);
    }
}