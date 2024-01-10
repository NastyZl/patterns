package org.example.task2;

public class Request {
    private String fullName;
    private Integer age;
    private double income;
    private TypeCreditHistory creditHistory;
    private double interestRate;
    private int loanTerm;
    private double monthlyPayment;
    private boolean blackList;

    public Request(String fullName, Integer age, double income, TypeCreditHistory creditHistory,
                   double interestRate, int loanTerm, double monthlyPayment, boolean blackList) {
        this.fullName = fullName;
        this.age = age;
        this.income = income;
        this.creditHistory = creditHistory;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.monthlyPayment = monthlyPayment;
        this.blackList = blackList;
    }

    public boolean isBlackList() {
        return blackList;
    }

    public void setBlackList(boolean blackList) {
        this.blackList = blackList;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public TypeCreditHistory getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(TypeCreditHistory creditHistory) {
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
