package conexiones;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static final String DATABASE_HOST = "localhost"; 
    private static final int DATABASE_PORT = 27017; 

    public static MongoClient connect() {
        return MongoClients.create("mongodb://" + DATABASE_HOST + ":" + DATABASE_PORT);
    }

    public static MongoDatabase getDatabase(String databaseName) {
        MongoClient client = connect();
        return client.getDatabase(databaseName);
    }
}
