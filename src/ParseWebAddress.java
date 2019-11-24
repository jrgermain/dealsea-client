import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.LinkedList;
import java.util.List;

public class ParseWebAddress {

	private List<String> parsedData;

	public ParseWebAddress(String url, String selector, String keyword) {
		// Get elements from url matching selector
		Document document = parseUrl(url);
		List<Element> results = getItemsFromDocument(document, selector);

		// Get text from elements matching keyword
		List<String> resultText = new LinkedList<>();
		for (Element element : results) {
			String elementText = element.text();
			if (matchesSearch(keyword, elementText)) {
				resultText.add(elementText);
			}
		}
		this.parsedData = resultText;
	}

	public List<String> getParsedData() {
		return this.parsedData;
	}

	private Document parseUrl(String s) {
		try {
			return Jsoup.connect(s).get();
		} catch (Exception e){
			System.err.println(e.getLocalizedMessage());
			return null;
		}
	}

	private Elements getItemsFromDocument(Document document, String selector) {
		if (document == null)
			return new Elements();
		else
			return document.select(selector);
	}

	private boolean matchesSearch(String searchQuery, String searchResult) {
		String query = searchQuery.toLowerCase();
		String result = searchResult.toLowerCase();
		return result.contains(query);
	}
}
