package Java8;

interface A
{
    void show(int i);
}

interface X
{
    int get();
}

// Normal way of implementing the interface

// Separate class files are created for interface A and class B

// class B implements A
// {
//     public void show(int i)
//     {
//         System.out.print("Hello " + i);
//     }
// }

// Since class B is used only once, we can make that class as anonymous class

public class LambdaExpression 
{
    public static void main(String[] args) 
    {
        /* This class is Anonymous inner class. When we compile it will also create a class file
        A a = new A()
        {
            public void show(int i)
            {
                System.out.print("Hello " + i);
            }
        };
        */
        /* In java8 we have this feature of Lambda expressions. The main advantage of these 
           Lambda expressions are they wont create separate class files. So, the run time will
           be less.
         */
        A a = (i) ->
            {
                System.out.println("Hello "+ i);
            };
        X x = () -> { return 0; };
        
        a.show(6);
        System.out.print(x.get());
    }
}
