package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class rf extends c {
    private final int height = 132;
    private final int width = 132;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 132;
            case 1:
                return 132;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix d = c.d(looper);
                float[] c = c.c(looper);
                Paint g = c.g(looper);
                g.setFlags(385);
                g.setStyle(Style.FILL);
                Paint g2 = c.g(looper);
                g2.setFlags(385);
                g2.setStyle(Style.STROKE);
                g.setColor(WebView.NIGHT_MODE_COLOR);
                g2.setStrokeWidth(1.0f);
                g2.setStrokeCap(Cap.BUTT);
                g2.setStrokeJoin(Join.MITER);
                g2.setStrokeMiter(4.0f);
                g2.setPathEffect(null);
                c.a(g2, looper).setStrokeWidth(1.0f);
                g2 = c.a(g, looper);
                g2.setColor(-1907998);
                canvas.save();
                Paint a = c.a(g2, looper);
                Path h = c.h(looper);
                h.moveTo(65.38f, 0.0f);
                h.lineTo(68.18f, 0.0f);
                h.cubicTo(85.21f, 0.57f, 101.88f, 7.96f, 113.62f, 20.32f);
                h.cubicTo(124.75f, 31.8f, 131.3f, 47.43f, 132.0f, 63.38f);
                h.lineTo(132.0f, 66.62f);
                h.cubicTo(131.9f, 83.95f, 124.61f, 101.09f, 112.16f, 113.16f);
                h.cubicTo(100.64f, 124.56f, 84.79f, 131.31f, 68.62f, 132.0f);
                h.lineTo(63.81f, 132.0f);
                h.cubicTo(47.0f, 131.44f, 30.52f, 124.23f, 18.82f, 112.13f);
                h.cubicTo(6.97f, 100.12f, 0.08f, 83.42f, 0.0f, 66.54f);
                h.lineTo(0.0f, 65.4f);
                h.cubicTo(0.1f, 48.3f, 7.18f, 31.4f, 19.33f, 19.36f);
                h.cubicTo(31.36f, 7.2f, 48.27f, 0.11f, 65.38f, 0.0f);
                h.lineTo(65.38f, 0.0f);
                h.close();
                h.moveTo(43.89f, 43.93f);
                h.cubicTo(39.92f, 44.73f, 38.86f, 49.15f, 40.22f, 52.51f);
                h.cubicTo(39.07f, 53.92f, 37.35f, 55.16f, 37.21f, 57.14f);
                h.cubicTo(37.06f, 58.92f, 38.18f, 60.48f, 38.79f, 62.08f);
                h.cubicTo(37.49f, 63.78f, 35.58f, 65.5f, 36.05f, 67.89f);
                h.cubicTo(36.16f, 70.06f, 38.14f, 71.22f, 39.59f, 72.52f);
                h.cubicTo(38.44f, 74.14f, 36.68f, 75.73f, 37.02f, 77.93f);
                h.cubicTo(37.17f, 80.87f, 39.95f, 83.2f, 42.86f, 82.97f);
                h.cubicTo(49.81f, 83.1f, 56.76f, 82.95f, 63.71f, 82.99f);
                h.cubicTo(62.69f, 87.61f, 62.31f, 92.38f, 63.05f, 97.07f);
                h.cubicTo(63.6f, 100.51f, 63.89f, 104.86f, 67.46f, 106.59f);
                h.cubicTo(69.15f, 107.71f, 72.47f, 108.45f, 73.28f, 105.92f);
                h.cubicTo(73.72f, 101.08f, 72.82f, 96.08f, 74.5f, 91.38f);
                h.cubicTo(76.47f, 85.0f, 81.87f, 78.59f, 89.07f, 78.7f);
                h.cubicTo(90.86f, 78.38f, 93.95f, 78.6f, 93.92f, 76.02f);
                h.cubicTo(94.0f, 66.77f, 94.24f, 57.49f, 93.74f, 48.25f);
                h.cubicTo(88.93f, 47.98f, 84.07f, 47.45f, 79.68f, 45.33f);
                h.cubicTo(68.56f, 40.0f, 55.49f, 40.72f, 43.89f, 43.93f);
                h.lineTo(43.89f, 43.93f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                g = c.a(g, looper);
                g.setColor(-5000269);
                float[] a2 = c.a(c, 1.0f, 0.0f, 35.0f, 0.0f, 1.0f, 41.0f);
                d.reset();
                d.setValues(a2);
                canvas.concat(d);
                canvas.save();
                Paint a3 = c.a(g, looper);
                h = c.h(looper);
                h.moveTo(8.89f, 2.93f);
                h.cubicTo(20.49f, -0.28f, 33.56f, -1.0f, 44.68f, 4.33f);
                h.cubicTo(49.07f, 6.45f, 53.93f, 6.98f, 58.74f, 7.25f);
                h.cubicTo(59.24f, 16.49f, 59.0f, 25.77f, 58.92f, 35.02f);
                h.cubicTo(58.95f, 37.6f, 55.86f, 37.38f, 54.07f, 37.7f);
                h.cubicTo(46.87f, 37.59f, 41.47f, 44.0f, 39.5f, 50.38f);
                h.cubicTo(37.82f, 55.08f, 38.72f, 60.08f, 38.28f, 64.92f);
                h.cubicTo(37.47f, 67.45f, 34.15f, 66.71f, 32.46f, 65.59f);
                h.cubicTo(28.89f, 63.86f, 28.6f, 59.51f, 28.05f, 56.07f);
                h.cubicTo(27.31f, 51.38f, 27.69f, 46.61f, 28.71f, 41.99f);
                h.cubicTo(21.76f, 41.95f, 14.81f, 42.1f, 7.86f, 41.97f);
                h.cubicTo(4.95f, 42.2f, 2.17f, 39.87f, 2.02f, 36.93f);
                h.cubicTo(1.68f, 34.73f, 3.44f, 33.14f, 4.59f, 31.52f);
                h.cubicTo(3.14f, 30.22f, 1.16f, 29.06f, 1.05f, 26.89f);
                h.cubicTo(0.58f, 24.5f, 2.49f, 22.78f, 3.79f, 21.08f);
                h.cubicTo(3.18f, 19.48f, 2.06f, 17.92f, 2.21f, 16.14f);
                h.cubicTo(2.35f, 14.16f, 4.07f, 12.92f, 5.22f, 11.51f);
                h.cubicTo(3.86f, 8.15f, 4.92f, 3.73f, 8.89f, 2.93f);
                h.lineTo(8.89f, 2.93f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
