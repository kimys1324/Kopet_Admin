package com.example.kimys1324.kopet_admin.Fragments.Activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.content.CursorLoader;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.kimys1324.kopet_admin.R;

/**
 * Created by kimys1324 on 7/6/16.
 */
public class Login extends Activity {

    private ImageButton loginButton;
    private ImageButton create_account_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.loginButton = (ImageButton)findViewById(R.id.login_button);
        this.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentForDrawer = new Intent(Login.this, Kopet_Admin_main.class);
                startActivity(intentForDrawer);

            }
        });

        this.create_account_btn = (ImageButton)findViewById(R.id.create_account_btn);
        this.create_account_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Create Account
                //Intent intentForDrawer = new Intent(Login.this, CreateAccount.class);
                //startActivity(intentForDrawer);

            }
        });

    }
}