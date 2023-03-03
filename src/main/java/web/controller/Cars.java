package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class Cars {
    private final CarService carService;

    public Cars(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5")
                            int count, ModelMap model) {
        if (count < 0){
            count = 0;
        } else if (count > 5) {
            count = 5;
        }
        model.addAttribute("cars", carService.getCarList(count));
        return "cars";
    }
}
