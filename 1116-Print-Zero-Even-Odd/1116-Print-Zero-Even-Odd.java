class ZeroEvenOdd {
    private int n;
    Semaphore semZeor, semOdd, semEven;
    public ZeroEvenOdd(int n) {
        this.n = n;
        semZeor =  new Semaphore(1, true);
        semOdd  =  new Semaphore(0, true);
        semEven =  new Semaphore(0, true);
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= this.n; i++) {
            semZeor.acquire();
            printNumber.accept(0);
            if (i % 2 == 0) {
                // call even
                semEven.release();
            } else {
                // call odd
                semOdd.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= this.n; i += 2) {
            semEven.acquire();
            printNumber.accept(i);
            semZeor.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= this.n; i += 2) {
            semOdd.acquire();
            printNumber.accept(i);
            semZeor.release();
        }
    }
}