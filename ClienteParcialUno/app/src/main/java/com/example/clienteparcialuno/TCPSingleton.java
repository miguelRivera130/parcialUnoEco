package com.example.clienteparcialuno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPSingleton extends Thread {

    private static TCPSingleton instance;

    private TCPSingleton() {
    }

    public static TCPSingleton getInstance() {

        if (instance == null) {
            instance = new TCPSingleton();
        }
        return instance;

    }

    // declaraciones
    private BufferedWriter writer;
    private Socket socket;
    private String data = "0,0";
    private Controlador observer;

    // ActivadorDeSuscripcion
    public void setCliente(Controlador observer) {
        this.observer = observer;
    }

    public void run() {
        try {

            //ApartadoDeConecion
            socket = new Socket("192.168.1.68",5000);
            System.out.println("coneccion realizada");


            //ApartadoDeDeclaracion
            InputStream is = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            writer = new BufferedWriter(new OutputStreamWriter(out));
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            //ApartadoParaRecepcionDeDAtos
            while(true){
                System.out.println("envia informacion");
                String data = reader.readLine();
                observer.messageArrival(data);

            }
        } catch(UnknownHostException e) {

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void sharedData(String data) {

        new Thread(

                ()->{
                    try {

                        writer.write(data + "\n");
                        writer.flush();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

        ).start();

    }
}
