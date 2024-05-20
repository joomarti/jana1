public class Mers extends Car {

    public Mers(String model, String colour, String maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("mashuna toktody");
    }

    @Override
    public void bas() {
        System.out.println("jashuna toktodu");

    }
}
