package com.artivisi.android.kyurifood.marketer.activities;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.artivisi.android.kyurifood.marketer.R;
import com.artivisi.android.kyurifood.marketer.fragments.DashboardFragment;
import com.artivisi.android.kyurifood.marketer.fragments.KotakMasukFragment;
import com.artivisi.android.kyurifood.marketer.fragments.LaporanFragment;
import com.artivisi.android.kyurifood.marketer.fragments.PesananFragment;
import com.artivisi.android.kyurifood.marketer.fragments.ProdukFragment;

public class DashboardActivity extends AppCompatActivity
    implements
        DashboardFragment.OnFragmentInteractionListener,
        ProdukFragment.OnFragmentInteractionListener,
        PesananFragment.OnFragmentInteractionListener,
        LaporanFragment.OnFragmentInteractionListener,
        KotakMasukFragment.OnFragmentInteractionListener{

    DashboardFragment dashboardFragment = new DashboardFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, dashboardFragment);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
