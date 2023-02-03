import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
        public static void main(String[] args) throws IOException {
            ArrayList<String> arr = new ArrayList<>();
            Document doc = Jsoup.connect("https://www.krylatskoye.ru/content/ratings/2021/09/0928.html").get();
            Element table = doc.select("table").first();
            for (int i = 0; i < 200; i+=2) {
                String clas = table.getElementsByClass("left").get(i).text();
                arr.add(clas);
            }

            Collections.sort(arr);
            for (String i :
                    arr) {
                System.out.println(i);
            }
        }
    }
