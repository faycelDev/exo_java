package Exo_java;

public class EncapsulationGettersSetter {

    public EncapsulationGettersSetter(int expiration) {

        this.ExpirationYear = expiration;
        System.out.println("enregistrement du produit, valide jusqu' en : " + this.ExpirationYear);

            if(numberOfRegistration > 0) {

                this.ExpirationYear = expiration;
                numberOfRegistration--;

                System.out.println("Logiciel valide ( expiration : " + this.ExpirationYear + ")");
                System.out.println("Enregistrement restant : " + numberOfRegistration);
            }else {
                System.out.println("Maximum de validations éffectuées !");
            }
    }

    public int getExpirationYear() {
        return this.ExpirationYear;
    }

    public void setExpirationYear(int expiration) {

        return;

    }
    private static int numberOfRegistration = 2;

    private int ExpirationYear;
}
