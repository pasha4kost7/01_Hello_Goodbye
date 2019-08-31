package com.missouristate.betamen.hallo_goodby2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static ImageView imageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        ImageButton btn =  findViewById(R.id.imageButton_1);                  //created Image button by id

        btn.setOnClickListener(new View.OnClickListener() {                   // action when the button was pressed
            public void onClick(View v) {
                TextView textView = findViewById(R.id.text_1);               //reads text on the screen
                String newString =  textView.getText().toString();           //copies data on the screen into the String newString

                imageView = (ImageView) findViewById(R.id.image_front) ;     //reads the first imageView

                if (newString.contains("Hello")){                                       //checks if string on the string has word Hello ar Good Bye
                    newString = "Good Bye";                                             // changes newString variable to Good bye
                    imageView.setImageResource(R.drawable.hello_goodbye_back);          //imageView changed by setting setImageResource and use D.drawable
                }else {
                    newString = "Hello";
                    imageView.setImageResource(R.drawable.hellogoodbyefront);           // changes to Hello image
                }
                textView.setText(newString);                                            // Changes text on the screen to text in newString variable.








            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
