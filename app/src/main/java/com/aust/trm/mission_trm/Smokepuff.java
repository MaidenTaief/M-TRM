package com.aust.trm.mission_trm;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Smokepuff extends GameObject{
    public int r;
    public Smokepuff(int x, int y)
    {
        r = 5;
        super.x = x;
        super.y = y;
    }
    public void update()
    {
        x-=10;
    }
    public void draw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(x, y, r, paint);
        canvas.drawCircle(x+2, y-2,r,paint);
        canvas.drawCircle(x+4, y+1, r, paint);
    }

}