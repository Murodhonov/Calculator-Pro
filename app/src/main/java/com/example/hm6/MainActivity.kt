package com.example.hm6

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.wuyr.rippleanimation.RippleAnimation
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    var background = 0
    var primaryText = 0
    var SecondaryText = 0
    var shadowDark = 0
    var shadowLight = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            background = getColor(R.color.background)
            primaryText = getColor(R.color.primary_text)
            SecondaryText = getColor(R.color.secondary_text)
            shadowDark = getColor(R.color.dark_shadow)
            shadowLight = getColor(R.color.light_shadow)
        }

        var open = false

        dayNight.setOnClickListener {
            if (open) {
                open = false
                RippleAnimation.create(dayNight).setDuration(1000).start()
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    background = getColor(R.color.background)
                    primaryText = getColor(R.color.primary_text)
                    SecondaryText = getColor(R.color.secondary_text)
                    shadowDark = getColor(R.color.dark_shadow)
                    shadowLight = getColor(R.color.light_shadow)
                    rootViews.setBackgroundColor(getColor(R.color.background))
                }

                onStart()
            } else {
                open = true
                RippleAnimation.create(dayNight).setDuration(1000).start()
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    background = getColor(R.color.dark_background)
                    primaryText = getColor(R.color.dark_primary_text)
                    SecondaryText = getColor(R.color.dark_secondary_text)
                    shadowDark = getColor(R.color.dark_dark_shadow)
                    shadowLight = getColor(R.color.dark_light_shadow)
                    rootViews.setBackgroundColor(getColor(R.color.dark_background))
                }
                onStart()
            }
        }


    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onStart() {
        super.onStart()
        var bracket = false

        dayNight.setBackgroundColor(background)
        dayNight.setShadowColorDark(shadowDark)
        dayNight.setShadowColorLight(shadowLight)
        btn_one1.setBackgroundColor(background)
        btn_one1.setShadowColorDark(shadowDark)
        btn_one1.setShadowColorLight(shadowLight)
        btn_two1.setBackgroundColor(background)
        btn_two1.setShadowColorDark(shadowDark)
        btn_two1.setShadowColorLight(shadowLight)
        btn_three1.setBackgroundColor(background)
        btn_three1.setShadowColorDark(shadowDark)
        btn_three1.setShadowColorLight(shadowLight)
        btn_four1.setBackgroundColor(background)
        btn_four1.setShadowColorDark(shadowDark)
        btn_four1.setShadowColorLight(shadowLight)
        btn_five1.setBackgroundColor(background)
        btn_five1.setShadowColorDark(shadowDark)
        btn_five1.setShadowColorLight(shadowLight)
        btn_six1.setBackgroundColor(background)
        btn_six1.setShadowColorDark(shadowDark)
        btn_six1.setShadowColorLight(shadowLight)
        btn_seven1.setBackgroundColor(background)
        btn_seven1.setShadowColorDark(shadowDark)
        btn_seven1.setShadowColorLight(shadowLight)
        btn_eight1.setBackgroundColor(background)
        btn_eight1.setShadowColorDark(shadowDark)
        btn_eight1.setShadowColorLight(shadowLight)
        btn_nine1.setBackgroundColor(background)
        btn_nine1.setShadowColorDark(shadowDark)
        btn_nine1.setShadowColorLight(shadowLight)
        btn_zero1.setBackgroundColor(background)
        btn_zero1.setShadowColorDark(shadowDark)
        btn_zero1.setShadowColorLight(shadowLight)
        btn_doubleZero1.setBackgroundColor(background)
        btn_doubleZero1.setShadowColorDark(shadowDark)
        btn_doubleZero1.setShadowColorLight(shadowLight)
        btn_plus1.setBackgroundColor(background)
        btn_plus1.setShadowColorDark(shadowDark)
        btn_plus1.setShadowColorLight(shadowLight)
        btn_minus1.setBackgroundColor(background)
        btn_minus1.setShadowColorDark(shadowDark)
        btn_minus1.setShadowColorLight(shadowLight)
        btn_multiplication1.setBackgroundColor(background)
        btn_multiplication1.setShadowColorDark(shadowDark)
        btn_multiplication1.setShadowColorLight(shadowLight)
        btn_division1.setBackgroundColor(background)
        btn_division1.setShadowColorDark(shadowDark)
        btn_division1.setShadowColorLight(shadowLight)
        btn_bracket1.setBackgroundColor(background)
        btn_bracket1.setShadowColorDark(shadowDark)
        btn_bracket1.setShadowColorLight(shadowLight)
        btn_del1.setBackgroundColor(background)
        btn_del1.setShadowColorDark(shadowDark)
        btn_del1.setShadowColorLight(shadowLight)
        btn_percent1.setBackgroundColor(background)
        btn_percent1.setShadowColorDark(shadowDark)
        btn_percent1.setShadowColorLight(shadowLight)
        btn_dot1.setBackgroundColor(background)
        btn_dot1.setShadowColorDark(shadowDark)
        btn_dot1.setShadowColorLight(shadowLight)
        btn_equal1.setBackgroundColor(background)
        btn_equal1.setShadowColorDark(shadowDark)
        btn_equal1.setShadowColorLight(shadowLight)

        btn_one1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_one1.setShapeType(1)
                    writeToScreen("1")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_one1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_two1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_two1.setShapeType(1)
                    writeToScreen("2")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_two1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_three1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_three1.setShapeType(1)
                    writeToScreen("3")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_three1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_four1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_four1.setShapeType(1)
                    writeToScreen("4")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_four1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_five1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_five1.setShapeType(1)
                    writeToScreen("5")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_five1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_six1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_six1.setShapeType(1)
                    writeToScreen("6")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_six1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })
        btn_seven1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_seven1.setShapeType(1)
                    writeToScreen("7")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_seven1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_eight1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_eight1.setShapeType(1)
                    writeToScreen("8")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_eight1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_nine1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_nine1.setShapeType(1)
                    writeToScreen("9")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_nine1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_zero1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_zero1.setShapeType(1)
                    writeToScreen("0")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_zero1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_doubleZero1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_doubleZero1.setShapeType(1)
                    writeToScreen("00")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_doubleZero1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_plus1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "+" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "÷" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "*" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "-" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "%"
                    ) writeToScreen("+")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_plus1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_minus1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_minus1.setShapeType(1)
                    if (txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "+" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "÷" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "*" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "-" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "%"
                    ) writeToScreen("-")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_minus1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })
        btn_multiplication1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_multiplication1.setShapeType(1)
                    if (txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "+" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "÷" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "*" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "-" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "%"
                    ) writeToScreen("×")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_multiplication1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_division1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_division1.setShapeType(1)
                    if (txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "+" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "÷" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "*" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "-" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "%"
                    ) writeToScreen("÷")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_division1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_bracket1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_bracket1.setShapeType(1)
                    (if (!bracket) {
                        writeToScreen("(")
                        true
                    } else {
                        writeToScreen(")")
                        false
                    }).also { bracket = it }
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_bracket1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_del1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_del1.setShapeType(1)
                    if (txt_1.text.toString().isNotEmpty()) {
                        txt_1.text =
                            txt_1.text.toString().substring(0, txt_1.text.toString().length - 1)
                    }
                    if (txt_1.text.toString() == "") {
                        txt_1.text = "0"
                        txt_2.text = "0"
                    }
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_del1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_percent1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_percent1.setShapeType(1)
                    if (txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "+" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "÷" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "*" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "-" &&
                        txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "%"
                    ) writeToScreen("%")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_percent1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })
        btn_dot1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_dot1.setShapeType(1)
                    if (txt_1.text.toString().substring(
                            txt_1.text.toString().length - 1,
                            txt_1.text.toString().length
                        ) != "."
                    ) writeToScreen(".")
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_dot1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        btn_equal1.setOnTouchListener(View.OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    btn_equal1.setShapeType(1)
                    try {

                        var text = txt_1.text.toString()
                        text = text.replace("%", "/100")
                        text = text.replace('×', '*')
                        text = text.replace('÷', '/')
                        val expression = ExpressionBuilder(text).build()
                        val result = expression.evaluate()
                        val longResult = result.toLong()
                        if (result == longResult.toDouble()) txt_2.text =
                            longResult.toString() else txt_2.text = result.toString()

                    } catch (e: Exception) {
                        Log.d("Exception", "message: " + e.message)
                    }
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    btn_equal1.setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })
    }

    @SuppressLint("SetTextI18n")
    private fun writeToScreen(number: String) {
        if (txt_1.text.toString() != "0" && txt_1.text.toString() != "00") {
            txt_1.text =
                "${txt_1.text}$number"
        } else {
            txt_1.text = number
        }
    }
}