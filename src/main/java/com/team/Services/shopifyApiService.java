//package com.team.Services;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//
///**
// * Created by andrewdmo on 10/3/16.
// */
//public class shopifyApiService {
//
//   // package com.norialertapp.service;
////import com.norialertapp.entity.Product;
//
//
//    /**
//     * Created by katherine_celeste on 9/29/16.
//     */
//
//    @Service
//    public class ShopifyService {
//
//        @Value("${shopify.api.address}") //The @Value annotation tells Spring where to find the correct value
//        private String apiAddress;
//
//        @Value("${shopify.api.key}")
//        private String apiToken;
//
//        @Value("${shopify.api.password}")
//        private String apiPassword;
//
//        // This method uses a class named RestTemplate to make a get request to an API endpoint URL at Shopify.
//        // The resulting JSON is translated into an array of Product objects, which is, in turn, turned into a List.
//        public List<Product[]> listProducts() {
//            RestTemplate restTemplate = new RestTemplate();
//            // https://apikey:password@hostname/admin/resource.json
//            Product[] forObject = restTemplate.getForObject("https://" + apiToken + ":" + apiPassword + "@" + apiAddress + "/admin/products.json", Product[].class);
//            return Arrays.asList(forObject);
//        }
//
//    }
//
//
//
//}
