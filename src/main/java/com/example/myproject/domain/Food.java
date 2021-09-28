package com.example.myproject.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity  // JPAのテーブル
@Data  // Lombok pluginにより、Getter、Setter、Constructorなど自動的に生成してくれる
@RequiredArgsConstructor  // 全部の属性も必須パラメータとして持つConstructorを生成
public class Food  {

    @Id  // IDを表す属性を指定する
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)  // Enumタイプをデータベースに保存する際にどのタイプとして保存するかを表す
    private Type type;

    private double price;
    
    public static enum Type {  // 男女、県名、HTTPメソッドなど、一般的に変わらない属性はEnumとして扱った方が読みやすい
        HAMBURGER, PIZZA, DRINK
    }
}
