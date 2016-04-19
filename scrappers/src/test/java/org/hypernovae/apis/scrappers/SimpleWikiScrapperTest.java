package org.hypernovae.apis.scrappers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SimpleWikiScrapperTest {
	
	@Test
	public void doScrapeTest() {
		String scrapped = SimpleWikiScrapper.doScrape(SimpleWikiScrapper.SAMPLE_TOPIC);
		assertNotNull(scrapped);
		System.out.println("the scrapped text is: " + scrapped);
	}
	
}
