package org.example.Clases;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class TelefonosMongo {

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

        database = mongoClient.getDatabase("BaseDatos");
        collection = database.getCollection("Telefonos");
        System.out.println("Conexion establecida");
    }

    public void crearTelefono(){


        Telefono telefono = new Telefono();
        telefono.setMarca("Samsung");
        telefono.setModelo("Galaxy S21 Ultra");
        telefono.setSistemaOperativo("Android");
        telefono.setTamanoPantalla(6.8);
        telefono.setMemoriaRAM(12);
        telefono.setAlmacenamientoInterno(256);
        telefono.setTieneCamara(true);
        telefono.setResolucionCamara(108);
        telefono.setEsSmartphone(true);
        telefono.setImei("12345767744309");






        Document document = new Document("marca", telefono.getMarca())
                .append("modelo", telefono.getModelo())
                .append("sistemaOperativo", telefono.getSistemaOperativo())
                .append("tamanoPantalla", telefono.getTamanoPantalla())
                .append("memoriaRAM", telefono.getMemoriaRAM())
                .append("almacenamientoInterno", telefono.getAlmacenamientoInterno())
                .append("tieneCamara", telefono.getTieneCamara())
                .append("resolucionCamara", telefono.getResolucionCamara())
                .append("esSmartphone", telefono.getEsSmartphone())
                .append("imei", telefono.getImei());

        collection.insertOne(document);
        System.out.println("Telefono Creado");
    }

    public void leerTelefono(){
        List<Telefono> telefono = new ArrayList<>();

        //leer todos los documentos
        for (Document doc: collection.find()){
            Telefono t = new Telefono();
            t.setMarca(doc.getString("marca"));
            t.setModelo(doc.getString("modelo"));
            t.setSistemaOperativo(doc.getString("sistemaOperativo"));
            t.setTamanoPantalla(doc.getDouble("tamanoPantalla"));
            t.setMemoriaRAM(doc.getInteger("memoriaRAM"));
            t.setAlmacenamientoInterno(doc.getInteger("almacenamientoInterno"));
            t.setTieneCamara(doc.getBoolean("tieneCamara"));
            t.setResolucionCamara(doc.getInteger("resolucionCamara"));
            t.setEsSmartphone(doc.getBoolean("esSmartphone"));
            t.setImei(doc.getString("imei"));
            telefono.add(t);

        }
        for (Telefono t: telefono){
            System.out.println("Marca: "+t.getMarca());
            System.out.println("Modelo: "+t.getModelo());
            System.out.println("Sistema Operativo: "+t.getSistemaOperativo());
            System.out.println("Tamaño de Pantalla: "+t.getTamanoPantalla());
            System.out.println("Memoria RAM: "+t.getMemoriaRAM());
            System.out.println("Almacenamiento Interno: "+t.getAlmacenamientoInterno());
            System.out.println("Tiene Camara: "+t.getTieneCamara());
            System.out.println("Resolucion de Camara: "+t.getResolucionCamara());
            System.out.println("Es Smartphone: "+t.getEsSmartphone());
            System.out.println("IMEI: "+t.getImei());
            System.out.println("_________________________");

        }
    }

    public void actualizarTelefono() {
        collection.updateOne(Filters.eq("imei", "12345767744309"),

                Updates.set("modelo", "Galaxy S21 Ultra 5G"));
        System.out.println("telefono actualizado");
    }

    public  void eliminarTelefono() {
        collection.deleteOne(Filters.eq("imei", "12345767744309"));
        System.out.println("Telefono eliminada");
    }

}
