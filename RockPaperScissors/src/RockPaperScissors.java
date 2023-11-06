public class RockPaperScissors {
    public static void main(String[] args){
        //rock beats scissors, scissors beats paper,and paper beats rocks
        String[] moves = {"Rock", "Paper", "Scissors"};
        int player1 =(int)(Math.random() * 3);
        int player2 =(int)(Math.random() * 3);
        System.out.println("Player 1: "+moves[player1]);
        System.out.println("Player 2: "+moves[player2]);
        if (player1 == player2){
            System.out.println("No one won! Players played same move.");

        }
        else if (player1 == 0){
            if (player2 == 1){
                System.out.println("Player 2 has won with "+moves[player2]+". Player 1 has lost with "+moves[player1]);
            }else{
                System.out.println("Player 1 has won with "+moves[player1]+".Player 2 has lost with "+moves[player2]);
            }
        }else if (player1 == 1){
            if (player2 == 0){
                System.out.println("Player 1 has won with "+moves[player1]+". Player 2 has lost with "+moves[player2]);
            }else{
                System.out.println("Player 2 has won with "+moves[player2]+".Player 1 has lost with "+moves[player1]);
            }
        }else{
            if (player2 == 0){
                System.out.println("Player 2 has won with "+moves[player2]+". Player 1 has lost with "+moves[player1]);
            }else{
                System.out.println("Player 1 has won with "+moves[player1]+". Player 2 has lost with "+moves[player2]);
            }
        }

    }
}
