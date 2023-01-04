package co.kr.mono.studydb.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class MusciControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void albumListTest() throws Exception {
        this.mockMvc.perform(get("/albumList/BTS")).andDo(print()); //andDo()는 과정 출력
    }

    @Test
    public void artistTest() throws Exception{
        this.mockMvc.perform(get("/artist/BTS")).andDo(print());
    }
    @Test
    public void songTest() throws Exception{
        this.mockMvc.perform(get("/song/BS1")).andDo(print());
    }

    @Test
    public void ACTest() throws Exception{
        this.mockMvc.perform(get("/AC/BS1")).andDo(print());
    }

    @Test
    public void AllTest() throws Exception{
        this.mockMvc.perform(get("/AllSong/BTS")).andDo(print());
    }
}