package model;

import database.ReadWrite;

public class CreditCard {
	
	public String cardHolder, cardNumber, monthOfExpiry, yearOfExpiry, CVC;

	/**
	 * @return the cardHolder
	 */
	public String getCardHolder() {
		return cardHolder;
	}

	/**
	 * @param cardHolder the cardHolder to set
	 */
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the monthOfExpiry
	 */
	public String getMonthOfExpiry() {
		return monthOfExpiry;
	}

	/**
	 * @param monthOfExpiry the monthOfExpiry to set
	 */
	public void setMonthOfExpiry(String monthOfExpiry) {
		this.monthOfExpiry = monthOfExpiry;
	}

	/**
	 * @return the yearOfExpiry
	 */
	public String getYearOfExpiry() {
		return yearOfExpiry;
	}

	/**
	 * @param yearOfExpiry the yearOfExpiry to set
	 */
	public void setYearOfExpiry(String yearOfExpiry) {
		this.yearOfExpiry = yearOfExpiry;
	}

	/**
	 * @return the cVC
	 */
	public String getCVC() {
		return CVC;
	}

	/**
	 * @param cVC the cVC to set
	 */
	public void setCVC(String cVC) {
		CVC = cVC;
	}
	
	//Constructor to load credit card
	public CreditCard()
	{
		
	}
	
	public void writeTofile(String details)
	{
		ReadWrite.WriteDetails("creditCard.txt", details);
	}
}