package com.skypro.ShoppingCart.service;
import com.skypro.ShoppingCart.model.Cart;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final Cart cart;
    public ShoppingCartServiceImpl(Cart cart){
        this.cart=cart;
    }
    @Override
    public List<Integer> addAll(List<Integer> idsList) {
        return cart.addIds(idsList);
    }
    @Override
    public List<Integer> getAll(){
        return cart.getIds();
    }


}
