package log.trybe;

public class App {

  public static void main(String[] args) {
    System.out.println("Iniciando Trybe Log");
    Car fiorino = new Car("DBZ-6914", 2006);
    fiorino.toFuel("São Paulo", "Jão", 600);
    fiorino.toFuel("Canas", "Jão", 650);
    fiorino.refuellingsList();

    Motorcycle pangare = new Motorcycle("BYT-2116", 2008);
    pangare.toFuel("Cachoeira Paulista", "Jana", 60);
    pangare.toFuel("São Paulo", "Jana", 60.25);
    pangare.toFuel("Salto do Itararé", "Jana", 66.80);
    pangare.refuellingsList();
  }
}
