package tw.com.vic.finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    Button button,button2,button3,button4,button5,button6
            ,button7,button8,button9,button10,button11,button12
            ,button13,button14,button15,button16,button17,button18
            ,button19,button20,button21,button22,button23,button24
            ,button25,button26,button27,button28,button29,button30
            ,button31,button32,button33,button34,button35,button36
            ,button37,button38,button39,button40,button41,button42
            ,button43,button44,button45,button46,button47,button48
            ,button49,restart,exit;
    TextView result;
    int turn = 0;
    int gg= 0;
    static int table[][] = new int[6][7];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        result.setText("");
        for(int i =0;i<6;i++){
            for(int j =0;j<7;j++){
                table[i][j]=0;
            }
        }
    }
    private void findViews(){
        exit = (Button)findViewById(R.id.exit);
        restart = (Button)findViewById(R.id.restart);
        result = (TextView)findViewById(R.id.result);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);
        button17 = (Button)findViewById(R.id.button17);
        button18 = (Button)findViewById(R.id.button18);
        button19 = (Button)findViewById(R.id.button19);
        button20 = (Button)findViewById(R.id.button20);
        button21 = (Button)findViewById(R.id.button21);
        button22 = (Button)findViewById(R.id.button22);
        button23 = (Button)findViewById(R.id.button23);
        button24 = (Button)findViewById(R.id.button24);
        button25 = (Button)findViewById(R.id.button25);
        button26 = (Button)findViewById(R.id.button26);
        button27 = (Button)findViewById(R.id.button27);
        button28 = (Button)findViewById(R.id.button28);
        button29 = (Button)findViewById(R.id.button29);
        button30 = (Button)findViewById(R.id.button30);
        button31 = (Button)findViewById(R.id.button31);
        button32 = (Button)findViewById(R.id.button32);
        button33 = (Button)findViewById(R.id.button33);
        button34 = (Button)findViewById(R.id.button34);
        button35 = (Button)findViewById(R.id.button35);
        button36 = (Button)findViewById(R.id.button36);
        button37 = (Button)findViewById(R.id.button37);
        button38 = (Button)findViewById(R.id.button38);
        button39 = (Button)findViewById(R.id.button39);
        button40 = (Button)findViewById(R.id.button40);
        button41 = (Button)findViewById(R.id.button41);
        button42 = (Button)findViewById(R.id.button42);
        button43 = (Button)findViewById(R.id.button43);
        button44 = (Button)findViewById(R.id.button44);
        button45 = (Button)findViewById(R.id.button45);
        button46 = (Button)findViewById(R.id.button46);
        button47 = (Button)findViewById(R.id.button47);
        button48 = (Button)findViewById(R.id.button48);
        button49 = (Button)findViewById(R.id.button49);
        button43.setOnClickListener(btnLin);
        button44.setOnClickListener(btnLin);
        button45.setOnClickListener(btnLin);
        button46.setOnClickListener(btnLin);
        button47.setOnClickListener(btnLin);
        button48.setOnClickListener(btnLin);
        button49.setOnClickListener(btnLin);
        restart.setOnClickListener(reLin);
        exit.setOnClickListener(exLin);
    }
    public static int whowin(int[][] array) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (array[i][j] != 0) {
                    if(j<4){
                        if (array[i][j] == array[i][j + 1] && array[i][j] == array[i][j + 2] && array[i][j] == array[i][j + 3]) {
                            return array[i][j];
                        }
                    }

                    if(i<3){
                        if (array[i][j] == array[i + 1][j] && array[i][j] == array[i + 2][j] && array[i][j] == array[i + 3][j]) {
                            return array[i][j];
                        }
                    }
                    if(j<4&&i<3){
                        if (array[i][j] == array[i + 1][j + 1] && array[i][j] == array[i + 2][j + 2] && array[i][j] == array[i + 3][j + 3]) {
                            return array[i][j];
                        }
                    }
                    if(j>2&&i<3) {
                        if (array[i][j] == array[i + 1][j - 1] && array[i][j] == array[i + 2][j - 2] && array[i][j] == array[i + 3][j - 3]) {
                            return array[i][j];
                        }
                    }
                }

            }
        }
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if(array[i][j]!=0){
                    count+=1;
                }
            }
        }
        if(count == 42){
            return -1;
        }
        return 0;
    }
    private Button.OnClickListener reLin = new Button.OnClickListener() {
        public void onClick(View v) {
           gg=0;
            for(int i =0;i<6;i++){
                for(int j =0;j<7;j++){
                    table[i][j]=0;
                }
            }
            turn = 0;
            btnrestart();
            result.setText("");
        }
    };
    private Button.OnClickListener exLin = new Button.OnClickListener() {
        public void onClick(View v) {
            gg=0;
            for(int i =0;i<6;i++){
                for(int j =0;j<7;j++){
                    table[i][j]=0;
                }
            }
            turn = 0;
            btnrestart();
            result.setText("");
            finish();
        }
    };
    private void btnrestart(){
        button.setBackgroundResource(R.drawable.empty);
        button2.setBackgroundResource(R.drawable.empty);
        button3.setBackgroundResource(R.drawable.empty);
        button4.setBackgroundResource(R.drawable.empty);
        button5.setBackgroundResource(R.drawable.empty);
        button6.setBackgroundResource(R.drawable.empty);
        button7.setBackgroundResource(R.drawable.empty);
        button8.setBackgroundResource(R.drawable.empty);
        button9.setBackgroundResource(R.drawable.empty);
        button10.setBackgroundResource(R.drawable.empty);
        button11.setBackgroundResource(R.drawable.empty);
        button12.setBackgroundResource(R.drawable.empty);
        button13.setBackgroundResource(R.drawable.empty);
        button14.setBackgroundResource(R.drawable.empty);
        button15.setBackgroundResource(R.drawable.empty);
        button16.setBackgroundResource(R.drawable.empty);
        button17.setBackgroundResource(R.drawable.empty);
        button18.setBackgroundResource(R.drawable.empty);
        button19.setBackgroundResource(R.drawable.empty);
        button20.setBackgroundResource(R.drawable.empty);
        button21.setBackgroundResource(R.drawable.empty);
        button22.setBackgroundResource(R.drawable.empty);
        button23.setBackgroundResource(R.drawable.empty);
        button24.setBackgroundResource(R.drawable.empty);
        button25.setBackgroundResource(R.drawable.empty);
        button26.setBackgroundResource(R.drawable.empty);
        button27.setBackgroundResource(R.drawable.empty);
        button28.setBackgroundResource(R.drawable.empty);
        button29.setBackgroundResource(R.drawable.empty);
        button30.setBackgroundResource(R.drawable.empty);
        button31.setBackgroundResource(R.drawable.empty);
        button32.setBackgroundResource(R.drawable.empty);
        button33.setBackgroundResource(R.drawable.empty);
        button34.setBackgroundResource(R.drawable.empty);
        button35.setBackgroundResource(R.drawable.empty);
        button36.setBackgroundResource(R.drawable.empty);
        button37.setBackgroundResource(R.drawable.empty);
        button38.setBackgroundResource(R.drawable.empty);
        button39.setBackgroundResource(R.drawable.empty);
        button40.setBackgroundResource(R.drawable.empty);
        button41.setBackgroundResource(R.drawable.empty);
        button42.setBackgroundResource(R.drawable.empty);

    }
        private Button.OnClickListener btnLin = new Button.OnClickListener(){
        public void onClick(View v){
            if(gg == 0){
                if(v.getId() == R.id.button43){
                    turn+=1;
                    if(turn%2 == 1){
                        if(table[0][0]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][0]==0){
                                table[i][0] = 1;
                                int count = i*7+1;
                                if(count == 36){
                                    button36.setBackgroundResource(R.drawable.red);
                                }else if(count == 29){
                                    button29.setBackgroundResource(R.drawable.red);
                                }else if(count == 22){
                                    button22.setBackgroundResource(R.drawable.red);
                                }else if(count == 15){
                                    button15.setBackgroundResource(R.drawable.red);
                                }else if(count == 8){
                                    button8.setBackgroundResource(R.drawable.red);
                                }else if(count == 1){
                                    button.setBackgroundResource(R.drawable.red);
                                }

                                break;
                            }
                        }
                    }
                    else if (turn%2 == 0){
                        if(table[0][0]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][0]==0){
                                table[i][0] = 2;
                                int count = i*7+1;
                                if(count == 36){
                                    button36.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 29){
                                    button29.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 22){
                                    button22.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 15){
                                    button15.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 8){
                                    button8.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 1){
                                    button.setBackgroundResource(R.drawable.yellow);
                                }
                                break;
                            }
                        }
                    }
                    if(whowin(table)==1){
                        result.setText("player1 win!");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player1 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin(table)==2){
                        result.setText("player2 win");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player2 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin(table)==-1){
                        result.setText("平手");
                        gg=1;
                        Toast.makeText(MainActivity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }

                }
                else if (v.getId() == R.id.button44){
                    turn+=1;
                    if(turn%2 == 1){
                        if(table[0][1]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][1]==0){
                                table[i][1] = 1;
                                int count = i*7+2;
                                if(count == 37){
                                    button37.setBackgroundResource(R.drawable.red);
                                }else if(count == 30){
                                    button30.setBackgroundResource(R.drawable.red);
                                }else if(count == 23){
                                    button23.setBackgroundResource(R.drawable.red);
                                }else if(count == 16){
                                    button16.setBackgroundResource(R.drawable.red);
                                }else if(count == 9){
                                    button9.setBackgroundResource(R.drawable.red);
                                }else if(count == 2){
                                    button2.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                    }
                    else if (turn%2 == 0){
                        if(table[0][1]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][1]==0){
                                table[i][1] = 2;
                                int count = i*7+2;
                                if(count == 37){
                                    button37.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 30){
                                    button30.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 23){
                                    button23.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 16){
                                    button16.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 9){
                                    button9.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 2){
                                    button2.setBackgroundResource(R.drawable.yellow);
                                }
                                break;
                            }
                        }
                    }
                    if(whowin(table)==1){
                        result.setText("player1 win!");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player1 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin(table)==2){
                        result.setText("player2 win");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player2 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin(table)==-1){
                        result.setText("平手");
                        gg=1;
                        Toast.makeText(MainActivity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.button45){
                    turn+=1;
                    if(turn%2 == 1){
                        if(table[0][2]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][2]==0){
                                table[i][2] = 1;
                                int count = i*7+3;
                                if(count == 38){
                                    button38.setBackgroundResource(R.drawable.red);
                                }else if(count == 31){
                                    button31.setBackgroundResource(R.drawable.red);
                                }else if(count == 24){
                                    button24.setBackgroundResource(R.drawable.red);
                                }else if(count == 17){
                                    button17.setBackgroundResource(R.drawable.red);
                                }else if(count == 10){
                                    button10.setBackgroundResource(R.drawable.red);
                                }else if(count == 3){
                                    button3.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                    }
                    else if (turn%2 == 0){
                        if(table[0][2]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][2]==0){
                                table[i][2] = 2;
                                int count = i*7+3;
                                if(count == 38){
                                    button38.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 31){
                                    button31.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 24){
                                    button24.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 17){
                                    button17.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 10){
                                    button10.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 3){
                                    button3.setBackgroundResource(R.drawable.yellow);
                                }
                                break;
                            }
                        }
                    }
                    if(whowin(table)==1){
                        result.setText("player1 win!");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player1 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin(table)==2){
                        result.setText("player2 win");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player2 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin(table)==-1){
                        result.setText("平手");
                        gg=1;
                        Toast.makeText(MainActivity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.button46){
                    turn+=1;
                    if(turn%2 == 1){
                        if(table[0][3]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][3]==0){
                                table[i][3] = 1;
                                int count = i*7+4;
                                if(count == 39){
                                    button39.setBackgroundResource(R.drawable.red);
                                }else if(count == 32){
                                    button32.setBackgroundResource(R.drawable.red);
                                }else if(count == 25){
                                    button25.setBackgroundResource(R.drawable.red);
                                }else if(count == 18){
                                    button18.setBackgroundResource(R.drawable.red);
                                }else if(count == 11){
                                    button11.setBackgroundResource(R.drawable.red);
                                }else if(count == 4){
                                    button4.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                    }
                    else if (turn%2 == 0){
                        if(table[0][3]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][3]==0){
                                table[i][3] = 2;
                                int count = i*7+4;
                                if(count == 39){
                                    button39.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 32){
                                    button32.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 25){
                                    button25.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 18){
                                    button18.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 11){
                                    button11.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 4){
                                    button4.setBackgroundResource(R.drawable.yellow);
                                }
                                break;
                            }
                        }
                    }
                    if(whowin(table)==1){
                        result.setText("player1 win!");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player1 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin(table)==2){
                        result.setText("player2 win");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player2 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin(table)==-1){
                        result.setText("平手");
                        gg=1;
                        Toast.makeText(MainActivity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.button47){
                    turn+=1;
                    if(turn%2 == 1){
                        if(table[0][4]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][4]==0){
                                table[i][4] = 1;
                                int count = i*7+5;
                                if(count == 40){
                                    button40.setBackgroundResource(R.drawable.red);
                                }else if(count == 33){
                                    button33.setBackgroundResource(R.drawable.red);
                                }else if(count == 26){
                                    button26.setBackgroundResource(R.drawable.red);
                                }else if(count == 19){
                                    button19.setBackgroundResource(R.drawable.red);
                                }else if(count == 12){
                                    button12.setBackgroundResource(R.drawable.red);
                                }else if(count == 5){
                                    button5.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                    }
                    else if (turn%2 == 0){
                        if(table[0][4]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][4]==0){
                                table[i][4] = 2;
                                int count = i*7+5;
                                if(count == 40){
                                    button40.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 33){
                                    button33.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 26){
                                    button26.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 19){
                                    button19.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 12){
                                    button12.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 5){
                                    button5.setBackgroundResource(R.drawable.yellow);
                                }
                                break;
                            }
                        }
                    }
                    if(whowin(table)==1){
                        result.setText("player1 win!");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player1 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin(table)==2){
                        result.setText("player2 win");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player2 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin(table)==-1){
                        result.setText("平手");
                        gg=1;
                        Toast.makeText(MainActivity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.button48){
                    turn+=1;
                    if(turn%2 == 1){
                        if(table[0][5]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][5]==0){
                                table[i][5] = 1;
                                int count = i*7+6;
                                if(count == 41){
                                    button41.setBackgroundResource(R.drawable.red);
                                }else if(count == 34){
                                    button34.setBackgroundResource(R.drawable.red);
                                }else if(count == 27){
                                    button27.setBackgroundResource(R.drawable.red);
                                }else if(count == 20){
                                    button20.setBackgroundResource(R.drawable.red);
                                }else if(count == 13){
                                    button13.setBackgroundResource(R.drawable.red);
                                }else if(count == 6){
                                    button6.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                    }
                    else if (turn%2 == 0){
                        if(table[0][5]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][5]==0){
                                table[i][5] = 2;
                                int count = i*7+6;
                                if(count == 41){
                                    button41.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 34){
                                    button34.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 27){
                                    button27.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 20){
                                    button20.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 13){
                                    button13.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 6){
                                    button6.setBackgroundResource(R.drawable.yellow);
                                }
                                break;
                            }
                        }
                    }
                    if(whowin(table)==1){
                        result.setText("player1 win!");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player1 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin(table)==2){
                        result.setText("player2 win");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player2 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin(table)==-1){
                        result.setText("平手");
                        gg=1;
                        Toast.makeText(MainActivity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.button49){
                    turn+=1;
                    if(turn%2 == 1){
                        if(table[0][6]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][6]==0){
                                table[i][6] = 1;
                                int count = i*7+7;
                                if(count == 42){
                                    button42.setBackgroundResource(R.drawable.red);
                                }else if(count == 35){
                                    button35.setBackgroundResource(R.drawable.red);
                                }else if(count == 28){
                                    button28.setBackgroundResource(R.drawable.red);
                                }else if(count == 21){
                                    button21.setBackgroundResource(R.drawable.red);
                                }else if(count == 14){
                                    button14.setBackgroundResource(R.drawable.red);
                                }else if(count == 7){
                                    button7.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                    }
                    else if (turn%2 == 0){
                        if(table[0][6]!=0){
                            turn--;
                        }
                        for(int i = 5;i>-1;i--){
                            if(table[i][6]==0){
                                table[i][6] = 2;
                                int count = i*7+7;
                                if(count == 42){
                                    button42.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 35){
                                    button35.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 28){
                                    button28.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 21){
                                    button21.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 14){
                                    button14.setBackgroundResource(R.drawable.yellow);
                                }else if(count == 7){
                                    button7.setBackgroundResource(R.drawable.yellow);
                                }
                                break;
                            }
                        }
                    }
                    if(whowin(table)==1){
                        result.setText("player1 win!");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player1 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin(table)==2){
                        result.setText("player2 win");
                        gg=1;
                        Toast.makeText(MainActivity.this,"player2 win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin(table)==-1){
                        result.setText("平手");
                        gg=1;
                        Toast.makeText(MainActivity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
            }

        }
    };
}
