package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL);
        RectF rectF = new RectF(300,200,600,400);
//        canvas.drawArc(300,200,600,400, 30, 130, false, paint);
        canvas.drawArc(rectF, 20, 140, false, paint);
//        canvas.drawArc(300,200,600,400, -100, 90, true, paint);
        canvas.drawArc(rectF, -110, 100, true, paint);
        paint.setStyle(Style.STROKE);
//        canvas.drawArc(300,200,600,400, 180, 60, false, paint);
        canvas.drawArc(rectF, 180, 60, false, paint);

    }
}
