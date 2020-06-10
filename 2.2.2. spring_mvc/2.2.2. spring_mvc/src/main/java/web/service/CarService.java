package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    public CarService() {
    }

    public List<Car> getAllCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("scjkbsx",  "black"));
        list.add(new Car("spxj", "red"));
        list.add(new Car("wiohxb",  "green"));
        return list;
    }
}
