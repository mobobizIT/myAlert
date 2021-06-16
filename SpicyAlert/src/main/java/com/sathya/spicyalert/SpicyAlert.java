package com.sathya.spicyalert;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SpicyAlert {

    private Button alert;
    public void init(){

        alert = new Button(alert.getContext());
        alert.setText("Hooray!. Click Me!");

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(alert.getContext(), "This is sample plugin",Toast.LENGTH_LONG).show();
            }
        });

    }
}
