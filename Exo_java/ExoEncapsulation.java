package Exo_java;

public class ExoEncapsulation {

    public static void main(String[] args) {

        EncapsulationGettersSetter sr = new EncapsulationGettersSetter(2020);
        EncapsulationGettersSetter sr2 = new EncapsulationGettersSetter(2026);
        EncapsulationGettersSetter sr3 = new EncapsulationGettersSetter(2023);

        sr.setExpirationYear(2050);
        System.out.println(sr.getExpirationYear());
        System.out.println(sr2.getExpirationYear());
    }

}
