package this_able;

public class Sort {
	static int z;
	static int all;
	static String recommend[][][] = new String[100][20][2];
	static String temp;
	
	 static void re_sort(int round){						//그직업에 점수 넣고 직업이름 넣는 배열 생성
		 z=0;
		 for(int a=2;a<16;a++) {												
			 if(Utill.cheak[round][a] == 0) {				//이 직업이 나에게 맞지 않는다면 아예 생성이 안됌
				 recommend[round][z][0] = String.valueOf(Utill.point[round][a]);
				 recommend[round][z][1] = csv_file.indat[a][0];
				 z=z+1;
			 }
			 
		 }
		 all=z;
		 bubble_sort(round);
	 }
	 
	 static void bubble_sort(int round) {				//정렬시작
		 System.out.println("\n\n\n\n\n\n");
		 for(z=0;z<all-2;z++) {
			 for(int up = 0;up<all-1;up++) {
				 if(Integer.parseInt(recommend[round][up][0]) > Integer.parseInt(recommend[round][up+1][0])) {
					    temp = recommend[round][up][0];												//점수에 맞게 정렬
					    recommend[round][up][0] = recommend[round][up+1][0];				
					    recommend[round][up+1][0] = temp;
					    
					    temp = recommend[round][up][1];												//직업도 같이 정렬해줌
					    recommend[round][up][1] = recommend[round][up+1][1];
					    recommend[round][up+1][1] = temp;
				 }
			 }
		 }
		 System.out.println("추천할 직업의 수는 " + all +"개 입니다.\n");
		 for(z=all-1;z>-1;z--) {
			 System.out.println(recommend[round][z][1] +"   " + recommend[round][z][0] + "점");
		 }
	 }
}