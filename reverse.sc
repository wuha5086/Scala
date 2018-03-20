import scala.collection.mutable.ArrayBuffer 
import scala.io.Source
import java.io.FileWriter
import java.io.File

def reverse(sourceFile:String, outFile:String):Unit={
      var reversed = ArrayBuffer[String]()
      for (line <- Source.fromFile("/Users/hanwu/alice.txt").getLines) {
          reversed+=line
      }
      println(reversed)
      reversed = reversed.reverse
      println(reversed) 
      val out = new FileWriter(new File(outFile))
      for (line <- reversed) {
          out.write(line)}
      out.close
      }
reverse("alice.txt","test.txt")
