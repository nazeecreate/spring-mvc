package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String carsList(@RequestParam(value = "count", required = false) Integer count, Model model){
        if (count == null){
            count = 5;
        }
        model.addAttribute("cars", carService.getCarsList(count));
        return "cars";
    }
}
