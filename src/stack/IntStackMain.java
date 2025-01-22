package stack;

import java.util.Scanner;

public class IntStackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(64);


        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 수 : %d / %d\n", stack.size(), stack.getCapacity());
            System.out.print("1. push | 2. pop | 3. peek | 4. dump | 0. exit\n");
            int menu = sc.nextInt();
            if (menu == 0) break;
            int number;

            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    number = sc.nextInt();
                    try {
                        stack.push(number);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 차 있어서 푸시 불가");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("팝한 데이터: " + stack.pop());
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있어서 팝 불가");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("피크한 데이터: " + stack.peek());
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있어서 피크 불가");
                    }
                    break;

                case 4:
                    stack.dump();
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
        sc.close();

    }
}
