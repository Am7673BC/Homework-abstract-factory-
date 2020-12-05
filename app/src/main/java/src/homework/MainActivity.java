package src.homework;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import src.Application;
import src.DemoApplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoApplication Volodya = new DemoApplication();
        Application circle = Volodya.ConfigureApplication("Circle", 4);
        circle.paint();
    }
}