package com.example.android_sprint1_challenge.ui.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_sprint1_challenge.R
import kotlinx.android.synthetic.main.activity_main.*

class ListActivity : AppCompatActivity() {

    //companion object for intent
    companion object {
        const val REQUEST_MOVIE_WATCHED = 10
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button on list will open edit activity
        list_button.setOnClickListener {
            var editMovieIntent = Intent(this, EditActivity::class.java)
            startActivityForResult(editMovieIntent, REQUEST_MOVIE_WATCHED)
        }
    }
}
