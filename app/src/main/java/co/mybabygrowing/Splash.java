package co.mybabygrowing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import co.hygitech.mybabygrowing.R;
import co.hygitech.mybabygrowing.TabsActivity;


public class Splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(5000) ;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent main=new Intent(Splash.this , TabsActivity.class) ;
                   /* Intent main=new Intent("") ;*/
                    startActivity(main);
                }
            }
        };
        timer.start();
    }
}
