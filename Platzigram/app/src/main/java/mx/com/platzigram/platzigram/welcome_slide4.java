package mx.com.platzigram.platzigram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Personal on 06/10/2016.
 */

public class welcome_slide4 extends AppCompatActivity {
    Button Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_slide4);

        Ingresar = (Button)findViewById(R.id.Ingresar);
        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ingresar = new Intent(welcome_slide4.this,LoginActivity.class);
                startActivity(Ingresar);
            }
        });
    }

}




