import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;


public class carrer_data {

    public static void main(String[] args) {
        String[][] indat = new String[2880][2880];
        try {
            // csv 데이타 파일
            //File csv = new File("d:\\data\\Regression_ver20130401.csv");
            File csv = new File("C:\\Users\\김승엽\\IdeaProjects\\this-able\\직업.csv");
            BufferedReader br = new BufferedReader(new FileReader(csv));
            String line;
            int row =1 ,i;
            while ((line = br.readLine()) != null) {
                // -1 옵션은 마지막 "," 이후 빈 공백도 읽기 위한 옵션

                String[] token = line.split(",", -1);
                for(i=0;i<30;i++)    indat[row][i] = token[i];

                // CSV에서 읽어 배열에 옮긴 자료 확인하기 위한 출력
                for(i=0;i<30;i++)    System.out.print(indat[row][i] + ",");
                System.out.println("");

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
