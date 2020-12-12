package this_able;

import java.util.Scanner;

public class Utill {
	static int answer;
	static int i;
	static char information;
	static int round = -1;
	static char mine[][] = new char[10][10];
	static String x = "x";
	static String o = "o";
	static int point[][] = new int[100][20];
	static int cheak[][] = new int[100][16];
	 static void clearConsole(){
		 for(i=0;i<15;i++) {
			 System.out.println("\n");
		 }
	 }
	 

	 static void loby() {
		 System.out.println("당신은 무엇을 할것입니까?"+ "\n");
			System.out.println("1. 직업 추천!" + "\n");
			System.out.println("2. 직업 추천 목록" + "\n");
			System.out.println("3. 직업 추천 원리" + "\n");
			System.out.println("4. 끝냅니다." + "\n");
			Scanner scan = new Scanner(System.in);
			while(true){
				answer = scan.nextInt();
				if(answer == 1) {
					Utill.clearConsole();
					my_information();
					
				}
				else if(answer == 2) {
					Utill.clearConsole();
					for(int j=1;j<16;j++) {
						System.out.println(csv_file.indat[j][0]);
						
					}
					
				
				}
				else if(answer == 3) {
					Utill.clearConsole();
					System.out.println("나에게 맞지 않는 직업은 제거, 나에게 상관없는직업은 0점, 나에게 딱맞는 직업은 1점더해서 총점수가 높은 직업부터 정렬하여 보여줍니다 ㅎㅎ");
				}
				else if(answer == 4) {
					Utill.clearConsole();
					return;
				}
				answer = 0;
				System.out.println("\n\n"+"1.로비로 돌아갑니다."+"\n");
				System.out.println("2.끝냅니다.");
				answer = scan.nextInt();
					if(answer == 1) {
						Utill.clearConsole();
						loby();
					}
					else {
						Utill.clearConsole();
						return;
					}
				}
	 }

	 static void my_information(){
		 int a;
		 round=round+1;
		 for(a=1;a<8;a++) {
			 System.out.println(csv_file.indat[1][a]+"\n" +"(있으면 o, 없으면 x 나가고싶으면 r)"+"\n");
			 Scanner scanner = new Scanner(System.in);
			 information = scanner.next().charAt(0);
			 if(information == 'r') {
				 return;
			 }
			 mine[round][a] = information;
		 	}
		 Comparison(round);
	 	}
	 
	 static void Comparison(int i) {
		 System.out.println("\n\n\n\n\n\n\n\n\n");
		 for(int a=2;a<16;a++) {
			 for(int b=1;b<8;b++) {
				 if((csv_file.indat[a][b].equals(o))&&(Character.toString(Utill.mine[i][b]).equals(x))) {
					 point[i][a] = point[i][a]+1;
				 }
				 
				 if((csv_file.indat[a][b].equals(x))&&(Character.toString(Utill.mine[i][b]).equals(o))) {
					 cheak[i][a] = 1;
					 break;
				 }
				 else {
					 cheak[i][a] = 0;
				 }
				 
			 }
		 }
		 Sort.re_sort(i);
	}
}