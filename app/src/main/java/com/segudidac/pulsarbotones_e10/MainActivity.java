package com.segudidac.pulsarbotones_e10;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements View.OnClickListener {


    ToggleButton bToggle;
    Button bSuma;
    Button bResta;
    Button bReset;
    TextView tV;
    int valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bToggle = (ToggleButton) findViewById(R.id.toggleBotones);
        bSuma = (Button) findViewById(R.id.botonSuma);
        bResta = (Button) findViewById(R.id.botonResta);
        bReset = (Button) findViewById(R.id.botonReset);
        tV = (TextView) findViewById(R.id.textContador);
        valor = Integer.parseInt(tV.getText().toString());

        bToggle.setOnClickListener(this);
        bSuma.setOnClickListener(this);
        bResta.setOnClickListener(this);
        bReset.setOnClickListener(this);

        /*
        bToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton) btn1).isChecked()) {
                    bSuma.setEnabled(true);
                    bResta.setEnabled(true);
                    bReset.setEnabled(true);
                } else {
                    bSuma.setEnabled(false);
                    bResta.setEnabled(false);
                    bReset.setEnabled(false);
                }
            }
        });
        */
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toggleBotones:
                if (bToggle.isChecked()) {
                    bSuma.setEnabled(true);
                    bResta.setEnabled(true);
                    bReset.setEnabled(true);
                } else {
                    bSuma.setEnabled(false);
                    bResta.setEnabled(false);
                    bReset.setEnabled(false);
                }
            case R.id.botonSuma:
                valor++;
                tV.setText(String.valueOf(valor));
                break;
            case R.id.botonResta:
                if (valor > 0)
                    valor--;
                tV.setText(String.valueOf(valor));
                break;
            case R.id.botonReset:
                valor = 0;
                tV.setText(String.valueOf(valor));
                break;
        }
    }
}
