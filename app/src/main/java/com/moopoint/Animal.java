package com.moopoint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.moopoint.fragment.CowActivity;


public class Animal extends AppCompatActivity {
    Button mDog,mCat,mCow;
    TextView add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        mDog=(Button)findViewById(R.id.btn_dog);
        mCat=(Button)findViewById(R.id.btn_cat);
        mCow=(Button)findViewById(R.id.btn_cow);
        add=(TextView)findViewById(R.id.ad);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null)
        {
            String s=bundle.getString("EditLOk");
            add.setText(s);

        }
        mDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Animal.this, CatDogActivity.class);
                intent.putExtra("Ani", "Animal,Dog");
                intent.putExtra("EditLOk",add.getText());
                startActivity(intent);

            }
        });
        mCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Animal.this, CatActivity.class);
                intent.putExtra("Ani", "Animal,Cat");
                intent.putExtra("EditLOk",add.getText());
                startActivity(intent);

            }
        });
        mCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Animal.this, CowActivity.class);
                intent.putExtra("Ani", "Animal,Cow");
                intent.putExtra("EditLOk",add.getText());
                startActivity(intent);
            }
        });
    }
}
