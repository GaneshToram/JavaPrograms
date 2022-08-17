package Generics;

import java.util.ArrayList;

class Container<T extends Number>
{
    T val;
    void show()
    {
        System.out.println(val.getClass().getName());
    }
    void demo(ArrayList<? super T> obj)
    {
        System.out.println(obj.size());
    }
}
public class First 
{
    public static void main(String[] args) 
    {
        Container<Integer> c = new Container<>();
        c.val = 2;
        c.show();
    }
}
