package team.yylight.lightapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import team.yylight.lightapplication.R;

public class ItemInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_info);
        int itemNumber = getIntent().getIntExtra("number", 0);
    }
}