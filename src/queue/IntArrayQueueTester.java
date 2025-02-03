package queue;

import java.util.Queue;
import java.util.Scanner;

public class IntArrayQueueTester {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        // 최대 64개를 인큐할 수 있는 큐를 생성해 주세요
        IntArrayQueue queue = new IntArrayQueue(64);

        while (true) {
            System.out.println("현재 데이터의 개수 : " + queue.size() + "/" + queue.capacity());
            System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)종료 ");
            int menu = sc.nextInt();
            if (menu == 0) break;
            switch (menu) {
                case 1:
                    System.out.print("숫자 데이터를 입력하세요 ");
                    x = sc.nextInt();
                    try {
                        queue.enque(x);
                    } catch (IntArrayQueue.OverflowIntArrayQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = queue.deque();
                    } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
                        System.out.println("큐가 비어있습니다. 더 이상 디큐할 데이터가 존재하지 않습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = queue.peek();
                        System.out.println("피크 데이터는 " + x);
                    } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
                        System.out.println("큐가 비어있습니다. 데이터가 존재하지 않습니다.");
                    }
                    break;
                case 4:
                    queue.dump();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }

    }
}
