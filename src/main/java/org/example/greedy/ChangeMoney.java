package org.example.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeMoney {
    private int totalPrice;
    private final List<Integer> coinTypes;

    public ChangeMoney(int totalPrice, int[] coinTypes) {
        this.totalPrice = totalPrice;
        this.coinTypes = Arrays.stream(coinTypes).boxed().collect(Collectors.toList());
    }

    public int getCoins() {
        int coinCnt = 0;

        for (int coin : coinTypes) {
            coinCnt += totalPrice / coin;
            totalPrice = totalPrice % coin;
        }

        return coinCnt;
    }
}
