package cn.edu.gdmec.s07150836.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Button btn2= (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new InnerClass());
    }
    class InnerClass implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(Act2.this,"第二个菊花",Toast.LENGTH_LONG).show();
        }
    }
}
