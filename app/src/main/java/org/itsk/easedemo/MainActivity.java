package org.itsk.easedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.hyphenate.easeui.ui.EaseConversationListFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container= (FrameLayout) findViewById(R.id.container);

        EaseConversationListFragment fragment=new EaseConversationListFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,fragment,"ConversationList").commit();

    }
}
