package Inheritance;
class Parent
{
    int a = 10;
    void print()
    {
        System.out.println("This is Parent class" + a);
    }
}
class Child extends Parent
{

}
public class Single
{
    public static void main(String[] args) 
    {
        Child single = new Child();
        System.out.println(single.a);
        single.print();
    }
}
