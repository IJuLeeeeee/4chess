package tw.com.vic.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {
    Button btn_com,btn_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_com=(Button)findViewById(R.id.btn_com);
        btn_two=(Button)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(twoLis);
        btn_com.setOnClickListener(comLis);
    }
    Button.OnClickListener twoLis=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(Home.this, MainActivity.class);
            startActivity(intent);
        }
    };
    Button.OnClickListener comLis=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(Home.this, Main2Activity.class);
            startActivity(intent);
        }
    };
}
