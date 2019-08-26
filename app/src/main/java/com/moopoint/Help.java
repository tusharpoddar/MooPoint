package com.moopoint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Help extends AppCompatActivity {
    Button animal,water;
    TextView ad,add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        animal=(Button)findViewById(R.id.btn_animl);
        water=(Button)findViewById(R.id.btn_watertank);
        ad=(TextView)findViewById(R.id.Addd);
        add=(TextView)findViewById(R.id.check);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null)
        {
            String s=bundle.getString("EditLOk");
            ad.setText(s);

        }
        Intent intent1=getIntent();
        Bundle bundle1=intent.getExtras();
        if(bundle!=null)
        {
            String a=bundle1.getString("CheckBox");
            add.setText(a);

        }
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Help.this,Animal.class);
                intent.putExtra("Ani", "animal");
                intent.putExtra("EditLOk",ad.getText());
                startActivity(intent);

            }
        });
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Help.this,RequestHelp.class);
                intent.putExtra("Ani", "Supply Water at");
                intent.putExtra("EditLOk",ad.getText());
                startActivity(intent);

            }
        });
    }
}
