public class FlightApp {

    public static void main(String[] args) {

        // Objekt erstellen
        Airplane myPlane = new Airplane();

        // Flugzeugtyp setzen
        myPlane.setAirplaneType("Boeing 747");

        // Boarding
        int passengers = myPlane.boarding(100);
        System.out.println("Passagiere an Bord: " + passengers);
        System.out.println("Passagiere an Bord: " + myPlane.boarding(50));

        // Starten
        myPlane.start(180);
        System.out.println("Geschwindigkeit nach Start: " + myPlane.getCurrentSpeed() + " Knoten");

        // Fliegen
        myPlane.flight(30000, 500);
        System.out.println("Flughöhe: " + myPlane.getCurrentAltitude() + " Fuss");
        System.out.println("Geschwindigkeit: " + myPlane.getCurrentSpeed() + " Knoten");

        // Landen
        myPlane.land();
        System.out.println("Flughöhe nach Landung: " + myPlane.getCurrentAltitude() + " Fuss");
        System.out.println("Geschwindigkeit nach Landung: " + myPlane.getCurrentSpeed() + " Knoten");
    }
}