package conexiones;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;

import org.bson.Document;

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

      public static void guardarDocumento(String databaseName, String collectionName, Document documento) {
        try {
            MongoClient client = connect();
            MongoDatabase database = client.getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.insertOne(documento);
            System.out.println("Documento insertado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void eliminarDocumentos(String databaseName, String collectionName, Document filtro) {
        try {
            MongoClient client = connect();
            MongoDatabase database = client.getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.deleteMany(filtro);
            System.out.println("Documentos eliminados correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editarDocumentos(String databaseName, String collectionName, Document filtro, Document actualizacion) {
        try {
            MongoClient client = connect();
            MongoDatabase database = client.getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.updateMany(filtro, actualizacion);
            System.out.println("Documentos actualizados correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
