package com.yg.sopt25th.extra.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ExtraFragmentAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    private var fragments : ArrayList<Fragment> = ArrayList()
    override fun getItem(position: Int): Fragment  = fragments[position]

    override fun getCount(): Int  = fragments.size

    fun addFragments(fragment : Fragment){
        fragments.add(fragment)
    }
}
