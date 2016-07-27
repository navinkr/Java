package awok;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserOrders {

	public Integer getDELIVERY_ID() {
		return DELIVERY_ID;
	}

	public void setDELIVERY_ID(Integer dELIVERY_ID) {
		DELIVERY_ID = dELIVERY_ID;
	}

	public Integer getCONFIRMED_BY() {
		return CONFIRMED_BY;
	}

	public void setCONFIRMED_BY(Integer cONFIRMED_BY) {
		CONFIRMED_BY = cONFIRMED_BY;
	}

	public boolean getDOCS_REQUIRED() {
		return DOCS_REQUIRED;
	}

	public void setDOCS_REQUIRED(boolean dOCS_REQUIRED) {
		DOCS_REQUIRED = dOCS_REQUIRED;
	}

	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	public String ID;
	public Integer ORDER_ID;
	public String DATE_INSERT;
	public String DATE_UPDATE;
	public Double PRICE_DELIVERY;
	public Double DISCOUNT_VALUE;
	public Double PRICE;
	public String STATUS_ID;
	public String DATE_STATUS;
	public boolean PAYED;
	public int PAY_SYSTEM_ID;
	public boolean CANCELED;
	public Double SUM_PAID;
	public long USER_ID;
	public long LOCATION;
	public String FULL_NAME;
	public String PERSONAL_STREET;
	public String APT_VILLA_NO;
	public String PERSONAL_EMAIL;
	public int BX_VERSION;
	public String ACCOUNT_NUMBER;
	public String TELEPHONE;
	public String TELEPHONE_2;
	public String TIME_UPDATE;
	public Integer DELIVERY_ID;
	public Integer CONFIRMED_BY;
	public boolean DOCS_REQUIRED;
	//////////////////////////////////////////////////////
	public Double ADVANCE_PAID;
	public Integer CANCEL_REASON;
	public Integer CONFIRMED_GROUP;
	public String CONFIRMED_ON;
	public String DATE_CANCELED;
	public String DELIVERY_REPORT;
	public Integer DRIVER_ID;
	public Integer DUPLIC_ORDER_ID;
	public String EMP_STATUS_ID;
	public String EXCHANGE_AMOUNT;
	public String KEYCODE;
	public String LAST_MONGO_VERSION;
	public String OP_AUTH_CODE;
	public String OP_CARD;
	public Double OP_PAID_AMOUNT;
	public String OP_STATUS_DESC;
	public Double OP_TRANSF_AMOUNT;
	public Double OP_TRANSFERRED;
	public String PHONE_VERIFIED;
	public String SPLIT_ORIGINAL;
	public String SPLIT_SECONDARY;
	public String TRACKING_NUMBER;
	public String USER_DEVICE;

	List<Changes> changes = new ArrayList<Changes>();

	public Double getADVANCE_PAID() {
		return ADVANCE_PAID;
	}

	public void setADVANCE_PAID(Double aDVANCE_PAID) {
		ADVANCE_PAID = aDVANCE_PAID;
	}

	public Integer getCANCEL_REASON() {
		return CANCEL_REASON;
	}

	public void setCANCEL_REASON(Integer cANCEL_REASON) {
		CANCEL_REASON = cANCEL_REASON;
	}

	public Integer getCONFIRMED_GROUP() {
		return CONFIRMED_GROUP;
	}

	public void setCONFIRMED_GROUP(Integer cONFIRMED_GROUP) {
		CONFIRMED_GROUP = cONFIRMED_GROUP;
	}

	public String getCONFIRMED_ON() {
		return CONFIRMED_ON;
	}

	public void setCONFIRMED_ON(String cONFIRMED_ON) {
		CONFIRMED_ON = cONFIRMED_ON;
	}

	public String getDATE_CANCELED() {
		return DATE_CANCELED;
	}

	public void setDATE_CANCELED(String dATE_CANCELED) {
		DATE_CANCELED = dATE_CANCELED;
	}

	public String getDELIVERY_REPORT() {
		return DELIVERY_REPORT;
	}

	public void setDELIVERY_REPORT(String dELIVERY_REPORT) {
		DELIVERY_REPORT = dELIVERY_REPORT;
	}

	public Integer getDRIVER_ID() {
		return DRIVER_ID;
	}

	public void setDRIVER_ID(Integer dRIVER_ID) {
		DRIVER_ID = dRIVER_ID;
	}

	public Integer getDUPLIC_ORDER_ID() {
		return DUPLIC_ORDER_ID;
	}

	public void setDUPLIC_ORDER_ID(Integer dUPLIC_ORDER_ID) {
		DUPLIC_ORDER_ID = dUPLIC_ORDER_ID;
	}

	public String getEMP_STATUS_ID() {
		return EMP_STATUS_ID;
	}

	public void setEMP_STATUS_ID(String eMP_STATUS_ID) {
		EMP_STATUS_ID = eMP_STATUS_ID;
	}

	public String getEXCHANGE_AMOUNT() {
		return EXCHANGE_AMOUNT;
	}

	public void setEXCHANGE_AMOUNT(String eXCHANGE_AMOUNT) {
		EXCHANGE_AMOUNT = eXCHANGE_AMOUNT;
	}

	public String getKEYCODE() {
		return KEYCODE;
	}

	public void setKEYCODE(String kEYCODE) {
		KEYCODE = kEYCODE;
	}

	public String getLAST_MONGO_VERSION() {
		return LAST_MONGO_VERSION;
	}

	public void setLAST_MONGO_VERSION(String lAST_MONGO_VERSION) {
		LAST_MONGO_VERSION = lAST_MONGO_VERSION;
	}

	public String getOP_AUTH_CODE() {
		return OP_AUTH_CODE;
	}

	public void setOP_AUTH_CODE(String oP_AUTH_CODE) {
		OP_AUTH_CODE = oP_AUTH_CODE;
	}

	public String getOP_CARD() {
		return OP_CARD;
	}

	public void setOP_CARD(String oP_CARD) {
		OP_CARD = oP_CARD;
	}

	public Double getOP_PAID_AMOUNT() {
		return OP_PAID_AMOUNT;
	}

	public void setOP_PAID_AMOUNT(Double oP_PAID_AMOUNT) {
		OP_PAID_AMOUNT = oP_PAID_AMOUNT;
	}

	public String getOP_STATUS_DESC() {
		return OP_STATUS_DESC;
	}

	public void setOP_STATUS_DESC(String oP_STATUS_DESC) {
		OP_STATUS_DESC = oP_STATUS_DESC;
	}

	public Double getOP_TRANSF_AMOUNT() {
		return OP_TRANSF_AMOUNT;
	}

	public void setOP_TRANSF_AMOUNT(Double oP_TRANSF_AMOUNT) {
		OP_TRANSF_AMOUNT = oP_TRANSF_AMOUNT;
	}

	public Double getOP_TRANSFERRED() {
		return OP_TRANSFERRED;
	}

	public void setOP_TRANSFERRED(Double oP_TRANSFERRED) {
		OP_TRANSFERRED = oP_TRANSFERRED;
	}

	public String getPHONE_VERIFIED() {
		return PHONE_VERIFIED;
	}

	public void setPHONE_VERIFIED(String pHONE_VERIFIED) {
		PHONE_VERIFIED = pHONE_VERIFIED;
	}

	public String getSPLIT_ORIGINAL() {
		return SPLIT_ORIGINAL;
	}

	public void setSPLIT_ORIGINAL(String sPLIT_ORIGINAL) {
		SPLIT_ORIGINAL = sPLIT_ORIGINAL;
	}

	public String getSPLIT_SECONDARY() {
		return SPLIT_SECONDARY;
	}

	public void setSPLIT_SECONDARY(String sPLIT_SECONDARY) {
		SPLIT_SECONDARY = sPLIT_SECONDARY;
	}

	public String getTRACKING_NUMBER() {
		return TRACKING_NUMBER;
	}

	public void setTRACKING_NUMBER(String tRACKING_NUMBER) {
		TRACKING_NUMBER = tRACKING_NUMBER;
	}

	public String getUSER_DEVICE() {
		return USER_DEVICE;
	}

	public void setUSER_DEVICE(String uSER_DEVICE) {
		USER_DEVICE = uSER_DEVICE;
	}

	

	public String getPERSONAL_STREET() {
		return PERSONAL_STREET;
	}

	public void setPERSONAL_STREET(String pERSONAL_STREET) {
		PERSONAL_STREET = pERSONAL_STREET;
	}

	public String getAPT_VILLA_NO() {
		return APT_VILLA_NO;
	}

	public void setAPT_VILLA_NO(String aPT_VILLA_NO) {
		APT_VILLA_NO = aPT_VILLA_NO;
	}

	public Integer getORDER_ID() {
		return ORDER_ID;
	}

	public void setORDER_ID(Integer oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}

	public String getDATE_INSERT() {
		return DATE_INSERT;
	}

	public void setDATE_INSERT(String dATE_INSERT) {
		DATE_INSERT = dATE_INSERT;
	}

	public String getDATE_UPDATE() {
		return DATE_UPDATE;
	}

	public void setDATE_UPDATE(String dATE_UPDATE) {
		DATE_UPDATE = dATE_UPDATE;
	}

	public Double getPRICE_DELIVERY() {
		return PRICE_DELIVERY;
	}

	public void setPRICE_DELIVERY(Double pRICE_DELIVERY) {
		PRICE_DELIVERY = pRICE_DELIVERY;
	}

	public Double getDISCOUNT_VALUE() {
		return DISCOUNT_VALUE;
	}

	public void setDISCOUNT_VALUE(Double dISCOUNT_VALUE) {
		DISCOUNT_VALUE = dISCOUNT_VALUE;
	}

	public Double getPRICE() {
		return PRICE;
	}

	public void setPRICE(Double pRICE) {
		PRICE = pRICE;
	}

	public String getSTATUS_ID() {
		return STATUS_ID;
	}

	public void setSTATUS_ID(String sTATUS_ID) {
		STATUS_ID = sTATUS_ID;
	}

	public String getDATE_STATUS() {
		return DATE_STATUS;
	}

	public void setDATE_STATUS(String dATE_STATUS) {
		DATE_STATUS = dATE_STATUS;
	}

	public boolean isPAYED() {
		return PAYED;
	}

	public void setPAYED(boolean pAYED) {
		PAYED = pAYED;
	}

	public int getPAY_SYSTEM_ID() {
		return PAY_SYSTEM_ID;
	}

	public void setPAY_SYSTEM_ID(int pAY_SYSTEM_ID) {
		PAY_SYSTEM_ID = pAY_SYSTEM_ID;
	}

	public boolean isCANCELED() {
		return CANCELED;
	}

	public void setCANCELED(boolean cANCELED) {
		CANCELED = cANCELED;
	}

	public Double getSUM_PAID() {
		return SUM_PAID;
	}

	public void setSUM_PAID(Double sUM_PAID) {
		SUM_PAID = sUM_PAID;
	}

	public long getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(long uSER_ID) {
		USER_ID = uSER_ID;
	}

	public long getLOCATION() {
		return LOCATION;
	}

	public void setLOCATION(long lOCATION) {
		LOCATION = lOCATION;
	}

	public String getFULL_NAME() {
		return FULL_NAME;
	}

	public void setFULL_NAME(String fULL_NAME) {
		FULL_NAME = fULL_NAME;
	}

	public String getPERSONAL_EMAIL() {
		return PERSONAL_EMAIL;
	}

	public void setPERSONAL_EMAIL(String pERSONAL_EMAIL) {
		PERSONAL_EMAIL = pERSONAL_EMAIL;
	}

	public int getBX_VERSION() {
		return BX_VERSION;
	}

	public void setBX_VERSION(int bX_VERSION) {
		BX_VERSION = bX_VERSION;
	}

	public String getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}

	public void setACCOUNT_NUMBER(String aCCOUNT_NUMBER) {
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
	}

	public String getTELEPHONE() {
		return TELEPHONE;
	}

	public void setTELEPHONE(String tELEPHONE) {
		TELEPHONE = tELEPHONE;
	}

	public String getTELEPHONE_2() {
		return TELEPHONE_2;
	}

	public void setTELEPHONE_2(String tELEPHONE_2) {
		TELEPHONE_2 = tELEPHONE_2;
	}

	public String getTIME_UPDATE() {
		return TIME_UPDATE;
	}

	public void setTIME_UPDATE(String tIME_UPDATE) {
		TIME_UPDATE = tIME_UPDATE;
	}

	public List<Changes> getChanges() {
		return changes;
	}

	public void setChanges(List<Changes> changes) {
		this.changes = changes;
	}

}
