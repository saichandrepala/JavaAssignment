package com.calculator.service.calculatorservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CalculatorService {
    @GetMapping("/add/{x}/{y}")
    public int add(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    @GetMapping("/sub/{x}/{y}")
    public int sub(@PathVariable int x, @PathVariable int y) {
        return x - y;
    }

    @GetMapping("/mul/{x}/{y}")
    public int mul(@PathVariable int x, @PathVariable int y) {
        return x * y;
    }

    @GetMapping("/div/{x}/{y}")
    public int div(@PathVariable int x, @PathVariable int y) {
        return x / y;
    }
}
