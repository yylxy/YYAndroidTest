package lxys916.yyandroidtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import lxys916.mylibrarytest.TestView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestView.test(MainActivity.this, "888gggg");
            }
        });

    }


}
