package this_able;

public class Sort {
	static int z;
	static int all;
	static String recommend[][][] = new String[100][20][2];
	static String temp;
	
	 static void re_sort(int round){						//�������� ���� �ְ� �����̸� �ִ� �迭 ����
		 z=0;
		 for(int a=2;a<16;a++) {												
			 if(Utill.cheak[round][a] == 0) {				//�� ������ ������ ���� �ʴ´ٸ� �ƿ� ������ �ȉ�
				 recommend[round][z][0] = String.valueOf(Utill.point[round][a]);
				 recommend[round][z][1] = csv_file.indat[a][0];
				 z=z+1;
			 }
			 
		 }
		 all=z;
		 bubble_sort(round);
	 }
	 
	 static void bubble_sort(int round) {				//���Ľ���
		 System.out.println("\n\n\n\n\n\n");
		 for(z=0;z<all-2;z++) {
			 for(int up = 0;up<all-1;up++) {
				 if(Integer.parseInt(recommend[round][up][0]) > Integer.parseInt(recommend[round][up+1][0])) {
					    temp = recommend[round][up][0];												//������ �°� ����
					    recommend[round][up][0] = recommend[round][up+1][0];				
					    recommend[round][up+1][0] = temp;
					    
					    temp = recommend[round][up][1];												//������ ���� ��������
					    recommend[round][up][1] = recommend[round][up+1][1];
					    recommend[round][up+1][1] = temp;
				 }
			 }
		 }
		 System.out.println("��õ�� ������ ���� " + all +"�� �Դϴ�.\n");
		 for(z=all-1;z>-1;z--) {
			 System.out.println(recommend[round][z][1] +"   " + recommend[round][z][0] + "��");
		 }
	 }
}