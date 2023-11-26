package com.myappmysps.animalsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myappmysps.animalsapp.data.model.Animal
import com.myappmysps.animalsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val bird= Animal(name = "Bird", description = "Colorful bird, vital for ecosystems, bring joy with melodies and vibrant plumage.",R.drawable.bird)
    private val dog= Animal(name = "Dog", description = "Loyal dogs, cherished companions, offer boundless joy with wagging tails and unwavering loyalty.",R.drawable.dog)
    private val jack= Animal(name = "Jack", description = "Quirky hedgehogs, unique defenders, enchant with their adorable quills and nighttime foraging.",R.drawable.jack)

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewName.text=bird.name
        binding.textViewDescription.text=bird.description
        binding.imageView.setImageResource(bird.image)
        binding.textViewNameTwo.text=dog.name
        binding.textViewDescriptionTwo.text=dog.description
        binding.imageViewTwo.setImageResource(dog.image)
        binding.textViewNameThree.text=jack.name
        binding.textViewDescriptionThree.text=jack.description
        binding.imageViewThree.setImageResource(jack.image)
        binding.button.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "bird")
            startActivity(intent)
            finish()
        }
        binding.buttonTwo.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "dog")
            startActivity(intent)
            finish()
        }
        binding.buttonThree.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "jack")
            startActivity(intent)
            finish()
        }
    }
}