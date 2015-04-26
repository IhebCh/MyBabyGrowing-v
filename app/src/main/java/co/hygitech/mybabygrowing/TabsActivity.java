package co.hygitech.mybabygrowing;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

public class TabsActivity extends TabActivity {

    TabHost tabHost;
    TabWidget tabWidget;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  hideStatusBar();

        setContentView(co.hygitech.mybabygrowing.R.layout.activity_tab_host);
        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabWidget = (TabWidget) findViewById(android.R.id.tabs);
        setTabs();

    }

   /* private void hideStatusBar() {

        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
    //    ActionBar actionBar = getActionBar();
      //  actionBar.hide();
    }
*/
    private void setTabs() {
        addTab("", co.hygitech.mybabygrowing.R.drawable.tab1_background, Today.class);
        addTab("", co.hygitech.mybabygrowing.R.drawable.tab2_background, Baby.class);
        addTab("", co.hygitech.mybabygrowing.R.drawable.tab3_background, Mere.class);
        addTab("", co.hygitech.mybabygrowing.R.drawable.tab4_background, Plus.class);
        tabHost.setCurrentTab(0);
    }

    private void addTab(String labelId, int drawableId, Class<?> c) {
        Intent intent = new Intent(this, c);
        TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);
        View tabIndicator = LayoutInflater.from(this).inflate(co.hygitech.mybabygrowing.R.layout.tab_indicator, tabWidget, false);
        final TextView title = (TextView) tabIndicator.findViewById(co.hygitech.mybabygrowing.R.id.title);
        title.setText(labelId);

        ImageView icon = (ImageView) tabIndicator.findViewById(co.hygitech.mybabygrowing.R.id.icon);
        icon.setImageResource(drawableId);
        icon.setPadding(0,0,0,10);

        spec.setIndicator(tabIndicator);
        spec.setContent(intent);
        tabHost.addTab(spec);
    }


}