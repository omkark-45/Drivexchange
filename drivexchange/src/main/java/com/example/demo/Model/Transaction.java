package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    private String paymentStatus; // Pending, Completed, Failed
    private LocalDate paymentDate;
    private double totalAmount;
    private boolean installmentOption;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public User getBuyer() {
		return buyer;
	}
	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}
	public User getSeller() {
		return seller;
	}
	public void setSeller(User seller) {
		this.seller = seller;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public boolean isInstallmentOption() {
		return installmentOption;
	}
	public void setInstallmentOption(boolean installmentOption) {
		this.installmentOption = installmentOption;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", buyer=" + buyer + ", seller=" + seller + ", car="
				+ car + ", paymentStatus=" + paymentStatus + ", paymentDate=" + paymentDate + ", totalAmount="
				+ totalAmount + ", installmentOption=" + installmentOption + "]";
	}
    
    
}