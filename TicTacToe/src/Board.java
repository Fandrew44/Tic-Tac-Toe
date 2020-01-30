public class Board {

    String[][] moves;

    public Board(){
        moves = new String[3][3];
    }

    //MODIFIES: this
    //EFFECTS:
    public void initializeBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                moves[i][j] = "/";
            }
        }

    }

    public void printEmptyBoard(){
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+");
        System.out.println("|   |   |   |");
        System.out.println("+---+---+---+");

    }

    public void printBoard(){
        System.out.println("+---+---+---+");
        System.out.println("| " + moves[0][0] +  " | " + moves[0][1] + " | " + moves[0][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + moves[1][0] +  " | " + moves[1][1] + " | " + moves[1][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + moves[2][0] +  " | " + moves[2][1] + " | " + moves[2][2] + " |");
        System.out.println("+---+---+---+");
    }

    public void fillBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                moves[i][j] = "x";
            }
        }
    }

    public boolean isBoardFull() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(!moves[i][j].equals("/")){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public String getMove(int x, int y){
        return moves[x][y];
    }

    public void setMoveX(int x, int y){
        moves[x][y] = "x";
    }

    public void setMoveO(int x, int y){
        moves[x][y] = "o";
    }

    public boolean checkWin(){
        if(checkRows() || checkColumns() || checkDiagonals()){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkRows() {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if(moves[i][j].equals("/")){
//                    return false;
//                }else if(moves[i][j].equals("x")){
//                    if(!moves[i][j++].equals("o")){
//                        continue;
//                    }else{
//                        return false;
//                    }
//                }else if(moves[i][j].equals("o")){
//                    if(!moves[i][j++].equals("x")){
//                        continue;
//                    }else{
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0 && j == 0){
                    if(moves[i][j].equals(moves[0][1]) && moves[0][1].equals(moves[0][2]) && !moves[i][j].equals("/")){
                        return true;
                    }
                } else if(i == 1 && j == 0){
                    if(moves[i][j].equals(moves[1][1]) && moves[1][1].equals(moves[1][2]) && !moves[i][j].equals("/")){
                        return true;
                    }
                } else if(i == 2 && j == 0){
                    if(moves[i][j].equals(moves[2][1]) && moves[2][1].equals(moves[2][2]) && !moves[i][j].equals("/")){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean checkColumns(){
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                if(moves[i][j].equals("/")){
//                    return false;
//                } else if(moves[i][j].equals("x")){
//                    if(!moves[i++][j].equals("o")){
//                        continue;
//                    }else{
//                        return false;
//                    }
//                } else if(moves[i][j].equals("o")){
//                    if(!moves[i++][j].equals("x")){
//                        continue;
//                    } else{
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0 && j == 0){
                    if(moves[i][j].equals(moves[1][0]) && moves[1][0].equals(moves[2][0]) && !moves[i][j].equals("/")){
                        return true;
                    }
                } else if(i == 0 && j == 1){
                    if(moves[i][j].equals(moves[1][1]) && moves[1][1].equals(moves[2][1]) && !moves[i][j].equals("/")){
                        return true;
                    }
                } else if(i == 0 && j == 2){
                    if(moves[i][j].equals(moves[1][2]) && moves[1][2].equals(moves[2][2]) && !moves[i][j].equals("/")){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkDiagonals(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if((i == 0) && (j == 0)){
                    if((moves[i][j].equals(moves[1][1])) && (moves[1][1].equals(moves[2][2])) && !moves[i][j].equals("/")){
                        return true;
                    }
                }else if((i == 0) && (j == 2)){
                    if((moves[i][j].equals(moves[1][1])) && (moves[1][1].equals(moves[2][0])) && !moves[i][j].equals("/")){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkMoves(){
        return false;//stub
    }

    public boolean isMoveTaken(int x, int y){
        if(!moves[x][y].contains("/")){
            return true;
        }else{
            return false;
        }
    }

}
