package at.technikum.slmewwcalcapi.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }
}
