package com.example.rathimitra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.base.BaseActivity;
import com.example.rathimitra.fragment.HomeFragment;
import com.example.rathimitra.fragment.ManageLeadsFragment;
import com.example.rathimitra.fragment.MyProfileFragment;
import com.example.rathimitra.fragment.NoticeFragment;
import com.example.rathimitra.fragment.WalletFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends BaseActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    private ActionBarDrawerToggle drawerToggle;
    ImageView menu_img;
    LinearLayout li_notice,li_manage_leads,li_my_wallet,li_profile;
    AppBarLayout app_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initControl();
        myObserve();



        Fragment fm = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,fm,"Home").commit();
    }



    @Override
    public void init() {
        navigationView = findViewById(R.id.navigation_view);
        app_bar = findViewById(R.id.app_bar);
        drawerLayout = findViewById(R.id.drawerLayout);
        menu_img = findViewById(R.id.menu_img);
        li_notice = findViewById(R.id.li_notice);
        li_manage_leads = findViewById(R.id.li_manage_leads);
        li_my_wallet = findViewById(R.id.li_my_wallet);
        li_profile = findViewById(R.id.li_profile);

        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerToggle.setDrawerIndicatorEnabled(false);
        drawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }

    @Override
    public void initControl() {
        menu_img.setOnClickListener(this);
        li_notice.setOnClickListener(this);
        li_manage_leads.setOnClickListener(this);
        li_my_wallet.setOnClickListener(this);
        li_profile.setOnClickListener(this);
    }

    @Override
    public void myObserve() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_img:
                checkDrawerOpen();
                break;
             case R.id.li_notice:
                 app_bar.setVisibility(View.GONE);
                 drawerLayout.closeDrawers();
                openNoticeFragment();
                break;
          case R.id.li_manage_leads:
                 app_bar.setVisibility(View.GONE);
                 drawerLayout.closeDrawers();
                openManageLeadsFragment();
                break;
         case R.id.li_my_wallet:
                 app_bar.setVisibility(View.GONE);
                 drawerLayout.closeDrawers();
                openMyWalletFragment();
                break;
          case R.id.li_profile:
                 app_bar.setVisibility(View.GONE);
                 drawerLayout.closeDrawers();
                openProfileFragment();
                break;
        }

    }

    private void openProfileFragment() {
        MyProfileFragment profileFragment= new MyProfileFragment ();
        SwitchFragment(profileFragment);
    }

    private void openMyWalletFragment() {
        WalletFragment walletFragment= new WalletFragment ();
        SwitchFragment(walletFragment);
    }

    private void openManageLeadsFragment() {
        ManageLeadsFragment manageLeadsFragment = new ManageLeadsFragment ();
        SwitchFragment(manageLeadsFragment);
    }

    private void openNoticeFragment() {
        NoticeFragment noticeFragment = new NoticeFragment ();
        SwitchFragment(noticeFragment);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }


    public void checkDrawerOpen() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    public void SwitchFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_layout, fragment, HomeFragment.TAG);
        fragmentTransaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        menu_img.setImageResource(R.drawable.ic_baseline_menu_black_24);
    }
}