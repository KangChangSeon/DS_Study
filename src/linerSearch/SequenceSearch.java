package linerSearch;

import java.util.Scanner;

public class SequenceSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개의 데이터를 입력하시겠습니까?");

        int number = sc.nextInt();
//        int[] array = new int[number];  // 배열의 길이 셋팅하여 배열 객체 생성
        int[] array = new int[number+1];  // 배열의 길이 셋팅하여 배열 객체 생성 (보초법)

        System.out.println("데이터를 입력해 주세요.");
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
            System.out.println("arr[" + i + "] = " + array[i]);
        }
        System.out.println("검색할 값은?"); // key 값을 입력
        int key = sc.nextInt();
        int idx = seqSearch(array, number, key);
        if(idx == -1) System.out.println("데이터가 존재하지 않습니다.");
        else System.out.println("그 값은 array[" + idx + "]에 존재합니다.");

    }

    static int seqSearch(int[] array, int number, int key) {
        int i = 0;
        array[number] = key;
        while (true) {
//            if(i == number) return -1;     // 검색 실패(-1)
//            if (array[i] == key) return 1; // 검색 성공(자료가 있는 인덱스 반환)
//            i++;
            if(array[i]==key) break; // 검색 성공 (보초법)
            i++;
        }
        return i == number ? -1 : i;
    }
}

// 보초법