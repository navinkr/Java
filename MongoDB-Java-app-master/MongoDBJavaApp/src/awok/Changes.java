package awok;

import java.util.Date;

public class Changes {

	//public long ORDER_ID;
	public String DATE_CREATE;
	public long USER_ID;
	public int TYPE;
	public long PRODUCT_ID;
	public long QUANTITY;
	public String STATUS_ID;
	public boolean ALLOW_DELIVERY;
	public boolean RESERVED;
	public String DELIVERY_DOC_NUM;
	public Date DELIVERY_DOC_DATE;
	public boolean PAYED;
	public String PAY_VOUCHER_NUM;
	public String PAY_VOUCHER_DATE;
	public long BASKET_ID;
	public String NAME;
	public Double PRICE;
	public Double PRICE_NEW;
	public Integer SECTION_ID;
	public String WARRANTY;
	public Object PRE_ORDER;
	public Integer CURRENCY;
	public Integer PAY_SYSTEM_ID;
	public boolean MARKED;
	public String REASON_MARKED;
	public Integer DELIVERY_ID;
	public boolean CANCELED;
	public String REASON_CANCELED;
	public Double PRICE_DELIVERY;
	public String TRACKING_NUMBER;


	public String getTRACKING_NUMBER() {
		return TRACKING_NUMBER;
	}

	public void setTRACKING_NUMBER(String tRACKING_NUMBER) {
		TRACKING_NUMBER = tRACKING_NUMBER;
	}

/*	public long getORDER_ID() {
		return ORDER_ID;
	}

	public void setORDER_ID(long oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}*/

	public String getDATE_CREATE() {
		return DATE_CREATE;
	}

	public void setDATE_CREATE(String dATE_CREATE) {
		DATE_CREATE = dATE_CREATE;
	}

	public long getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(long uSER_ID) {
		USER_ID = uSER_ID;
	}

	public int getTYPE() {
		return TYPE;
	}

	public void setTYPE(int tYPE) {
		TYPE = tYPE;
	}

	public long getPRODUCT_ID() {
		return PRODUCT_ID;
	}

	public void setPRODUCT_ID(long pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}

	public long getQUANTITY() {
		return QUANTITY;
	}

	public void setQUANTITY(long qUANTITY) {
		QUANTITY = qUANTITY;
	}

	public String getSTATUS_ID() {
		return STATUS_ID;
	}

	public void setSTATUS_ID(String sTATUS_ID) {
		STATUS_ID = sTATUS_ID;
	}

	public boolean isALLOW_DELIVERY() {
		return ALLOW_DELIVERY;
	}

	public void setALLOW_DELIVERY(boolean aLLOW_DELIVERY) {
		ALLOW_DELIVERY = aLLOW_DELIVERY;
	}

	public boolean isRESERVED() {
		return RESERVED;
	}

	public void setRESERVED(boolean rESERVED) {
		RESERVED = rESERVED;
	}

	public String getDELIVERY_DOC_NUM() {
		return DELIVERY_DOC_NUM;
	}

	public void setDELIVERY_DOC_NUM(String delivery_doc_num2) {
		DELIVERY_DOC_NUM = delivery_doc_num2;
	}

	public Date getDELIVERY_DOC_DATE() {
		return DELIVERY_DOC_DATE;
	}

	public void setDELIVERY_DOC_DATE(Date dELIVERY_DOC_DATE) {
		DELIVERY_DOC_DATE = dELIVERY_DOC_DATE;
	}

	public boolean isPAYED() {
		return PAYED;
	}

	public void setPAYED(boolean pAYED) {
		PAYED = pAYED;
	}

	public String getPAY_VOUCHER_NUM() {
		return PAY_VOUCHER_NUM;
	}

	public void setPAY_VOUCHER_NUM(String pAY_VOUCHER_NUM) {
		PAY_VOUCHER_NUM = pAY_VOUCHER_NUM;
	}

	public String getPAY_VOUCHER_DATE() {
		return PAY_VOUCHER_DATE;
	}

	public void setPAY_VOUCHER_DATE(String pAY_VOUCHER_DATE) {
		PAY_VOUCHER_DATE = pAY_VOUCHER_DATE;
	}

	public long getBASKET_ID() {
		return BASKET_ID;
	}

	public void setBASKET_ID(long bASKET_ID) {
		BASKET_ID = bASKET_ID;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public Double getPRICE() {
		return PRICE;
	}

	public void setPRICE(Double double1) {
		PRICE = double1;
	}

	public Double getPRICE_NEW() {
		return PRICE_NEW;
	}

	public void setPRICE_NEW(Double double1) {
		PRICE_NEW = double1;
	}

	public Integer getSECTION_ID() {
		return SECTION_ID;
	}

	public void setSECTION_ID(Integer double1) {
		SECTION_ID = double1;
	}

	public String getWARRANTY() {
		return WARRANTY;
	}

	public void setWARRANTY(String wARRANTY) {
		WARRANTY = wARRANTY;
	}

	public Integer getCURRENCY() {
		return CURRENCY;
	}

	public void setCURRENCY(Integer cURRENCY) {
		CURRENCY = cURRENCY;
	}

	public Integer getPAY_SYSTEM_ID() {
		return PAY_SYSTEM_ID;
	}

	public void setPAY_SYSTEM_ID(Integer pAY_SYSTEM_ID) {
		PAY_SYSTEM_ID = pAY_SYSTEM_ID;
	}

	public boolean getMARKED() {
		return MARKED;
	}

	public void setMARKED(boolean mARKED) {
		MARKED = mARKED;
	}

	public String getREASON_MARKED() {
		return REASON_MARKED;
	}

	public void setREASON_MARKED(String rEASON_MARKED) {
		REASON_MARKED = rEASON_MARKED;
	}

	public Integer getDELIVERY_ID() {
		return DELIVERY_ID;
	}

	public void setDELIVERY_ID(Integer dELIVERY_ID) {
		DELIVERY_ID = dELIVERY_ID;
	}

	public boolean getCANCELED() {
		return CANCELED;
	}

	public void setCANCELED(boolean cANCELED) {
		CANCELED = cANCELED;
	}

	public String getREASON_CANCELED() {
		return REASON_CANCELED;
	}

	public void setREASON_CANCELED(String rEASON_CANCELED) {
		REASON_CANCELED = rEASON_CANCELED;
	}

	public Double getPRICE_DELIVERY() {
		return PRICE_DELIVERY;
	}

	public void setPRICE_DELIVERY(Double pRICE_DELIVERY) {
		PRICE_DELIVERY = pRICE_DELIVERY;
	}

	public Object getPRE_ORDER() {
		return PRE_ORDER;
	}

	public void setPRE_ORDER(Object pRE_ORDER) {
		PRE_ORDER = pRE_ORDER;
	}

}
