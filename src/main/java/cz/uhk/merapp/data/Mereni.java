package cz.uhk.merapp.data;

import java.util.ArrayList;
import java.util.List;

public class Mereni {
    private List<Number> data = new ArrayList<>();

    public void addNumber(Number n)
    {
        data.add(n);
    }

    public  Number getNumber(int i)
    {
        return data.get(i);
    }

    public int getSize()
    {
        return data.size();
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
        return addTogether().doubleValue()/data.size();
    }

    public Number maximum()
    {
        Number Max = data.get(0);
        for (Number n1 : data){
            if (Max.doubleValue() < n1.doubleValue())
                Max = n1;
        }
        return Max;
    }

    public Number minimum()
    {
        Number min = data.get(0);
        for (Number n1 : data){
            if (min.doubleValue() > n1.doubleValue())
                min = n1;
        }
        return min;
    }
}
