package com.serper.Groceries.controllers;

import com.serper.Groceries.services.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/store/order")
@RestController
public class StoreController {

    public StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String add(@RequestParam ("ids") List<Integer> ids) {
        storeService.add(ids);
        return "Продукт(ы) с id: " + ids + " успешно добавлен(ы)";

    }

    @GetMapping("/get")
    public List<Integer> getOrder() {
        return storeService.get();
    }

}

