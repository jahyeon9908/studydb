package co.kr.mono.studydb.model.music;

import co.kr.mono.studydb.model.music.Artist;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Album {

    @JsonIgnore
    private String albumId;
    @JsonIgnore
    private int albumSeq;
    @JsonIgnore
    private String albumTitle;
    @JsonIgnore
    private String openDate;

    //@JsonIgnore
    //@ToString.Exclude
    private Artist artist;

    //@JsonIgnore //결과값이 널인게 보기 싫어서 json으로 변환 안 함
    //@ToString.Exclude
    private List<Song> songs; //album_id

    private String mstId;

   // 다른 쪽에 넘겨주려고 dto를 작성했던건데 이제 entity(domain)을 쓰기 때문에 dto 안 작성해도 됨
}
