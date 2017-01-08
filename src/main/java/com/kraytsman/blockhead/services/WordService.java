package com.kraytsman.blockhead.services;

import com.kraytsman.blockhead.domain.entities.Word;

public interface WordService {

    Word safe(Word word);

    Iterable<Word> getWords();

}
