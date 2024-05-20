package com.example.ktphaneynetimsistemiapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddBook = findViewById<Button>(R.id.btnAddBook)
        val btnAddMember = findViewById<Button>(R.id.btnAddMember)
        val btnListBooks = findViewById<Button>(R.id.btnListBooks)
        val btnListMembers = findViewById<Button>(R.id.btnListMembers)

        btnAddBook.setOnClickListener {
            // Kitap ekleme işlemi burada gerçekleştirilecek
        }

        btnAddMember.setOnClickListener {
            // Üye ekleme işlemi burada gerçekleştirilecek
        }

        btnListBooks.setOnClickListener {
            // Kitapları listeleme işlemi burada gerçekleştirilecek
        }

        btnListMembers.setOnClickListener {
            // Üyeleri listeleme işlemi burada gerçekleştirilecek
        }
    }
}