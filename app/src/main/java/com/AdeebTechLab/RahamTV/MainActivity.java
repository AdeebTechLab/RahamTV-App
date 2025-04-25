package com.AdeebTechLab.RahamTV;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.picture1,"Live Program Coming Soon...", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.picture2,"Live Program Coming Soon...", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.picture3,"Live Program Coming Soon...", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.picture4,"Live Program Coming Soon...", ScaleTypes.CENTER_CROP));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);

        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int position) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this,web.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,web.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,web.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,web.class));
                        break;
                }

            }

            @Override
            public void doubleClick(int position) {

            }
        });


        Button gd_bt, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, full_bt_juma, full_bt_tafsery, full_bt_khashkoly, full_bt_roh, full_bt_amreeki, full_bt_almi, status1, status2, status3, status4, status5, status6, status7, svb1, svb2, svb3, svb4, svb5, svb6, svb7, svb8, svb9, svb10;
        LinearLayout layout;
        TextView textView;


        layout = findViewById(R.id.ads);

        textView = findViewById(R.id.Developed);

        gd_bt = findViewById(R.id.General_Donations);

        sp1 = findViewById(R.id.sp_bt_1);
        sp2 = findViewById(R.id.sp_bt_2);
        sp3 = findViewById(R.id.sp_bt_3);
        sp4 = findViewById(R.id.sp_bt_4);
        sp5 = findViewById(R.id.sp_bt_5);
        sp6 = findViewById(R.id.sp_bt_6);
        sp7 = findViewById(R.id.sp_bt_7);
        sp8 = findViewById(R.id.sp_bt_8);

        full_bt_juma = findViewById(R.id.full_bt_juma);
        full_bt_tafsery = findViewById(R.id.full_bt_tafsery);
        full_bt_khashkoly = findViewById(R.id.full_bt_khashkoly);
        full_bt_roh = findViewById(R.id.full_bt_roh);
        full_bt_amreeki = findViewById(R.id.full_bt_amreeki);
        full_bt_almi = findViewById(R.id.full_bt_almi);

        status1 = findViewById(R.id.status1);
        status2 = findViewById(R.id.status2);
        status3 = findViewById(R.id.status3);
        status4 = findViewById(R.id.status4);
        status5 = findViewById(R.id.status5);
        status6 = findViewById(R.id.status6);
        status7 = findViewById(R.id.status7);

        svb1 = findViewById(R.id.svb1);
        svb2 = findViewById(R.id.svb2);
        svb3 = findViewById(R.id.svb3);
        svb4 = findViewById(R.id.svb4);
        svb5 = findViewById(R.id.svb5);
        svb6 = findViewById(R.id.svb6);
        svb7 = findViewById(R.id.svb7);
        svb8 = findViewById(R.id.svb8);
        svb9 = findViewById(R.id.svb9);
        svb10 = findViewById(R.id.svb10);










        //Button------------------------------------------------------------

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.linkedin.com/in/adeebtechnologylab/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        //Button------------------------------------------------------------

        gd_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/public/donation?amount=15";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //Button Donation------------------------------------------------------------

        sp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/sponsor/jummah-khutbah";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //Button Donation------------------------------------------------------------

        sp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/sponsor/tafseer-muneeri-zikr";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });//Button Donation------------------------------------------------------------

        sp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/sponsor/tazkiya-workshop";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });//Button Donation------------------------------------------------------------

        sp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/sponsor/rooh-ki-baatein-majlis-e-zikr";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });//Button Donation------------------------------------------------------------

        sp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/sponsor/eid-lu-fitr";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });//Button Donation------------------------------------------------------------

        sp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/sponsor/taraweeh-khatam-e-quran-ramadan-2023";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });//Button Donation------------------------------------------------------------

        sp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/sponsor/terbiyati-etikaf-ramadan-2023";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //Button Donation------------------------------------------------------------

        sp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.raham.tv/sponsor/kashkol-ma-arifat";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });











        //Button Full progrrams------------------------------------------------------------

        full_bt_juma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9Vlxr7PhTYjDuOeWTjDgyMyTS";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //Button Full progrrams------------------------------------------------------------

        full_bt_tafsery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlzyPH00edgjRRaSUET0DYiM";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //Button Full progrrams------------------------------------------------------------

        full_bt_khashkoly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlwlVSpx9RMhi6XwdcH-mtU_";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //Button Full progrrams------------------------------------------------------------

        full_bt_roh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlwYasJd8xB9_SUXCSRLEhgC";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //Button Full progrrams------------------------------------------------------------

        full_bt_amreeki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlyNYCryJ3Iiy75-ILr-_Fse";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        //Button Full progrrams------------------------------------------------------------

        full_bt_almi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9Vlz_ie7euyG6jAaMZtS3U0Rv";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });















        //Button Status Video------------------------------------------------------------

        status1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/shorts/blWgZspHX9M";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        status2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/shorts/FopI52Gl790";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        status3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/shorts/wEAJDr-NXgM";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        status4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/shorts/dIPK_VLDel0";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        status5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/shorts/xNv9WsPzkFE";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        status6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/shorts/aUap41FM9PA";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        status7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/shorts/ZBA9vl398-c";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
















        //Button Status Video------------------------------------------------------------

        svb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9Vlyrr2xgbG60hbmLp07QDsSi";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9Vly1DLgbqupoy0gzFOm03m1B";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlwT6dYPYQ1Jn-Hh9hueOr-K";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlwBwJsk5eqDYFzGfFmkyVhx";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9Vlx-nDRdv42GiZkXVhDIYHHf";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlzNst8BdPchvgkRaUk18yZg";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9Vlxqoj3YjPhzO3znmDujWWR0";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9Vlx18-Ahis9gsIideOYKd2R_";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlyqqtqWG9X0UDbHPrlzu46c";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
        //Button Status Video------------------------------------------------------------

        svb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/playlist?list=PLAko-gSS9VlyNJcIuBYxNA3Zd63DbBbyR";
                Intent i = new Intent(MainActivity.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });
















        //Button------------------------------------------------------------

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/uc?export=download&id=1yFjgzTokZQVjD0CdQZYBCbrkJC1zGhwZ";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });






    }
}