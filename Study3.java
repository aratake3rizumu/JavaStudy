package Javastudy;

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
//		System.out.println("total>=11：1 , total<11：2");
//		int h = scan.nextInt();
//
//		int i = ran.nextInt(9);
//		int j = ran.nextInt(9);
//		int total  = i + j;
//		if ((h == 1 && total >= 11)||( h == 2 && total < 11)) {
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
		
//		課題4-1,2
		String[] hands = {"グー", "チョキ", "パー"};
		String[] result = {"負け", "勝ち", "あいこ"};
		String[] m = {"大吉", "中吉", "小吉", "吉", "凶", "大凶"};
		int win = 0;
		int lose = 0;	
		int draw = 0;
		while(win < 3 && lose < 3) {		
				System.out.println("グー：0, チョキ：1, パー：2");
				int player = scan.nextInt();
				System.out.println("プレイヤー：" + hands[player]);
				int cp  = ran.nextInt(hands.length);
				System.out.println("相手：" + hands[cp]);
				
				if(player == 1 &&  cp == 0 || player == 2 && cp == 1 || player == 0 && cp == 2) {
					System.out.println(result[0]);
					lose ++;
				
				} else if(player == 0 && cp == 1 || player == 1 && cp == 2 || player == 2 && cp == 0) {
					System.out.println(result[1]);
					win ++;

				} else {
					System.out.println(result[2]);
					draw ++;
				}
		}
		
		if(win >= 3) {
			int n  = ran.nextInt(m.length);
			System.out.println(m[n]);
		} else if (lose >= 3) {
			System.out.println("またチャレンジしてね");
		}
	
	}
}