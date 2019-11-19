public class DealseaClient {

	public static void main(String[] args) throws InterruptedException {
		// Read console input
		ConsoleInput search = new ConsoleInput();
		int intervalMinutes = search.getInterval();
		long intervalMillis = intervalMinutes * 60 * 1000;
		String keyWord = search.getKeyWord();

		while (true) {
			long startTime = System.currentTimeMillis();
			// TODO Parse page
			long timeElapsed = System.currentTimeMillis() - startTime;
			Thread.sleep(intervalMillis - timeElapsed);
		}
	}
}
