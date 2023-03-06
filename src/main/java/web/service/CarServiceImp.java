package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{
    List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCarList(int count) {
        cars.add(new Car("Bmv", "5 series", "E34"));
        cars.add(new Car("Bmv", "5 series", "E39"));
        cars.add(new Car("Bmv", "5 series", "E60/E61"));
        cars.add(new Car("Bmv", "3 series", "E36"));
        cars.add(new Car("Bmv", "3 series", "E46"));

        if (count < 0){
            count = 0;
        } else if (count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
