package creational.Prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;
import java.util.logging.Logger;

@Getter
@ToString
public abstract class BasicCar implements Cloneable, Serializable {

    String modelName;
    Double price = 1000.00;


    public abstract void info();

    public BasicCar copy()
    {
        BasicCar car = null;
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.getClass().getSimpleName()+".Copy"+Thread.currentThread().getId()));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(this.getClass().getSimpleName()+".Copy"+Thread.currentThread().getId())))
        {
            objectOutputStream.writeObject(this);

            car = (BasicCar) objectInputStream.readObject();
        }
        catch (Exception e)
        {
            System.out.println("Couldn't copy object");
        }

        return car;
    }

    @Override
    protected Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException)
        {
            Logger.getLogger(this.getClass().getSimpleName()).info("Clone not supported");
        }

        return clone;
    }
}
