package com.dayone;

import com.dayone.model.Company;
import com.dayone.scraper.Scraper;
import com.dayone.scraper.YahooFinanceScraper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        Scraper scraper = new YahooFinanceScraper();
////        var result = scraper.scrap(Company.builder().ticker("MMM").build());
//        var result = scraper.scrapCompanyByTicker("MMM");
//        System.out.println(result);
    }
}
