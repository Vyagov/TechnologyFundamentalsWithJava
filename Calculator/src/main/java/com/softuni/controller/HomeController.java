package com.softuni.controller;

import com.softuni.entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operator", "+");
        model.addAttribute("view", "views/calculatorForm");
        return "base-layout";
    }

    @PostMapping("/")
    public String calculate(@RequestParam String leftOperand, @RequestParam String operator, @RequestParam String rightOperand, Model model) {
        double num1;
        double num2;

        try {
            num1 = Double.parseDouble(leftOperand);
        } catch (NumberFormatException ex) {
            num1 = 0;
        }
        try {
            num2 = Double.parseDouble(rightOperand);
        } catch (NumberFormatException ex) {
            num2 = 0;
        }
        Calculator calculator = new Calculator(num1, operator, num2);

        DecimalFormat df = new DecimalFormat("#.######");

        model.addAttribute("leftOperand", df.format(calculator.getLeftOperand()));
        model.addAttribute("operator", calculator.getOperator());
        model.addAttribute("rightOperand", df.format(calculator.getRightOperand()));

        if (num2 == 0 && operator.equals("/")) {
            model.addAttribute("result", calculator.divideByZero());
        } else {
            double result = calculator.calculateResult();

            model.addAttribute("result", df.format(result));
        }

        model.addAttribute("view", "views/calculatorForm");

        return "base-layout";
    }
}