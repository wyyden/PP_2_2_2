package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Bmv", "5 series", "E34"));
        cars.add(new Car("Bmv", "5 series", "E39"));
        cars.add(new Car("Bmv", "5 series", "E60/E61"));
        cars.add(new Car("Bmv", "3 series", "E36"));
        cars.add(new Car("Bmv", "3 series", "E46"));
    }

    @Override
    public List<Car> getCarList(int count) {

        if (count < 0){
            return cars;
        } else if (count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
