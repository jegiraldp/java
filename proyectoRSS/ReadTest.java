package pqt;

public class ReadTest {
  public static void main(String[] args) {
    RSSFeedParser parser = new RSSFeedParser("http://www.elcolombiano.com/rss/portada.xml");
	//RSSFeedParser parser = new RSSFeedParser("http://www.eltiempo.com/noticias/rss");
    
    Feed feed = parser.readFeed();
    System.out.println(feed);
    for (FeedMessage message : feed.getMessages()) {
      System.out.println(message);

    }

  }
} 