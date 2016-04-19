package org.hypernovae.apis.scrappers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SimpleWikiScrapper {
	public static final String WIKI_BASE_URL = "https://en.wikipedia.org/wiki/";
	public static final String SAMPLE_TOPIC = "Software_architecture";
	
	public static void scrape(String topic) {
		String markedUpContent = getDatas(WIKI_BASE_URL+topic);
		Document doc = Jsoup.parse(markedUpContent);
		String content = doc.select("#mw-content-text > p").first().text();
		System.out.println(content);
	}
	
	public static String doScrape(String topic) {
		String markedUpContent = getDatas(WIKI_BASE_URL+topic);
		Document doc = Jsoup.parse(markedUpContent);
		String content = doc.select("#mw-content-text > p").first().text();
		return content;
	}
	
	public static String getDatas(String url) {
		URL urlInstance = null;
		try {
			urlInstance = new URL(url);
		} catch (MalformedURLException mFEx) {
			System.out.println("An exception occured..." + mFEx.getMessage());
			return "";
		}
		URLConnection connection = null;
		BufferedReader reader = null;
		String output = "";
		try {
			connection = urlInstance.openConnection();
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				output += line;
			}
			reader.close();
		} catch (IOException ioEx) {
			System.out.println("An exception occured while attempting to read the datas..." + ioEx.getMessage());
			return "";			
		}
		return output;		
	}
}