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

public class ThirdActivity extends AppCompatActivity {
    private Button bt3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent3);
            }
        });
    }
}
