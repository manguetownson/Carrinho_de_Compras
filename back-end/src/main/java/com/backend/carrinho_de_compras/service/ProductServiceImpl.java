package com.backend.carrinho_de_compras.service;

import com.backend.carrinho_de_compras.models.ProductModel;
import com.backend.carrinho_de_compras.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl {
    @Autowired
    private ProductRepository repository;

    @Transactional
    public List<ProductModel> findAll(){
        return (List<ProductModel>) repository.findAll();
    }
}
