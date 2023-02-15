//package com.LearnSpringBoot.RestAPI.controllers;
//
//import com.LearnSpringBoot.RestAPI.model.Product;
//import com.LearnSpringBoot.RestAPI.DTO.ResponseObject;
//import com.LearnSpringBoot.RestAPI.respository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping(path = "/api/v1/Products")
//public class ProductController {
//    @Autowired
//    private ProductRepository productRepository;
//
//    @GetMapping("")
//    List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    ResponseEntity<ResponseObject> findById(@PathVariable Long id) {
//        Optional<Product> foundProduct =  productRepository.findById(id);
//        if(foundProduct.isPresent()){
//            return ResponseEntity.status(HttpStatus.OK).body(
//              new ResponseObject("ok","Query product successfully",foundProduct)
//            );
//        }else{
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
//                    new ResponseObject("false","Cannot find product with id = " + id,"")
//            );
//        }
//
//    }
//    @PostMapping("/insert")
//    ResponseEntity<ResponseObject> insertProduct(@RequestBody Product newProduct){
//        List<Product> foundProducts =productRepository.findByProductName(newProduct.getProductName().trim());
//        if(foundProducts.size() > 0){
//            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
//                    new ResponseObject("false","Product name already taken","")
//            );
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(
//                new ResponseObject("ok","Insert product successfully",productRepository.save(newProduct))
//        );
//    }
//
//    @PutMapping("/{id}")
//    ResponseEntity<ResponseObject> updateProduct(@RequestBody Product newProduct,@PathVariable Long id){
//            Product updateProduct = productRepository.findById(id)
//                    .map(product -> {
//                        product.setProductName(newProduct.getProductName());
//                        product.setYear(newProduct.getYear());
//                        product.setUrl(newProduct.getUrl());
//                        product.setPrice(newProduct.getPrice());
//                        return productRepository.save(product);
//                    }).orElseGet(()->{
//                        newProduct.setId(id);
//                        return productRepository.save(newProduct);
//                    });
//        return ResponseEntity.status(HttpStatus.OK).body(
//                new ResponseObject("ok","Update product successfully",updateProduct)
//        );
//    }
//    @DeleteMapping("/{id}")
//    ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id){
//        boolean exists =productRepository.existsById(id);
//        if (exists){
//            productRepository.deleteById(id);
//            return ResponseEntity.status(HttpStatus.OK).body(
//                    new ResponseObject("ok","Delete product successfully",""));
//        }
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
//                new ResponseObject("false","Cannot find product to delete","")
//        );
//    }
//}
