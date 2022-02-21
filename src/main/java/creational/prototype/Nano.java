package creational.prototype;

import lombok.ToString;

@ToString
public class Nano extends BasicCar implements Cloneable
{
    public Nano()
    {
        setModelName("Nano");
        setPrice(10_000.00); //budget model price
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
