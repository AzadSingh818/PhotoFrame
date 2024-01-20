package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] names = {"God Shiva","God Krishna","Krishna","Shiva","Great Shiva"};
    ImageButton prev,next;
    ImageView pic;

    int currentImage = 0;
    TextView text;
    // 0-1-2-3-4-0-1-2-3-4....

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("NewApi")
    public void prev(View v){
        TextView text = findViewById(R.id.text);
        String idX = "pic" + currentImage;
         @SuppressLint("DiscouragedApi") int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (5 + currentImage - 1) % 5;
        String idY = "pic" + currentImage;
        @SuppressLint("DiscouragedApi") int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        text.setText(names[currentImage]);


    }

    public void next(View v){
        TextView text = findViewById(R.id.text);
        String idX = "pic" + currentImage;
        @SuppressLint("DiscouragedApi") int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (5 + currentImage + 1) % 5;
        String idY = "pic" + currentImage;
          @SuppressLint("DiscouragedApi") int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        text.setText(names[currentImage]);


    }
}