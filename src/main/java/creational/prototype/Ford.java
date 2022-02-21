package creational.prototype;

import lombok.ToString;

@ToString
public class Ford extends BasicCar implements Cloneable
{
    public Ford()
    {
        setModelName("Ford");
        setPrice(25_000.00); // luxury model
    }

    @Override
    protected Object clone() {
        return super.clone();
    }

    public void info() {
        System.out.println("This is a Ford and costs "+price);
    }
}
