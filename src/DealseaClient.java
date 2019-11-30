import java.util.List;

public class DealseaClient {

	private static final String DEALSEA_URL = "https://dealsea.com/";
	private static final String DEALSEA_RESULT_SELECTOR = "div.dealcontent > strong > a";

	public static void main(String[] args) throws InterruptedException {
		// Read console input
		ConsoleInput search = new ConsoleInput();
		int intervalMinutes = search.getInterval();
		long intervalMillis = intervalMinutes * 60 * 1000;
		String keyWord = search.getKeyWord();

		while (true) {
			long startTime = System.currentTimeMillis();

			// Get search results
			ParseWebAddress pwa = new ParseWebAddress(DEALSEA_URL, DEALSEA_RESULT_SELECTOR, keyWord);
			List<String> results = pwa.getParsedData();

			// Display search results
			PopUp popUp = new PopUp();
			popUp.displayItems(results);

			long timeElapsed = System.currentTimeMillis() - startTime;
			Thread.sleep(intervalMillis - timeElapsed);
		}
	}
}
