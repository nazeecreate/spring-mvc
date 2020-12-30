package web.service;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("car1",111,"red"));
        carList.add(new Car("car2",222,"blue"));
        carList.add(new Car("car3",333,"green"));
        carList.add(new Car("car4",444,"white"));
        carList.add(new Car("car5",555,"pink"));
    }

    @Override
    public List<Car> getCarsList(int count) {
        if (count>5){count = carList.size();}
        return carList.subList(0,count);
    }
}
