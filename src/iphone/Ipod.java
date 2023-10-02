package iphone;

public class Ipod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando uma música...");
    }

    @Override
    public void pausar() {
        System.out.println("pausando uma música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado uma música...");
    }

}
