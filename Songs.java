import java.io.*;
import java.util.*;
class Songs{
  public static void main(String[] args){ throws IOException
    Scanner sc = new Scanner(new File("regional-global-daily-latest.csv"));
    int cols = 4;
    int rows = 199;
    String[][] myList = new String[rows][cols];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        myList[i][j] = sc.Next();
      }
    }
    int[][] arr = { { 1, 2 }, { 3, 4 } };
    System.out.println("arr[0][0] = " + arr[0][0]);
    sc.close();
  }
}
