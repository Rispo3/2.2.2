package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "E34", 1993));
        cars.add(new Car("Skoda", "Superb", 2010));
        cars.add(new Car("Subaru", "Forester", 2003));
        cars.add(new Car("LADA", "21099", 1993));
        cars.add(new Car("Opel", "Vectra", 2008));
    }

    @Override
    public List<Car> listCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
