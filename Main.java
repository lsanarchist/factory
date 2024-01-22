interface Car {
    void drive();
    void stop();
}


class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Sedan is moving");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }
}

class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("SUV is moving");
    }

    @Override
    public void stop() {
        System.out.println("SUV stopped");
    }
}


interface CarFactory {
    Car createCar();
}


class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}

class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }
}


public class Main {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.drive(); // Output: Sedan is moving

        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar();
        suv.stop(); // Output: SUV stopped
    }
}
