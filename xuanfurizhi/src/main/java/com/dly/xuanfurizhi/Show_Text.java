package com.dly.xuanfurizhi;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.yhao.floatwindow.FloatWindow;

import static com.yhao.floatwindow.MoveType.active;

/**
 * 作者：created by Mr_s
 * 日期：2020/8/28 15
 * 描述：
 */
public class Show_Text {
    static TextView tv_log;
    public static TextView getTv_log() {
        return tv_log;
    }
    public static void XuanFuClears(Context context){
        WindowManager wm = (WindowManager) context.getSystemService(context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        View view;
        view= LayoutInflater.from(context).inflate(R.layout.view,null);
        tv_log=view.findViewById(R.id.tv_log);
        view.setBackgroundColor(Color.argb(50,144,144,144));
        FloatWindow
                .with(context.getApplicationContext())
                .setView(view)
                .setWidth(width)                               //设置控件宽高
                .setHeight(2*height/5)
                .setX(0)                                   //设置控件初始位置
                .setY(0)
                .setMoveType(active)
                .setDesktopShow(true)                        //桌面显示
                .build();

}
}
