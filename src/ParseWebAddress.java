import org.jsoup.*;
import org.jsoup.nodes.Document;

public class ParseWebAddress {
	public Document parseUrl(String s) {
		try {
			return Jsoup.connect(s).get();

		}
		catch (Exception e){
			System.out.println(e);
			return null;
		}
	}
}
