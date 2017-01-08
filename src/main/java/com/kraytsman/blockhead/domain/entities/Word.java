package com.kraytsman.blockhead.domain.entities;

import com.kraytsman.blockhead.dto.RandomWord;
import com.wordsapi.www.model.Result;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Column;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@Document(indexName = "blockhead", type = "words")
public class Word {

    public Word(RandomWord randomWord) {
        this.word = randomWord.getWord();
        this.definitions = randomWord.getResults().stream()
                .filter(result -> result.getPartOfSpeech().equals("noun"))
                .map(Result::getDefinition)
                .collect(Collectors.toList());
    }

    @Id
    private String word;

    @Column
    private List<String> definitions;

}
