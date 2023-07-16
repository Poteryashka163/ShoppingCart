package com.skypro.ShoppingCart.model;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Cart {
    private final List<Integer> ids = new ArrayList<>();

    public List<Integer> addIds (List<Integer> ids){
        this.ids.addAll(ids);
        return getIds();
    }

    public List<Integer> getIds(){
        return Collections.unmodifiableList(ids);
    }
}
