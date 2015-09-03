package nl.dev66.apps.project0myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

// main activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    // spotify streamer button onClick handler
    public void buttonSpotifyStreamerOnClick(View view)
    {
        // create and display Toast
        Toast toast = Toast.makeText(getApplicationContext(), "Spotify Streamer", Toast.LENGTH_SHORT);
        toast.show();
    }

    // scores app button onClick handler
    public void buttonScoresAppOnClick(View view)
    {
        // create and display Toast
        Toast toast = Toast.makeText(getApplicationContext(), "Scores App", Toast.LENGTH_SHORT);
        toast.show();
    }

    // library app button onClick handler
    public void buttonLibraryAppOnClick(View view)
    {
        // create and display Toast
        Toast toast = Toast.makeText(getApplicationContext(), "Library App", Toast.LENGTH_SHORT);
        toast.show();
    }

    // build it bigger button onClick handler
    public void buttonBuildItBiggerOnClick(View view)
    {
        // create and display Toast
        Toast toast = Toast.makeText(getApplicationContext(), "Build It Bigger", Toast.LENGTH_SHORT);
        toast.show();
    }

    // xyz reader button onClick handler
    public void buttonXYZReaderOnClick(View view)
    {
        // create and display Toast
        Toast toast = Toast.makeText(getApplicationContext(), "XYZ Reader", Toast.LENGTH_SHORT);
        toast.show();
    }

    // capstone: my own app button onClick handler
    public void buttonCapstoneMyOwnAppOnClick(View view)
    {
        // create and display Toast
        Toast toast = Toast.makeText(getApplicationContext(), "Capstone: my own app", Toast.LENGTH_SHORT);
        toast.show();
    }
}
