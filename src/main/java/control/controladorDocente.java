/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import model.Docente;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author Kevin Rios
 */


public class controladorDocente {

    private static final String COLECCION_DOCENTES = "docente";

    private conexionMongo conexionMongoDB;

    public controladorDocente() {
        this.conexionMongoDB = new conexionMongo();
    }

    public void registrarDocente(Docente nuevoDocente) {
        
        try {
            // Encriptar la contraseña antes de almacenarla
        String contrasenaEncriptada = BCrypt.hashpw(nuevoDocente.getContrasena(), BCrypt.gensalt());
        nuevoDocente.setContrasena(contrasenaEncriptada);

        // Guardar en MongoDB
        try (MongoClient mongoClient = conexionMongoDB.conectar()) {
            MongoCollection<Document> collection = conexionMongoDB.obtenerBaseDeDatos(mongoClient).getCollection(COLECCION_DOCENTES);

            // Convertir el objeto Docente a Document
            Document docenteDocument = new Document()
                .append("nombre", nuevoDocente.getNombre())
                .append("matricula", nuevoDocente.getMatricula())
                .append("telefono", nuevoDocente.getTelefono())
                .append("correo", nuevoDocente.getCorreo())
                .append("contrasena", nuevoDocente.getContrasena());

            // Insertar el documento en la colección
            collection.insertOne(docenteDocument);
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
