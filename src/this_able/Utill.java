package this_able;

import java.util.Scanner;

public class Utill {
	static int answer;
	static int i;
	static int c;
	static char information[] = new char[8];					//나의 정보를 입력하는 배열
	static int round = -1;									//직업 추천을 한 횟수를 담는 변수
	static char mine[][] = new char[10][10];				//나의 정보를 담는 배열
	static String x = "x";					
	static String o = "o";
	static int point[][] = new int[100][20];				//점수를 담는 배열
	static int cheak[][] = new int[100][16];				//직업이 맞는지 안맞는지 체크하는 배열
	 static void clearConsole(){		//화면 지우는 함수
		 for(i=0;i<15;i++) {
			 System.out.println("\n");
		 }
	 }
	 

	 static void loby() {  									//로비창
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

	 static void my_information(){																	//나의 신체정보를 입력받는 함수
		 int a;
		 round=round+1;
		 if(round != 0) {																			// 또사용하기위한 초기화
			 for(a=1;a<8;a++)
				 information[a] = ' ';
		 }
		 for(a=1;a<8;a++) {
			 for(c=0; information[a]!= 'r' && information[a]!= 'o' && information[a]!= 'x' ;c++) {		//답변을 o,x,r만 받을수 있게 하는 반복문
			 System.out.println(csv_file.indat[1][a]+"\n" +"(있으면 o, 없으면 x 나가고싶으면 r)"+"\n");
			 Scanner scanner = new Scanner(System.in);
			 information[a] = scanner.next().charAt(0);
			 }
			 if(information[a] == 'r') {
				 return;
			 }
			 mine[round][a] = information[a];														//입력받은 정보를 나의 정보를 담는 배열에 저장
		 	}
		 Comparison(round);
		 	
		 }
	 
	 static void Comparison(int round) {
		 System.out.println("\n\n\n\n\n\n\n\n\n");
		 for(int a=2;a<16;a++) {
			 for(int b=1;b<8;b++) {
				 if((csv_file.indat[a][b].equals(o))&&(Character.toString(Utill.mine[round][b]).equals(x))) {		//나에게 딱맞는 직업은 점수 +
					 point[round][a] = point[round][a]+1;
				 }
				 
				 if((csv_file.indat[a][b].equals(x))&&(Character.toString(Utill.mine[round][b]).equals(o))) {		//직업이 맞지 않는 다면 1로 표시하고 반복문을 멈쳐 다음 배열로 이동
					 cheak[round][a] = 1;
					 break;
				 }
				 else {
					 cheak[round][a] = 0;																			//직업이 맞으면 0으로 표시
				 }
				 
			 }
		 }
		 Sort.re_sort(round);
	}
}