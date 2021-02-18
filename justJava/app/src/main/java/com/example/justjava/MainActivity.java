package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int numberOfCoffees=1,pricePerCup=10,price;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void increment(View v){
        numberOfCoffees++;
        display(numberOfCoffees);
        price=numberOfCoffees*pricePerCup;

        displayPrice(price);

    }

    public void decrement(View v){
        if(numberOfCoffees>0) {
            numberOfCoffees--;
            display(numberOfCoffees);
            price=numberOfCoffees*pricePerCup;

            displayPrice(price);
        }

    }


    public void ChangeText(View v){
        if(numberOfCoffees>0) {
            Toast.makeText(this, "Order submmited", Toast.LENGTH_SHORT).show();

        }else{
            msg="Can't order "+numberOfCoffees+" cups of coffee .";
            displayMessage(msg);
            Toast.makeText(this, "you didn't order anything", Toast.LENGTH_SHORT).show();

        }
    }

    private void display(int number){
        TextView text=(TextView) findViewById(R.id.quantity_value);
        text.setText("" + number);

    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceValue = (TextView) findViewById(R.id.price_value);
        priceValue.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void displayMessage(String message){
        TextView priceValue = (TextView) findViewById(R.id.price_value);
        priceValue.setText(message);


    }


}