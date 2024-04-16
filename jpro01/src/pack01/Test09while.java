package pack01;

import java.util.Scanner;

public class Test09while {

	public static void main(String[] args) {
		// 반복문 while
		// while(조건) {실행문들...}
		int w = 1;
		while (w <= 5) {
			System.out.println("w = " + w + " ");
			w++;
		}
		System.out.println("\nwhile 수행 후 w : " + w);

		System.out.println();

		int count = 0;
		while (count < 5) {
			count++;
			System.out.println("count : " + count);
			if (count == 3) {
				System.out.println("쉬어가기");
			}
			if (count == 5) {
				System.out.println("count가 5라서 종료 : " + count);
			}
		}
		System.out.println();
		w = 0;
		while (true) { // 무한루프
			w++;
			if (w == 3)
				continue;
			if (w == 5)
				break;
			System.out.println("w는 " + w);
		}
		System.out.println();
		// factorial n!은 1부터 n까지의 모든 정수의 곱.
		// ex 5! = 5 * 4 * 3 * 2 * 1 = 120
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt(); // API를 가져다 적용
		int num = 5;
		// factorial 계산을 위한 초기값 설정
		int factorial = 1;
		int i = 1; // 반복을 위한 counter 변수
		while (i <= num) {
			// System.out.println(i);
			factorial *= i;
			i++;
		}
		System.out.printf("num은 %d factorial은 %d이다.", num, factorial);

		System.out.println("\n다중 while-----");
		int a = 1;
		while (a <= 3) {
			System.out.println("a : " + a);
			int b = 1;
			while (b <= 4) {
				System.out.print("b : " + b + " ");
				b++;
			}
			a++;
			System.out.println();
		}
		System.out.println();
		// 키보드로 입력받은 숫자에 대해 1부터 시작해 그 숫자까지 모든 수에
		// 나누기를 시도하고 나누어 떨어지는 경우 (약수) 그 수를 출력한다
		// 0이나 음수를 입력하면 프로그램 종료.
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("정수 입력(0이나 음수면 종료) : ");
//			int number = sc.nextInt();
//			if(number <= 0) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			System.out.println(number + "의 약수는");
//			int divisor = 1; // 약수를 찾기 위해 1부터 시작
//			while(divisor <= number) {
//				if(number % divisor == 0) {
//					System.out.println(divisor); // 약수 출력
//				}
//				divisor++; // 다음 수로 이동
//			}
//		}
		System.out.println();
		// do{반복 수행문...} while(조건);
		int k = 10;
		do { // 최소 1회는 수행
			System.out.println("k : " + k);
			k++;
		} while (k <= 5);

		System.out.println("exam------------");
		// 문제1) 1~100 사이의 정수 중 3의 배수 이지만 2의 배수가 아닌
		// 수를 출력하고, 합과 갯수도 출력
		int hap = 0;
		int su = 0;
		int d = 1;
		System.out.println("3의배수 이지만 2의 배수가 아닌수들");
		while (d <= 100) {
			if (d % 3 == 0 && d % 2 != 0) {
				System.out.print(d + " ");
				su++;
				hap += d;
			}
			d++;
		}
		System.out.println();
		System.out.println("그 수들의 갯수 : " + su);
		System.out.println("그 수들의 합 : " + hap);
		System.out.println();
		
		// 문제2) -1, 3, -5, 7, -9, 11 ... 99 까지의 합 출력
		//        1  2  3  4  5   6
		
		// 강사님 풀이
		
		int n1 = 1, cnt1 = 1, sum1 = 0;
		while(n1<=99) {
			if(cnt1 % 2 == 0) {
				sum1 += n1;
				//System.out.println("짝수" + n1);
			}
			else {
				int imsi = n1 * -1;
				sum1 += imsi; // 부호 변경 후 누적
				//System.out.println("홀수" + imsi);
			}
			//System.out.println(n1);
			n1 += 2;
			cnt1++;
		}
		System.out.println("합은 " + sum1);
		System.out.println();
		
		// 내 풀이
		
		int aa = 1; // 1부터 99까지의 수 
		int bb = 1; // 순서
		int sum = 0; // 합
		while (aa <= 99) {
			if (bb % 2 != 0) {
				aa *= -1;
			}
			bb++;
			sum += aa;
			
			if(aa < 0) {
				aa *= -1;
			}
			aa += 2;
		}
		System.out.println("while의 합은 " + sum + "입니다. ");
		System.out.println();
		
		// for로 푸는 방법
		
		int sum2 = 0, cnt2 = 1;
		for(int c=1; c <= 99; c += 2) {
			if(cnt2 % 2 == 0) {
				sum2 += c;
			}
			else {
				sum2 += c * (-1);
			}
			cnt2++;
		}
		System.out.println("for의 합은 " + sum2 + "입니다." );
		System.out.println();

		// 문제3) 1 ~ 100 사이의 정수중에서 소수와 그 갯수를 출력
		// 소수 : 1보다 크며 1과 그 수 자체 이외의 다른 수로는
		// 나누어 떨어지지 않는 수
		
		// 강사님 풀이
		
		/*
		int aa1 = 2;
		int count1 = 0; // 소수의 갯수
		int su1 = 0;
		System.out.println("1부터 100까지의 소수 ");
		while(aa1 <= 100) {
			boolean imsi = false;
			
			int bb1 = 2;
			while(bb1 <= aa1 - 1) {
				if(aa1 % bb1 == 0) {
					imsi = true;
				}
				bb1++;
			}
			if(imsi == false) {
				System.out.print(aa1 + " ");
				count1++;
			}
			aa1++;
		}
		System.out.println("\n" + count1 + "개");
		System.out.println();
		*/
		
		// 강사님 두번째 풀이
		
		/* System.out.println("2부터 그 숫자의 제곱근까지의 모든 수로 나누어 떨어지는지 확인");
		// 소수를 찾는 이유로 제곱근까지만 검사하는 것은 어떤 수의 약수는 그 수의 제곱근을 넘지 않기 때문.
		int num1 = 2; // 1은 소수가 아니므로 2부터 출발 
 		int cnt3 = 0; // 건수
 		System.out.println("1부터 100까지의 소수");
 		
 		
 		while(num1 <= 100) {
 			boolean isPrime = true; // 현재 숫자가 소수인지 판별
 			int divisor = 2; // 나누는 수는 2부터 시작
 			while(divisor <= Math.sqrt(num1)) {
 				if(num1 % divisor == 0) {
 					isPrime = false;
 					break; 					
 				}
 				divisor++;
 			}
 			if(isPrime) { // if(isPrime) 
 				cnt3++;
 				System.out.print(num1 + " ");
 			}
 			num1++;
 		}
 		System.out.println("\n건수 : " + cnt3);
 		System.out.println();
		*/
		
		// 내 풀이
		
		int n = 2; // 1 ~ 100 까지의 자연수
		int c = 2; // n이랑 비교하는 수
		int cnt = 0; // 소수의 갯수
		System.out.println("1부터 100까지의 소수");
		while (n <= 100) {
			c = 2;
			while (c <= n) {
				if (n % c == 0) {
					if (n != c) {
						break;
					} else {
						System.out.print(n + " ");
						cnt++;
					}
				}
				c++;
			}
			n++;
		}
		System.out.println();
		System.out.println("소수의 갯수 : " + cnt);
	}
}
