package com.f3pro.dsdeliver.services;

import com.f3pro.dsdeliver.dto.ProductDTO;
import com.f3pro.dsdeliver.etities.Product;
import com.f3pro.dsdeliver.repositorie.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAllByOrderByNameAsc();
        return list.stream().map(ProductDTO::new).collect(Collectors.toList());


    }
}
