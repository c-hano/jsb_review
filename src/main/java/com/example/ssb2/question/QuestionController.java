package com.example.ssb2.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {

    @GetMapping("list")
    public String list() {
        return "question list";
    }
}
