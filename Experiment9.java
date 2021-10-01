package com.example.preferance_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedpref;
    TextView name, email;
    Button btnSave, btnRetr, btnClear;
    public static final String mypref = "mypref";
    public static final String Name = "namekey";
    public static final String Email = "emailkey";
