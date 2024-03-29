package com.nhat220801.microservices.apigateway.configuration;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ApiGatewatConfiguration {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
//        Function<PredicateSpec, Buildable<Route>> routeFunction =
//                p -> p.path("/get")
//                        .filters(f ->
//                                f.addRequestHeader("MyHeader","MyHeader")
//                                        .addRequestParameter("My Param","123"))
//                        .uri("http://httpbin.org:80");
        Function<PredicateSpec, Buildable<Route>> routeFunction =
                p -> p.path("/currency-exchange/**")
                        .filters(f -> f.rewritePath("/currency-conversion-new/(?<segment>.*)",
                                "/currency-conversion-new/${segment}"))
                        .uri("lb://currency-exchange");
        return builder.routes()
                .route(routeFunction).build();
    }
}
