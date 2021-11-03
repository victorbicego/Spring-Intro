package com.devdojo.springtutorial.controllers;

import com.devdojo.springtutorial.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/test")
@Log4j2
@AllArgsConstructor
public class TestController {

    private DateUtil dateUtil;

//    @Autowired
//    private DateUtil dateUtil;

    @GetMapping("/list")
    public List<String> getTestList() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of("Test1", "Test2");
    }
}
