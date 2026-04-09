class FizzBuzz {
    private int n;
    private Semaphore fiz=new Semaphore(0);
    private Semaphore buz=new Semaphore(0);
    private Semaphore fizbuz=new Semaphore(0);
    private Semaphore num=new Semaphore(1);
    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0){
                fiz.acquire();
                printFizz.run();
                num.release();
            }
        }
       

    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
       
        for(int i=1;i<=n;i++){
            if(i%3!=0 && i%5==0){
                buz.acquire();
                printBuzz.run();
                num.release();
            }
        }
        
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                fizbuz.acquire();
                printFizzBuzz.run();
                num.release();
            }
        }
        
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        
        for(int i=1;i<=n;i++){
            num.acquire();
            if (i % 3 == 0 && i % 5 == 0) {
                fizbuz.release();
            } else if (i % 3 == 0) {
                fiz.release();
            } else if (i % 5 == 0) {
                buz.release();
            } else {
                printNumber.accept(i);
                num.release();
            }
        }
      
    }
}