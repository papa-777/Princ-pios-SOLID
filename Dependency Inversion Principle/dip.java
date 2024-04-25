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


// O princípio da inversão de dependência diz que devemos depender de abstrações (interfaces) ao invés de implementações (classes concretas) a fim de ter um menor acoplamento entre as camadas do sistema.
// No código acima sem abstração, o método da classe CarUtil depende da classe Ferrari para funcionar. Isso significa que, caso você altere o método drive dentro da classe Ferrari, a classe CarUtil vai ser diretamente afetada, podendo causar bugs.
// Já utilizando o princípio DIP com abstração no código abaixo, o método CarUtil não depende mais da classe Ferrari e sim, da interface car, podendo receber qualquer argumento que implemente a mesma.