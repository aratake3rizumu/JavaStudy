package Javastudy;

import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;




public class Study3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
//		int x = scan.nextInt();
//		int y = ran.nextInt(3);
//		if (x == y) {
//			System.out.println("あたり");
//		} else {
//			System.out.println("ハズレ");
//		}
//		System.out.println("答え" + y);
		
//		HIGH&LOW
//		System.out.println("total>11：1 , total<=11：2");
//		int h = scan.nextInt();
//
//		int i = ran.nextInt(9);
//		int j = ran.nextInt(9);
//		int total  = i + j;
//		if (h == 1 && total > 11) {
//			System.out.println("あたりです");
//		} else {
//			System.out.println("ハズレです");			
//		}
//		System.out.println("合計は" + total + "です");
//
//		課題2
//		int total = 0;
//		for(int i = 0; i < 5; i++) {
//			System.out.println("数字を入力：");
//			int k  = scan.nextInt();
//			total += k;
//		}
//		System.out.println("合計は：" + total);
		
//		課題3-1
//		String[] m = {"大吉", "中吉", "小吉", "吉", "凶", "大凶"};
//		int n  = ran.nextInt(m.length);
//		System.out.println(m[n]);
		
//		課題3-2,3
//		String[] m = {"大吉", "中吉", "小吉", "吉", "凶", "大凶"};
//		int i = 0;
//		while(true) {
//			int n  = ran.nextInt(m.length);
//			System.out.println(m[n]);
//			i ++;
//			if(n == 0) {
//			System.out.println(i +"回引きました");
//			break; 
//			}
//		}
		
//		課題4
		String[] hands = {"グー", "チョキ", "パー"};
		String[] result = {"負け", "勝ち", "引き分け"};
		System.out.println("グー：0, チョキ：1, パー：2");
		int player = scan.nextInt();
		System.out.println("プレイヤー：" + hands[player]);
		int cp  = ran.nextInt(hands.length);
		System.out.println("相手：" + hands[cp]);
		int i = 0;
			if(player == 1 &&  cp == 0) {
				System.out.println(result[0]);
			} else if(player == 2 && cp == 1) {
				System.out.println(result[0]);
			} else if(player == 0 && cp == 3) {
				System.out.println(result[0]);
			} else if(player == 0 && cp == 1) {
				System.out.println(result[1]);
			} else if(player == 1 && cp == 2) {
				System.out.println(result[1]);
			} else if(player == 2 && cp == 0) {
				System.out.println(result[1]);
			} else {
				System.out.println(result[2]);
			}
			
	}
}
