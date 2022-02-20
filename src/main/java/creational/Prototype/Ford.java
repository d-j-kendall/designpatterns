package creational.Prototype;

import lombok.ToString;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
