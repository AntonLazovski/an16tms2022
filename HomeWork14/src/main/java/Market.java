import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Market {
    public static void main(String[] args) {
        CashDesk[] cashDesk = {new CashDesk("cash desk N1"), new CashDesk("cash desk N2"),
                new CashDesk("cash desk N3")};

        String[] goods = {"cheese", "juice", "orange", "milk", "beer"};
        for (int i = 1; i <= 25; i++)
            new Buyer("№" + i, cashDesk, goods);
    }
}


class CashDesk {
    private String cashDeskName;
    private ReentrantLock lock;

    CashDesk(String cashDeskName) {
        this.cashDeskName = cashDeskName;
        lock = new ReentrantLock();
    }

    private String getCashDeskName() {
        return this.cashDeskName;
    }

    String getGoods(Buyer buyer) {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        int item = rand.nextInt(buyer.getGoods().length);

        lock.lock();

        try {

            for (; item < buyer.getGoods().length; item++) {

                if (item != buyer.getGoods().length - 1) {
                    result.append(buyer.getGoods()[item]).append(", ");
                } else {
                    result.append(buyer.getGoods()[item]);
                }
            }

            Thread.sleep((int) (Math.random() * 100));

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return "Buyer " + buyer.getName() + " buy: " + result + " in " + this.getCashDeskName();
    }

    ReentrantLock getLock() {
        return lock;
    }
}

class Buyer extends Thread {
    private CashDesk[] cashDesks;
    private String[] goods;

    Buyer(String name, CashDesk[] cashDesks, String[] goods) {
        super(name);
        this.cashDesks = cashDesks;
        this.goods = goods;
        this.start();
    }

    String[] getGoods() {
        return this.goods;
    }

    @Override
    public void run() {
        CashDesk chosenCashDesk = cashDesks[0];

        while (true) {
            for (CashDesk cashDesk : cashDesks) {
                if (cashDesk.getLock().getQueueLength() < chosenCashDesk.getLock().getQueueLength()) {
                    chosenCashDesk = cashDesk;
                    break;
                }
            }
            System.out.println(chosenCashDesk.getGoods(this));
            if (this.isAlive()) break;
        }
    }
}


