package ch06;

public class FinalMethodEx {
  public static void main(String[] args) {

  }
}


class Chess {
  enum ChessPlayer {
    WHITE, BLACK


  }

  }

  class WorldChess extends Chess{

    ChessPlayer getFirstPlayer(){
      return ChessPlayer.BLACK;

    }
  }

