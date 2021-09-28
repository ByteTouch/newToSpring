package com.example.myproject.service;

import com.example.myproject.data.FoodRepository;
import com.example.myproject.domain.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // Service層であることを提示する、SpringBoot起動時にこのクラスが自動的に生成される
public class FoodService {
    
    private FoodRepository foodRepository;

    @Autowired  // Autowiredにより、このクラスが生成される際にパラメータは自動的に注入される
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Iterable<Food> findAllFoods() {  //  業務ロジックはService層のメソッドで定義すること
        return foodRepository.findAll();
    }
}
