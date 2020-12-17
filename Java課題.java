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
		int m0 = 0;
		int m1 = 0;
		int m2 = 0;
		String[] monster = {"ドラキー", "キラーパンサー","ホイミスライム"};

		
//		ここからスタート
		System.out.println("名前は：");
		String name = scan.next();
		
		while(mhp[0] > 0 || mhp[1] > 0 || mhp[2] > 0 && php > 0) {	
			int select = ran.nextInt(mhp.length);
			
//		ドラキーの場合
			if(select == 0) {
				if(mhp[0] > 0) {
					System.out.println("------------------");
					System.out.println();
					System.out.println( monster[select] + "がおそってきた！");					
				}
				while(php > 0 && mhp[0] > 0) {
					System.out.println();
					System.out.println( "【" + name + "の行動】");
					System.out.println("こうげき：0  " + "メラ：1  " + "にげる：2  " );
					int play = scan.nextInt();
					if(play == 0) {
						System.out.println(name +"のこうげき！" + monster[select] + "に2のダメージ！");
						mhp[0] = mhp[0] - 2;
					}
					else if(play == 1) {
						System.out.println( name + "のメラ！");
						if(pmp >= 2) {
							System.out.println( monster[select] + "に4のダメージ！");
							mhp[0] = mhp[0] - 4;
							pmp = pmp - 2;
						} else {
							System.out.println("MPが足りなかった！");
						}
					} else {
						System.out.println(name +"はにげた");
						return;
					}
					if(mhp[0] > 0) {						
						System.out.println();
						String[] a = {"こうげき", "こうげき2", "ぼうぎょ"};
						int b = ran.nextInt(a.length);
						System.out.println("【ドラキーの行動！】" + a[b]);
						if(b == 0) {
							System.out.println(name + "は1のダメージ！" );
							php --;
						} else if (b == 1) {
							System.out.println(name + "は2のダメージ！" );
							php = php - 2;
						} else {
							System.out.println("身をまもっている" );
							if(play == 0) {
								mhp[0] = mhp[0] + 2;
							} else if (play == 1) {
								mhp[0] = mhp[0] + 4;
							}
						}						
					}
					System.out.println(name + "HP：" + php);
					System.out.println(name + "MP：" + pmp);
				}
				while(m0<= 0) {
					if(php <= 0) {
						System.out.println(name +"は負けてしまった");
						return;
					} else {
						System.out.println(monster[0] + "をたおした！");
						m0++;
					}	
				}
				
			}
//		キラーパンサーの場合
			if(select == 1) {
				if(mhp[1] > 0) {
					System.out.println("------------------");
					System.out.println();
					System.out.println( monster[select] + "がおそってきた！");	
				}
				while(php > 0 && mhp[1] > 0) {
					System.out.println();
					System.out.println( "【" + name + "の行動】");
					System.out.println("こうげき：0  " + "メラ：1  " + "にげる：2  " );
					int play = scan.nextInt();
					if(play == 0) {
						System.out.println(name + "のこうげき！" + monster[select] + "に2のダメージ！");
						mhp[1] = mhp[1] - 2;
					}
					else if(play == 1) {
						System.out.println(name + "のメラ！");
						if(pmp >= 2) {
							System.out.println(monster[select] + "に4のダメージ！");
							mhp[1] = mhp[1] - 4;
							pmp = pmp - 2;
						} else {
							System.out.println("MPが足りなかった！");
						}
					} else {
						System.out.println(name + "はにげた");
						return;
					}
					if(mhp[1] > 0) {		
						System.out.println();
						String[] c = {"こうげき", "ねころんでいる", "ごろごろしている"};
						int d = ran.nextInt(c.length);
						System.out.println("【キラーパンサーの行動！】" + c[d]);
						if(d == 0) {
							System.out.println(name + "は5のダメージ！" );
							php --;
						} else {
							System.out.println("なにもおこらなかった");
						}
					}	
					System.out.println(name + "HP：" + php);
					System.out.println(name + "MP：" + pmp);
				}
				while(m1 <= 0) {
					if(php <= 0) {
						System.out.println(name + "は負けてしまった");
						return;
					} else {
						System.out.println(monster[1] + "をたおした！");
						m1++;
					}	
				}
			}
			
//		ホイミスライムの場合
			if(select == 2) {
				if(mhp[2] > 0) {
					System.out.println("------------------");
					System.out.println();
					System.out.println( monster[select] + "がおそってきた！");					
				}
				while(php > 0 && mhp[2] > 0) {
					System.out.println();
					System.out.println( "【" + name + "の行動】");
					System.out.println("こうげき：0  " + "メラ：1  " + "にげる：2  " );
					int play = scan.nextInt();
					if(play == 0) {
						System.out.println(name + "のこうげき！" + monster[select] + "に2のダメージ！");
						mhp[2] = mhp[2] - 2;
					}
					else if(play == 1) {
						System.out.println(name + "のメラ！");
						if(pmp >= 2) {
							System.out.println(monster[select] + "に4のダメージ！");
							mhp[2] = mhp[2] - 4;
							pmp = pmp - 2;
						} else {
							System.out.println("MPが足りなかった！");
						}
					} else {
						System.out.println(name + "はにげた");
						return;
					}			
					if(mhp[2] > 0) {
						System.out.println();
						String[] e = {"こうげき", "ホイミ", "ふわふわしている"};
						int f = ran.nextInt(e.length);
						System.out.println("【ホイミスライムの行動！】" + e[f]);
						if(f == 0) {
							System.out.println(name + "は1のダメージ！" );
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
					System.out.println(name + "HP：" + php);
					System.out.println(name + "MP：" + pmp);
				}
				while(m2 <= 0) {
					if(php <= 0) {
						System.out.println(name + "は負けてしまった");
						return;
					} else {
						System.out.println(monster[2] + "をたおした！");
						++m2;
					}
				}

			}
		}
		System.out.println("==================");
		System.out.println("★★★レベルアップ★★★");
		System.out.println("ステータスが上がった！");
		System.out.println("スカラ、ホイミ、バイキルトを覚えた！");
		

		//プレイヤー
		//通常攻撃に会心の一撃追加
		//魔法追加 (メラMP2/ホイミmp2/スカラmp8/バイキルトmp8)
		//防御力・攻撃力追加
		int off = 3;
		int def = 0;
		int bhp = 40;
		int boff = 3;
		int kmo = 0;
		String boss = "キラーマシン";

		
		System.out.println("進んでいくと、奥に泉をみつけた");
		System.out.println("少し休みますか？　" + "・・・・・" + "はい：0　" + "いいえ：1" );
		int stay = scan.nextInt();
		if(stay == 0) {
			php = 30;
			pmp = 15;
			System.out.println("HPとMPが全回復した！");
			System.out.println(name + "HP：" + php);
			System.out.println(name + "MP：" + pmp);
		} else {
			System.out.println("そのまま進むことにした");
		}
		
		System.out.println("==================");
		System.out.println();
		System.out.println("==================");
		System.out.println("奥に進むと、眠っていた" + boss + "がおそってきた！");

		while(bhp > 0 && php > 0) {	
			System.out.println();
			System.out.println( "【" + name + "の行動】");
			System.out.println("こうげき：0  " + "まほう：1  " + "にげる：2  " );
			int play = scan.nextInt();

			if(play == 0) {
				System.out.println(name + "のこうげき！" + boss + "に" + off + "のダメージ！");
				bhp = bhp - off;
			} else if(play == 1) {
				String[] pmagic = {"メラ", "ホイミ", "スカラ", "バイキルト"};
				System.out.println("メラ：0  " + "ホイミ：1  " + "スカラ：2  " + "バイキルト：3  ");
				int magic = scan.nextInt();
				System.out.println(pmagic[magic] + "!!");
				if(magic == 0) {
					if(pmp >= 2) {
						System.out.println(boss + "に4のダメージ！");
						bhp = bhp - 4;
						pmp = pmp - 2;						
					} else {
						System.out.println("MPが足りなかった！");
					}
				} else if(magic == 1) {
					if(pmp >= 2) {
						if(php >= 1 || php <= 18) {
							System.out.println("HPを2かいふくした！");
							php = php + 2;
							pmp = pmp - 2;
						} else if(php == 19) {
							System.out.println("HPを1かいふくした！");
							php = php + 1;
							pmp = pmp - 2;
						} else {
							System.out.println("MPが足りなかった！");
						}
					}
				} else if(magic == 2) {
					if(pmp >= 8) {
						System.out.println("防御力があがった！");
						def = def + 2;
						pmp = pmp - 8;						
					} else {
						System.out.println("MPが足りなかった！");
					}
				} else {
					if(pmp >= 8) {
						System.out.println("攻撃力があがった！");
						off = off + 2;
						pmp = pmp - 8;
					} else {
						System.out.println("MPが足りなかった！");
					}
				}
			} else {
				System.out.println(name + "はにげた");
				return;
			}
			
			
			//キラーマシン
			if(bhp > 0 || php >= 0) {
				System.out.println();
				String[] k = {"こうげき", "2回こうげき", "本気こうげき！"};
				int km = ran.nextInt(k.length);
				System.out.println(boss + "の" + k[km]);
				if(def >= 2) {
					kmo = boff - def;
					if(km == 0) {
						if(def > boff) {
							System.out.println(name + "はダメージをうけなかった！" );	
						} else {
							System.out.println(name + "は" + kmo + "のダメージ！");
							php = php - kmo;
						}
						kmo = 0;
					} else if (km == 1) {
						if(def >= boff) {
							System.out.println(name + "はダメージをうけなかった！" );	
						} else {
							kmo += kmo;
							System.out.println(name + "は" + kmo + "のダメージ！");
							php = php - kmo;
						}
						kmo = 0;
					} else {
						String[] tukon = {"つうこんの一撃", "失敗", "失敗", "失敗"};
						int p = ran.nextInt(tukon.length);
						if(p == 1) {
							System.out.println(tukon[0] + "があたった！！！！");
							System.out.println(name + "は8のダメージ！" );
						} else {
							System.out.println("こうげきははずれた！");
						}
					}
				} else {
					if(km == 0) {
						System.out.println(name + "は" + boff + "のダメージ！" );
						php = php - boff;
					} else if (km == 1) {
						boff += boff;
						System.out.println(name + "は" + boff + "のダメージ！");
						php = php - boff;
						boff = 3;
					} else {
						String[] tukon = {"つうこんの一撃", "失敗", "失敗", "失敗"};
						int p = ran.nextInt(tukon.length);
						if(p == 1) {
							System.out.println(tukon[0] + "があたった！！！！");
							System.out.println(name + "は8のダメージ！");	
						} else {
							System.out.println("こうげきははずれた！");
						}
					}
					
				}
				System.out.println(name + "HP：" + php);
				System.out.println(name + "MP：" + pmp);
			}
		}
		if(php <= 0) {
			System.out.println(name + "は負けてしまった");
			return;
		} else {
			System.out.println(boss + "をたおした！");
			System.out.println("ゲームクリア！！！");
		}
	}
}