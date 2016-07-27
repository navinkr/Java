package awok;

import java.util.Date;

public class Basket {
	
	
	 
	
	
	
    public long BASKET_ID;
    public long PRODUCT_ID;
    public String NAME;
    public Integer ORDER_ID;
    public float PRICE;
    public float PRICE_NEW;
    public float SECTION_ID;  
    public Date WARRANTY; 
    public int QUANTITY ;
    public int PRE_ORDER;
	
	public long getBASKET_ID() {
		return BASKET_ID;
	}
	public void setBASKET_ID(long bASKET_ID) {
		BASKET_ID = bASKET_ID;
	}
	public long getPRODUCT_ID() {
		return PRODUCT_ID;
	}
	public void setPRODUCT_ID(long pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public Integer getORDER_ID() {
		return ORDER_ID;
	}
	public void setORDER_ID(Integer orderid) {
		ORDER_ID = orderid;
	}
	public float getPRICE() {
		return PRICE;
	}
	public void setPRICE(float pRICE) {
		PRICE = pRICE;
	}
	public float getPRICE_NEW() {
		return PRICE_NEW;
	}
	public void setPRICE_NEW(float pRICE_NEW) {
		PRICE_NEW = pRICE_NEW;
	}
	public float getSECTION_ID() {
		return SECTION_ID;
	}
	public void setSECTION_ID(float sECTION_ID) {
		SECTION_ID = sECTION_ID;
	}
	public Date getWARRANTY() {
		return WARRANTY;
	}
	public void setWARRANTY(Date wARRANTY) {
		WARRANTY = wARRANTY;
	}
	public int getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(int qUANTITY) {
		QUANTITY = qUANTITY;
	} 
}
