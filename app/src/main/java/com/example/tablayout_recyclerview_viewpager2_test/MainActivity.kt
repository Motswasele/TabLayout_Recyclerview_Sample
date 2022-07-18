package com.example.tablayout_recyclerview_viewpager2_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayout_recyclerview_viewpager2_test.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragmentViewPager()
    }

    private fun fragmentViewPager() {

        val fragment1 = AnimalsFragment()
        val fragment2 = AfricaFragment()
        val fragment3 = AsiaFragment()

        val pageAdapter = CustomPageAdapter(this)

        pageAdapter.addFragment(fragment1,"Animal One")
        pageAdapter.addFragment(fragment2,"Africa")
        pageAdapter.addFragment(fragment3,"Asia")

        binding.contentMain.viewPager.adapter = pageAdapter

        TabLayoutMediator(binding.contentMain.tabLayout, binding.contentMain.viewPager){tab, position ->
            tab.text = pageAdapter.getPageTitle(position)
        }.attach()
    }
   }