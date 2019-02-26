package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.WHITE);
        canvas.drawLine(200, 200, 200, 600, paint);
        canvas.drawLine(200, 600, 1000, 600, paint);
        paint.setStrokeWidth(2);
        canvas.drawLine(220, 598, 300, 598, paint);
        paint.setStyle(Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(320,580, 400, 600,paint);
        canvas.drawRect(420,580, 500, 600,paint);
        canvas.drawRect(520,460, 600, 600,paint);
        canvas.drawRect(620,300, 700, 600,paint);
        canvas.drawRect(720,260, 800, 600,paint);
        canvas.drawRect(820,420, 900, 600,paint);
        paint.setTextSize(25);
        paint.setColor(Color.WHITE);
        canvas.drawText("Froyo", 0, "Froyo".length(), 220, 625, paint);
        canvas.drawText("GB", 0, "GB".length(), 340, 625, paint);
        canvas.drawText("ICS", 0, "ICS".length(), 440, 625, paint);
        canvas.drawText("JB", 0, "JB".length(), 540, 625, paint);
        canvas.drawText("KitKat", 0, "KitKat".length(), 630, 625, paint);
        canvas.drawText("L", 0, "L".length(), 760, 625, paint);
        canvas.drawText("M", 0, "M".length(), 860, 625, paint);
        paint.setTextSize(40);
        canvas.drawText("直方图", 0, "直方图".length(), 520, 725, paint);


    }
}
