package com.dly.xuanfurizhi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;

import com.dly.sandbox.Show_Text;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestPermission();
        Show_Text.XuanFuClears(MainActivity.this);
        //真他妈神奇 赞👍还是你牛批  分分钟搞定

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void requestPermission() {
    requestPermissions(new String[]{Manifest.permission.SYSTEM_ALERT_WINDOW},120);
    }
}