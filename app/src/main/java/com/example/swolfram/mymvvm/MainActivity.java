package com.example.swolfram.mymvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.swolfram.mymvvm.databinding.ActivityMainBinding;

/**
 *
 *
 * MainActivity setContentView for databinding and set model (User and Handler) in binding.
 * Then you have access to this model in view and in all view callbacks.
 *
 * Con: View (activity, fragment, etc.) must set all models.
 *
 * @see <a href="https://developer.android.com/topic/libraries/data-binding/index.html</a>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        ActivityMainBinding activityMainBinding1 = ActivityMainBinding.inflate(getLayoutInflater());
        // TODO: 22.02.18 How use databing with dagger?
        activityMainBinding.setUser(new MainViewModel("Hallo du!"));
        activityMainBinding.setHandler(new Presenter());
//        activityMainBinding.setVariable(BR)
    }

}