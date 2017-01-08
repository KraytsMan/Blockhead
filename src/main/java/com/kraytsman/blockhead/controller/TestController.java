package com.kraytsman.blockhead.controller;

import com.kraytsman.blockhead.domain.entities.Word;
import com.kraytsman.blockhead.services.WordApiService;
import com.kraytsman.blockhead.services.WordService;
import com.wordsapi.www.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    private final WordApiService wordApiService;
    private final WordService wordService;

    @Autowired
    public TestController(WordApiService wordApiService, WordService wordService) {
        this.wordApiService = wordApiService;
        this.wordService = wordService;
    }

    @RequestMapping
    public void get() throws IOException, ApiException {
        Word randomWord = wordApiService.getRandomWord();
        wordService.safe(randomWord);
        Iterable<Word> words = wordService.getWords();
        words.iterator().forEachRemaining(System.out::println);
    }

}
