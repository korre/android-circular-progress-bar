package se.kmdev.circularprogressbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    CircularProgressBar circularProgressBar;
    Button updateProgressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProgressBar = (CircularProgressBar) findViewById(R.id.circularProgress);
        circularProgressBar.setProgressColor(getResources().getColor(R.color.link_text_material_light));

        updateProgressButton= (Button) findViewById(R.id.updateProgressButton);
        updateProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int newProgress = (int) (Math.random() * 100);
                circularProgressBar.setProgress(newProgress);
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
