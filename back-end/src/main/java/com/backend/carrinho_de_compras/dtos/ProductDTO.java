package com.backend.carrinho_de_compras.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ProductDTO(@NotBlank String name, @NotBlank String description, @NotNull Long price) {
}
