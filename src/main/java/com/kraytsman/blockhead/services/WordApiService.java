package com.kraytsman.blockhead.services;

import com.kraytsman.blockhead.domain.entities.Word;
import com.wordsapi.www.ApiException;

import java.io.IOException;

public interface WordApiService {

    Word getRandomWord() throws IOException, ApiException;

}
