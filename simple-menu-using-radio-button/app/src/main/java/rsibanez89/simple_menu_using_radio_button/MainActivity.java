package rsibanez89.simple_menu_using_radio_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView text =  (TextView) findViewById(R.id.app_main_text);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.app_menu_item_1:
                if (checked)
                    text.setText("Menu - Item 1 Pressed...");
                    break;
            case R.id.app_menu_item_2:
                if (checked)
                    text.setText("Menu - Item 2 Pressed...");
                break;
            case R.id.app_menu_item_3:
                if (checked)
                    text.setText("Menu - Item 3 Pressed...");
                    break;
            case R.id.app_menu_item_4:
                if (checked)
                    text.setText("Menu - Item 4 Pressed...");
                    break;
        }
    }
}
