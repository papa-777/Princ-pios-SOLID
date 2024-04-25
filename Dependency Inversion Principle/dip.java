class Ferrari { 
    public void drive() { 
    } 
} 
class CarUtil { 
    public static void drive(Ferrari ferrari) { 
        ferrari.drive(); 
    } 
}

------------------


interface Car {
    public void drive();
}
class Ferrari implements Car {
    @Override
    public void drive() {
    }
}
class CarUtil {
    public static void drive(Car car) {
        car.drive();
    }
}
