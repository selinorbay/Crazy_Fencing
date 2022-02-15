import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    double totArea = 0;

    Scanner values = new Scanner(System.in);
    int n = values.nextInt();

    int h[] = new int[n+1];
    int w[] = new int[n];

    for(int i = 0; i < n+1; i++){

      h[i] = values.nextInt();
    }

    for(int i = 0; i < n; i++){

      w[i] = values.nextInt();
    }

    for(int i = 0; i < n; i++){

      totArea += (h[i] + h[i+1]) * w[i];
    }

    System.out.println(totArea / 2.0);
    
  }
}