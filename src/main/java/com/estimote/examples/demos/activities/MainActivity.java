package com.estimote.examples.demos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.estimote.examples.demos.R;

public class MainActivity extends ActionBarActivity{
  Button signoutButton;
  Button bookButton;
  Button discoverButton;
  Button logoutButton;
    int genrePos,bookPos;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.all_demos);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    toolbar.setTitle(getTitle());
    bookButton = (Button)findViewById(R.id.select_book_button);
    bookButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent("com.estimote.examples.demos.activities.SELECTBOOK");
        startActivity(intent);
      }
    });
    discoverButton = (Button)findViewById(R.id.discover_button);
    discoverButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SuggestedActivity.class);
        startActivity(intent);
      }
    });
    signoutButton = (Button)findViewById(R.id.notify_button);
    signoutButton.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v){
        Intent intent = new Intent(MainActivity.this, ProxCheck.class);
        startActivity(intent);
      }
    });
    logoutButton = (Button)findViewById(R.id.sign_out);
    logoutButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
      }
    });
  }

  private void startListBeaconsActivity(String extra) {
    Intent intent = new Intent(MainActivity.this, ProximityActivity.class);
    intent.putExtra(ProximityActivity.EXTRAS_TARGET_ACTIVITY, extra);
    startActivity(intent);
  }
}
