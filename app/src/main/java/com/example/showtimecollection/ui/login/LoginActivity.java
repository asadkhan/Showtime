package com.example.showtimecollection.ui.login;

import android.app.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.showtimecollection.R;
import com.example.showtimecollection.baseclasses.BaseActivity;
import com.example.showtimecollection.ui.login.LoginViewModel;
import com.example.showtimecollection.ui.login.LoginViewModelFactory;

public class LoginActivity extends BaseActivity {

private EditText phoneNumber;
    private Button loginButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
         EditText phoneNumber = findViewById(R.id.phone);



         Button loginButton = findViewById(R.id.login);

        String[] Zones = new String[]{"Select Zone", "A", "B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};




    }



}