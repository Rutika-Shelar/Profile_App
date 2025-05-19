package com.example.profileapp.ui.profile;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.example.profileapp.R;

public class ProfileActivity extends AppCompatActivity {
    private ProfileViewModel viewModel;
    private TextView nameText, memberSinceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameText = findViewById(R.id.profile_name);
        memberSinceText = findViewById(R.id.member_since);

        viewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        viewModel.getProfile().observe(this, profile -> {
            nameText.setText(profile.getName());
            memberSinceText.setText("member since " + profile.getMemberSince());
        });
    }
}
