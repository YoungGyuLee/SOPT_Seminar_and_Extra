package com.yg.sopt25th.extra.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter

class ExtraFragmentAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var fragments : ArrayList<Fragment> = ArrayList()
    override fun getItem(position: Int): Fragment  = fragments[position]

    override fun getCount(): Int  = fragments.size

    fun addFragments(fragment : Fragment){
        fragments.add(fragment)
    }

    fun replaceFragment(index : Int, fragment2 : Fragment){
        fragments.removeAt(index)
        fragments.add(index, fragment2)
    }

    override fun getItemPosition(item: Any): Int {
        return PagerAdapter.POSITION_NONE
    }
}
