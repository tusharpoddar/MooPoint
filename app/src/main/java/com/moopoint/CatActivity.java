package com.moopoint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CatActivity extends AppCompatActivity {
Button provide,Hosp;
    TextView add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        provide=(Button)findViewById(R.id.btn_provide);
        Hosp=(Button)findViewById(R.id.btn_call_hosp);
        add=(TextView)findViewById(R.id.adda);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null)
        {
            String s=bundle.getString("EditLOk");
            add.setText(s);

        }
        add=(TextView)findViewById(R.id.adda);
        provide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(CatActivity.this,RequestHelp.class);
                intent.putExtra("Ani", "Animal"+"\n"+"Cat"+"\n"+"Provide Water"+"\n"+"at ");
                intent.putExtra("EditLOk",add.getText());
                startActivity(intent);
            }
        });
        Hosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(CatActivity.this,RequestHelp.class);
                intent.putExtra("Ani", "Animal"+"\n"+"Dog"+"\n"+"Call for hospital"+"\n"+"at ");
                intent.putExtra("EditLOk",add.getText());
                startActivity(intent);
            }
        });
    }
}
