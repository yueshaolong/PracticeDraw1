package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint paint;

    public Practice2DrawCircleView(Context context) {
        this(context, null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Style.FILL);
        canvas.drawCircle(300,200, 160, paint);

        paint.setStyle(Style.STROKE);
        canvas.drawCircle(680,200, 160, paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Style.FILL);
        canvas.drawCircle(300,580, 160, paint);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(80);
        paint.setStyle(Style.STROKE);
        canvas.drawCircle(680,580, 160, paint);
    }
}
