package com.example.clienteparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.clienteparcialuno.model.Color;
import com.example.clienteparcialuno.model.Movimiento;
import com.google.gson.Gson;

import java.net.InetAddress;
import java.util.UUID;

public class Controlador extends AppCompatActivity implements View.OnClickListener{

    private TCPSingleton tcp;
    private String movement;
    private String id;
    private String color;
    private Boolean activadorMov = false;
    private Boolean activadorCol = false;
    private Boolean activadorNam = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controlador);

        tcp = TCPSingleton.getInstance();
        tcp.setCliente(this);
        tcp.start();
    }

    public void messageArrival(String dato) {
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.up:

                id = UUID.randomUUID().toString();
                movement = "up";
                activadorMov = true;

                break;

            case R.id.down:

                id = UUID.randomUUID().toString();
                movement = "down";
                activadorMov = true;

                break;

            case R.id.left:

                id = UUID.randomUUID().toString();
                movement = "left";
                activadorMov = true;

                break;

            case R.id.right:

                id = UUID.randomUUID().toString();
                movement = "right";
                activadorMov = true;

                break;

            case R.id.recolor:

                id = UUID.randomUUID().toString();
                color = "red";
                activadorCol = true;

                break;

        }

        //Envio de movimiento.

        if(activadorNam == true){

            String name = getIntent().getExtras().getString("nameOfCharacter");

            Gson gson = new Gson();
            String json = gson.toJson(name);
            tcp.sharedData(json);

        }

        if(activadorMov == true) {

            Gson gson = new Gson();
            Movimiento obj = new Movimiento(movement, id);
            String json = gson.toJson(obj);
            tcp.sharedData(json);

            activadorMov = false;

        } else if (activadorCol == true){

            Gson gson = new Gson();
            Color obj = new Color(color, id);
            String json = gson.toJson(obj);
            tcp.sharedData(json);

            activadorCol = false;

        }
    }
}