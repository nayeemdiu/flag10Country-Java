package com.flags10country.Flags10country;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private String[] allBoardNames;
    private String[] boardBangla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        allBoardNames = getResources().getStringArray(R.array.board_names);
        boardBangla = getResources().getStringArray(R.array.board_bangla);
        listView = findViewById(R.id.listviewId);
        CustomAdapter adapter = new CustomAdapter(this,allBoardNames,boardBangla);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(MainActivity.this,austrelia.class);
                    startActivity(intent);
                }

                else if(position == 1){
                    Intent intent = new Intent(MainActivity.this,bangladesh.class);
                    startActivity(intent);
                }

                else if(position == 2){
                    Intent intent = new Intent(MainActivity.this,canada.class);
                    startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(MainActivity.this,denmark.class);
                    startActivity(intent);
                }

                else if(position == 4){
                    Intent intent = new Intent(MainActivity.this,brazil.class);
                    startActivity(intent);
                }
                else if(position == 5){
                    Intent intent = new Intent(MainActivity.this,morokko.class);
                    startActivity(intent);
                }
                else if(position == 6){
                    Intent intent = new Intent(MainActivity.this,pakistan.class);
                    startActivity(intent);
                }
                else if(position == 7){
                    Intent intent = new Intent(MainActivity.this,rgentina.class);
                    startActivity(intent);
                }

                else if(position == 8){
                    Intent intent = new Intent(MainActivity.this,india.class);
                    startActivity(intent);
                }
                else if(position == 9){
                    Intent intent = new Intent(MainActivity.this,usa.class);
                    startActivity(intent);
                }
            }
        });
    }
    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this).setMessage("Are you sure want to exit ?")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", null).show();
    }
}