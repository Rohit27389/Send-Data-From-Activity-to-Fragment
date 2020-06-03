package com.rohit.fragment_sendd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.edit1);
        button1 = findViewById(R.id.Button1);
        button2 = findViewById(R.id.Button2);
        button3 = findViewById(R.id.Button3);
        click1();
        click2();
        click3();
    }

    /*Send Data through Bundle Object */
    public void click1() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key", "This Is Android Program");
                Fragment_Data_Show data = new Fragment_Data_Show();
                data.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, data)
                        .commit();
            }
        });
    }

    /*Send Data through Fragment Object */
    public void click2() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eData = editText1.getText().toString();
                Fragment_Data_Show data = new Fragment_Data_Show();
                data.setData(eData, 22);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, data)
                        .commit();
            }
        });
    }

    /*Fragment remove but once you change your configuration then its will work */
    public void click3() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_Data_Show mFragmentCalled = (Fragment_Data_Show) getFragmentManager().findFragmentById(R.id.fragment_container);

                if (mFragmentCalled != null) {
                    getFragmentManager().beginTransaction()
                            .remove(mFragmentCalled).commit();

                }

            }
        });

    }

}


