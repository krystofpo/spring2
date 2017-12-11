package kry.spring1.controller;


import kry.spring1.biz.Note;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Mario on 10.12.2017.
 */
@RequestMapping(value="/")
@Controller
public class NoteController {

    @RequestMapping(value="/note/{id}", method= RequestMethod.GET)
    public @ResponseBody Note findOne (@PathVariable("id") Long id) {
       return new Note();
    }

}
