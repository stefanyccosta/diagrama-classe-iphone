package iphone;

import iphone.AparalhoTelefonico;

public class Iphone extends Ipod implements AparalhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("ligando...");
    }

    @Override
    public void atender() {
        System.out.println("atendendo...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }



}