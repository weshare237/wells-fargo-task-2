package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {

    @Id
    @SequenceGenerator(
            name = "security_sequence",
            sequenceName = "security_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "security_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private long securityId;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false, name = "purchase_price")
    private double purchasePrice;
    @Column(nullable = false, name = "purchase_date")
    private Date purchaseDate;
    @Column(nullable = false)
    private int quantity;

    public Security() {
    }

    public Security(String name, Portfolio portfolio, String category, double purchasePrice, Date purchaseDate, int quantity) {
        this.name = name;
        this.portfolio = portfolio;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
