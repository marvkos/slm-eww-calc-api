package at.technikum.slmewwcalcapi.controller;

import at.technikum.slmewwcalcapi.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(
            CalculatorService calculatorService
    ) {
        this.calculatorService = calculatorService;
    }

    // ?a=5&b=6
    @GetMapping("/calc/add")
    public int add(
        @RequestParam int a,
        @RequestParam int b
    ) {
        return calculatorService.add(a, b);
    }
}
