package Numbers;

public class Main {
    public static void main(String[] args) {
        for (IRomanNumbers siffra : IRomanNumbers.values()) {
            System.out.println(siffra + " has the value " + siffra.getValue());
        }
    }
}