package awok;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class ParseTokenExample8 {
	private static DB db = MongoDBManager.getInstance();

	public static void main(String[] args) throws MalformedURLException, IOException {

		iterateCollection();

		System.out.println("Done ..!!!");
	}

	public static void writeOuput(String content, String id) {
		try {

			File file = new File("live27/output_" + id + ".json");

			/*
			 * This logic is to create the file if the file is not already
			 * present
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			// Here true is to append the content to file
			FileWriter fw = new FileWriter(file, true);
			// BufferedWriter writer give better performance
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.write("\n");
			// Closing BufferedWriter Stream
			bw.close();

			// System.out.println("Data successfully appended at the end of
			// file");

		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	static void iterateCollection() throws IOException {

		DBCollection collection = db.getCollection("userOrders");
		// DBCursor curs = (DBCursor) collection.find().iterator();
		DBCursor curs = (DBCursor) collection.find(); /// .batchSize(100)
		GsonBuilder gsonBuilder = new GsonBuilder();
		List allJson = Collections.synchronizedList(new ArrayList());
		Gson gson = gsonBuilder.create();
		AllEntity all = new AllEntity();

		Set orderset = new HashSet();
		Set basketset = new HashSet();
		Set changeset = new HashSet();

		while (curs.hasNext()) {

			DBObject tobj = curs.next();
			String id = (String) tobj.get("_id");
			System.out.println("id=\t" + id);
			// all.set_id(id);
			BasicDBList orderList = new BasicDBList();
			orderList = (BasicDBList) tobj.get("orders");
			List<UserOrders> userOrder = new ArrayList<UserOrders>();

			for (int i = 0; i < orderList.size(); i++) {

				UserOrders userOrders = new UserOrders();
				BasicDBObject orderlist = new BasicDBObject();
				orderlist = (BasicDBObject) orderList.get(i);
				// orderset.add(orderlist.keySet());
				userOrders.setID(id);

				Integer userOrderId = ((Integer) orderlist.get("ORDER_ID"));
				if (userOrders != null && !userOrders.toString().trim().equals("null")) {
					userOrders.setORDER_ID(userOrderId);
				}
				Date userDateInsert = (Date) (orderlist.getDate("DATE_INSERT"));
				if (userDateInsert != null && !userDateInsert.toString().trim().equals("null")) {
					userOrders.setDATE_INSERT(changeDateFormat(userDateInsert));
				}

				Date userDateUpdate = (Date) (orderlist.getDate("DATE_UPDATE"));
				if (userDateUpdate != null && !userDateUpdate.toString().trim().equals("null")) {
					userOrders.setDATE_UPDATE(changeDateFormat(userDateUpdate));
				}
				Double userPriceDelivery = (Double) orderlist.get("PRICE_DELIVERY");
				if (userPriceDelivery != null && !userPriceDelivery.toString().trim().equals("null")) {
					userOrders.setPRICE_DELIVERY(userPriceDelivery);
				}

				Double userDiscountValue = (Double) orderlist.get("DISCOUNT_VALUE");
				if (userDiscountValue != null && !userDiscountValue.toString().trim().equals("null")) {
					userOrders.setDISCOUNT_VALUE(userDiscountValue);
				}

				Double userPrice = (Double) orderlist.get("PRICE");
				if (userPrice != null && !userPrice.toString().trim().equals("null")) {
					userOrders.setPRICE(userPrice);
				}

				String userStatusId = (String) orderlist.get("STATUS_ID");
				Date userDateStatus = (Date) (orderlist.getDate("DATE_STATUS"));
				Boolean userPayed = (Boolean) orderlist.getBoolean("PAYED");
				Double userSumPaid = (Double) orderlist.get("SUM_PAID");
				String userFullName = (String) orderlist.get("FULL_NAME");
				String userPersonalStreet = (String) orderlist.get("PERSONAL_STREET");
				String userAptVillano = (String) orderlist.get("APT_VILLA_NO");
				String userPersonalEmail = (String) orderlist.get("PERSONAL_EMAIL");
				String userAccountNo = (String) orderlist.get("ACCOUNT_NUMBER");
				String userTelephone = (String) orderlist.get("TELEPHONE");
				String userTelephone2 = (String) orderlist.get("TELEPHONE_2");
				Date userTimeUpdate = (Date) (orderlist.getDate("time_update"));
				Integer userDeliveryId = (Integer) orderlist.get("DELIVERY_ID");
				if (userStatusId != null && !userStatusId.toString().trim().equals("null")) {
					userOrders.setSTATUS_ID(userStatusId);
				}
				if (userDateStatus != null && !userDateStatus.toString().trim().equals("null")) {
					userOrders.setDATE_STATUS(changeDateFormat(userDateStatus));
				}

				if (userPayed != null && !userPayed.toString().trim().equals("null")) {
					userOrders.setPAYED(userPayed);
				}

				if (userSumPaid != null && !userSumPaid.toString().trim().equals("null")) {
					userOrders.setSUM_PAID(userSumPaid);
				}

				if (userFullName != null && !userFullName.toString().trim().equals("null")) {
					userOrders.setFULL_NAME(userFullName);
				}
				if (userPersonalStreet != null && !userPersonalStreet.toString().trim().equals("null")) {
					userOrders.setPERSONAL_STREET(userPersonalStreet);
				}
				if (userAptVillano != null && !userAptVillano.toString().trim().equals("null")) {
					userOrders.setAPT_VILLA_NO(userAptVillano);
				}
				if (userPersonalEmail != null && !userPersonalEmail.toString().trim().equals("null")) {
					userOrders.setPERSONAL_EMAIL(userPersonalEmail);
				}
				if (userAccountNo != null && !userAccountNo.toString().trim().equals("null")) {
					userOrders.setACCOUNT_NUMBER(userAccountNo);
				}
				if (userTelephone != null && !userTelephone.toString().trim().equals("null")) {
					userOrders.setTELEPHONE(userTelephone);
				}
				if (userTelephone2 != null && !userTelephone2.toString().trim().equals("null")) {
					userOrders.setTELEPHONE_2(userTelephone2);
				}
				if (userTimeUpdate != null && !userTimeUpdate.toString().trim().equals("null")) {
					userOrders.setTIME_UPDATE(changeDateFormat(userTimeUpdate));
				}
				if (userDeliveryId != null && !userDeliveryId.toString().trim().equals("null")) {
					userOrders.setDELIVERY_ID(userDeliveryId);
				}

				/////////
				Double userAdvancePaid = (Double) orderlist.get("ADVANCE_PAID");
				Integer userCancelReason = (Integer) orderlist.get("CANCEL_REASON");
				Integer userConfirmedGroup = (Integer) orderlist.get("CONFIRMED_GROUP");
				String userConfirmedOn = (String) orderlist.get("CONFIRMED_ON");
				Date userDateCancelled = (Date) (orderlist.getDate("DATE_CANCELED"));
				String userDeliveryReport = (String) orderlist.get("DELIVERY_REPORT");
				Integer userDriverId = (Integer) orderlist.get("DRIVER_ID");
				Integer userDuplicateOrderId = (Integer) orderlist.get("DUPLIC_ORDER_ID");
				String userEmpStatusId = (String) orderlist.get("EMP_STATUS_ID");
				String userExchangeAmount = (String) orderlist.get("EXCHANGE_AMOUNT");
				String userKeyCode = (String) orderlist.get("KEYCODE");
				String userLastMongoVersion = (String) orderlist.get("LAST_MONGO_VERSION");
				String userOPAuthCode = (String) orderlist.get("OP_AUTH_CODE");
				String userOPCard = (String) orderlist.get("OP_CARD");
				Double userOPPaidAmount = (Double) orderlist.get("OP_PAID_AMOUNT");
				String userOPStatusDesc = (String) orderlist.get("OP_STATUS_DESC");
				Double userOPTransfAmount = (Double) orderlist.get("OP_TRANSF_AMOUNT");
				Double userOPTransferred = (Double) orderlist.get("OP_TRANSFERRED");

				if (userAdvancePaid != null && !userAdvancePaid.toString().trim().equals("null")) {
					userOrders.setADVANCE_PAID(userAdvancePaid);
				}
				if (userCancelReason != null && !userCancelReason.toString().trim().equals("null")) {
					userOrders.setCANCEL_REASON((userCancelReason));
				}
				if (userConfirmedGroup != null && !userConfirmedGroup.toString().trim().equals("null")) {
					userOrders.setCONFIRMED_GROUP(userConfirmedGroup);
				}
				if (userConfirmedOn != null && !userConfirmedOn.toString().trim().equals("null")) {
					userOrders.setCONFIRMED_ON(userConfirmedOn);
				}
				if (userDateCancelled != null && !userDateCancelled.toString().trim().equals("null")) {
					userOrders.setDATE_CANCELED(changeDateFormat(userDateCancelled));
				}
				if (userDeliveryReport != null && !userDeliveryReport.toString().trim().equals("null")) {
					userOrders.setDELIVERY_REPORT(userDeliveryReport);
				}
				if (userDriverId != null && !userDriverId.toString().trim().equals("null")) {
					userOrders.setDRIVER_ID(userDriverId);
				}
				if (userDuplicateOrderId != null && !userDuplicateOrderId.toString().trim().equals("null")) {
					userOrders.setDUPLIC_ORDER_ID(userDuplicateOrderId);
				}
				if ((userEmpStatusId != null) && !userEmpStatusId.toString().trim().equals("null")) {
					userOrders.setEMP_STATUS_ID(userEmpStatusId);
				}
				if (userExchangeAmount != null && !userExchangeAmount.toString().trim().equals("null")) {
					userOrders.setEXCHANGE_AMOUNT(userExchangeAmount);
				}
				if (userKeyCode != null && !userKeyCode.toString().trim().equals("null")) {
					userOrders.setKEYCODE(userKeyCode);
				}
				if (userLastMongoVersion != null && !userLastMongoVersion.toString().trim().equals("null")) {
					userOrders.setLAST_MONGO_VERSION(userLastMongoVersion);
				}
				if (userOPAuthCode != null && !userOPAuthCode.toString().trim().equals("null")) {
					userOrders.setOP_AUTH_CODE(userOPAuthCode);
				}
				if (userOPCard != null && !userOPCard.toString().trim().equals("null")) {
					userOrders.setOP_CARD(userOPCard);
				}

				if (userOPPaidAmount != null && !userOPPaidAmount.toString().trim().equals("null")) {
					userOrders.setOP_PAID_AMOUNT(userOPPaidAmount);
				}
				if (userOPStatusDesc != null && !userOPStatusDesc.toString().trim().equals("null")) {
					userOrders.setOP_STATUS_DESC(userOPStatusDesc);
				}
				if (userOPTransfAmount != null && !userOPTransfAmount.toString().trim().equals("null")) {
					userOrders.setOP_TRANSF_AMOUNT(userOPTransfAmount);
				}
				if (userOPTransferred != null && !userOPTransferred.toString().trim().equals("null")) {
					userOrders.setOP_TRANSFERRED(userOPTransferred);
				}

				BasicDBList basket = new BasicDBList();
				basket = (BasicDBList) orderlist.get("basket");

				List<Changes> changeslist = new ArrayList<Changes>();
				BasicDBObject changelist = new BasicDBObject();
				if (basket != null) {
					Changes changesObj = new Changes();

					for (int k = 0; k < basket.size(); k++) {

						BasicDBObject basketDBObject = new BasicDBObject();
						basketDBObject = (BasicDBObject) basket.get(k);
						/// basketset.add(basketDBObject.keySet());
						// Integer orderid = (Integer)
						// basketDBObject.get("ORDER_ID");
						Date datecreated = (Date) (basketDBObject.getDate("DATE_CREATE"));
						Integer userId = (Integer) basketDBObject.get("USER_ID");
						Integer type = (Integer) basketDBObject.get("TYPE");
						Integer productId = (Integer) basketDBObject.get("PRODUCT_ID");
						Integer quantity = (Integer) basketDBObject.get("QUANTITY");
						String statusId = (String) basketDBObject.get("STATUS_ID");
						String delivery_doc_num = ((String) basketDBObject.get("DELIVERY_DOC_NUM"));
						String payVocuherNum = (String) (basketDBObject.get("PAY_VOUCHER_NUM"));
						Date payVoucherDate = (Date) (basketDBObject.getDate("PAY_VOUCHER_DATE"));
						Integer basketId = (Integer) basketDBObject.get("BASKET_ID");
						String name = (String) basketDBObject.get("NAME");
						Double price = (Double) basketDBObject.get("PRICE");
						Object preorder = (Object) basketDBObject.get("PRE_ORDER") + "";
						Double priceNew = (Double) basketDBObject.get("PRICE_NEW");
						Integer sectionId = (Integer) basketDBObject.get("SECTION_ID");

						Date warranty = (Date) (basketDBObject.getDate("WARRANTY"));

						if (datecreated != null && !datecreated.toString().trim().equals("null")) {

							changesObj.setDATE_CREATE((changeDateFormat(datecreated)));
						}
						if (userId != null && !userId.toString().trim().equals("null")) {
							changesObj.setUSER_ID(userId);
						}
						if (type != null && !type.toString().trim().equals("null")) {
							changesObj.setTYPE(type);
						}
						if (productId != null && !productId.toString().trim().equals("null")) {
							changesObj.setPRODUCT_ID(productId);
						}
						if (quantity != null && !quantity.toString().trim().equals("null")) {
							changesObj.setQUANTITY(quantity);
						}
						if (statusId != null && !statusId.toString().trim().equals("null")) {
							changesObj.setSTATUS_ID(statusId);
						}

						if (delivery_doc_num != null && !delivery_doc_num.toString().trim().equals("null")) {
							changesObj.setDELIVERY_DOC_NUM(delivery_doc_num);
						}

						if (payVocuherNum != null && !payVocuherNum.toString().trim().equals("null")) {
							changesObj.setPAY_VOUCHER_NUM(payVocuherNum);
						}
						if (payVoucherDate != null && !payVoucherDate.toString().trim().equals("null")) {
							changesObj.setPAY_VOUCHER_DATE(changeDateFormat(payVoucherDate));
						}
						if (basketId != null && !basketId.toString().trim().equals("null")) {
							changesObj.setBASKET_ID(basketId);
						}
						if (name != null && !name.toString().trim().equals("null")) {
							changesObj.setNAME(name);
						}
						if (price != null && !price.toString().trim().equals("null")) {
							changesObj.setPRICE(price);
						}
						if (warranty != null && !warranty.toString().trim().equals("null")) {
							String strwarranty = changeDateFormat(warranty);
							changesObj.setWARRANTY(strwarranty);
						}

						if (priceNew != null && !priceNew.toString().trim().equals("null")) {
							changesObj.setPRICE_NEW(priceNew);

						}

						if (sectionId != null && !sectionId.toString().trim().equals("null")) {
							changesObj.setSECTION_ID(sectionId);

						}

						if (preorder != null && !preorder.toString().trim().equals("null")) {
							changesObj.setPRE_ORDER(preorder);
						}
					}
					changeslist.add(changesObj);
				}

				BasicDBList changes = new BasicDBList();
				changes = (BasicDBList) orderlist.get("changes");

				if (changes != null && changes.size() > 0) {

					for (int l = 0; l < changes.size(); l++) {
						Changes changesObj = new Changes();

						changelist = (BasicDBObject) changes.get(l);
						// changeset.add(changelist.keySet());

						Date datecreated = (Date) (changelist.getDate("DATE_CREATE"));

						Integer userId = (Integer) changelist.get("USER_ID");
						Integer type = (Integer) changelist.get("TYPE");
						Integer productId = (Integer) changelist.get("PRODUCT_ID");
						Integer quantity = (Integer) changelist.get("QUANTITY");
						String statusId = (String) changelist.get("STATUS_ID");
						String delivery_doc_num = ((String) changelist.get("DELIVERY_DOC_NUM"));
						String payVocuherNum = (String) changelist.get("PAY_VOUCHER_NUM");
						Date payVoucherDate = (Date) (changelist.getDate("PAY_VOUCHER_DATE"));
						Integer basketId = (Integer) changelist.get("BASKET_ID");
						String name = (String) changelist.get("NAME");
						Double price = (Double) changelist.get("PRICE");
						String warranty = (String) (changelist.getDate("WARRANTY") + "");

						Integer currency = (Integer) changelist.get("CURRENCY");
						Integer paySystemId = (Integer) changelist.get("PAY_SYSTEM_ID");
						// boolean marked = (boolean) changelist.get("MARKED");
						String reasonMarked = (String) changelist.get("REASON_MARKED");
						Integer deliveryId = (Integer) changelist.get("DELIVERY_ID");
						boolean canceled = (boolean) changelist.getBoolean("CANCELED");
						String reasonCancelled = (String) changelist.get("REASON_CANCELED");
						Double priceDeliver = (Double) changelist.get("PRICE_DELIVERY");

						Date deliverDocDate = (Date) changelist.getDate("DELIVERY_DOC_DATE");

						String trackingNo = (String) changelist.get("TRACKING_NUMBER");

						if (deliverDocDate != null && !deliverDocDate.toString().trim().equals("null")) {
							changesObj.setDELIVERY_DOC_DATE(deliverDocDate);
						}

						if (trackingNo != null && !trackingNo.toString().trim().equals("null")) {
							changesObj.setTRACKING_NUMBER(trackingNo);
						}

						if (currency != null && !currency.toString().trim().equals("null")) {
							changesObj.setCURRENCY(currency);

						}
						if (paySystemId != null && !paySystemId.toString().trim().equals("null")) {
							changesObj.setPAY_SYSTEM_ID(paySystemId);

						}

						if (reasonMarked != null && !reasonMarked.toString().trim().equals("null")) {
							changesObj.setREASON_MARKED(reasonMarked);

						}
						if (deliveryId != null && !deliveryId.toString().trim().equals("null")) {
							changesObj.setDELIVERY_ID(deliveryId);

						}

						changesObj.setCANCELED(canceled);

						if (reasonCancelled != null && !reasonCancelled.toString().trim().equals("null")) {
							changesObj.setREASON_CANCELED(reasonCancelled);

						}
						if (priceDeliver != null && !priceDeliver.toString().trim().equals("null")) {
							changesObj.setPRICE_DELIVERY(priceDeliver);

						}

						if (datecreated != null && !datecreated.toString().trim().equals("null")) {
							changesObj.setDATE_CREATE(changeDateFormat(datecreated));
						}
						if (userId != null && !userId.toString().trim().equals("null")) {
							changesObj.setUSER_ID(userId);
						}
						if (type != null && !type.toString().trim().equals("null")) {
							changesObj.setTYPE(type);
						}
						if (productId != null && !productId.toString().trim().equals("null")) {
							changesObj.setPRODUCT_ID(productId);
						}
						if (quantity != null && !quantity.toString().trim().equals("null")) {
							changesObj.setQUANTITY(quantity);
						}
						if (statusId != null && !statusId.toString().trim().equals("null")) {
							changesObj.setSTATUS_ID(statusId);
						}
						if (delivery_doc_num != null && !delivery_doc_num.toString().trim().equals("null")) {
							changesObj.setDELIVERY_DOC_NUM(delivery_doc_num);
						}
						if (payVocuherNum != null && !payVocuherNum.toString().trim().equals("null")) {
							changesObj.setPAY_VOUCHER_NUM(payVocuherNum);
						}
						if (payVoucherDate != null && !payVoucherDate.toString().trim().equals("null")) {
							changesObj.setPAY_VOUCHER_DATE(changeDateFormat(payVoucherDate));
						}
						if (basketId != null && !basketId.toString().trim().equals("null")) {
							changesObj.setBASKET_ID(basketId);
						}
						if (name != null && !name.toString().trim().equals("null")) {
							changesObj.setNAME(name);
						}
						if (price != null && !price.toString().trim().equals("null")) {
							changesObj.setPRICE(price);
						}

						if (type != null && !type.toString().trim().equals("null")) {
							changesObj.setTYPE(type);
						}

						if (warranty != null && !warranty.toString().trim().equals("null")) {
							changesObj.setWARRANTY(warranty);
						}
						changeslist.add(changesObj);

					}

				}
				if (changeslist.size() > 0) {
					userOrders.setChanges(changeslist);
				}
				userOrder.add(userOrders);
				all.setUserOrders(userOrder);
				// System.out.println(gson.toJson(userOrders));
				writeOuput(gson.toJson(userOrders), id);
			}

			// System.out.println(gson.toJson(userOrder));
			// System.out.println(gson.toJson(all));

			// allJson.add(gson.toJson(all));
			// writeOuput(gson.toJson(all),id);
		}

		/*
		 * System.out.println("ORDERSET\t" + orderset);
		 * System.out.println("BASKETSET\t" + basketset);
		 * System.out.println("CHANGESET \t" + changeset);
		 */

		// return allJson;
	}

	static String changeDateFormat1(Date date) {
		// YYYY-MM-DD HH:MM:SS.SSSSSS
		SimpleDateFormat ft = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.getDefault());
		DateFormat dateInstance = SimpleDateFormat.getDateInstance();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd
		// HH:mm:ss.SSS"); When required in timestamp
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS.SSSSSS");

		Date newdate = null;
		// Date newBigDate = null;
		String bigDate = null;
		try {

			newdate = ft.parse(date + "");
			System.out.println("newdate = " + newdate);
			bigDate = sdf.format(newdate);
			System.out.println("bigDate = " + bigDate);
			// System.out.println("bigDate= "+bigDate);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		return bigDate + "";
	}

	static String changeDateFormat(Date date) {

		DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.getDefault());
		String formatedDate = "";
		String formatedDate1 = "";
		try {
			Date newdate = (Date) formatter.parse(date.toString());
			Calendar cal = Calendar.getInstance();
			cal.setTime(newdate);
			formatedDate = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE)
					+ " " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND)
					+ "." + cal.get(Calendar.ZONE_OFFSET);
			// System.out.println("formatedDate1 : " + formatedDate);

			StringBuilder sb = new StringBuilder();
			// Send all output to the Appendable object sb
			Formatter widthformatter = new Formatter(sb, Locale.US);

			int year = cal.get(Calendar.YEAR);
			int month = (cal.get(Calendar.MONTH) + 1);
			int date1 = cal.get(Calendar.DATE);
			int hour = cal.get(Calendar.HOUR);
			int min = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			int zone = cal.get(Calendar.ZONE_OFFSET);
			String fmonth = String.format("%02d%n", month).trim();
			String fdate = String.format("%02d%n", date1).trim();
			String fhour = String.format("%02d%n", hour).trim();
			String fmin = String.format("%02d%n", min).trim();
			String fsec = String.format("%02d%n", sec).trim();
			String fzone = String.format("%06d%n", zone);

			formatedDate1 = cal.get(Calendar.YEAR) + "-" + fmonth + "-" + fdate + " " + fhour + ":" + fmin + ":" + fsec
					+ "." + "000000";
			// System.out.println("formatedDate2 : " + formatedDate1);

		} catch (ParseException e) {

			e.printStackTrace();
		}

		return formatedDate1;

	}

}