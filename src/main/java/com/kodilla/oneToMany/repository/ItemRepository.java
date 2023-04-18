package com.kodilla.oneToMany.repository;

import com.kodilla.oneToMany.model.Cart;
import com.kodilla.oneToMany.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    Item findByCart(Cart cart);

}