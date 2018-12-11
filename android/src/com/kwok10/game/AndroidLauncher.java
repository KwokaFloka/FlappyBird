package com.kwok10.game;

import android.os.Bundle;
import android.support.*;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

//import com.android.volley.*;

import org.json.JSONObject;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.kwok10.game.FlappyBird;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new FlappyBird(), config);
	}
}
