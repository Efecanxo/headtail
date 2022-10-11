package com.example.challenges

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import java.lang.Integer.*
import java.lang.Math.*

fun main(){



 println("how many times do you want to flip the coin")

 var cointoflip= valueOf(readLine())


 var imgnum:Int=0

 var numnum:Int=0

 for(i in 0..cointoflip-1)
 {

 var zeroone=(0..1).random()
  //0 is head 1 is tail
  if(zeroone==0)
  {
   imgnum++
  }
  else{
   numnum++
  }

 }

println("well done, your game is finished and the head is(img): ${imgnum} and tail is(number): ${numnum}")

}


