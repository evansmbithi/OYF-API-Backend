package com.example.OYFAPIBackend;

public class TaxCalculator {
    private String grossAmount;
    private String netSalary;
    private String nssf;
    private String taxableIncome;
    private String taxBeforeRelief;
    private String personalRelief;
    private String healthInsurance;
    private String paye;
    private String nhif;

    public TaxCalculator(String grossAmount, String netSalary, String nssf, String taxableIncome, String taxBeforeRelief, String personalRelief, String healthInsurance, String paye, String nhif) {
        this.grossAmount = grossAmount;
        this.netSalary = netSalary;
        this.nssf = nssf;
        this.taxableIncome = taxableIncome;
        this.taxBeforeRelief = taxBeforeRelief;
        this.personalRelief = personalRelief;
        this.healthInsurance = healthInsurance;
        this.paye = paye;
        this.nhif = nhif;
    }

    public String getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(String grossAmount) {
        this.grossAmount = grossAmount;
    }

    public String getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(String netSalary) {
        this.netSalary = netSalary;
    }

    public String getNssf() {
        return nssf;
    }

    public void setNssf(String nssf) {
        this.nssf = nssf;
    }

    public String getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(String taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public String getTaxBeforeRelief() {
        return taxBeforeRelief;
    }

    public void setTaxBeforeRelief(String taxBeforeRelief) {
        this.taxBeforeRelief = taxBeforeRelief;
    }

    public String getPersonalRelief() {
        return personalRelief;
    }

    public void setPersonalRelief(String personalRelief) {
        this.personalRelief = personalRelief;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public String getPaye() {
        return paye;
    }

    public void setPaye(String paye) {
        this.paye = paye;
    }

    public String getNhif() {
        return nhif;
    }

    public void setNhif(String nhif) {
        this.nhif = nhif;
    }
}
