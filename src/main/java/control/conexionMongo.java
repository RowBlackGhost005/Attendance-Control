/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;


/**
 *
 * @author Kevin Rios
 */


public class conexionMongo {

    private static final String URI = "mongodb+srv://attendanceControl:iUMOsyRYbN2RtWQR@isw-projects.e8av5da.mongodb.net/?retryWrites=true&w=majority";
    private static final String DATABASE_NAME = "attendanceControl";

    public MongoClient conectar() {
        return MongoClients.create(URI);
    }

    public MongoDatabase obtenerBaseDeDatos(MongoClient mongoClient) {
        return mongoClient.getDatabase(DATABASE_NAME);
    }
}
