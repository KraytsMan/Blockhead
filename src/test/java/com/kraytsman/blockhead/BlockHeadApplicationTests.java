package com.kraytsman.blockhead;

import com.kraytsman.blockhead.services.WordApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlockHeadApplicationTests {

	@Autowired
	private WordApiService wordApiService;

	@Test
	public void contextLoads() throws IOException {
		wordApiService.getRandomWord();
	}

}
