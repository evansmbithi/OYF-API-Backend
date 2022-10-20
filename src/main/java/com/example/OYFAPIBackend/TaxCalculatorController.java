package com.example.OYFAPIBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TaxCalculatorController {

    private static final String PATTERN = "^-?+\\d+\\.?+\\d*$";

    @GetMapping("/computeTax")
    public TaxCalculator taxCalculator(
            @RequestParam(value = "gross", defaultValue = "150000")
            String grossInput
    ){
//        localhost:8080/api/v1/computeTax?gross=150000

        String grossAmount;
        String netSalary;
        String nssf = "200";
        String taxableIncome = "24000";
        String taxBeforeRelief = "2500";
        String personalRelief = "500";
        String healthInsurance = "10000";
        String paye = "22500";
        String nhif = "1000";


        Double totalDeductions =
                        Double.valueOf(nssf) +
                        Double.valueOf(taxableIncome) +
                        Double.valueOf(taxBeforeRelief) +
                        Double.valueOf(personalRelief) +
                        Double.valueOf(healthInsurance) +
                        Double.valueOf(paye) +
                        Double.valueOf(nhif);

        netSalary = String.valueOf(Double.valueOf(grossInput) - totalDeductions);

        if (grossInput != null && grossInput.matches(PATTERN)){
            grossAmount = String.valueOf(Double.valueOf(grossInput));
        } else {
            grossAmount = "Input value is not set to numeric value.";
        }

        return new TaxCalculator(grossAmount, netSalary, nssf, taxableIncome, taxBeforeRelief, personalRelief, healthInsurance, paye, nhif);
    }
}
