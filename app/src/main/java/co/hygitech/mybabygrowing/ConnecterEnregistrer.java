package co.hygitech.mybabygrowing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ConnecterEnregistrer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(co.hygitech.mybabygrowing.R.layout.activity_connecter_enregistrer);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(co.hygitech.mybabygrowing.R.menu.menu_connecter_enregistrer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == co.hygitech.mybabygrowing.R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void signUp(View v){
        Intent i=new Intent(ConnecterEnregistrer.this,Enregistrer.class);
        startActivity(i);
    }

    public void logIn(View v){
        Intent i=new Intent(ConnecterEnregistrer.this,Login.class);
        startActivity(i);
    }

}
