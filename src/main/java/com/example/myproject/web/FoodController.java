package com.example.myproject.web;

import com.example.myproject.domain.Food;
import com.example.myproject.service.FoodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired  // 属性にもそれぞれにAutowiredと指定できるが、Bugのリスクを避けるために、一つしかない場合のみこの方法を使用した方が良い
    private FoodService foodService;
    
    @GetMapping("/all")
    public Iterable<Food> showAllFoods() {  // ObjectはJsonに変換して表示
        return foodService.findAllFoods();
    }
}
