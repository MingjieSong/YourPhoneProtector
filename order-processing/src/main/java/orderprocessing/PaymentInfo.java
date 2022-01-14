package orderprocessing;

import javax.persistence.*;
@Entity
@Table(name="PAYMENT_INFO") 
public class PaymentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	@Column(name="CARD_NUM")
	String cardNum ; 
	@Column(name="EXP_DATE")
	String expireDate; 
	@Column(name="CVV")
	String cvvCode ; 
	@Column(name="HOLDER_NAME")
	String holderName ;
	@Column(name ="PAYMENT_CONFIRMATION_NUM")
	String paymentConfirmNum ;
	
	public PaymentInfo() {
		
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getCvvCode() {
		return cvvCode;
	}
	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	} 
	public String getPaymentConfirmNum() {
		return paymentConfirmNum;
	}
	public void setPaymentConfirmNum(String paymentConfirmNum) {
		this.paymentConfirmNum = paymentConfirmNum;
	}
	
	

}