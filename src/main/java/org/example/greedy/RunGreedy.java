package org.example.greedy;

public class RunGreedy {
    public static void main(String[] args) {
        runChangeMoney();
    }

    private static void runChangeMoney() {
        int[] coinTypes = {500, 100, 50, 10};
        int totalPrice = 5750;

        ChangeMoney changeMoney = new ChangeMoney(totalPrice, coinTypes);

        int coinCnt = changeMoney.getCoins();

        System.out.println("총 화폐 개수: " + coinCnt);
    }
}
