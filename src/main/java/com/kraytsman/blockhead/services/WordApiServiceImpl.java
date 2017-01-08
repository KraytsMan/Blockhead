package com.kraytsman.blockhead.services;

import com.kraytsman.blockhead.domain.entities.Word;
import com.kraytsman.blockhead.dto.RandomWord;
import com.squareup.okhttp.Call;
import com.wordsapi.www.ApiClient;
import com.wordsapi.www.ApiException;
import com.wordsapi.www.Configuration;
import com.wordsapi.www.Pair;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@Service
@Slf4j
public class WordApiServiceImpl implements WordApiService {

    private String baseUrl;
    private String apiKey;
    private ApiClient apiClient;

    public WordApiServiceImpl(@Value("${wordsApi.baseUrl}") String baseUrl,
                              @Value("${wordsApi.apiKey}") String apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        apiClient = Configuration.getDefaultApiClient();
        apiClient.setBasePath(baseUrl);
    }

    @Override
    public Word getRandomWord() throws IOException, ApiException {
        Call call = apiClient.buildCall("/words", RequestMethod.GET.name(), new ArrayList<Pair>() {{
            add(new Pair("letters", "5"));
            add(new Pair("partOfSpeech", "noun"));
            add(new Pair("random", "true"));
        }}, null, new HashMap<String, String>() {{
            put("X-Mashape-Key", apiKey);
        }}, new HashMap(), new String[]{"Default"});
        return new Word(apiClient.execute(call, RandomWord.class));
    }
}
