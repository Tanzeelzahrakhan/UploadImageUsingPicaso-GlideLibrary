package com.example.imageuploadwithpicasoandglidelibarary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    TextView Name1,Name2,Name3,Name4,Email1,Email2,Email3,Email4,Password1,Password2,Password3,Password4,City1,City2,
            City3,City4;
    ImageView Image1,Image2,Image3,Image4;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.btn);
        Name1=findViewById(R.id.tvName1);
        Name2=findViewById(R.id.tvName2);
        Name3=findViewById(R.id.tvName3);
        Name4=findViewById(R.id.tvName4);
        Email1=findViewById(R.id.tvemail1);
        Email2=findViewById(R.id.tvemail2);
        Email3=findViewById(R.id.tvemail3);
        Email4=findViewById(R.id.tvemail4);
        Password1=findViewById(R.id.tvpass1);
        Password2=findViewById(R.id.tvpass2);
        Password3=findViewById(R.id.tvpass3);
        Password4=findViewById(R.id.tvpass4);
        City1=findViewById(R.id.tvcity1);
        City2=findViewById(R.id.tvcity2);
        City3=findViewById(R.id.tvcity3);
        City4=findViewById(R.id.tvcity4);
        Image1=findViewById(R.id.Img1);
        Image2=findViewById(R.id.Img2);
        Image3=findViewById(R.id.Img3);
        Image4=findViewById(R.id.Img4);

//Image1.setImageResource(R.drawable.abc);
        ModelClass obj1=new ModelClass("Tanzeel","tz27065@gmail.com","xyz","Bhakkar");
        ModelClass obj2=new ModelClass("Mehrab","Meh@gmail.com","xyzabc","Jhangh");
        ModelClass obj3=new ModelClass("Alia","Alia@gmail.com","abc","Bhakkar");
        ModelClass obj4=new ModelClass("Muqds","Muq@gmail.com","abcxyz","DarayaKhan");
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String url="https://ik.imagekit.io/ikmedia/backlit.jpg";
               Picasso.get().load(url).into(Image1);
               Name1.setText(obj1.getName());


               Email1.setText(obj1.getEmail());
               Password1.setText(obj1.getPassword());
               City1.setText(obj1.getCity());


               ; String url2="https://images.pexels.com/photos/1237119/pexels-photo-1237119.jpeg?auto=compress&cs=tinysrgb&w=600";
               Picasso.get().load(url2).into(Image2);
               Name2.setText(obj2.getName());
               Email2.setText(obj2.getEmail());
               Password2.setText(obj2.getPassword());
               City2.setText(obj2.getCity());

               Glide.with(MainActivity.this).load("https://images.pexels.com/photos/757889/pexels-photo-757889.jpeg?auto=compress&cs=tinysrgb&w=600").into(Image3);
               Name3.setText(obj3.getName());
               Email3.setText(obj3.getEmail());
               Password3.setText(obj3.getPassword());
               City3.setText(obj3.getCity());

               Glide.with(MainActivity.this).load("https://images.pexels.com/photos/870711/pexels-photo-870711.jpeg?auto=compress&cs=tinysrgb&w=600").into(Image4);
               Name4.setText(obj4.getName());
               Email4.setText(obj4.getEmail());
               Password4.setText(obj4.getPassword());
               City4.setText(obj4.getCity());

           }
       });


    }
}