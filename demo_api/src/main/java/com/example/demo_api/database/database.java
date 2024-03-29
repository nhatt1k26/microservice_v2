// package com.example.demo_api.database;

// import org.hibernate.boot.model.relational.Database;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import com.example.demo_api.models.Product;
// import com.example.demo_api.repositories.ProductRepositories;

// @Configuration
// public class database {
//     @Bean
//     CommandLineRunner initDatabase(ProductRepositories ProductRepositories){
//         return new CommandLineRunner() {
//             private static final Logger logger = LoggerFactory.getLogger(Database.class);
//             @Override
//             public void run(String... args) throws Exception {
//                 Product productA = new Product("a");
//                 Product productB = new Product("b");
//                 logger.info("insert data: " + ProductRepositories.saveAndFlush(productA));
//                 logger.info("insert data: " + ProductRepositories.saveAndFlush(productB));
                
//             }
//         };
//     }
// }
