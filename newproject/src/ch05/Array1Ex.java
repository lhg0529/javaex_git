package ch05;

public class Array1Ex {
  public static void main(String[] args) {
    int sum = 0 , avg = 0;
    int sc1 = 90;
    int sc2 = 80;
    int sc3 = 100;

    sum = sc1 + sc2 + sc3;
    avg = sum/3;

//    int[] scores = new int[3];
//    scores[0]=90;
//    scores[1]=80;
//    scores[2]=10;
//    //sum = scores[0] + scores[1] + scores[2];
    int[] scores = {90, 80, 100, 100, 90};

    for (int i = 0; i < 3; i++) {
      sum += scores[i];

    }

    avg = sum/3;
    System.out.printf("sum=%d, avg=%d", sum, avg);
    int[] scoreBig = new int[5];
    for (int i = 0; i < scores.length; i++) {
      scoreBig[i] = scores[i];
    }

    scores=scoreBig;
    scores[3]=110;
    for(int i=0; i < scores.length; i++){
      System.out.println(scores[i]);
    }
    for (int score : scores) {
      System.out.println(score);

    }
  }
}
