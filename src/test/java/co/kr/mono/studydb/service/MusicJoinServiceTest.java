package co.kr.mono.studydb.service;

import co.kr.mono.studydb.model.music.Album;
import co.kr.mono.studydb.model.music.Artist;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.plaf.PanelUI;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MusicJoinServiceTest {

    @Autowired
    MusicJoinService musicJoinService;

    ObjectMapper mapper;

    @BeforeEach
    void setup() {mapper = new ObjectMapper();}

    @Test
    @DisplayName("Album에 담긴 노래목록 조회")
    public void albumList() throws JsonProcessingException {
        List<Album> albumList = musicJoinService.searchArtistList("BTS");
        log.info("Json 변환 : ", mapper.writeValueAsString(albumList));
    }
    @Test
    @DisplayName("Album에 담긴 노래목록 조회")
    public void searchArtist() throws JsonProcessingException {
        Artist artist = musicJoinService.searchArtist("BTS");
        log.info("Json 변환 : {}", mapper.writeValueAsString(artist));
    }

    @Test
    @DisplayName("Album")
    public void searchSongs() throws JsonProcessingException {
        List<Album> songList = musicJoinService.searchSongs("BS1");
        log.info("Json 변환 : {}", mapper.writeValueAsString(songList));
    }

    @Test
    @DisplayName("AC")
    public void searchAC() throws JsonProcessingException {
        List<Album> songList = musicJoinService.searchAC("BS1");
        log.info("Json 변환 : {}", mapper.writeValueAsString(songList));
    }

    @Test
    @DisplayName("AllSong")
    public void searchAllSong() throws JsonProcessingException {
        List<Artist> songList = musicJoinService.searchAll("BTS");
        log.info("Json 변환 : {}", mapper.writeValueAsString(songList));
    }
}