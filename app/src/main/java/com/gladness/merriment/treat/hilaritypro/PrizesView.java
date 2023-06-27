package com.gladness.merriment.treat.hilaritypro;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class PrizesView extends ImageView {
    public PrizesView(Context context) {
        this(context, null, 0, 0);
    }

    public PrizesView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0, 0);
    }

    public PrizesView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public PrizesView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setAdjustViewBounds(true);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        int heigh = getMeasuredHeight();


        setMeasuredDimension(Math.max(width, heigh), Math.max(width, heigh));

    }
}
