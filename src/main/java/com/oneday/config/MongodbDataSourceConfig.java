package com.oneday.config;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
//import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//
//
////@Configuration
////@PropertySource({"classpath:mongo.properties"})
////public class MongodbDataSourceConfig extends AbstractMongoConfiguration {
//
////@Autowired
////Environment env;
////
////@Override
////public String getDatabaseName() {
////  return env.getRequiredProperty("spring.data.mongodb.database");
////}
////
////@Override
////public @Bean Mongo mongo() throws Exception {
////
////  ServerAddress serverAddress = new ServerAddress(env.getRequiredProperty("spring.data.mongodb.host"));
////  List<MongoCredential> credentials = new ArrayList<>();
////  credentials.add(MongoCredential.createCredential(null,
////      env.getRequiredProperty("spring.data.mongodb.database"),null));
////  MongoClientOptions options = new MongoClientOptions.Builder().build();
////  return new MongoClient(serverAddress, credentials, options);
////}
////
////}