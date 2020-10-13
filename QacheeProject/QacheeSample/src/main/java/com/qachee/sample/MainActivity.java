package com.qachee.sample;

import android.os.Bundle;

import com.qachee.ExpirationTime;
import com.qachee.QacheeManager;
import com.qachee.sample.fragment.CharacterListFragment;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	    QacheeManager.getInstance().setExpirationTime(ExpirationTime.THIRTY_SECONDS);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, CharacterListFragment.newInstance())
                    .commit();
        }
    }


}
