package com.ict2105.ict2105_prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class ViewRequestDetailsActivity : AppCompatActivity() {

    var sampleImages = intArrayOf(
        R.drawable.clothes,
        R.drawable.clothes,
        R.drawable.clothes
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_request_details)

        supportActionBar?.title = "Request Details"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val carouselView = findViewById<CarouselView>(R.id.carouselView)
        carouselView.setPageCount(sampleImages.size)
        carouselView.setImageListener(imageListener)
    }

    var imageListener: ImageListener = object : ImageListener {
        override fun setImageForPosition(position: Int, imageView: ImageView) {
            // You can use Glide or Picasso here
            imageView.setImageResource(sampleImages[position])
        }
    }
}
