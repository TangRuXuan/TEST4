package edu.fjnu.cse.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.preference.PreferenceActivity;
/**
 * Created by 唐璇儿 on 2017/4/11.
 */

public class preference extends PreferenceActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.action_preferences);
    }
}

