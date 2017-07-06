package tw.com.vic.finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends Activity {
    Button b2utton,b2utton2,b2utton3,b2utton4,b2utton5,b2utton6
            ,b2utton7,b2utton8,b2utton9,b2utton10,b2utton11,b2utton12
            ,b2utton13,b2utton14,b2utton15,b2utton16,b2utton17,b2utton18
            ,b2utton19,b2utton20,b2utton21,b2utton22,b2utton23,b2utton24
            ,b2utton25,b2utton26,b2utton27,b2utton28,b2utton29,b2utton30
            ,b2utton31,b2utton32,b2utton33,b2utton34,b2utton35,b2utton36
            ,b2utton37,b2utton38,b2utton39,b2utton40,b2utton41,b2utton42
            ,b2utton43,b2utton44,b2utton45,b2utton46,b2utton47,b2utton48
            ,b2utton49,restart2,exit2;
    TextView result2;
    int turn = 0;
    int gg= 0;
    static int table[][] = new int[6][7];
    int scores[] = new int[7];
    int find = 0;
    int stop=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViews();
        result2.setText("");
        for(int i =0;i<6;i++){
            for(int j =0;j<7;j++){
                table[i][j]=0;
            }
        }
    }
    private void findViews(){
        exit2 = (Button)findViewById(R.id.exit2);
        restart2 = (Button)findViewById(R.id.restart2);
        result2 = (TextView)findViewById(R.id.result2);
        b2utton = (Button)findViewById(R.id.b2utton);
        b2utton2 = (Button)findViewById(R.id.b2utton2);
        b2utton3 = (Button)findViewById(R.id.b2utton3);
        b2utton4 = (Button)findViewById(R.id.b2utton4);
        b2utton5 = (Button)findViewById(R.id.b2utton5);
        b2utton6 = (Button)findViewById(R.id.b2utton6);
        b2utton7 = (Button)findViewById(R.id.b2utton7);
        b2utton8 = (Button)findViewById(R.id.b2utton8);
        b2utton9 = (Button)findViewById(R.id.b2utton9);
        b2utton10 = (Button)findViewById(R.id.b2utton10);
        b2utton11 = (Button)findViewById(R.id.b2utton11);
        b2utton12 = (Button)findViewById(R.id.b2utton12);
        b2utton13 = (Button)findViewById(R.id.b2utton13);
        b2utton14 = (Button)findViewById(R.id.b2utton14);
        b2utton15 = (Button)findViewById(R.id.b2utton15);
        b2utton16 = (Button)findViewById(R.id.b2utton16);
        b2utton17 = (Button)findViewById(R.id.b2utton17);
        b2utton18 = (Button)findViewById(R.id.b2utton18);
        b2utton19 = (Button)findViewById(R.id.b2utton19);
        b2utton20 = (Button)findViewById(R.id.b2utton20);
        b2utton21 = (Button)findViewById(R.id.b2utton21);
        b2utton22 = (Button)findViewById(R.id.b2utton22);
        b2utton23 = (Button)findViewById(R.id.b2utton23);
        b2utton24 = (Button)findViewById(R.id.b2utton24);
        b2utton25 = (Button)findViewById(R.id.b2utton25);
        b2utton26 = (Button)findViewById(R.id.b2utton26);
        b2utton27 = (Button)findViewById(R.id.b2utton27);
        b2utton28 = (Button)findViewById(R.id.b2utton28);
        b2utton29 = (Button)findViewById(R.id.b2utton29);
        b2utton30 = (Button)findViewById(R.id.b2utton30);
        b2utton31 = (Button)findViewById(R.id.b2utton31);
        b2utton32 = (Button)findViewById(R.id.b2utton32);
        b2utton33 = (Button)findViewById(R.id.b2utton33);
        b2utton34 = (Button)findViewById(R.id.b2utton34);
        b2utton35 = (Button)findViewById(R.id.b2utton35);
        b2utton36 = (Button)findViewById(R.id.b2utton36);
        b2utton37 = (Button)findViewById(R.id.b2utton37);
        b2utton38 = (Button)findViewById(R.id.b2utton38);
        b2utton39 = (Button)findViewById(R.id.b2utton39);
        b2utton40 = (Button)findViewById(R.id.b2utton40);
        b2utton41 = (Button)findViewById(R.id.b2utton41);
        b2utton42 = (Button)findViewById(R.id.b2utton42);
        b2utton43 = (Button)findViewById(R.id.b2utton43);
        b2utton44 = (Button)findViewById(R.id.b2utton44);
        b2utton45 = (Button)findViewById(R.id.b2utton45);
        b2utton46 = (Button)findViewById(R.id.b2utton46);
        b2utton47 = (Button)findViewById(R.id.b2utton47);
        b2utton48 = (Button)findViewById(R.id.b2utton48);
        b2utton49 = (Button)findViewById(R.id.b2utton49);
        b2utton43.setOnClickListener(btnLin2);
        b2utton44.setOnClickListener(btnLin2);
        b2utton45.setOnClickListener(btnLin2);
        b2utton46.setOnClickListener(btnLin2);
        b2utton47.setOnClickListener(btnLin2);
        b2utton48.setOnClickListener(btnLin2);
        b2utton49.setOnClickListener(btnLin2);
        restart2.setOnClickListener(reLin2);
        exit2.setOnClickListener(exLin2);
    }
    public static int whowin2(int[][] array) {
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

    private Button.OnClickListener reLin2 = new Button.OnClickListener() {
        public void onClick(View v) {
            gg=0;
            for(int i =0;i<6;i++){
                for(int j =0;j<7;j++){
                    table[i][j]=0;
                }
            }
            turn = 0;
            btnrestart2();
            result2.setText("");
        }
    };
    private Button.OnClickListener exLin2 = new Button.OnClickListener() {
        public void onClick(View v) {
            gg=0;
            for(int i =0;i<6;i++){
                for(int j =0;j<7;j++){
                    table[i][j]=0;
                }
            }
            turn = 0;
            btnrestart2();
            result2.setText("");
            finish();
        }
    };
    private void btnrestart2(){
        b2utton.setBackgroundResource(R.drawable.empty);
        b2utton2.setBackgroundResource(R.drawable.empty);
        b2utton3.setBackgroundResource(R.drawable.empty);
        b2utton4.setBackgroundResource(R.drawable.empty);
        b2utton5.setBackgroundResource(R.drawable.empty);
        b2utton6.setBackgroundResource(R.drawable.empty);
        b2utton7.setBackgroundResource(R.drawable.empty);
        b2utton8.setBackgroundResource(R.drawable.empty);
        b2utton9.setBackgroundResource(R.drawable.empty);
        b2utton10.setBackgroundResource(R.drawable.empty);
        b2utton11.setBackgroundResource(R.drawable.empty);
        b2utton12.setBackgroundResource(R.drawable.empty);
        b2utton13.setBackgroundResource(R.drawable.empty);
        b2utton14.setBackgroundResource(R.drawable.empty);
        b2utton15.setBackgroundResource(R.drawable.empty);
        b2utton16.setBackgroundResource(R.drawable.empty);
        b2utton17.setBackgroundResource(R.drawable.empty);
        b2utton18.setBackgroundResource(R.drawable.empty);
        b2utton19.setBackgroundResource(R.drawable.empty);
        b2utton20.setBackgroundResource(R.drawable.empty);
        b2utton21.setBackgroundResource(R.drawable.empty);
        b2utton22.setBackgroundResource(R.drawable.empty);
        b2utton23.setBackgroundResource(R.drawable.empty);
        b2utton24.setBackgroundResource(R.drawable.empty);
        b2utton25.setBackgroundResource(R.drawable.empty);
        b2utton26.setBackgroundResource(R.drawable.empty);
        b2utton27.setBackgroundResource(R.drawable.empty);
        b2utton28.setBackgroundResource(R.drawable.empty);
        b2utton29.setBackgroundResource(R.drawable.empty);
        b2utton30.setBackgroundResource(R.drawable.empty);
        b2utton31.setBackgroundResource(R.drawable.empty);
        b2utton32.setBackgroundResource(R.drawable.empty);
        b2utton33.setBackgroundResource(R.drawable.empty);
        b2utton34.setBackgroundResource(R.drawable.empty);
        b2utton35.setBackgroundResource(R.drawable.empty);
        b2utton36.setBackgroundResource(R.drawable.empty);
        b2utton37.setBackgroundResource(R.drawable.empty);
        b2utton38.setBackgroundResource(R.drawable.empty);
        b2utton39.setBackgroundResource(R.drawable.empty);
        b2utton40.setBackgroundResource(R.drawable.empty);
        b2utton41.setBackgroundResource(R.drawable.empty);
        b2utton42.setBackgroundResource(R.drawable.empty);

    }
    public int countscore(int[][] array,int col) {
        int temp = 0;
        if(array[0][col]!=0){
            temp = -10000;
            return temp;
        }
        for(int i=5;i>-1;i--){
            if(array[i][col]==0){
                find = 1;
            }
            if(find==1){
                try{
                    if (array[i][col + 1] == 2 && array[i][col + 2] == 2 && array[i][col + 3] == 2) {
                        temp += 100000;
                        return temp;
                    }//往右找3個
                }catch (Exception e){}
                try{
                    if (array[i+1][col + 1] == 2 && array[i+2][col + 2] == 2 && array[i+3][col + 3] == 2) {
                        temp += 100000;
                        return temp;
                    }//往右下找3個
                }catch (Exception e){}
                try{
                    if (array[i-1][col + 1] == 2 && array[i-2][col + 2] == 2 && array[i-3][col + 3] == 2) {
                        temp += 100000;
                        return temp;
                    }//往右上找3個
                }catch (Exception e){}
                try{
                    if (array[i+1][col] == 2 && array[i+2][col] == 2 && array[i+3][col] == 2) {
                        temp += 100000;
                        return temp;
                    }//往下找3個
                }catch (Exception e){}
                try{
                    if (array[i+1][col-1] == 2 && array[i+2][col-2] == 2 && array[i+3][col-3] == 2) {
                        temp += 100000;
                        return temp;
                    }//往左下找3個
                }catch (Exception e){}
                try{
                    if (array[i][col-1] == 2 && array[i][col-2] == 2 && array[i][col-3] == 2) {
                        temp += 100000;
                        return temp;
                    }//往左找3個
                }catch (Exception e){}
                try{
                    if (array[i-1][col-1] == 2 && array[i-2][col-2] == 2 && array[i-3][col-3] == 2) {
                        temp += 100000;
                        return temp;
                    }//往左找3個
                }catch (Exception e){}
                try {
                    if (array[i][col + 1] == 1) {
                        temp += 1;
                    }//往右找1個
                    if (array[i][col + 1] == 1 && array[i][col + 2] == 1) {
                        temp += 20;
                    }//往右找2個
                    if (array[i][col + 1] == 1 && array[i][col + 2] == 1 && array[i][col + 3] == 1) {
                        temp += 1000;
                    }//往右找3個
                }catch (Exception e){}
                try {
                    if (array[i-1][col + 1] == 1) {
                        temp+=1;
                    }//往右上找1個
                    if (array[i-1][col + 1] == 1 &&array[i-2][col + 2]==1) {
                        temp+=20;

                    }//往右上找2個
                    if (array[i-1][col + 1] == 1 &&array[i-2][col + 2]==1 &&array[i-3][col + 3]==1) {
                        temp+=1000;

                    }//往右上找3個
                }catch (Exception e){
                }
                try{
                    if (array[i+1][col + 1] == 1) {
                        temp+=1;
                    }//往右下找1個
                    if (array[i+1][col + 1] == 1 &&array[i+2][col + 2]==1) {
                        temp+=20;
                    }//往右下找2個
                    if (array[i+1][col + 1] == 1 &&array[i+2][col +2]==1 &&array[i+3][col + 3]==1) {
                        temp+=1000;
                    }//往右下找3個
                }catch (Exception e){

                }
                try{
                    if (array[i+1][col] == 1) {
                        temp+=1;
                    }//往下找1個
                    if (array[i+1][col] == 1 &&array[i+2][col]==1) {
                        temp+=20;
                    }//往下找2個
                    if (array[i+1][col] == 1 &&array[i+2][col]==1 &&array[i+3][col]==1) {
                        temp+=1000;
                    }//往下找3個
                }catch (Exception e){

                }
                try{
                    if (array[i+1][col-1] == 1) {
                        temp+=1;
                    }//往左下找1個
                    if (array[i+1][col-1] == 1 &&array[i+2][col-2]==1) {
                        temp+=20;
                    }//往左下找2個
                    if (array[i+1][col-1] == 1 &&array[i+2][col-2]==1 &&array[i+3][col-3]==1) {
                        temp+=1000;
                    }//往左下找3個
                }catch (Exception e){

                }
                try{
                    if (array[i][col-1] == 1) {
                        temp+=1;
                    }//往左找1個
                    if (array[i][col-1] == 1 &&array[i][col-2]==1) {
                        temp+=20;
                    }//往左找2個
                    if (array[i][col-1] == 1 &&array[i][col-2]==1 &&array[i][col-3]==1) {
                        temp+=1000;
                    }//往左找3個
                }catch (Exception e){

                }
                try{
                    if (array[i-1][col-1] == 1) {
                        temp+=1;
                    }//往左上找1個
                    if (array[i-1][col-1] == 1 &&array[i-2][col-2]==1) {
                        temp+=20;
                    }//往左上找2個
                    if (array[i-1][col-1] == 1 &&array[i-2][col-2]==1 &&array[i-3][col-3]==1) {
                        temp+=1000;
                    }//往左上找3個
                }catch (Exception e){

                }
            }
        }
        return temp;
    }
    private int complay(){
        for(int i=0;i<7;i++){
            scores[i]=countscore(table,i);
            find = 0;
        }
        int max = -10001;
        int max_col = 0;
        for(int i =0;i<7;i++){
            if(scores[i]>max){
                max = scores[i];
                max_col = i;
            }
        }
        turn+=1;
        return max_col;
    }

    private Button.OnClickListener btnLin2 = new Button.OnClickListener(){
        public void onClick(View v){
            if(gg == 0){
                if(v.getId() == R.id.b2utton43){
                    turn+=1;
                    if(turn%2 == 1) {
                        if (table[0][0] != 0) {
                            turn--;
                            stop = 1;
                        }
                        for (int i = 5; i > -1; i--) {
                            if (table[i][0] == 0) {
                                table[i][0] = 1;
                                int count = i * 7 + 1;
                                if (count == 36) {
                                    b2utton36.setBackgroundResource(R.drawable.red);
                                } else if (count == 29) {
                                    b2utton29.setBackgroundResource(R.drawable.red);
                                } else if (count == 22) {
                                    b2utton22.setBackgroundResource(R.drawable.red);
                                } else if (count == 15) {
                                    b2utton15.setBackgroundResource(R.drawable.red);
                                } else if (count == 8) {
                                    b2utton8.setBackgroundResource(R.drawable.red);
                                } else if (count == 1) {
                                    b2utton.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                        if (whowin2(table) == 1) {
                            result2.setText("player win!");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "player win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        } else if (whowin2(table) == 2) {
                            result2.setText("computer win");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "computer win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        }
                        if (stop == 0) {
                            if (gg == 0) {
                                int colss = complay();
                                for (int i = 5; i > -1; i--) {
                                    if (table[i][colss] == 0) {
                                        table[i][colss] = 2;
                                        int count = i * 7 + 1 + colss;
                                        if (count == 36) {
                                            b2utton36.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 29) {
                                            b2utton29.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 22) {
                                            b2utton22.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 15) {
                                            b2utton15.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 8) {
                                            b2utton8.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 1) {
                                            b2utton.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 37) {
                                            b2utton37.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 30) {
                                            b2utton30.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 23) {
                                            b2utton23.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 16) {
                                            b2utton16.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 9) {
                                            b2utton9.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 2) {
                                            b2utton2.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 38) {
                                            b2utton38.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 31) {
                                            b2utton31.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 24) {
                                            b2utton24.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 17) {
                                            b2utton17.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 10) {
                                            b2utton10.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 3) {
                                            b2utton3.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 39) {
                                            b2utton39.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 32) {
                                            b2utton32.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 25) {
                                            b2utton25.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 18) {
                                            b2utton18.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 11) {
                                            b2utton11.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 4) {
                                            b2utton4.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 40) {
                                            b2utton40.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 33) {
                                            b2utton33.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 26) {
                                            b2utton26.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 19) {
                                            b2utton19.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 12) {
                                            b2utton12.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 5) {
                                            b2utton5.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 41) {
                                            b2utton41.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 34) {
                                            b2utton34.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 27) {
                                            b2utton27.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 20) {
                                            b2utton20.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 13) {
                                            b2utton13.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 6) {
                                            b2utton6.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 42) {
                                            b2utton42.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 35) {
                                            b2utton35.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 28) {
                                            b2utton28.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 21) {
                                            b2utton21.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 14) {
                                            b2utton14.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 7) {
                                            b2utton7.setBackgroundResource(R.drawable.yellow);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    stop=0;
                    if(whowin2(table)==1){
                        result2.setText("player win!");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"player win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin2(table)==2){
                        result2.setText("computer win");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"computer win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if(whowin2(table)==-1){
                        result2.setText("平手");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.b2utton44){
                    turn+=1;
                    if(turn%2 == 1) {
                        if (table[0][1] != 0) {
                            turn--;
                            stop=1;
                        }
                        for (int i = 5; i > -1; i--) {
                            if (table[i][1] == 0) {
                                table[i][1] = 1;
                                int count = i * 7 + 2;
                                if (count == 37) {
                                    b2utton37.setBackgroundResource(R.drawable.red);
                                } else if (count == 30) {
                                    b2utton30.setBackgroundResource(R.drawable.red);
                                } else if (count == 23) {
                                    b2utton23.setBackgroundResource(R.drawable.red);
                                } else if (count == 16) {
                                    b2utton16.setBackgroundResource(R.drawable.red);
                                } else if (count == 9) {
                                    b2utton9.setBackgroundResource(R.drawable.red);
                                } else if (count == 2) {
                                    b2utton2.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                        if (whowin2(table) == 1) {
                            result2.setText("player win!");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "player win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        } else if (whowin2(table) == 2) {
                            result2.setText("computer win");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "computer win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        }
                        if (stop == 0) {
                            if (gg == 0) {
                                int colss = complay();
                                for (int i = 5; i > -1; i--) {
                                    if (table[i][colss] == 0) {
                                        table[i][colss] = 2;
                                        int count = i * 7 + 1 + colss;
                                        if (count == 36) {
                                            b2utton36.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 29) {
                                            b2utton29.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 22) {
                                            b2utton22.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 15) {
                                            b2utton15.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 8) {
                                            b2utton8.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 1) {
                                            b2utton.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 37) {
                                            b2utton37.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 30) {
                                            b2utton30.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 23) {
                                            b2utton23.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 16) {
                                            b2utton16.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 9) {
                                            b2utton9.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 2) {
                                            b2utton2.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 38) {
                                            b2utton38.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 31) {
                                            b2utton31.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 24) {
                                            b2utton24.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 17) {
                                            b2utton17.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 10) {
                                            b2utton10.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 3) {
                                            b2utton3.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 39) {
                                            b2utton39.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 32) {
                                            b2utton32.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 25) {
                                            b2utton25.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 18) {
                                            b2utton18.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 11) {
                                            b2utton11.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 4) {
                                            b2utton4.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 40) {
                                            b2utton40.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 33) {
                                            b2utton33.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 26) {
                                            b2utton26.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 19) {
                                            b2utton19.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 12) {
                                            b2utton12.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 5) {
                                            b2utton5.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 41) {
                                            b2utton41.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 34) {
                                            b2utton34.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 27) {
                                            b2utton27.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 20) {
                                            b2utton20.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 13) {
                                            b2utton13.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 6) {
                                            b2utton6.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 42) {
                                            b2utton42.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 35) {
                                            b2utton35.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 28) {
                                            b2utton28.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 21) {
                                            b2utton21.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 14) {
                                            b2utton14.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 7) {
                                            b2utton7.setBackgroundResource(R.drawable.yellow);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    stop=0;
                    if(whowin2(table)==1){
                        result2.setText("player win!");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"player win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin2(table)==2){
                        result2.setText("computer win");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"computer win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin2(table)==-1){
                        result2.setText("平手");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.b2utton45){
                    turn+=1;
                    if(turn%2 == 1) {
                        if (table[0][2] != 0) {
                            turn--;
                            stop = 1;
                        }
                        for (int i = 5; i > -1; i--) {
                            if (table[i][2] == 0) {
                                table[i][2] = 1;
                                int count = i * 7 + 3;
                                if (count == 38) {
                                    b2utton38.setBackgroundResource(R.drawable.red);
                                } else if (count == 31) {
                                    b2utton31.setBackgroundResource(R.drawable.red);
                                } else if (count == 24) {
                                    b2utton24.setBackgroundResource(R.drawable.red);
                                } else if (count == 17) {
                                    b2utton17.setBackgroundResource(R.drawable.red);
                                } else if (count == 10) {
                                    b2utton10.setBackgroundResource(R.drawable.red);
                                } else if (count == 3) {
                                    b2utton3.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                        if (whowin2(table) == 1) {
                            result2.setText("player win!");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "player win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        } else if (whowin2(table) == 2) {
                            result2.setText("computer win");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "computer win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        }
                        if (stop == 0) {
                            if (gg == 0) {
                                int colss = complay();
                                for (int i = 5; i > -1; i--) {
                                    if (table[i][colss] == 0) {
                                        table[i][colss] = 2;
                                        int count = i * 7 + 1 + colss;
                                        if (count == 36) {
                                            b2utton36.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 29) {
                                            b2utton29.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 22) {
                                            b2utton22.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 15) {
                                            b2utton15.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 8) {
                                            b2utton8.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 1) {
                                            b2utton.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 37) {
                                            b2utton37.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 30) {
                                            b2utton30.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 23) {
                                            b2utton23.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 16) {
                                            b2utton16.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 9) {
                                            b2utton9.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 2) {
                                            b2utton2.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 38) {
                                            b2utton38.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 31) {
                                            b2utton31.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 24) {
                                            b2utton24.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 17) {
                                            b2utton17.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 10) {
                                            b2utton10.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 3) {
                                            b2utton3.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 39) {
                                            b2utton39.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 32) {
                                            b2utton32.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 25) {
                                            b2utton25.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 18) {
                                            b2utton18.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 11) {
                                            b2utton11.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 4) {
                                            b2utton4.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 40) {
                                            b2utton40.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 33) {
                                            b2utton33.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 26) {
                                            b2utton26.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 19) {
                                            b2utton19.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 12) {
                                            b2utton12.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 5) {
                                            b2utton5.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 41) {
                                            b2utton41.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 34) {
                                            b2utton34.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 27) {
                                            b2utton27.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 20) {
                                            b2utton20.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 13) {
                                            b2utton13.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 6) {
                                            b2utton6.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 42) {
                                            b2utton42.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 35) {
                                            b2utton35.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 28) {
                                            b2utton28.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 21) {
                                            b2utton21.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 14) {
                                            b2utton14.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 7) {
                                            b2utton7.setBackgroundResource(R.drawable.yellow);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    stop=0;
                    if(whowin2(table)==1){
                        result2.setText("player win!");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"player win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin2(table)==2){
                        result2.setText("computer win");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"computer win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin2(table)==-1){
                        result2.setText("平手");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.b2utton46){
                    turn+=1;
                    if(turn%2 == 1) {
                        if (table[0][3] != 0) {
                            turn--;
                            stop = 1;
                        }
                        for (int i = 5; i > -1; i--) {
                            if (table[i][3] == 0) {
                                table[i][3] = 1;
                                int count = i * 7 + 4;
                                if (count == 39) {
                                    b2utton39.setBackgroundResource(R.drawable.red);
                                } else if (count == 32) {
                                    b2utton32.setBackgroundResource(R.drawable.red);
                                } else if (count == 25) {
                                    b2utton25.setBackgroundResource(R.drawable.red);
                                } else if (count == 18) {
                                    b2utton18.setBackgroundResource(R.drawable.red);
                                } else if (count == 11) {
                                    b2utton11.setBackgroundResource(R.drawable.red);
                                } else if (count == 4) {
                                    b2utton4.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                        if (whowin2(table) == 1) {
                            result2.setText("player win!");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "player win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        } else if (whowin2(table) == 2) {
                            result2.setText("computer win");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "computer win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        }
                        if (stop == 0) {
                            if (gg == 0) {
                                int colss = complay();
                                for (int i = 5; i > -1; i--) {
                                    if (table[i][colss] == 0) {
                                        table[i][colss] = 2;
                                        int count = i * 7 + 1 + colss;
                                        if (count == 36) {
                                            b2utton36.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 29) {
                                            b2utton29.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 22) {
                                            b2utton22.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 15) {
                                            b2utton15.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 8) {
                                            b2utton8.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 1) {
                                            b2utton.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 37) {
                                            b2utton37.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 30) {
                                            b2utton30.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 23) {
                                            b2utton23.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 16) {
                                            b2utton16.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 9) {
                                            b2utton9.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 2) {
                                            b2utton2.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 38) {
                                            b2utton38.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 31) {
                                            b2utton31.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 24) {
                                            b2utton24.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 17) {
                                            b2utton17.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 10) {
                                            b2utton10.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 3) {
                                            b2utton3.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 39) {
                                            b2utton39.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 32) {
                                            b2utton32.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 25) {
                                            b2utton25.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 18) {
                                            b2utton18.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 11) {
                                            b2utton11.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 4) {
                                            b2utton4.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 40) {
                                            b2utton40.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 33) {
                                            b2utton33.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 26) {
                                            b2utton26.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 19) {
                                            b2utton19.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 12) {
                                            b2utton12.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 5) {
                                            b2utton5.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 41) {
                                            b2utton41.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 34) {
                                            b2utton34.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 27) {
                                            b2utton27.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 20) {
                                            b2utton20.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 13) {
                                            b2utton13.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 6) {
                                            b2utton6.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 42) {
                                            b2utton42.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 35) {
                                            b2utton35.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 28) {
                                            b2utton28.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 21) {
                                            b2utton21.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 14) {
                                            b2utton14.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 7) {
                                            b2utton7.setBackgroundResource(R.drawable.yellow);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    stop=0;
                    if(whowin2(table)==1){
                        result2.setText("player win!");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"player win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin2(table)==2){
                        result2.setText("computer win");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"computer win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin2(table)==-1){
                        result2.setText("平手");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.b2utton47){
                    turn+=1;
                    if(turn%2 == 1) {
                        if (table[0][4] != 0) {
                            turn--;
                            stop = 1;
                        }
                        for (int i = 5; i > -1; i--) {
                            if (table[i][4] == 0) {
                                table[i][4] = 1;
                                int count = i * 7 + 5;
                                if (count == 40) {
                                    b2utton40.setBackgroundResource(R.drawable.red);
                                } else if (count == 33) {
                                    b2utton33.setBackgroundResource(R.drawable.red);
                                } else if (count == 26) {
                                    b2utton26.setBackgroundResource(R.drawable.red);
                                } else if (count == 19) {
                                    b2utton19.setBackgroundResource(R.drawable.red);
                                } else if (count == 12) {
                                    b2utton12.setBackgroundResource(R.drawable.red);
                                } else if (count == 5) {
                                    b2utton5.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                        if (whowin2(table) == 1) {
                            result2.setText("player win!");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "player win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        } else if (whowin2(table) == 2) {
                            result2.setText("computer win");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "computer win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        }
                        if (stop == 0) {
                            if (gg == 0) {
                                int colss = complay();
                                for (int i = 5; i > -1; i--) {
                                    if (table[i][colss] == 0) {
                                        table[i][colss] = 2;
                                        int count = i * 7 + 1 + colss;
                                        if (count == 36) {
                                            b2utton36.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 29) {
                                            b2utton29.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 22) {
                                            b2utton22.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 15) {
                                            b2utton15.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 8) {
                                            b2utton8.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 1) {
                                            b2utton.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 37) {
                                            b2utton37.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 30) {
                                            b2utton30.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 23) {
                                            b2utton23.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 16) {
                                            b2utton16.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 9) {
                                            b2utton9.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 2) {
                                            b2utton2.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 38) {
                                            b2utton38.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 31) {
                                            b2utton31.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 24) {
                                            b2utton24.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 17) {
                                            b2utton17.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 10) {
                                            b2utton10.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 3) {
                                            b2utton3.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 39) {
                                            b2utton39.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 32) {
                                            b2utton32.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 25) {
                                            b2utton25.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 18) {
                                            b2utton18.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 11) {
                                            b2utton11.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 4) {
                                            b2utton4.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 40) {
                                            b2utton40.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 33) {
                                            b2utton33.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 26) {
                                            b2utton26.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 19) {
                                            b2utton19.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 12) {
                                            b2utton12.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 5) {
                                            b2utton5.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 41) {
                                            b2utton41.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 34) {
                                            b2utton34.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 27) {
                                            b2utton27.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 20) {
                                            b2utton20.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 13) {
                                            b2utton13.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 6) {
                                            b2utton6.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 42) {
                                            b2utton42.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 35) {
                                            b2utton35.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 28) {
                                            b2utton28.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 21) {
                                            b2utton21.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 14) {
                                            b2utton14.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 7) {
                                            b2utton7.setBackgroundResource(R.drawable.yellow);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    stop=0;
                    if(whowin2(table)==1){
                        result2.setText("player win!");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"player win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin2(table)==2){
                        result2.setText("computer win");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"computer win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin2(table)==-1){
                        result2.setText("平手");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.b2utton48){
                    turn+=1;
                    if(turn%2 == 1) {
                        if (table[0][5] != 0) {
                            turn--;
                            stop = 1;
                        }
                        for (int i = 5; i > -1; i--) {
                            if (table[i][5] == 0) {
                                table[i][5] = 1;
                                int count = i * 7 + 6;
                                if (count == 41) {
                                    b2utton41.setBackgroundResource(R.drawable.red);
                                } else if (count == 34) {
                                    b2utton34.setBackgroundResource(R.drawable.red);
                                } else if (count == 27) {
                                    b2utton27.setBackgroundResource(R.drawable.red);
                                } else if (count == 20) {
                                    b2utton20.setBackgroundResource(R.drawable.red);
                                } else if (count == 13) {
                                    b2utton13.setBackgroundResource(R.drawable.red);
                                } else if (count == 6) {
                                    b2utton6.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                        if (whowin2(table) == 1) {
                            result2.setText("player win!");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "player win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        } else if (whowin2(table) == 2) {
                            result2.setText("computer win");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "computer win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        }
                        if (stop == 0) {
                            if (gg == 0) {
                                int colss = complay();
                                for (int i = 5; i > -1; i--) {
                                    if (table[i][colss] == 0) {
                                        table[i][colss] = 2;
                                        int count = i * 7 + 1 + colss;
                                        if (count == 36) {
                                            b2utton36.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 29) {
                                            b2utton29.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 22) {
                                            b2utton22.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 15) {
                                            b2utton15.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 8) {
                                            b2utton8.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 1) {
                                            b2utton.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 37) {
                                            b2utton37.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 30) {
                                            b2utton30.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 23) {
                                            b2utton23.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 16) {
                                            b2utton16.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 9) {
                                            b2utton9.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 2) {
                                            b2utton2.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 38) {
                                            b2utton38.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 31) {
                                            b2utton31.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 24) {
                                            b2utton24.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 17) {
                                            b2utton17.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 10) {
                                            b2utton10.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 3) {
                                            b2utton3.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 39) {
                                            b2utton39.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 32) {
                                            b2utton32.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 25) {
                                            b2utton25.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 18) {
                                            b2utton18.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 11) {
                                            b2utton11.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 4) {
                                            b2utton4.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 40) {
                                            b2utton40.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 33) {
                                            b2utton33.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 26) {
                                            b2utton26.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 19) {
                                            b2utton19.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 12) {
                                            b2utton12.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 5) {
                                            b2utton5.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 41) {
                                            b2utton41.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 34) {
                                            b2utton34.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 27) {
                                            b2utton27.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 20) {
                                            b2utton20.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 13) {
                                            b2utton13.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 6) {
                                            b2utton6.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 42) {
                                            b2utton42.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 35) {
                                            b2utton35.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 28) {
                                            b2utton28.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 21) {
                                            b2utton21.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 14) {
                                            b2utton14.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 7) {
                                            b2utton7.setBackgroundResource(R.drawable.yellow);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    stop=0;
                    if(whowin2(table)==1){
                        result2.setText("player win!");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"player win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin2(table)==2){
                        result2.setText("computer win");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"computer win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }else if(whowin2(table)==-1){
                        result2.setText("平手");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
                else if (v.getId() == R.id.b2utton49){
                    turn+=1;
                    if(turn%2 == 1) {
                        if (table[0][6] != 0) {
                            turn--;
                            stop = 1;
                        }
                        for (int i = 5; i > -1; i--) {
                            if (table[i][6] == 0) {
                                table[i][6] = 1;
                                int count = i * 7 + 7;
                                if (count == 42) {
                                    b2utton42.setBackgroundResource(R.drawable.red);
                                } else if (count == 35) {
                                    b2utton35.setBackgroundResource(R.drawable.red);
                                } else if (count == 28) {
                                    b2utton28.setBackgroundResource(R.drawable.red);
                                } else if (count == 21) {
                                    b2utton21.setBackgroundResource(R.drawable.red);
                                } else if (count == 14) {
                                    b2utton14.setBackgroundResource(R.drawable.red);
                                } else if (count == 7) {
                                    b2utton7.setBackgroundResource(R.drawable.red);
                                }
                                break;
                            }
                        }
                        if (whowin2(table) == 1) {
                            result2.setText("player win!");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "player win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        } else if (whowin2(table) == 2) {
                            result2.setText("computer win");
                            gg = 1;
                            Toast.makeText(Main2Activity.this, "computer win 請按重製進行下一局", Toast.LENGTH_SHORT).show();
                        }
                        if (stop == 0) {
                            if (gg == 0) {
                                int colss = complay();
                                for (int i = 5; i > -1; i--) {
                                    if (table[i][colss] == 0) {
                                        table[i][colss] = 2;
                                        int count = i * 7 + 1 + colss;
                                        if (count == 36) {
                                            b2utton36.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 29) {
                                            b2utton29.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 22) {
                                            b2utton22.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 15) {
                                            b2utton15.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 8) {
                                            b2utton8.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 1) {
                                            b2utton.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 37) {
                                            b2utton37.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 30) {
                                            b2utton30.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 23) {
                                            b2utton23.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 16) {
                                            b2utton16.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 9) {
                                            b2utton9.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 2) {
                                            b2utton2.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 38) {
                                            b2utton38.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 31) {
                                            b2utton31.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 24) {
                                            b2utton24.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 17) {
                                            b2utton17.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 10) {
                                            b2utton10.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 3) {
                                            b2utton3.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 39) {
                                            b2utton39.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 32) {
                                            b2utton32.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 25) {
                                            b2utton25.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 18) {
                                            b2utton18.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 11) {
                                            b2utton11.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 4) {
                                            b2utton4.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 40) {
                                            b2utton40.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 33) {
                                            b2utton33.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 26) {
                                            b2utton26.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 19) {
                                            b2utton19.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 12) {
                                            b2utton12.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 5) {
                                            b2utton5.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 41) {
                                            b2utton41.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 34) {
                                            b2utton34.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 27) {
                                            b2utton27.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 20) {
                                            b2utton20.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 13) {
                                            b2utton13.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 6) {
                                            b2utton6.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 42) {
                                            b2utton42.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 35) {
                                            b2utton35.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 28) {
                                            b2utton28.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 21) {
                                            b2utton21.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 14) {
                                            b2utton14.setBackgroundResource(R.drawable.yellow);
                                        } else if (count == 7) {
                                            b2utton7.setBackgroundResource(R.drawable.yellow);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    stop=0;
                    if(whowin2(table)==1){
                        result2.setText("player win!");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"player win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if (whowin2(table)==2){
                        result2.setText("computer win");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"computer win 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                    else if(whowin2(table)==-1)
                    {
                        result2.setText("平手");
                        gg=1;
                        Toast.makeText(Main2Activity.this,"平手 請按重製進行下一局",Toast.LENGTH_SHORT).show();
                    }
                }
            }

        }
    };
}
