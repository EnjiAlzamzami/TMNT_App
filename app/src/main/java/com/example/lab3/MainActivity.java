package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget .Spinner ;
import android.widget. TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private  Spinner spinner ;
private  ImageView imageView ;
private  TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.image);
        textView= findViewById(R.id.text);

        String[] tmnt = {"Choose the character" , "Leonardo" , "Raphael  ","Donatello" , "Michelangelo "};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,tmnt);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?>parent, View view, int position, long id) {
               switch (position){
                   case  1 : imageView.setImageResource(R.drawable.leona);
                   textView.setText("Leonardo, often known as Leo, He wears a blue mask and wields two katana swords. Leonardo is the Turtles' leader and the most mature and disciplined member of his brothers..");
                   break;
                   case  2 : imageView.setImageResource(R.drawable.raphael);
                       textView.setText("Raphael is noted for his volatile and cynical personality, being short-tempered, combative, gloomy, maddened, caustic, and rebellious, and is usually represented with a red eye mask. Raphael's anger is not always fully explored. He is the turtle brothers' second oldest/mid-middle child.");
                       break;
                   case 3: imageView.setImageResource(R.drawable.donatello);
                       textView.setText("Donatello, sometimes known as Don or Donnie, is a fictional superhero and one of the Teenage Mutant Ninja Turtles' four major protagonists. He wears a purple mask over his eyes and is the wisest and gentlest of his brothers.");
                       break;
                   case  4  : imageView.setImageResource(R.drawable.michelangelo);
                       textView.setText("Michelangelo, sometimes known as Mike or Mikey. He is the most naturally gifted of the four brothers, yet he would rather have fun than train. He is the group's youngest member, and he is shown to be immature but he is known for his wisecracks, skating, humorous optimism, and love of pizza. He's normally seen with an orange eye mask on.g an orange mask and welding a pair of nunchalou.");
                       break;
               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });






    }

    public void a(View view) {
    }
}