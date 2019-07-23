
public class GameOfLife {

  public static void initialize_generation(boolean[][] Gen, double p){
   int N = Gen.length;
   for (int i = 0; i < N; i++)
    for (int j = 0; j < N; j++)
      if (Math.random() < p) Gen[i][j] = true;
  }

 public static void show_generation(boolean[][] Gen, boolean which){
  int N = Gen.length;
  StdDraw.setXscale(-1, N);
  StdDraw.setYscale(-1, N);
  for (int i=0; i < N; i++)
   for (int j=0; j < N; j++)
    if (Gen[i][j]==which) StdDraw.filledSquare(j, N-i-1, .5);
 }

 public static int live_neighbors(boolean[][] Gen, int x, int y){
  int N = Gen.length;
  int count = 0;
  if (Gen[x][y]) count--;
  for (int i = x-1; i <= x+1; i++)
   for (int j = y-1; j <= y+1; j++)
      if (i >= 0 && i < N && j >= 0 && j < N && Gen[i][j]) count++;
  return count;
 }
    
 public static void compute_next_generation(boolean[][] Gen){
   int N = Gen.length;
   for (int i = 0; i < N; i++)
    for (int j = 0; j < N; j++){
     int n = live_neighbors(Gen, i, j);
     if (Gen[i][j] && (n < 2 || n > 3)) Gen[i][j]=false;
     if (!Gen[i][j] && n==3) Gen[i][j]=true;
   }
 }
  
 public static void main(String[] args){
  int N = Integer.parseInt(args[0]);  // size of grid
  double p = Double.parseDouble(args[1]); // probability that a cell is initially live
  int T = Integer.parseInt(args[2]); // number of succeeding generations to be computed
  boolean[][]Generation = new boolean[N][N];
  initialize_generation(Generation, p);
  for (int t = 1; t <= T; t++){
   StdDraw.clear();
   StdDraw.setPenColor(StdDraw.GRAY);
   show_generation(Generation, false);
   StdDraw.setPenColor(StdDraw.BLUE);
   show_generation(Generation, true);
   StdDraw.show(1000);
   compute_next_generation(Generation);
  }
 }
}