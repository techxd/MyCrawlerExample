package crawler.example;

import com.github.abola.crawler.CrawlerPack;
import org.jsoup.nodes.Document;


/**
 * 爬蟲包程式的全貌，就只有這固定的模式
 * 
 * @author techxd
 *
 */
public class PTT_example_test {
	// commit test test
	public static void main(String[] args) {

		// 遠端資料路徑
		String uri = "https://www.ptt.cc/bbs/Boy-Girl/M.1492948779.A.71D.html";

		Document MyData = CrawlerPack.start().addCookie("over18","1").getFromHtml(uri);
		//MyData.select()

				// 抓標題 .select("#main-content > div:nth-child(3) > span.article-meta-value")


	}
}
