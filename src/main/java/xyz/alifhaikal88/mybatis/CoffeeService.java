package xyz.alifhaikal88.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeMapper coffeeMapper;

    public void saveCoffee(Coffee coffee) {
        int rows = coffeeMapper.saveCoffee(coffee);
        System.out.println("coffee = " + coffee.getId());
        System.out.println("rows = " + rows);
    }
}
