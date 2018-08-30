package example.com.kotlinenum

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

enum class Type {
    A, B, C
}

interface TypeWrapper {
    val type: Type
}


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val map = mapOf<String, TypeWrapper>()
        val wrapper = map["a"]
        println(wrapper?.type == Type.A)
    }

}
