package meta.hard;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    MedianFinder() {//initializes the MedianFinder object.
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    void addNum(int num) { //adds the integer num from the data stream to the data structure.
        left.offer(num);
        if (!right.isEmpty() && right.peek() < left.peek()) {
            right.offer(left.poll());
        }
        if (left.size() - right.size() > 1) {
            right.offer(left.poll());
        } else if (left.size() < right.size()) {
            left.offer(right.poll());
        }
    }

    double findMedian() {// returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
        if (left.size() == right.size()) return left.peek() + right.peek() / 2;
        else return left.peek();
    }
}
