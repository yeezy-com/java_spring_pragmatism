package ch01.part02;

// Shop은 Account와 Product에 모든 값을 물어보면서 로직을 처리한다.
public class Shop {

    public void sell(Account account, Product product) {
        long price = product.getPrice();
        long mileage = account.getMoney();

        if (mileage >= price) {
            account.setMoney(mileage - price);
            System.out.println(product.getName() + "를 구매했습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
