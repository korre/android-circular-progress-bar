package se.kmdev.circularprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    CircularProgressBar circularProgressBar1;
    CircularProgressBar circularProgressBar2;
    CircularProgressBar circularProgressBar3;

    Button updateProgressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProgressBar1 = findViewById(R.id.circularProgress);
        circularProgressBar2 = findViewById(R.id.circularProgress2);
        circularProgressBar3 = findViewById(R.id.circularProgress3);

        circularProgressBar1.setProgressColor(getResources().getColor(R.color.highlighted_text_material_dark));
        circularProgressBar1.setProgressWidth(30);

        circularProgressBar2.setProgressColor(getResources().getColor(R.color.highlighted_text_material_dark));
        circularProgressBar2.setProgressWidth(20);
        circularProgressBar2.setTextColor(getResources().getColor(R.color.button_material_dark));
        circularProgressBar2.useRoundedCorners(false);

        circularProgressBar3.setProgressColor(getResources().getColor(R.color.primary_text_disabled_material_light));
        circularProgressBar3.setProgressWidth(15);
        circularProgressBar3.showProgressText(false);

        updateProgressButton= findViewById(R.id.updateProgressButton);
        updateProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int newProgress = (int) (Math.random() * 100);
                circularProgressBar1.setProgress(newProgress);
                circularProgressBar2.setProgress(newProgress);
                circularProgressBar3.setProgress(newProgress);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
