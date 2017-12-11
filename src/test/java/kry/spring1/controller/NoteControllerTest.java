package kry.spring1.controller;

import kry.spring1.biz.Note;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Mario on 11.12.2017.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(NoteController.class)
public class NoteControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
        mockMvc.perform(get("/note/123"))
                .andExpect(status().isOk())
        .andExpect(content().string(containsString("message")))
        .andExpect(content().string(containsString("label")));

    }

}