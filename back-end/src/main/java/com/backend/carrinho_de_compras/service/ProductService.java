package com.backend.carrinho_de_compras.service;

import com.backend.carrinho_de_compras.models.ProductModel;
import com.backend.carrinho_de_compras.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    @Autowired
    List<ProductModel> findAll();


}
