package com.jamrud.dempstershafer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public class SelectedUserActivity extends AppCompatActivity {
    TextView tvUser;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_selected_user);
        this.tvUser = (TextView) findViewById(R.id.selectedUser);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            this.tvUser.setText(((Versions) intent.getSerializableExtra("data")).getCodeName());
        }
    }
}
