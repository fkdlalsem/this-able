package this_able;

import java.util.Scanner;

public class Utill {
	static int answer;
	static int i;
	static int c;
	static char information[] = new char[8];					//���� ������ �Է��ϴ� �迭
	static int round = -1;									//���� ��õ�� �� Ƚ���� ��� ����
	static char mine[][] = new char[10][10];				//���� ������ ��� �迭
	static String x = "x";					
	static String o = "o";
	static int point[][] = new int[100][20];				//������ ��� �迭
	static int cheak[][] = new int[100][16];				//������ �´��� �ȸ´��� üũ�ϴ� �迭
	 static void clearConsole(){		//ȭ�� ����� �Լ�
		 for(i=0;i<15;i++) {
			 System.out.println("\n");
		 }
	 }
	 

	 static void loby() {  									//�κ�â
		 System.out.println("����� ������ �Ұ��Դϱ�?"+ "\n");
			System.out.println("1. ���� ��õ!" + "\n");
			System.out.println("2. ���� ��õ ���" + "\n");
			System.out.println("3. ���� ��õ ����" + "\n");
			System.out.println("4. �����ϴ�." + "\n");
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
					System.out.println("������ ���� �ʴ� ������ ����, ������ ������������� 0��, ������ ���´� ������ 1�����ؼ� �������� ���� �������� �����Ͽ� �����ݴϴ� ����");
				}
				else if(answer == 4) {
					Utill.clearConsole();
					return;
				}
				answer = 0;
				System.out.println("\n\n"+"1.�κ�� ���ư��ϴ�."+"\n");
				System.out.println("2.�����ϴ�.");
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

	 static void my_information(){																	//���� ��ü������ �Է¹޴� �Լ�
		 int a;
		 round=round+1;
		 if(round != 0) {																			// �ǻ���ϱ����� �ʱ�ȭ
			 for(a=1;a<8;a++)
				 information[a] = ' ';
		 }
		 for(a=1;a<8;a++) {
			 for(c=0; information[a]!= 'r' && information[a]!= 'o' && information[a]!= 'x' ;c++) {		//�亯�� o,x,r�� ������ �ְ� �ϴ� �ݺ���
			 System.out.println(csv_file.indat[1][a]+"\n" +"(������ o, ������ x ����������� r)"+"\n");
			 Scanner scanner = new Scanner(System.in);
			 information[a] = scanner.next().charAt(0);
			 }
			 if(information[a] == 'r') {
				 return;
			 }
			 mine[round][a] = information[a];														//�Է¹��� ������ ���� ������ ��� �迭�� ����
		 	}
		 Comparison(round);
		 	
		 }
	 
	 static void Comparison(int round) {
		 System.out.println("\n\n\n\n\n\n\n\n\n");
		 for(int a=2;a<16;a++) {
			 for(int b=1;b<8;b++) {
				 if((csv_file.indat[a][b].equals(o))&&(Character.toString(Utill.mine[round][b]).equals(x))) {		//������ ���´� ������ ���� +
					 point[round][a] = point[round][a]+1;
				 }
				 
				 if((csv_file.indat[a][b].equals(x))&&(Character.toString(Utill.mine[round][b]).equals(o))) {		//������ ���� �ʴ� �ٸ� 1�� ǥ���ϰ� �ݺ����� ���� ���� �迭�� �̵�
					 cheak[round][a] = 1;
					 break;
				 }
				 else {
					 cheak[round][a] = 0;																			//������ ������ 0���� ǥ��
				 }
				 
			 }
		 }
		 Sort.re_sort(round);
	}
}