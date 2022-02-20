package creational.Prototype;

import lombok.ToString;

@ToString
public class Nano extends BasicCar implements Cloneable
{
    public Nano()
    {
        super.modelName = "Nano";
        super.price = 10_000.00; //budget model price
    }

    @Override
    protected Object clone() {
        return super.clone();
    }

    @Override
    public void info() {
        System.out.println("This is a nano and costs "+ price);
    }
}
