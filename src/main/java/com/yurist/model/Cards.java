package com.yurist.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cards")
public class Cards {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "card_id")
	private int cardId;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "card_number")
	private String cardNumber;

	@Column(name = "card_type")
	private String cardType;

	@Column(name = "total_limit")
	private int totalLimit;

	@Column(name = "amount_used")
	private int amountUsed;

	@Column(name = "available_amount")
	private int availableAmount;

	@Column(name = "create_dt")
	private Date createData;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getTotalLimit() {
		return totalLimit;
	}

	public void setTotalLimit(int totalLimit) {
		this.totalLimit = totalLimit;
	}

	public int getAmountUsed() {
		return amountUsed;
	}

	public void setAmountUsed(int amountUsed) {
		this.amountUsed = amountUsed;
	}

	public int getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(int availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Date getCreateData() {
		return createData;
	}

	public void setCreateData(Date createDt) {
		this.createData = createDt;
	}

}
