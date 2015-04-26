package co.hygitech.mybabygrowing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Plus extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView more = (TextView)findViewById(R.id.topHeading);
        setContentView(R.layout.activity_plus);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_plus, menu);
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
    public void babyName(View v){
        Intent i = new Intent(Plus.this,babyName.class);
        startActivity(i);
    }
    public void phone(View v){
        Intent i = new Intent(Plus.this,contact.class);
        startActivity(i);
    }
    public void setting(View v){
        Intent i = new Intent(Plus.this,setting.class);
        startActivity(i);
    }

}
