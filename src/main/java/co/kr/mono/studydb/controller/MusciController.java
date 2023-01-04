package co.kr.mono.studydb.controller;


import co.kr.mono.studydb.model.AreaSalesDTO;
import co.kr.mono.studydb.model.music.Album;
import co.kr.mono.studydb.model.music.Artist;
import co.kr.mono.studydb.service.MusicJoinService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//httpjsonMessageComporter : json으로 바꿔줌

@RestController //json으로 바꿔줌
@Log4j2
public class MusciController {

    @Autowired
    MusicJoinService musicJoinService;


    @GetMapping("/albumList/{artistId}")
    public List<Album> albumTest(@PathVariable String artistId){
        List<Album> albums = musicJoinService.searchArtistList(artistId);
        log.info(albums);
        return albums;
    }

    @GetMapping("/artist/{artistId}")
    public Artist artist(@PathVariable String artistId){
        Artist artist = musicJoinService.searchArtist(artistId);
        log.info(artist);
        return artist;
    }

    @GetMapping("/song/{albumId}")
    public List<Album> albumSonog(@PathVariable String albumId){
        List<Album> Songs = musicJoinService.searchSongs(albumId);
        log.info(Songs);
        return Songs;
    }

    @GetMapping("/AC/{albumId}")
    public List<Album> AC(@PathVariable String albumId){
        List<Album> Songs = musicJoinService.searchAC(albumId);
        log.info(Songs);
        return Songs;
    }

    @GetMapping("/AllSong/{mstId}")
    public List<Artist> AllSong(@PathVariable String mstId){
        List<Artist> Songs = musicJoinService.searchAll(mstId);
        log.info(Songs);
        return Songs;
    }

    /*@GetMapping("/album")
    public Album albumTest2(@RequestParam String mst_id){
        return albumService.album(mst_id);
    }*/

}
