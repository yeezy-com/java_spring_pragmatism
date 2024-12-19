package ch01.part01;

public class Food implements Calculable {

    private long price;
    private long originCost; // 원가

    @Override
    public long calculateRevenue() {
        return price;
    }

    @Override
    public long calculateProfit() {
        return price - originCost;
    }
}
