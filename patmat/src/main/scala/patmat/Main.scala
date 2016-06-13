package patmat

/**
  * Created by iuiu on 13/06/16.
  */
object Main extends App{
  println(Huffman.decodedSecret.mkString(""))

  println(Huffman.createCodeTree("someText".toList))
}
