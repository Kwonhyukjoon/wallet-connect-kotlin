package com.trustwallet.walletconnect.models.session

data class WCKeplrWallet (
    val name: String,
    val algo: String,
    val pubKey: String,
    val address: String,
    val bech32Address: String,
    val isNanoLedger: Boolean
)