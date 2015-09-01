package com.example.iamuser773.wallpaper;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.IOException;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//ทำการประกาศปุ่มกด
    Button show_hide_button,show_hide_button2,show_hide_button3,show_hide_button4,show_hide_button5;
    //ประกาศView ไว้เก็บค่าLinearLayout
    View ImageViewgroup;
    //เเละประกาศ boolean ไว้เก็บค่า show/hide
    boolean viewShow,viewShow2,viewShow3,viewShow4,viewShow5 = false;

    //ประกาศurl
    String url[] ={
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Path-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-eiffel-tower-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Tree-Branch-Bokeh-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Summer-Vacation-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Headphones-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-bridge-fre-sonneveld-oakland-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-dog-puppy-tumblr-puppylove-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Beach-Sunrise-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Battlefield-3-Game-2011-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Flower-l2.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-The-fog-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Rail-Road-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-City-Dark-New-York-Bridge-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Stripped-l.jpg",
            "http://cdn.mobileswall.com/wp-content/uploads/2015/08/640-Maple-Leaf-girl-l.jpg"



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //Id && setOnClick
        show_hide_button = (Button) findViewById(R.id.buttonshow);
        show_hide_button2 = (Button) findViewById(R.id.buttonshow2);
        show_hide_button3 = (Button) findViewById(R.id.buttonshow3);
        show_hide_button4 = (Button) findViewById(R.id.buttonshow4);
        show_hide_button5 = (Button) findViewById(R.id.buttonshow5);
        show_hide_button.setOnClickListener(this);
        show_hide_button2.setOnClickListener(this);
        show_hide_button3.setOnClickListener(this);
        show_hide_button4.setOnClickListener(this);
        show_hide_button5.setOnClickListener(this);


        //ImageViewgroup1 กำหนดรูป
            ImageView image1 = (ImageView) findViewById(R.id.image1);
            ImageView image2 = (ImageView) findViewById(R.id.image2);
            ImageView image3 = (ImageView) findViewById(R.id.image3);

            Picasso.with(this)
                    .load(url[0])
                    .into(image1);


            Picasso.with(this)
                    .load(url[1])
                    .into(image2);
            Picasso.with(this)
                    .load(url[2])
                    .into(image3);
        //ImageViewgroup2 กำหนดรูป
        ImageView image4 = (ImageView) findViewById(R.id.image4);
        ImageView image5 = (ImageView) findViewById(R.id.image5);
        ImageView image6 = (ImageView) findViewById(R.id.image6);

        Picasso.with(this)
                .load(url[3])
                .into(image4);
        Picasso.with(this)
                .load(url[4])
                .into(image5);
        Picasso.with(this)
                .load(url[5])
                .into(image6);
        //ImageViewgroup3 กำหนดรูป
        ImageView image7 = (ImageView) findViewById(R.id.image7);
        ImageView image8 = (ImageView) findViewById(R.id.image8);
        ImageView image9 = (ImageView) findViewById(R.id.image9);

        Picasso.with(this)
                .load(url[6])
                .into(image7);
        Picasso.with(this)
                .load(url[7])
                .into(image8);
        Picasso.with(this)
                .load(url[8])
                .into(image9);
        //ImageViewgroup4 กำหนดรูป
        ImageView image10 = (ImageView) findViewById(R.id.image10);
        ImageView image11 = (ImageView) findViewById(R.id.image11);
        ImageView image12 = (ImageView) findViewById(R.id.image12);

        Picasso.with(this)
                .load(url[9])
                .into(image10);
        Picasso.with(this)
                .load(url[10])
                .into(image11);
        Picasso.with(this)
                .load(url[11])
                .into(image12);
        //ImageViewgroup5 กำหนดรูป
        ImageView image13 = (ImageView) findViewById(R.id.image13);
        ImageView image14 = (ImageView) findViewById(R.id.image14);
        ImageView image15 = (ImageView) findViewById(R.id.image15);

        Picasso.with(this)
                .load(url[12])
                .into(image13);
        Picasso.with(this)
                .load(url[13])
                .into(image14);
        Picasso.with(this)
                .load(url[14])
                .into(image15);



        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);
        image10.setOnClickListener(this);
        image11.setOnClickListener(this);
        image12.setOnClickListener(this);
        image13.setOnClickListener(this);
        image14.setOnClickListener(this);
        image15.setOnClickListener(this);





    }



    //รับค่าviewมาgetId
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonshow:

                ImageViewgroup = findViewById(R.id.image_viewgroup);
                if (viewShow){
                    ImageViewgroup.setVisibility(View.GONE);
                    show_hide_button.setText("Show");


                }else {
                    ImageViewgroup.setVisibility(View.VISIBLE);
                    show_hide_button.setText("hide");

                }
                viewShow = !viewShow;

                break;
            case R.id.buttonshow2:

                ImageViewgroup = findViewById(R.id.image_viewgroup2);
                if (viewShow2){
                    ImageViewgroup.setVisibility(View.GONE);
                    show_hide_button2.setText("Show");
                }else {
                    ImageViewgroup.setVisibility(View.VISIBLE);
                    show_hide_button2.setText("hide");
                }

                viewShow2 = !viewShow2;
                break;
            case R.id.buttonshow3:

                ImageViewgroup = findViewById(R.id.image_viewgroup3);
                if (viewShow3){
                    ImageViewgroup.setVisibility(View.GONE);
                    show_hide_button3.setText("Show");
                }else {
                    ImageViewgroup.setVisibility(View.VISIBLE);
                    show_hide_button3.setText("hide");
                }

                viewShow3 = !viewShow3;
                break;
            case R.id.buttonshow4:

                ImageViewgroup = findViewById(R.id.image_viewgroup4);
                if (viewShow4){
                    ImageViewgroup.setVisibility(View.GONE);
                    show_hide_button4.setText("Show");
                }else {
                    ImageViewgroup.setVisibility(View.VISIBLE);
                    show_hide_button4.setText("hide");
                }

                viewShow4 = !viewShow4;
                break;
            case R.id.buttonshow5:

                ImageViewgroup = findViewById(R.id.image_viewgroup5);
                if (viewShow5){
                    ImageViewgroup.setVisibility(View.GONE);
                    show_hide_button5.setText("Show");
                }else {
                    ImageViewgroup.setVisibility(View.VISIBLE);
                    show_hide_button5.setText("hide");
                }

                viewShow5 = !viewShow5;
                break;

        }


        switch (v.getId()){
            case R.id.image1:
                SetMyWallpaper(url[0]);

                break;
            case R.id.image2:
                SetMyWallpaper(url[1]);

                break;
            case R.id.image3:
                SetMyWallpaper(url[2]);

                break;
            case R.id.image4:
                SetMyWallpaper(url[3]);

                break;
            case R.id.image5:
                SetMyWallpaper(url[4]);

                break;
            case R.id.image6:
                SetMyWallpaper(url[5]);

                break;
            case R.id.image7:
                SetMyWallpaper(url[6]);

                break;
            case R.id.image8:
                SetMyWallpaper(url[7]);

                break;
            case R.id.image9:
                SetMyWallpaper(url[8]);

                break;
            case R.id.image10:
                SetMyWallpaper(url[9]);

                break;
            case R.id.image11:
                SetMyWallpaper(url[10]);

                break;
            case R.id.image12:
                SetMyWallpaper(url[11]);

                break;
            case R.id.image13:
                SetMyWallpaper(url[12]);

                break;
            case R.id.image14:
                SetMyWallpaper(url[13]);

                break;
            case R.id.image15:
                SetMyWallpaper(url[14]);

                break;
        }
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



private void SetMyWallpaper(String url){
    Picasso.with(this).load(url).into(new Target() {
        @Override
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
            DisplayMetrics dm = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);

            int height = dm.heightPixels;
            int width = dm.widthPixels ;

            WallpaperManager wp = WallpaperManager.getInstance(getApplicationContext());
            try {
                wp.setBitmap(bitmap);
                wp.suggestDesiredDimensions(width,height);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onBitmapFailed(Drawable errorDrawable) {
            Toast.makeText(MainActivity.this,"โหลดรูปบ่ได๋",Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onPrepareLoad(Drawable placeHolderDrawable) {

        }
    });
}



}
