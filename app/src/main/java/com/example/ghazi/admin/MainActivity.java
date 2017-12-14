package com.example.ghazi.admin;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        CameraFragment.OnFragmentInteractionListener,
        ReceivedSmsFragment.OnFragmentInteractionListener,
        CallLogFragment.OnFragmentInteractionListener,
        ContactFragment.OnFragmentInteractionListener,
        NotificationFragment.OnFragmentInteractionListener,
        InstaNotificationsFragment.OnFragmentInteractionListener,
        EmailFragment.OnFragmentInteractionListener
{

    RecyclerView rvItem;
    CardView cvItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        rvItem= (RecyclerView)findViewById(R.id.rvItem1);
        cvItem=(CardView)findViewById(R.id.cvItem);

        rvItem.setHasFixedSize(true);
        RecyclerView.LayoutManager manager= new LinearLayoutManager(this);
        rvItem.setLayoutManager(manager);

        //test
        ArrayList<Sms> test = new ArrayList<Sms>();
        test.add(new Sms("21770984","ghazi bitcha"));
        test.add(new Sms("25123","ghazi rojla"));


        /*SmsAdapter smsAdapter =new SmsAdapter(getApplicationContext(),test);
        rvItem.setAdapter(smsAdapter);*/



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.sentSms) {
            // Handle the camera action
            CameraFragment cameraFragment= new CameraFragment();
            android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container_for_fragments,cameraFragment,cameraFragment.getTag()).commit();

        } else if (id == R.id.receivedSms) {
            ReceivedSmsFragment receivedSmsFragment= new ReceivedSmsFragment();
            android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container_for_fragments,receivedSmsFragment,receivedSmsFragment.getTag()).commit();



        } else if (id == R.id.callLogs) {
            CallLogFragment callLogFragment= new CallLogFragment();
            android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container_for_fragments,callLogFragment,callLogFragment.getTag()).commit();



        } else if (id == R.id.contacts) {
            ContactFragment contactFragment= new ContactFragment();
            android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container_for_fragments,contactFragment,contactFragment.getTag()).commit();



        } else if (id == R.id.fcbNotifs) {
            NotificationFragment notificationFragment= new NotificationFragment();
            android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container_for_fragments,notificationFragment,notificationFragment.getTag()).commit();



        } else if (id == R.id.instagramNotifs) {

            InstaNotificationsFragment instanotificationFragment= new InstaNotificationsFragment();
            android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container_for_fragments,instanotificationFragment,instanotificationFragment.getTag()).commit();



        }
        else if (id == R.id.emailNotif) {

            EmailFragment emailFragment= new EmailFragment();
            android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.container_for_fragments,emailFragment,emailFragment.getTag()).commit();



        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
