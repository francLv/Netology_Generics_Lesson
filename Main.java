public class Main {

    public static void main(String[] args) {
        Canister<Fuel> fuelCanister = new Canister<>(new Fuel());
        Canister<Water> waterCanister = new Canister<>(new Water());

        PoisonJar<Cianide> cianidePoisonJar = new PoisonJar<>(new Cianide());



    }
}
