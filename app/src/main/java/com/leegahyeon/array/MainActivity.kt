package com.leegahyeon.array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 기본 타입 배열 선언하기 - 각 기본 타입별로 10개의 빈 공간이 할당된다.
        var students = IntArray(10)
        var longArray = LongArray(10)
        var charArray = CharArray(10)
        var floatArray = FloatArray(10)
        var doubleArray = DoubleArray(10)
        // arrayOf() 함수를 사용하면 선언과 동시에 값을 입력할 수 있다.
        var intArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        // intArray 변수에는 1부터 10까지의 값이 각각의 배열 공간에 저장되어 있다.     ?

        // 2. 문자열 타입 배열 선언하기
        var stirngArray = Array(10, {item->""})
        // arrayOf() 함수로 값을 직접 입력해서 배열을 생성할 수 있다.
        var dayArray = arrayOf("Mon", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

        // 3. 앞에서 선언한 students 변수에 값 넣기
        // 가. 대괄호를 사용하는 방법
        students[0] = 90
        students[1] = 91
        students[2] = 92
        students[3] = 93
        students[4] = 94
        // 나. set 함수를 사용하는 방법
        students.set(5, 95)
        students.set(6, 96)
        students.set(7, 97)
        students.set(8, 98)
        students.set(9, 99)

        // 4. 값 변경해보기
        intArray[6] = 137        // 6번 인덱스인 일곱 번째 값 7이 137로 변경된다.
        intArray.set(9, 200)     // 9번 인덱스인 열 번째 값 10이 200으로 변경된다.

        // 5. 배열 값 사용하기
        var sevenValue = intArray[6]
        Log.d("Array", "일곱 번째 intArray의 값은 {$sevenValue}입니다.")
        var tenthValue = intArray.get(9)
        Log.d("Array", "10번째 intArray의 값은 {$tenthValue}입니다.")
        // 6. 변수에 담지 않고 직접 사용해도 된다.
        Log.d("Array", "첫 번째 dayArray의 값은 ${dayArray[0]}입니다.")
        Log.d("Array", "여섯 번째 dayArray의 값은 ${dayArray[5]}입니다.")
    }
}