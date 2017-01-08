package com.kraytsman.blockhead.services;

import com.kraytsman.blockhead.domain.entities.Word;
import com.kraytsman.blockhead.domain.repositories.elasticsearch.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;

    @Autowired
    public WordServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public Word safe(Word word) {
        return this.wordRepository.save(word);
    }

    @Override
    public Iterable<Word> getWords() {
        return this.wordRepository.findAll();
    }

}
