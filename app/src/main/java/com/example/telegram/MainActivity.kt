package com.example.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telegram.R.drawable.*
import com.example.telegram.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var imglist = arrayOf(
            pro1,
            pro2,
            pro3,
            pro4,
            pro5,
            pro6,
            pro7,
            pro8,
            pro9,
            pro10,
            pro11
        )
        var namelist = arrayOf(
            "BlackMagic Design Davicinci Resolve Studio",
            "Infinate Painter Premium Version",
            "Panda Video Compressor For Laptop And Pc",
            "WondareShare FilmoraGo is a simple video editor",
            "fl studio,an all in one music production software",
            "PhotoScapeX Pro AIO photo editing Software,photo viewer",
            "Adobe Media Encoder 2020 ",
            "Photo film ,is the perfect companion for everyone ",
            "Kaspersky has replaced individual update",
            "Movie mater Video Pro ,come with unlimited video",
            "techSmith,All in one Screen Recorder"
        )

        var timelist = arrayOf(
            "3.30 PM",
            "2.40 AM",
            "5.35 PM",
            "9.16 PM",
            "7.52 PM",
            "5.59 PM",
            "1.24 PM",
            "4.53 PM",
            "7.28 PM",
            "3.26 PM",
            "8.45 PM"
        )
        var grouplist = arrayOf(
            "Android Developers",
            "ios Developers",
            "Flutter",
            "Web Designer",
            "UI/UX",
            "Coder Club",
            "Designers",
            "App Developers",
            "Shopify",
            "Web Developers",
            "Graphics Designer"
        )
        var msgcountlist = arrayOf(
            "25351",
            "16240",
            "256",
            "3054",
            "4025",
            "1245",
            "5263",
            "9523",
            "7612",
            "5455",
            "5658"
        )

        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frecycle.layoutManager = LinearLayoutManager(applicationContext)
        binding.frecycle.adapter = profileadapter(timelist,namelist,grouplist,imglist,msgcountlist)


        binding.imgmenu.setOnClickListener {
            binding.drawer.openDrawer(Gravity.LEFT)
        }
        binding.navview.setNavigationItemSelectedListener(object :
            OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.group -> {
                        Toast.makeText(applicationContext, "New Group", Toast.LENGTH_SHORT).show()
                    }
                    R.id.contact -> {
                        Toast.makeText(applicationContext, "Contacts", Toast.LENGTH_SHORT).show()
                    }
                    R.id.call -> {
                        Toast.makeText(applicationContext, "Calls", Toast.LENGTH_SHORT).show()
                    }

                    R.id.nearby -> {
                        Toast.makeText(applicationContext, "People Nearby", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.message -> {
                        Toast.makeText(applicationContext, "Saved Message", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.setting -> {
                        Toast.makeText(applicationContext, "Settings", Toast.LENGTH_SHORT).show()
                    }
                    R.id.invite -> {
                        Toast.makeText(applicationContext, "Invite Friends", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.feature -> {
                        Toast.makeText(applicationContext, "Telegram Feature", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
                binding.drawer.closeDrawer(Gravity.LEFT)
                return false
            }
        })

//        var adapter = profileadapter(time, namelist, grouplist, img_pro, msgcount)


    }
}



