package AbstractFactory;

import AbstractFactory.factory.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //AbstractFactory.listFactory.ListFactory
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "AbstractFactory.listFactory.ListFactory";
        Factory factory = Factory.getFactory(input);

        Link han = factory.createLink("한겨레","http://www.hani.co.kr/");
        Link khan = factory.createLink("경향","http://www.khan.co.kr/");

        Link naver = factory.createLink("naver", "http://naver.com");
        Link daum = factory.createLink("daum", "http://daum.com");
        Link google = factory.createLink("google", "http://google.com");

        Tray tray_news = factory.createTray("신문");
        tray_news.add(han);
        tray_news.add(khan);

        Tray tray_portal = factory.createTray("포털");
        tray_portal.add(naver);
        tray_portal.add(daum);
        tray_portal.add(google);

        Page page = factory.createPage("LinkPage", "최우석");
        page.add(tray_news);
        page.add(tray_portal);
        page.output();
    }
}

