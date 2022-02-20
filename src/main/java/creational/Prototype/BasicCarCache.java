package creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class BasicCarCache {

    static Map<String, BasicCar> carCache = new HashMap<>();

    static
    {
        Ford ford = new Ford();
        carCache.put(ford.modelName, ford);

        Nano nano = new Nano();
        carCache.put(nano.modelName, nano);
    }

    public static BasicCar getCar(String model)
    {
        return carCache.get(model).copy();
    }
}
