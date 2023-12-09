package com.serper.Groceries.services;

import java.util.List;

public interface StoreService {
    public void add(List<Integer> ids);
    public List<Integer> get();
}
