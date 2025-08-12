package org.example.greedy;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BigNumberLaw {
    private final int totalInputSize;
    private final int totalAddCount;
    private final int maxRepeatCount;

    private List<Integer> numbers;

    public BigNumberLaw(int totalInputSize, int totalAddCount, int maxRepeatCount) {
        this.totalInputSize = totalInputSize;
        this.totalAddCount = totalAddCount;
        this.maxRepeatCount = maxRepeatCount;
    }

    public void initNums(int[] inputNums) {
        if (inputNums.length != totalInputSize) {
            throw new IllegalArgumentException("Unexpected Input Size");
        }
        numbers = Arrays.stream(inputNums).boxed().collect(Collectors.toList());
    }

    public int getSum() {
        numbers.sort(Comparator.naturalOrder());

        int first = numbers.get(numbers.size() - 1);     // 가장 큰 수
        int second = numbers.get(numbers.size() - 2);    // 두 번째로 큰 수

        int maxCount = (totalAddCount / (maxRepeatCount + 1)) * maxRepeatCount;
        maxCount += totalAddCount % (maxRepeatCount + 1);

        return (maxCount * first) + ((totalAddCount - maxCount) * second);
    }
}
