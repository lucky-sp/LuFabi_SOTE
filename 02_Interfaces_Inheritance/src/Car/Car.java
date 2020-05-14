public class Car{

    int leistung;
    int kilometerstand;
    String marke;
    String modell;

    public Car (int leistung, int kilometerstand, String marke, String modell){
        this.leistung = leistung;
        this.kilometerstand = kilometerstand;;
        this.marke = marke;
        this.modell = modell;
    }

    static class CarBuilder{

        private int leistung;
        private int kilometerstand;
        private String marke;
        private String modell;

        public CarBuilder setLeistung(int leistung){
            this.leistung = leistung;
            return this;
        }

        public CarBuilder setKilometerstand(int kilometerstand){
            this.kilometerstand = kilometerstand;
            return this;
        }

        public CarBuilder setMarke(String marke){
            this.marke = marke;
            return this;
        }

        public CarBuilder setModell(String modell){
            this.modell = modell;
            return this;
        }

        public Car build(){
            return new Car(leistung, kilometerstand, marke, modell);
        }

    }

} 