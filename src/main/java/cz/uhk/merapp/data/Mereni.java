package cz.uhk.merapp.data;


import cz.uhk.util.Seznam;
import cz.uhk.util.impl.SpojovySeznam;

public class Mereni {
    private Seznam<Number> data = new SpojovySeznam<>();

    public void addNumber(Number n)
    {
        data.pridej(n);
    }

    public  Number getNumber(int i)
    {
        return data.vrat(i);
        //f
    }

    public int getSize()
    {
        return data.pocet();
    }


    public Number addTogether()
    {
        Number added = 0;
        for (Number n1 : data){
            added = added.doubleValue() + n1.doubleValue();
        }
        return added;
    }

    public  Number average()
    {
        return addTogether().doubleValue()/data.pocet();
    }

    public Number maximum()
    {
        Number Max = data.vrat(0);
        for (Number n1 : data){
            if (Max.doubleValue() < n1.doubleValue())
                Max = n1;
        }
        return Max;
    }

    public Number minimum()
    {
        Number min = data.vrat(0);
        for (Number n1 : data){
            if (min.doubleValue() > n1.doubleValue())
                min = n1;
        }
        return min;
    }
}
