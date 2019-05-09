package com.example.a533.examenpratique2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

public class CustomView extends View implements OnSuccessPasswordListener{
Paint paint = new Paint();
String motDePasse = "0001";
String validation = "";
    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onSucessPassword() {

    }

    @Override
    protected void onDraw(Canvas canvas) {

        for(int pisse =0 ; pisse <4 ; pisse++){

            if(pisse < validation.length()){
               paint.setStyle(Paint.Style.FILL);
           }else{
                paint.setStyle(Paint.Style.STROKE);
            }
            canvas.drawCircle(150+(200*pisse),200,50,paint);

        }

    }

    public void setInput(String input){
        validation  += input;
        if( validation.equals(motDePasse)){
            Toast.makeText(getContext(),"ça marche!",Toast.LENGTH_SHORT).show();

        }
        if(validation.length() == 4){
            validation = "";
        }
    }
}
