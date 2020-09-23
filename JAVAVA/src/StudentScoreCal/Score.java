package StudentScoreCal;

import java.util.Scanner;
import java.util.ArrayList;

public class Score {
	public static void main(String[] args) {
		String editname;
		ArrayList<Student> arr = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ성적관리ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println(" 1.성적입력   2.성적출력   3.성적수정   4.성적삭제   5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("1번~5번메뉴중에 하를 입력해주세요 : ");
			int menu = sc.nextInt();
			Student std = new Student();
			

			switch (menu) {
			case 1:
				System.out.print("이름을 입력하시오 :");
				std.setName(sc.next());// 이름
				System.out.print("국어를 입력하시오 :");
				std.setKor(sc.nextInt());// 국
				System.out.print("영어를 입력하시오 :");
				std.setEng(sc.nextInt());// 영
				System.out.print("수학을 입력하시오 :");
				std.setMat(sc.nextInt());// 수

				arr.add(std);
				break;
			case 2:
				System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ성적출력ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				
				for (Student n : arr) {
					System.out.print(n.getName() + "\t"+n.getKor()+"\t"+n.getEng()+"\t"
									+n.getMat()+"\t"+n.getTotal()+"\t"+n.getAverage());
				}
				break;
			case 3:
				System.out.println("---------------------");
				System.out.println("---성적 수정사람 이름입력 ---");
				System.out.println("---------------------");
				editname = sc.nextLine();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getName().equals(editname)) {
						while (true) {
							System.out.println("--- 성적 수정 시작----");
							System.out.println(" 1.국   2.영   3.수학    ");
							System.out.println("-----------------");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.print("수정 할 국어성적을 입력해주세요 :");
								std.setKor(sc.nextInt());
								System.out.println("국어성적이 수정되었습니다");
							}
							if (choice == 2) {
								System.out.print("수정 할 영어성적을 입력해주세요 :");
								std.setEng(sc.nextInt());
								System.out.println("영어성적이 수정되었습니다");
							}
							if (choice == 3) {
								System.out.print("수정 할 수학성적을 입력해주세요 :");
								std.setMat(sc.nextInt());
								System.out.println("수학성적이 수정되었습니다");
							}

						}

					}

				}

			}
		}
	}
}
