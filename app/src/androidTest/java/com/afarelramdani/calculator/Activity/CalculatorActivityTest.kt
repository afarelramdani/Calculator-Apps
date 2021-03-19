package com.afarelramdani.calculator.Activity

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.afarelramdani.calculator.R
import junit.framework.TestCase
import kotlinx.android.synthetic.main.activity_calculator.view.*

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Exception


@RunWith(AndroidJUnit4::class)
class CalculatorActivityTest {
    @Rule @JvmField
    var activityRule = ActivityTestRule<CalculatorActivity>(CalculatorActivity::class.java)


    @Test
    @Throws(Exception::class)
    fun clickNumber() {
        Espresso.onView(withId(R.id.btnEqual)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.btn0)).check(matches(isDisplayed()))
    }
}