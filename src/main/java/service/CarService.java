package service;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCarsList(int count);
}
