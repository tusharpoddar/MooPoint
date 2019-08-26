package com.moopoint.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.moopoint.R;
import com.moopoint.RequestHelp;

public class CowActivity extends AppCompatActivity {
    Button btnnextfood,btnProfood,btnProWater,btnProHosp;
    TextView add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cow);
        btnProfood=(Button)findViewById(R.id.btn_dog);
        add=(TextView)findViewById(R.id.addaa);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null)
        {
            String s=bundle.getString("EditLOk");
            add.setText(s);

        }
        btnProfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Ani", "Animal"+"\n"+"Cow"+"\n"+"Provide food"+"\n"+"at ");
                intent.putExtra("EditLOk",add.getText());
                intent.setClass(CowActivity.this,RequestHelp.class);
                startActivity(intent);
            }
        });
        btnProWater=(Button)findViewById(R.id.btn_cat);
        btnProWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Ani", "Animal"+"\n"+"Cow"+"\n"+"Provide Water"+"\n"+"at ");
                intent.putExtra("EditLOk",add.getText());
                intent.setClass(CowActivity.this,RequestHelp.class);
                startActivity(intent);
            }
        });
        btnProHosp=(Button)findViewById(R.id.btn_cow);
        btnProHosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Ani", "Animal"+"\n"+"Cow"+"\n"+"Call for hospital"+"\n"+"at ");
                intent.putExtra("EditLOk",add.getText());
                intent.setClass(CowActivity.this,RequestHelp.class);
                startActivity(intent);
            }
        });

    }
}
