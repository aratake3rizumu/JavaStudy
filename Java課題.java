package Javastudy;

import java.util.Random;
import java.util.Scanner;


public class Java課題 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int php = 20;
		int pmp = 10;
		int[] mhp = {10, 5, 8};
		String[] monster = {"ドラキー", "キラーパンサー","スライム"};
		
//		ここからスタート
		while(mhp[0] > 0 || mhp[1] > 0 || mhp[2] > 0 && php > 0) {	
			int select = ran.nextInt(mhp.length);
			
//		ドラキーの場合
			if(select == 0) {
				if(mhp[0] > 0) {
					System.out.println("------------------");
					System.out.println( monster[select] + "がおそってきた！");					
				}
				while(php > 0 && mhp[0] > 0) {
					System.out.println();
					System.out.println("【プレイヤーの行動】");
					System.out.println("こうげき：0  " + "まほう：1  " + "にげる：2  " );
					int play = scan.nextInt();
					if(play == 0) {
						System.out.println("プレイヤーのこうげき！" + monster[select] + "に2のダメージ！");
						mhp[0] = mhp[0] - 2;
					}
					else if(play == 1) {
						if(pmp >= 2) {
							System.out.println("プレイヤーのまほう攻撃！" + monster[select] + "に4のダメージ！");
							mhp[0] = mhp[0] - 4;
							pmp = pmp - 2;
						} else {
							System.out.println("プレイヤーのまほう攻撃！");
							System.out.println("MPが足りなかった！");
						}
					} else {
						System.out.println("プレイヤーはにげた");
						return;
					}
					if(mhp[0] > 0) {						
						System.out.println();
						String[] a = {"こうげき", "こうげき2", "ぼうぎょ"};
						int b = ran.nextInt(a.length);
						System.out.println("【ドラキーの行動！】" + a[b]);
						if(b == 0) {
							System.out.println("プレイヤーは" + "1のダメージ！" );
							php --;
						} else if (b == 1) {
							System.out.println("プレイヤーは" + "2のダメージ！" );
							php = php - 2;
						} else {
							System.out.println("身をまもっている" );
							if(play == 0) {
								mhp[0] = mhp[0] + 2;
							} else if (play == 1) {
								mhp[0] = mhp[0] + 4;
							}
					}					
					System.out.println("プレイヤーHP：" + php);
					System.out.println("プレイヤーMP：" + pmp);
				}
				if(php < 0) {
					System.out.println("プレイヤーは負けてしまった");
					return;
				} else {
					System.out.println(monster[0] + "をたおした！");
				}
				
			}
		  }
//		キラーパンサーの場合
			if(select == 1) {
				if(mhp[1] > 0) {
					System.out.println("------------------");
					System.out.println( monster[select] + "がおそってきた！");	
				}
				while(php > 0 && mhp[1] > 0) {
					System.out.println();
					System.out.println("【プレイヤーの行動】");
					System.out.println("こうげき：0  " + "まほう：1  " + "にげる：2  " );
					int play = scan.nextInt();
					if(play == 0) {
						System.out.println("プレイヤーのこうげき！" + monster[select] + "に2のダメージ！");
						mhp[1] = mhp[1] - 2;
					}
					else if(play == 1) {
						if(pmp >= 2) {
							System.out.println("プレイヤーのまほう攻撃！" + monster[select] + "に4のダメージ！");
							mhp[1] = mhp[1] - 4;
							pmp = pmp - 2;
						} else {
							System.out.println("プレイヤーのまほう攻撃！");
							System.out.println("MPが足りなかった！");
						}
					} else {
						System.out.println("プレイヤーはにげた");
						return;
					}
					
					if(mhp[1] > 0) {		
						System.out.println();
						String[] c = {"こうげき", "ねころんでいる", "ごろごろしている"};
						int d = ran.nextInt(c.length);
						System.out.println("【キラーパンサーの行動！】" + c[d]);
						if(d == 0) {
							System.out.println("プレイヤーは" + "5のダメージ！" );
							php --;
						} else {
							System.out.println("なにもおこらなかった");
						}
					}
					System.out.println("プレイヤーHP：" + php);
					System.out.println("プレイヤーMP：" + pmp);
				}
				if(php < 0) {
					System.out.println("プレイヤーは負けてしまった");
					return;
				} else {
					System.out.println(monster[1] + "をたおした！");
				}
			}
			
//		ホイミスライムの場合
			if(select == 2) {
				if(mhp[2] > 0) {
					System.out.println("------------------");
					System.out.println( monster[select] + "がおそってきた！");					
				}
				while(php > 0 && mhp[2] > 0) {
					System.out.println();
					System.out.println("【プレイヤーの行動】");
					System.out.println("こうげき：0  " + "まほう：1  " + "にげる：2  " );
					int play = scan.nextInt();
					if(play == 0) {
						System.out.println("プレイヤーのこうげき！" + monster[select] + "に2のダメージ！");
						mhp[2] = mhp[2] - 2;
					}
					else if(play == 1) {
						if(pmp >= 2) {
							System.out.println("プレイヤーのまほう攻撃！" + monster[select] + "に4のダメージ！");
							mhp[2] = mhp[2] - 4;
							pmp = pmp - 2;
						} else {
							System.out.println("プレイヤーのまほう攻撃！");
							System.out.println("MPが足りなかった！");
						}
					} else {
						System.out.println("プレイヤーはにげた");
						return;
					}
					if(mhp[2] > 0) {
						System.out.println();
						String[] e = {"こうげき", "ホイミ", "ふわふわしている"};
						int f = ran.nextInt(e.length);
						System.out.println("【ホイミスライムの行動！】" + e[f]);
						if(f == 0) {
							System.out.println("プレイヤーは" + "1のダメージ！" );
							php --;
						} else if (f == 1) {
							if(mhp[2] < 8 ) {
								System.out.println(monster[2] + "は、1ダメージかいふくした" );
								mhp[2] ++;
							} else {
								System.out.println("HPはすでに満タンだ！");
							}
						} else {
							System.out.println("なにもおこらなかった");
						}
					}
					
					System.out.println("プレイヤーHP：" + php);
					System.out.println("プレイヤーMP：" + pmp);
				}
				if(php < 0) {
					System.out.println("プレイヤーは負けてしまった");
					return;
				} else {
					System.out.println(monster[2] + "をたおした！");
				}
			}
		}
		System.out.println("==================");
		System.out.println("ゲームクリア！！");
	}
}

			
