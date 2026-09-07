package com.fastradio;
import android.app.*; import android.os.*; import android.widget.*;
public class MainActivity extends Activity { public void onCreate(Bundle b){super.onCreate(b); setContentView(new TextView(this){{setText("Fast Radio");}});}}
