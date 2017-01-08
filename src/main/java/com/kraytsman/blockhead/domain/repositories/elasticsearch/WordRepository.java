package com.kraytsman.blockhead.domain.repositories.elasticsearch;

import com.kraytsman.blockhead.domain.entities.Word;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends ElasticsearchCrudRepository<Word, String> {
}
