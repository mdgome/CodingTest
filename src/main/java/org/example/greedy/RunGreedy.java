package org.example.greedy;

public class RunGreedy {
    public static void main(String[] args) {
        runChangeMoney();
        runBigNumberLaw();
    }

    private static void runChangeMoney() {
        int[] coinTypes = {500, 100, 50, 10};
        int totalPrice = 5750;

        ChangeMoney changeMoney = new ChangeMoney(totalPrice, coinTypes);

        int coinCnt = changeMoney.getCoins();

        System.out.println("총 화폐 개수: " + coinCnt);
    }

    private static void runBigNumberLaw() {
        int[] numbers = {2, 4, 5, 4, 6};

        int totalInputSize = 5;
        int totalSumCnt = 8;
        int maxRepeatCount = 3;

        BigNumberLaw bigNumberLaw = new BigNumberLaw(totalInputSize, totalSumCnt, maxRepeatCount);

        bigNumberLaw.initNums(numbers);

        int bigNumberSums = bigNumberLaw.getSum();

        System.out.println("큰 수의 법칙 합 : " + bigNumberSums);
    }
}
