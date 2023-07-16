package com.skypro.ShoppingCart.service;
import java.util.List;

public interface ShoppingCartService {
    List<Integer> addAll (List<Integer> idList);
    List <Integer> getAll();
}
