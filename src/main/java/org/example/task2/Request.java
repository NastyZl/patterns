package org.example.task2;

public class Request {
    private String fullName;
    private String personalData;
    private double income;
    private String creditHistory;

    private double interestRate;
    private int loanTerm;
    private double monthlyPayment;

    public Request(String fullName, String personalData, double income, String creditHistory,
                   double interestRate, int loanTerm, double monthlyPayment) {
        this.fullName = fullName;
        this.personalData = personalData;
        this.income = income;
        this.creditHistory = creditHistory;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.monthlyPayment = monthlyPayment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(String creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
