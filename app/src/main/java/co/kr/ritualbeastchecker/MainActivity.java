package co.kr.ritualbeastchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button initButton;

    ImageView apelio;
    ImageView elder;
    ImageView ritualLara;
    ImageView wen;
    ImageView drago;
    ImageView cannahawk;
    ImageView pettlephin;
    ImageView rampengu;
    ImageView spritLara;
    ImageView winda;



    private ArrayList<ImageView> imageViews = new ArrayList<ImageView>();
    boolean[] flags = {true, true,true,true,true,true,true,true,true,true};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apelio = (ImageView)findViewById(R.id.apelio);
        apelio.setOnClickListener(this::onClick);

        rampengu = (ImageView)findViewById(R.id.rampengu);
        rampengu.setOnClickListener(this::onClick);

        cannahawk = (ImageView)findViewById(R.id.cannahawk);
        cannahawk.setOnClickListener(this::onClick);

        pettlephin = (ImageView)findViewById(R.id.pettlephin);
        pettlephin.setOnClickListener(this::onClick);

        elder = (ImageView)findViewById(R.id.elder);
        elder.setOnClickListener(this::onClick);

        wen = (ImageView)findViewById(R.id.wen);
        wen.setOnClickListener(this::onClick);

        winda = (ImageView)findViewById(R.id.winda);
        winda.setOnClickListener(this::onClick);

        drago = (ImageView)findViewById(R.id.drago);
        drago.setOnClickListener(this::onClick);

        spritLara = (ImageView)findViewById(R.id.spritLara);
        spritLara.setOnClickListener(this::onClick);

        ritualLara = (ImageView)findViewById(R.id.ritualLara);
        ritualLara.setOnClickListener(this::onClick);


        initButton = (Button) findViewById(R.id.initButton);
        initButton.setOnClickListener(this::onClick);
    }

    public void convertImage(ImageView view, int flagIndex){

        if(flags[flagIndex] == false){
            view.setColorFilter(null);
            flags[flagIndex] = true;
        }
        else{
            ColorMatrix matrix = new ColorMatrix();
            matrix.setSaturation(0);

            ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
            view.setColorFilter(filter);
            //출처: https://docko.tistory.com/590 [프로그래머의 꿈:티스토리]

            flags[flagIndex] = false;
        }

    }

    public void onClick(View view){
        switch(view.getId()){

            case R.id.ritualLara:
                convertImage(ritualLara , 0);
                break;

            case R.id.spritLara:
                convertImage(spritLara , 1);
                break;


            case R.id.winda:
                convertImage(winda , 2);
                break;

            case R.id.drago:
                convertImage(drago , 3);
                break;

            case R.id.elder:
                convertImage(elder , 4);
                break;

            case R.id.apelio:
                convertImage(apelio , 5);
                break;

            case R.id.rampengu:
                convertImage(rampengu , 6);
                break;

            case R.id.pettlephin:
                convertImage(pettlephin , 7);
                break;

            case R.id.cannahawk:
                convertImage(cannahawk , 8);
                break;

            case R.id.wen:
                convertImage(wen , 9);
                break;

            case R.id.initButton:

                for(int i = 0; i < flags.length;i++){
                    flags[i] = false;
                }


                convertImage(wen , 9);
                convertImage(cannahawk , 8);
                convertImage(pettlephin , 7);
                convertImage(rampengu , 6);
                convertImage(apelio , 5);
                convertImage(elder , 4);
                convertImage(drago , 3);
                convertImage(winda , 2);
                convertImage(spritLara , 1);
                convertImage(ritualLara , 0);
                break;


        }

    }

}