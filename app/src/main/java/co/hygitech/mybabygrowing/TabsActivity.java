package co.hygitech.mybabygrowing;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import co.mybabygrowing.Baby;
import co.mybabygrowing.Mere;
import co.mybabygrowing.Plus;
import co.mybabygrowing.Today;

public class TabsActivity extends TabActivity {

    TabHost tabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tabHost = getTabHost();
        setTabs();
        //setContentView(R.layout.activity_main);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String arg0) {
                 switch (tabHost.getCurrentTab()){
                     case 0:
                            setSelectedTab(R.drawable.today_selected_btn);
                         break;
                     case 1:
                         break;
                     case 2:
                         break;
                     case 3:
                         break;
                 }
            }
        });
    }

    private void setTabs()
    {
        addTab("today", R.drawable.tab1_background, Today.class );
        addTab("baby", R.drawable.tab2_background,Baby.class);
        addTab("mom", R.drawable.tab3_background, Mere.class);
        addTab("more", R.drawable.tab4_background, Plus.class);
        tabHost.setCurrentTab(0);
    }

    private void addTab(String labelId, int drawableId, Class<?> c)
    {
        Intent intent = new Intent(this, c);
        TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);
        View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator, getTabWidget(), false);
        TextView title = (TextView) tabIndicator.findViewById(R.id.title);
        title.setText(labelId);
        ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
        icon.setImageResource(drawableId);
        spec.setIndicator(tabIndicator);
        spec.setContent(intent);
        tabHost.addTab(spec);
    }

    private void setSelectedTab(/*String labelId,*/ int drawableId)
    {
        View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator, getTabWidget(), false);
        TextView title = (TextView) tabIndicator.findViewById(R.id.title);
      //  title.setText(labelId);
        ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
        icon.setImageResource(drawableId);
    }

}