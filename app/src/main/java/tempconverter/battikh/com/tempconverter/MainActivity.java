package tempconverter.battikh.com.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.SeekBar;
import java.util.Locale;
import java.lang.Override;

public class MainActivity extends AppCompatActivity {

    TextView tv_f,tv_c;

    SeekBar seekBar;

    double c,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_c = (TextView) findViewById (R.id.tv_c);
        tv_f = (TextView) findViewById (R.id.tv_f);
        seekBar = (SeekBar) findViewById (R.id.seekBar);

        seekBar.setMax(400);
        seekBar.setProgress(200);

        c = seekBar.getProgress() - 200;
        f = c * 1.8 + 32;

        tv_c.setText(String.format(Locale.getDefault(), "%.1f", c));
        tv_f.setText(String.format(Locale.getDefault(), "%.1f", f));


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                c = progress - 200;
                f = c * 1.8 + 32;
                tv_c.setText(String.format(Locale.getDefault(), "%.1f", c));
                tv_f.setText(String.format(Locale.getDefault(), "%.1f", f));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){

            }
        });
    }
}
