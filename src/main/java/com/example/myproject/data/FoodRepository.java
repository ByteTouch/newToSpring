package com.example.myproject.data;

import com.example.myproject.domain.Food;

import org.springframework.data.repository.CrudRepository;

// Food対象のデータベースへの接続
// JPAフレームワークはinterfaceを定義した上で特定の親Repositoryをextendsすれば、簡単な処理メソッドは自動的に生成してくれる
// RelationalDBでよく使う親RepositoryはCrudRepository、PagingAndSortingRepository、JpaRepository。左から右へ機能が段々追加されていく。必要な機能だけ持たせるのは少し性能的に良い
// 親RepositoryはGeneric Typeであり、< >の中に左は対象のタイプ、右は対象のidのタイプ
public interface FoodRepository extends CrudRepository<Food, Long> {
    
}
