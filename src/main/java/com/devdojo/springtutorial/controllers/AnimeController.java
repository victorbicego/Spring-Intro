package com.devdojo.springtutorial.controllers;

import com.devdojo.springtutorial.domain.Anime;
import com.devdojo.springtutorial.services.AnimeService;
import com.devdojo.springtutorial.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/animes")
@Log4j2
@AllArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;
    private final AnimeService animeService;

//    @Autowired
//    private DateUtil dateUtil;

    @GetMapping("/listall")
    public ResponseEntity<List<Anime>> getTestList() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
//        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id) {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(animeService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Anime> save(@RequestBody Anime anime) {
//        return ResponseEntity.ok(animeService.save(anime));
        return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Anime> delete(@PathVariable long id){
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
