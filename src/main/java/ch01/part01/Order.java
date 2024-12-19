package ch01.part01;

import java.util.List;

public class Order implements Calculable { // 역할을 구현

    private List<Calculable> foods; // 역할에 의존하도록 변경
    private double transactionFeePercent = 0.03; // 결제 수수료 3%

    @Override
    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable food : foods) {
            revenue += food.calculateRevenue();
        }

        return revenue;
    }

    @Override
    public long calculateProfit() {
        long income = 0;
        for (Calculable food : foods) {
            income += food.calculateProfit();
        }

        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}
