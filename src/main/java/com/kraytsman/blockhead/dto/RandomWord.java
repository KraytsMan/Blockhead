package com.kraytsman.blockhead.dto;

import com.wordsapi.www.model.Result;
import lombok.Data;

import java.util.List;

@Data
public class RandomWord {

    private String word;

    private List<Result> results;

}
