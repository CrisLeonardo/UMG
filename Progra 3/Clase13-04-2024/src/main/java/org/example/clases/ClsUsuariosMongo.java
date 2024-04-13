package org.example.clases;
import com.mongodb.client.*;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import com.mongodb.ConnectionString;

import java.util.ArrayList;
import java.util.List;


public class ClsUsuariosMongo {

private MongoClient mongoClient;
private MongoDatabase database;
private MongoCollection<Document> collection;

public void conexion(){
    //cadena de conezion, contiene la informacion de la instalacion de mogodb
    ConnectionString connecctionString = new ConnectionString("mongodb://localhost:27017");

    //se crean las configuraciones especificas para conezion y manejo de la db
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connecctionString)
            .retryWrites(true)
            .build();
    //crear la conexion y establece la comunicacion
    mongoClient = MongoClients.create(settings);

    database = mongoClient.getDatabase("miBaseDatos");
    collection = database.getCollection("usuarios");
    System.out.println("Conexion establecida");
}

//crear un usuario (insert)
    public void crearUsuario(){
//    mdUsuario usuario = new mdUsuario();
//    usuario.setNombre("Juan");
//    usuario.setCorreo("juanitoElVrgas@gmail.com");
//    usuario.setIdTelegram(1234567890);

        mdUsuario usuario = new mdUsuario();
        usuario.setNombre("Mariita");
        usuario.setCorreo("mariitaDelBarrio@gmail.com");
        usuario.setIdTelegram(644319864);




    Document document = new Document("nombre", usuario.getNombre())
            .append("correo", usuario.getCorreo())
            .append("idTelegram", usuario.getIdTelegram());
    collection.insertOne(document);
    System.out.println("Usuario creado");
    }
    
    public void leerUsuario(){
        List<mdUsuario> usuario = new ArrayList<>();
        
        //leer todos los documentos
        for (Document doc: collection.find()){
            mdUsuario u = new mdUsuario();
            u.setNombre(doc.getString("nombre"));
            u.setCorreo(doc.getString("correo"));
            u.setIdTelegram(doc.getLong("idTelegram"));
            usuario.add(u);
        }
        for (mdUsuario u: usuario){
            System.out.println("Nombre: "+u.getNombre());
            System.out.println("Correo: "+u.getCorreo());
            System.out.println("IdTelegram: "+u.getIdTelegram());
            System.out.println("_________________________");
        }
    }

    private  void actualizarUsuario() {
        collection.updateOne(Filters.eq("idTelegram", 88745587),
                Updates.set("correo", "Nuevo@example.com"));
        System.out.println("Usuario actualizado");
    }

    private  void eliminarUsuario() {
        collection.deleteOne(Filters.eq("idTelegram", 9995587));
        System.out.println("Usuario eliminado");
    }

    private  void desconectarMongoDB() {
        // Cerrar la conexión
        mongoClient.close();
        System.out.println("Desconectado de MongoDB");
    }

    private  void conectarMongoDB() {
        // Conexión a MongoDB
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        mongoClient = MongoClients.create(settings);

        // Obtener la base de datos y la colección
        database = mongoClient.getDatabase("miBaseDeDatos");
        collection = database.getCollection("usuarios");
        System.out.println("Conectado a MongoDB");
    }

    //buscar usuario por correo
    //returna un registro
    private  void buscarUnUsuarioCorreo(String correo) {
        Document doc = collection.find(Filters.eq("correo", correo)).first();
        if (doc != null) {
            System.out.println("Usuario encontrado: " + doc.toJson());
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    //buscar usuario por correo
    //returna un registro




    //buscar usuario por correo
    //retorna una lista de registros
    private  List<mdUsuario> buscarUsuariosPorCorreo(String correo) {
        List<mdUsuario> usuarios = new ArrayList<>();
        MongoCursor<Document> cursor = collection.find(Filters.eq("correo", correo)).iterator();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                mdUsuario u = new mdUsuario();
                u.setIdTelegram(doc.getLong("idTelegram"));
                u.setNombre(doc.getString("nombre"));
                u.setCorreo(doc.getString("correo"));
                usuarios.add(u);
            }
        } finally {
            cursor.close();
        }

        return usuarios;
    }

}//end class
