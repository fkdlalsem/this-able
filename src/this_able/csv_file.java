package this_able;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class csv_file {
		static int row = 1;
		static int i = 0;
		public static String[][] indat = new String[2880][2880];
    static void create_array() {
        String token[] = new String[100];
        try {
            // csv ����Ÿ ����
            //File csv = new File("C:\Users\82105\eclipse-workspace\this_able\");
            File csv = new File("./2.csv");
            BufferedReader br = new BufferedReader(new FileReader(csv));
            String line = "";
 
            while ((line = br.readLine()) != null) {
                // -1 �ɼ��� ������ "," ���� �� ���鵵 �б� ���� �ɼ�
                token = line.split(",", -1);
                for(i=0;i<8;i++) {
                	indat[row][i] = token[i];
                	
                }
                row++;
            }
            
            br.close();
 
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }        
 
}

