package com.myappmysps.animalsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myappmysps.animalsapp.data.model.Animal
import com.myappmysps.animalsapp.databinding.ActivityDetailBinding
import com.myappmysps.animalsapp.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this@DetailActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    private var _binding: ActivityDetailBinding? = null
    private val binding get() = _binding!!
    private val bird = Animal(
        name = "Bird",
        description = "Though you may adore your feathered friend, you might not fully grasp just how remarkable it is, along with its entire species. Did you know, for instance, that birds possess an additional organ enabling them to savor scents? Or that they've evolved singing as a unique means of communication, exclusively with other birds?",
        R.drawable.bird
    )

    private val dog = Animal(
        name = "Dog", description = "You may cherish your canine companion, but you might not fully realize how extraordinary it is, as well as its entire species. For instance, did you know that dogs have an exceptional sense of smell, allowing them to perceive scents in a way humans can't? Their barking and tail wagging have evolved as expressive ways to communicate, particularly with humans.", R.drawable.dog
    )

    private val jack = Animal(
        name = "Jack",
        description = "While you cherish your hedgehog buddy, you might not entirely comprehend just how fascinating it is, along with its entire species. For instance, were you aware that hedgehogs have a remarkable defense mechanism - they can roll into a ball to protect themselves? Their quills, though sharp, serve as a unique feature to deter predators. Understanding their behaviors, such as foraging for food at night, adds to the marvel of these prickly creatures.",
        R.drawable.jack
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        when (intent.getStringExtra("Animal")) {
            "bird" -> {
                binding.textViewNameDetail.text = bird.name
                binding.textViewDescriptions.text = bird.description
                binding.imageViewDetail.setImageResource(bird.image)

            }

            "dog" -> {
                binding.textViewNameDetail.text = dog.name
                binding.textViewDescriptions.text = dog.description
                binding.imageViewDetail.setImageResource(dog.image)
            }

            "jack" -> {
                binding.textViewNameDetail.text = jack.name
                binding.textViewDescriptions.text = jack.description
                binding.imageViewDetail.setImageResource(jack.image)
            }
        }
    }


}