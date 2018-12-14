package pl.droidsonroids.gif.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.sample.opengl.MyDialog;

/**
 * Main activity, hosts the pager

 * @author koral--
 */
public class MainActivity extends Activity {
    private GifImageView gif1,gif2,gif3;
    private Button changeGIFBtn;
    private int currentGIF = 1;
    final int GIF_COUNT = 3;
    private MyDialog mMyDialog;
    private View view;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        gif1 = (GifImageView) findViewById(R.id.gif1);
//        gif2 = (GifImageView) findViewById(R.id.gif2);
//        gif3 = (GifImageView) findViewById(R.id.gif3);
        context = this;
        changeGIFBtn = (Button) findViewById(R.id.changGif_btn);

        changeGIFBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentGIF != GIF_COUNT)
                    currentGIF++;
                else
                    currentGIF = 1;
                switch (currentGIF){
                    case 1:
                        view = getLayoutInflater().inflate(R.layout.dialog1, null);
                        mMyDialog = new MyDialog(context, 0, 0, view, R.style.DialogTheme);
                        mMyDialog.setCancelable(true);
                        mMyDialog.show();
                        break;
                    case 2:
                        view = getLayoutInflater().inflate(R.layout.dialog2, null);
                        mMyDialog = new MyDialog(context, 0, 0, view, R.style.DialogTheme);
                        mMyDialog.setCancelable(true);
                        mMyDialog.show();
                        break;
                    case 3:
                        view = getLayoutInflater().inflate(R.layout.dialog3, null);
                        mMyDialog = new MyDialog(context, 0, 0, view, R.style.DialogTheme);
                        mMyDialog.setCancelable(true);
                        mMyDialog.show();
                        break;

                }
            }
        });
//        changeGIFBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (currentGIF != GIF_COUNT)
//                    currentGIF++;
//                else
//                    currentGIF = 1;
//                switch (currentGIF){
//                    case 1:
//                        gif1.setVisibility(View.VISIBLE);
//                        gif2.setVisibility(View.INVISIBLE);
//                        gif3.setVisibility(View.INVISIBLE);
//                        break;
//                    case 2:
//                        gif1.setVisibility(View.INVISIBLE);
//                        gif2.setVisibility(View.VISIBLE);
//                        gif3.setVisibility(View.INVISIBLE);
//                        break;
//                    case 3:
//                        gif1.setVisibility(View.INVISIBLE);
//                        gif2.setVisibility(View.INVISIBLE);
//                        gif3.setVisibility(View.VISIBLE);
//                        break;
//
//                }
//            }
//        });
    }
}
