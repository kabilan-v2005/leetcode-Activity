class H2O {
    private Semaphore h=new Semaphore(2);
    private Semaphore o=new Semaphore(0);
    int hydrogencount=0;
    public H2O() {
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		
            h.acquire();
            releaseHydrogen.run();
            synchronized(this){
                hydrogencount++;
                if(hydrogencount==2)
                    o.release();
            }
        
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
       
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
            o.acquire();
            releaseOxygen.run();
            synchronized(this){
                    hydrogencount=0;
                    h.release(2);
        }
    }
}