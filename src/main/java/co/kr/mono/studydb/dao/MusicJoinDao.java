package co.kr.mono.studydb.dao;

import co.kr.mono.studydb.model.music.Album;
import java.util.List;

import co.kr.mono.studydb.model.music.Artist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicJoinDao {
    public List<Album> selectArtistByPrimaryKey1(String mst_id);
    public Artist selectArtistByPrimaryKey2(String mst_id);
    public List<Album> selectAlbumByPrimaryKey1(String album_id);
    public List<Album> selectAlbumByPrimaryKey2(String album_id);
    public List<Artist> selectAllSong(String mst_id);
}
