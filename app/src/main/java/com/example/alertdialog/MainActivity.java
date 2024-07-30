package com.example.alertdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
//    public void buttonClick(View view)
//    {
//        AlertDialog.Builder add = new AlertDialog.Builder(MainActivity.this);
//        add.setIcon(R.drawable.baseline_ads_click_24);
//        add.setTitle("Window Operation :");
//        add.setCancelable(false);
//        add.setMessage("you click on this post yes and go ON:??");
//        add.setPositiveButton("yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "you Clicked Yes..! ", Toast.LENGTH_SHORT).show();
//            }
//        });
//        add.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "you clicked NO.", Toast.LENGTH_SHORT).show();
//            }
//        });
//        add.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "Cancel this post", Toast.LENGTH_SHORT).show();
//            }
//        });
//        add.show();
//}
    public void buttonClick(View view)
    {
        Dialog dia = new Dialog(MainActivity.this);
        dia.setContentView(R.layout.custom_alert);
        Button bu = dia.findViewById(R.id.btn_id);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dia.dismiss();
                Toast.makeText(MainActivity.this, "Click on web portal!!", Toast.LENGTH_SHORT).show();
            }
        });
        dia.setCancelable(false);
        dia.show();
    }



}