package model.entities;

import model.services.OnlinePaymentService;
import model.services.PaypalService;

import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double amount;

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public Installment(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Valor: " + amount;
    }
}
