package sg.edu.rp.c346.id22002222.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("durain");


        String fruitsOutput = "Fruits \n";
        fruitsOutput += "===== \n";
        for(int i = 0; i < fruits.size(); i++){
            fruitsOutput += fruits.get(i) + "\n";
        }

        tv.setText(fruitsOutput);
    }
}