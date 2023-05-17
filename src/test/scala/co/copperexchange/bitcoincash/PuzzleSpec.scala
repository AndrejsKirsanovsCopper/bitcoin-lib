package co.copperexchange.bitcoincash

import org.scalatest.FlatSpec

class PuzzleSpec extends FlatSpec {

  "bitcoincash-lib" should "handle puzzle a3b78ca23020cabe2bc467d485bb95921aff0fba6808286f1bea6342029182b7" in {
    val tx = Transaction.read(
      "01000000010000000000000000000000000000000000000000000000000000000000000000ffffffff1403131308074121205af048963a0a00002b170100ffffffff0106a3874a000000001976a914bd840bf4df59cc41694c067024fb0a99a78a780388ac00000000"
    )
    Transaction.correctlySpends(
      tx,
      Map.empty[OutPoint, TxOut],
      ScriptFlags.MANDATORY_SCRIPT_VERIFY_FLAGS
    )
  }
  it should "handle puzzle c156347bec14aebd6e433070f43e257f429fc6cccd26c912e309da018b7adbdf" in {
    val tx = Transaction.read(
      "01000000022ffadcae8d26d75c67264d45e018d85819e1428ddd21ea4484491b80effc37ce000000008a47304402205dcbc7e099da36843737956ce61f65a8b7a0ef378af93af55b2a6055285e1762022074e69893b05349a795a9a8bd6db5c32e09ade93005c6fbbc54a2ed9328c2693141410416f013b2538585529bafc275d4ca7e2e36fdd9e204a99f7b1c70be1f12c5256cfb83a719e65612ee8c8f5786145e2670cb111c1a54ad3b0d7a11b73a121986affeffffff344343fd97f282aafa40d2f0896e98e97bd1bbe17b4729dd7fd082deccaf3ede000000008b483045022100aed152735040c28cd551f6c2adbac98089ec1a4471809d916a0f04b72ab6a94802206a003c1bc08e182addf6946870e1ffe5c2a6134ea4bf1dc347b99147c887152b41410416f013b2538585529bafc275d4ca7e2e36fdd9e204a99f7b1c70be1f12c5256cfb83a719e65612ee8c8f5786145e2670cb111c1a54ad3b0d7a11b73a121986affeffffff012dfe4e12000000001976a914ce97e7ce49557fe81cff231785fb67f5833ad02888ac0b130800"
    )
    val inputs = Seq(
      Transaction.read(
        "01000000069d1ff8c40053a32cff4cf640ef3b03dea633219b7a53ee35bb1a3ef00c429e9b010000006b483045022100b0f08a6054e52c4e5ef72767b69ca8e49c03da00734ab627681bdbe53a878a840220450bddea498e33e1e3a33a49fef16a0757b7709b4ce9f46f21ab95a066067104012103319f1ce011bbcbace662e1a2fd6ef1d982eba3f95df49ab10d00f5b210dca047ffffffff8f9c7ede97f9cf96ae7cd27ea886898ad1c854a547d61b10e733ecdbffa2bc33020000006a473044022051458e78dd5044670a8708bf57c59279439b3d67e82eef06a486825fcad0d0e7022026a27deb5cd7599c8d98a7dd2856fcb1e3844b6c9aba3acc2e276d62efad32d30121039f37a544237159eb04b933d9b87d0d7f3e3f345ec50d05b5754fa9322390513cffffffff8f9c7ede97f9cf96ae7cd27ea886898ad1c854a547d61b10e733ecdbffa2bc33010000006b483045022100bcdb02b59b4f684dead0c535e9c3e5a70d60b9a6a440f4000a7cd65289bdd5c3022027c9fffd655b22cd4492a989707047c2fba66850c2fbe1bf748062172df53e65012103807136519aa8666781a9ed4c0b41a78ecaf7bdf3c19bda0854b79a083354cdfbffffffff68e9a27d929ccb83ebd5f253f997b09589627ced2e9685ad5935e10e26446623010000006b4830450221009091ca879b063d2f4707184b0464ae5bf22b442d104de9c11c17b9f2272cffb602201bf2a380483aaebc397d9d3b3dc9a56ae15627b3fe4296fb7c5c88d6468933fa01210318e1b2d7d9ccb9f6ba055880cff5fdb0aaeb39e2d432ba21f21b03112b8aa52affffffff0f2345b172ee459eab7f2cd24dac1f4f751d0c52ae82c8841dd9498c52ff2c59020000006b48304502210081f69854ece2a6d1b51b29741d5f95c0cfad1f879c37a72d62d31e4aaab285e602201bc9261e0c0449f6d45150079e75dc68e909daa73cb25b98f5fea94c454b7cf801210315d25e9946fb7c1f2084fbe7bb7bea8c3e59e81c8bca13945d77af5d26b95cc6ffffffff0f2345b172ee459eab7f2cd24dac1f4f751d0c52ae82c8841dd9498c52ff2c59010000006b483045022100d72e8b67f4a096e64ccce752d8d5c7c25b7fcea8b2541c0d7ebe69afeb8e963b02201a49a8cd124ee20a08e7d903a6caaaec63dc2aa6408d2f494945496f7347a228012103aee81b74711ecbabd5e11bb32eb064711e2157837074834b6aa94adcaa790fc6ffffffff03e0c64d12000000001976a9140b1e15660ac380b1aba224aef1cd9218df234f3588ac0f153802000000001976a914125b3d2204809651cf7dd4007eee68766bc8443688ac0e153802000000001976a9145b90c54024f1dec65ce9515209951a71627c4e7b88ac00000000"
      ),
      Transaction.read(
        "01000000010914392856341aa7a2b0a631a4c02231712b5126b31566c4a8f0dda7da54934b070000006a4730440220599b2142a6427780538fa861e9da74f3ce87c4540a5b315b13e452ccca2a0830022017d1ba8868929501051a205e72d5655288c50dbdfdaa49db0c2d5ebed1cbc95d0121021d7334408d125848c6fde69732a1606f6e89e2eef17462d4a6bf5373d6af7e99ffffffff0315470100000000001976a9140b1e15660ac380b1aba224aef1cd9218df234f3588ac71123100000000001976a91430e6232eb3f8fe3d782d3ca83a4971b71a5f976588ac70123100000000001976a914db37421b89d03202827a82ce6d0c84a2abd7ef2688ac00000000"
      )
    )
    Transaction.correctlySpends(
      tx,
      inputs,
      ScriptFlags.MANDATORY_SCRIPT_VERIFY_FLAGS
    )
  }
}