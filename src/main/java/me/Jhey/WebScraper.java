package me.Jhey;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomText;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextArea;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScraper {
      WebClient webClient = new WebClient();
      HtmlPage page;

   public WebScraper(String url) throws IOException {
      page = getWebPage(url);
   }
   private HtmlPage getWebPage(String url) throws IOException {
      webClient.getOptions().setCssEnabled(false);
      webClient.getOptions().setJavaScriptEnabled(false);
      return webClient.getPage(url);
   }

   public void getInformation() throws IOException {
      HtmlTextArea textArea = (HtmlTextArea) page.getByXPath("//div/textarea").get(0);
      HtmlSubmitInput submitInput = (HtmlSubmitInput) page.getByXPath("//div/div/buttton").get(0);

      textArea.type("ficialmente República Federativa do Brasil (Loudspeaker.svg? escutar),[7] é o maior país da América do Sul e d" +
              "a região da América Latina, sendo o quinto maior do mundo em área territorial (equivalente a 47,3% do território sul-amer" +
              "icano), com 8 510 345,538 km²,[8] e o sexto em população[9][10] (com mais de 213 milhões de habitantes). É o único país n" +
              "a América onde se fala majoritariamente a língua portuguesa e o maior país lusófono do planeta,[11] além de ser uma das na" +
              "ções mais multiculturais e etnicamente diversas,");

      submitInput.click();

   }

}
