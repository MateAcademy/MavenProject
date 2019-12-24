package com.app;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author Sergey Klunniy
 * Парсим сайт мэте академи!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Парсим сайт мэте академи!");
        Document document = Jsoup.connect("https://mate.academy/uk").get();
        System.out.println(document);
    }
}
