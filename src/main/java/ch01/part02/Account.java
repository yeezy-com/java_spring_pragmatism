package ch01.part02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    private long money;

    public boolean canAfford(long amount) {
        return money >= amount;
    }

    public void withdraw(long amount) {
        money -= amount;
    }
}
