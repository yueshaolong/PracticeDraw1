package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();

        RectF rectF = new RectF(300, 200, 900, 800);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, -45, 40, true, paint);
        paint.setColor(getResources().getColor(R.color.zi));
        canvas.drawArc(rectF, 0, 15, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF, 17, 10, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 29, 45, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 76, 104, true, paint);

        paint.setColor(Color.RED);
        RectF rectF1 = new RectF(280, 180, 880, 780);
//        canvas.drawArc(280, 180, 880, 780, -180, 135, true, paint);
        canvas.drawArc(rectF1, -180, 135, true, paint);

        paint.setColor(Color.WHITE);
        paint.setStyle(Style.STROKE);
        Path path = new Path();
        path.moveTo(340, 320);
        path.lineTo(290, 180);
        path.rLineTo(-110, 0);
        canvas.drawPath(path,paint);

        paint.setTextSize(30);
        canvas.drawText("Lollopop", 50, 190, paint);

    }
}
