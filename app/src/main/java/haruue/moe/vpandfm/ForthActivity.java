package haruue.moe.vpandfm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 晴天 on 2016/12/8.
 */

public class ForthActivity extends AppCompatActivity {

    private Button bt4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        bt4 = (Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(ForthActivity.this, MainActivity.class);
                startActivity(intent4);
            }
        });
    }
}
