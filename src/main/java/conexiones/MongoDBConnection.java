package conexiones;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBConnection {
    
    private static final String ATLAS_CONNECTION_STRING = "mongodb+srv://attendanceControl:iUMOsyRYbN2RtWQR@isw-projects.e8av5da.mongodb.net/";
    private static MongoClient instance;

    private MongoDBConnection() {
    }

    public static MongoClient getInstance() {
        if (instance == null) {
            synchronized (MongoDBConnection.class) {
                if (instance == null) {
                    instance = MongoClients.create(new ConnectionString(ATLAS_CONNECTION_STRING));
                }
            }
        }
        return instance;
    }

    public static MongoDatabase getDatabase(String databaseName) {
        return getInstance().getDatabase(databaseName);
    }

    public static void guardarDocumento(String databaseName, String collectionName, Document documento) {
        try {
            MongoDatabase database = getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.insertOne(documento);
            System.out.println("Documento insertado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void eliminarDocumentos(String databaseName, String collectionName, Document filtro) {
        try {
            MongoDatabase database = getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.deleteMany(filtro);
            System.out.println("Documentos eliminados correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editarDocumentos(String databaseName, String collectionName, Document filtro, Document actualizacion) {
        try {
            MongoDatabase database = getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.updateMany(filtro, actualizacion);
            System.out.println("Documentos actualizados correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


