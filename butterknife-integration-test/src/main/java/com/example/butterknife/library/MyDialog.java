package com.example.butterknife.library;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.butterknife.R;

import butterknife.BindLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@BindLayout(R.layout.simple_dialog)
public class MyDialog extends Dialog {
    @BindView(R.id.hello_dialog)
    Button mButton;

    public MyDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.hello_dialog)
    void onButtonClick() {
        Toast.makeText(getContext(), "Hello Button", Toast.LENGTH_SHORT).show();
    }
}
