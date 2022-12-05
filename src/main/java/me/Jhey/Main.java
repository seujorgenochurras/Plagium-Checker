package me.Jhey;

import java.io.IOException;
import java.util.List;

public class Main {
   public static void main(String[] args) throws IOException {
      WebScraper webScraper = new WebScraper("https://www.plagium.com/pt/detectordeplagio");
      webScraper.getInformation();

   }
}