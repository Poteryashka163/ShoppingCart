package com.skypro.ShoppingCart.controller;
import java.util.List;
import com.skypro.ShoppingCart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService){
        this.shoppingCartService=shoppingCartService;
    }

    @PostMapping("/add")
    public List<Integer> addCartIds(@RequestParam List<Integer> ids) {
        return shoppingCartService.addAll(ids);
    }

    @GetMapping("/get")
    public List<Integer> getCartIds() {
        return shoppingCartService.getAll();
    }

}
