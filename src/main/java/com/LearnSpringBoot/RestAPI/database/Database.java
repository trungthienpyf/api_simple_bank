package com.LearnSpringBoot.RestAPI.database;

import com.LearnSpringBoot.RestAPI.model.Product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Database {

//    private static final Logger logger= LoggerFactory.getLogger(Database.class);
//    @Bean
//    CommandLineRunner initDatabase(ProductRepository productRepository){
//
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                Product productA=new Product("MacBook",2002,2323.0,"");
//                Product productB=new Product("MacBook2",2002,2323.0,"");
//                logger.info("Inser data: "+productRepository.save(productA));
//                logger.info("Inser data: "+productRepository.save(productB));
//            }
//        };
//    }
}
