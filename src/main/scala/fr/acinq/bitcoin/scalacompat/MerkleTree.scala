package fr.acinq.bitcoin.scalacompat

import KotlinUtils._

import scala.jdk.CollectionConverters.SeqHasAsJava

/**
  * see https://en.bitcoin.it/wiki/Protocol_specification#Merkle_Trees
  */
object MerkleTree {
  def computeRoot(tree: Seq[ByteVector32]): ByteVector32 = fr.acinq.bitcoin.MerkleTree.computeRoot(tree.map(scala2kmp).asJava)
}
