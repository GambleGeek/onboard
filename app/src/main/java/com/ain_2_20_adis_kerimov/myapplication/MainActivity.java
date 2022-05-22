package com.ain_2_20_adis_kerimov.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        final PaperOnboardingFragment paperOnboardingFragment = PaperOnboardingFragment.newInstance(getDataForBoarding());
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, paperOnboardingFragment);
        fragmentTransaction.commit();
    }

    private ArrayList<PaperOnboardingPage> getDataForBoarding() {
        PaperOnboardingPage src1 = new PaperOnboardingPage("Hotels", "All hotels and hostels are sorted by hostility ratings",
                Color.parseColor("#ffb174"), R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground);
        PaperOnboardingPage src2 = new PaperOnboardingPage("Hotels", "All hotels and hostels are sorted by hostility ratings",
                Color.parseColor("#ffb174"), R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground);
        PaperOnboardingPage src3 = new PaperOnboardingPage("Hotels", "All hotels and hostels are sorted by hostility ratings",
                Color.parseColor("#ffb174"), R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(src1);
        elements.add(src2);
        elements.add(src3);

        return elements;
    }
}