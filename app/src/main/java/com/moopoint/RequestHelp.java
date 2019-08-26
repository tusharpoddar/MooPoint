package com.moopoint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RequestHelp extends AppCompatActivity {
    Button submit;
    TextView Ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_request_help);
        submit=(Button)findViewById( R.id.btn_sumt);
        final Bundle extras = getIntent().getExtras();
        Ad=(TextView)findViewById( R.id.Addd);
        // Intent intent = getIntent();
//        String str = intent.getStringExtra("Location");
//        Ad.setText(str);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null)
        {
            String s=bundle.getString("EditLOk");
            Ad.setText(s);

        }
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"moopointservices@gmail.com"});
                intent.putExtra(Intent.EXTRA_TEXT, ""+extras.getString("Ani")+extras.getString("EditLOk"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"Help needed here urgently kindly help");
                intent.setPackage("com.google.android.gm");
                if (intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);
                else
                    Toast.makeText(RequestHelp.this,"Not Installed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
