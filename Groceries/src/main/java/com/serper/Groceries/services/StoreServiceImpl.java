package com.serper.Groceries.services;

import com.serper.Groceries.Ecxeptions.BanInputException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope

public class StoreServiceImpl implements StoreService {

    List<Integer> orderList = new ArrayList<>();

    public void add(List<Integer> id) {
        if(id.contains(null)){
            throw new BanInputException("Вводить можно только числа");
        }
        orderList.addAll(id);
    }

    @Override
    public List<Integer> get() {
        return Collections.unmodifiableList(orderList);
    }

}
