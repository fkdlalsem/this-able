package this_able;

public class Sort {
	static int z;
	static int all;
	static String recommend[][][] = new String[100][20][2];
	static String temp;
	
	 static void re_sort(int i){
		 z=0;
		 for(int a=2;a<16;a++) {
			 if(Utill.cheak[i][a] == 0) {
				 recommend[i][z][0] = String.valueOf(Utill.point[i][a]);
				 recommend[i][z][1] = csv_file.indat[a][0];
				 z=z+1;
			 }
			 
		 }
		 all=z;
		 bubble_sort(i);
	 }
	 
	 static void bubble_sort(int i) {
		 System.out.println("\n\n\n\n\n\n");
		 for(z=0;z<all-2;z++) {
			 for(int up = 0;up<all-1;up++) {
				 if(Integer.parseInt(recommend[i][up][0]) > Integer.parseInt(recommend[i][up+1][0])) {
					    temp = recommend[i][up][0];
					    recommend[i][up][0] = recommend[i][up+1][0];
					    recommend[i][up+1][0] = temp;
					    
					    temp = recommend[i][up][1];
					    recommend[i][up][1] = recommend[i][up+1][1];
					    recommend[i][up+1][1] = temp;
				 }
			 }
		 }
		 System.out.println("추천할 직업의 수는 " + all +"개 입니다.\n");
		 for(z=all-1;z>-1;z--) {
			 System.out.println(recommend[i][z][1] +"   " + recommend[i][z][0] + "점");
		 }
	 }
}