package haruue.moe.vpandfm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Fragment> frags;
    private PagerTabStrip tab;
    private List<String> titles;

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * 通过Fragment作为ViewPager的数据源
         */
        frags = new ArrayList<Fragment>();
        frags.add(new Fragment1());
        frags.add(new Fragment2());

        titles = new ArrayList<String>();
        titles.add("微软");
        titles.add("谷歌");

        tab = (PagerTabStrip) findViewById(R.id.newsTitle);  //初始化标题对象
        //tab.setBackgroundColor(Color.WHITE);
        tab.setDrawFullUnderline(false);      //调用这些方法进行标题样式调整
        tab.setTabIndicatorColor(Color.BLUE);
        tab.setTextColor(Color.BLACK);


        viewPager = (ViewPager) findViewById(R.id.viewpager); //初始化ViewPager对象

        //实例化适配器，并传入数据源
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), frags, titles);

        viewPager.setAdapter(adapter);  //设置适配器

            imageButton1 = (ImageButton) findViewById(R.id.imageBut1);
            imageButton2 = (ImageButton) findViewById(R.id.imageBut2);
            imageButton3 = (ImageButton) findViewById(R.id.imageBut3);
            imageButton4 = (ImageButton) findViewById(R.id.imageBut4);

            imageButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Fragement1", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent1);
                }
            });
            imageButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Fragement2", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent2);
                }
            });
            imageButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Fragement3", Toast.LENGTH_SHORT).show();
                    Intent intent3 = new Intent(MainActivity.this, ForthActivity.class);
                    startActivity(intent3);
                }
            });
            imageButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Fragement4", Toast.LENGTH_SHORT).show();
                    Intent intent4 = new Intent(MainActivity.this, FifthActivity.class);
                    startActivity(intent4);
                }
            });

    }





}
