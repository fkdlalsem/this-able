package this_able;

import java.util.Scanner;

public class Utill {
	static int answer;
	static int i;
	 static void clearConsole(){
		 for(i=0;i<10;i++) {
			 System.out.println("\n");
		 }
	 }
	 
	 static void loby() {
		 System.out.println("����� ������ �Ұ��Դϱ�?"+ "\n");
			System.out.println("1. ���� ��õ!" + "\n");
			System.out.println("2. ���� ��õ ���" + "\n");
			Scanner scan = new Scanner(System.in);
			while(true){
				answer = scan.nextInt();
				if(answer == 1) {
					Utill.clearConsole();
					return;
				}
				else if(answer == 2) {
					Utill.clearConsole();
					for(int j=1;j<16;j++) {
						System.out.println(csv_file.indat[j][0]+ "\n");
					}
					return;
				}
				
			}
	 }
}
