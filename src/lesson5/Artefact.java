package lesson5;

public class Artefact {
    int serialNumber;
    String culture;
    int century;

    Artefact(int serialNumber){
        this.serialNumber = serialNumber;
    }

    Artefact(int serialNumber, String culture){
        this(serialNumber);
        this.culture = culture;
    }

    Artefact(int serialNumber, String culture, int century){
        this(serialNumber, culture);
        this.century = century;
    }

    @Override
    public String toString() {
        return "Artefact{" +
                "serialNumber=" + serialNumber +
                ", culture='" + culture + '\'' +
                ", century=" + century +
                '}';
    }
}
