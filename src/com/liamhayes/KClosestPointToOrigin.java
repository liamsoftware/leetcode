package com.liamhayes;

import javax.swing.text.html.HTMLDocument;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {

    public static void main(String[] args) {
        int[][] points = { {1, 3}, {3, 4}, {2, -1}};
        int[][] result = findClosestPoints(points, 2);
        System.out.print("Here are the k points closest the origin: ");
        for (int[] point : result)
            System.out.print("[" + point[0] + " , " + point[1] + "] ");
    }

    public static int[][] findClosestPoints(int[][] points, int k) {

        PriorityQueue<int[]> distHeap = new PriorityQueue<>((a, b) ->
                (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));


        for (int i = 0; i < k; i++)
            distHeap.add(points[i]);

        System.out.println(distHeap.size());
        for (int[] d : distHeap) {
            System.out.println(d[0] + "," + d[1]);
        }

        for (int i = k; i < points.length; i++) {
            int[] currentPoint = points[i];
            int currentDistance = (currentPoint[0] * currentPoint[0]) + (currentPoint[1] * currentPoint[1]);

            int[] peekElement = distHeap.peek();
            int heapPointDistance = (peekElement[0] * peekElement[0]) + (peekElement[1] * peekElement[1]);

            if (currentDistance < heapPointDistance) {
                distHeap.poll();
                distHeap.add(currentPoint);
            }
        }

        System.out.println(distHeap.size());
        for (int[] d : distHeap) {
            System.out.println(d[0] + "," + d[1]);
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++)
            result[i] = distHeap.poll();

        for (int[] i : result)
            System.out.println(i[0] + "," + i[1]);

        return result;
    }
}
