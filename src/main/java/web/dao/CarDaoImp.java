package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{
    @Override
    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Bmv", "5 series", "E34"));
        cars.add(new Car("Bmv", "5 series", "E39"));
        cars.add(new Car("Bmv", "5 series", "E60/E61"));
        cars.add(new Car("Bmv", "3 series", "E36"));
        cars.add(new Car("Bmv", "3 series", "E46"));
        return cars;
    }
}
