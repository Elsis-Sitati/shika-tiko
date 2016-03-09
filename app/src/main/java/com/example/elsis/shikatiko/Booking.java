package com.example.elsis.shikatiko;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.gc.materialdesign.views.ButtonRectangle;
import com.vstechlab.easyfonts.EasyFonts;

public class Booking extends Activity {

    EditText personName, personEmail, personPhone;
    ButtonRectangle book;
    String names, email, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);

        personName = (EditText)findViewById(R.id.person_name);
        personEmail = (EditText)findViewById(R.id.person_email);
        personPhone = (EditText)findViewById(R.id.person_phone);
        book = (ButtonRectangle)findViewById(R.id.buttonbook);

        personName.setTypeface(EasyFonts.caviarDreams(getApplicationContext()));
        personEmail.setTypeface(EasyFonts.caviarDreams(getApplicationContext()));
        personPhone.setTypeface(EasyFonts.caviarDreams(getApplicationContext()));

//        personName.setOnClickListener(this);
//        personEmail.setOnClickListener(this);
//        personPhone.setOnClickListener(this);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                names = personName.getText().toString();
                email = personEmail.getText().toString();
                phoneNumber = personPhone.getText().toString();

                if(isEmpty(personName)){
                    invalidInputEffect(personName);
                }
                if(isEmpty(personEmail)){
                    invalidInputEffect(personEmail);
                }
                if(isEmpty(personPhone)){
                    invalidInputEffect(personPhone);
                }

            }
        });

    }

    private boolean isEmpty(EditText etText){
        return etText.getText().toString().trim().length()==0;
    }
    private void invalidInputEffect(EditText etText){
        YoYo.with(Techniques.Shake).playOn(book);
        Toast.makeText(getApplicationContext(),"Please fill all fields.",Toast.LENGTH_SHORT).show();
    }


//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.person_name:
//                break;
//            case R.id.person_email:
//                break;
//            case R.id.person_phone:
//                break;
//            case R.id.buttonflat:
//                Toast.makeText(getApplicationContext(),"Please fill all fields",Toast.LENGTH_LONG).show();
//                if(personName.getText().toString().equals(null)){
//                    YoYo.with(Techniques.Shake).playOn(findViewById(R.id.person_name));
//                    Toast.makeText(getApplicationContext(),"Please fill all fields",Toast.LENGTH_LONG).show();
//                }
//                break;
//            default:
//                break;
//        }
//    }
}
