package com.example.sugiyamakazuteru.taskmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity{

    private final Date now = new Date(System.currentTimeMillis());
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/DD");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   //日付の表示　表示形式：YY/MM(曜)
    public void dateDisplay(){
        String nowText = SimpleDateFormat.format(now);
        TextView textView = (TextView)findViewById(R.id.date_text);
        textView.setText(nowText);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Toast toast;

        //押下されるアイコンにIDを振り分ける
        switch (menuItem.getItemId()) {
            case R.id.action_delete:
                toast=Toast.makeText(MainActivity.this, "ゴミ箱を選択", Toast.LENGTH_SHORT);
                break;
            default:
                toast=Toast.makeText(MainActivity.this, "保存を選択", Toast.LENGTH_SHORT);
        }
        toast.show();
        return true;
    }

}
