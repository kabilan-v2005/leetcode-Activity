using System.Threading;
public class Foo {
    private SemaphoreSlim gate1=new SemaphoreSlim(0,1);
    private SemaphoreSlim gate2=new SemaphoreSlim(0,1);
    public Foo() {
        
    }

    public void First(Action printFirst) {
        


printFirst();
        gate1.Release();
    }

    public void Second(Action printSecond) {
        gate1.Wait();
        // printSecond() outputs "second". Do not change or remove this line.
        printSecond();
        gate2.Release();
    }

    public void Third(Action printThird) {
        gate2.Wait();
        // printThird() outputs "third". Do not change or remove this line.
        printThird();
        
    }
}