package awok;

import java.net.UnknownHostException;
import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoDBManager {

	private static DB mongoMgr;

	public static DB getInstance() {
		if (mongoMgr == null) {
			MongoClient mongo;
			try {
				mongo = new MongoClient("localhost", 27017);

				mongoMgr = mongo.getDB("local");
			
			} catch (UnknownHostException e) {
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
			}
		}
		return mongoMgr;
	}
}
