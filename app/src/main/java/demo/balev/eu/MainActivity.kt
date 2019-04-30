package demo.balev.eu

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import demo.balev.eu.mood.Mood
import demo.balev.eu.mood.MoodArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moodSpinner.adapter = MoodArrayAdapter(
            this,
            listOf(
                Mood(R.drawable.angry, "Angry"),
                Mood(R.drawable.happy, "Happy"),
                Mood(R.drawable.playful, "Playful"),
                Mood(R.drawable.wondering, "Wondering")
            )
        )

    }
}
